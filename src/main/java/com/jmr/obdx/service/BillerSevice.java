package com.jmr.obdx.service;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import javax.swing.text.Utilities;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jmr.obdx.domain.AccountTypeM;
import com.jmr.obdx.domain.BasebranchCodeM;
import com.jmr.obdx.domain.BeneficiaryM;
import com.jmr.obdx.domain.Biller;
import com.jmr.obdx.domain.CurrencyM;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.McxAuditLog;
import com.jmr.obdx.domain.McxBillerOperator;
import com.jmr.obdx.domain.McxTransactionM;
import com.jmr.obdx.domain.McxUserM;
import com.jmr.obdx.domain.RetailCustomer;
import com.jmr.obdx.domain.TxnData;
import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.repositories.BasebranchCodeRepo;
import com.jmr.obdx.domain.McxVwBillerInfo;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.repositories.BillerRepo;
import com.jmr.obdx.repositories.CurrencyRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.McxAuditLogRepo;
import com.jmr.obdx.repositories.McxTransactionMRepo;
import com.jmr.obdx.repositories.McxUserMRepo;
import com.jmr.obdx.repositories.RetailCustomerRepo;
import com.jmr.obdx.repositories.TxnDataRepo;
import com.jmr.obdx.service.dto.BillerDto;
import com.jmr.obdx.service.dto.BillerInfo;
import com.jmr.obdx.service.dto.PayBillIDto;
import com.jmr.obdx.service.dto.PayBillInfo;
import com.jmr.obdx.util.McxAdapter;
import com.jmr.obdx.util.ObjectMarshaller;
import com.jmr.obdx.service.dto.RegisterBillerDto;
import com.jmr.obdx.service.dto.UserAddedBillerDto;
import com.jmr.obdx.service.dto.UserAddedBillerInfo;
import com.jmr.obdx.util.Utility;
import com.mcx.xml.CreateContractReq;
import com.mcx.xml.CreateuptransactionIopkReq;
import com.mcx.xml.McxHeader;
import com.mcx.xml.McxPayBillBody;
import com.mcx.xml.PayBillSoapBody;
import com.mcx.xml.PayBillSoapenvEnvelope;
import com.mcx.xml.SoapBody;
import com.mcx.xml.SoapenvEnvelope;
import com.mcx.xml.TransactionDetailsIo;

@Service
public class BillerSevice {

	private static Logger logger = Logger.getLogger(BillerSevice.class);
	private UserAddedBillerInfo userAddedBillerInfo;
	private BillerInfo billerInfo;
	private StatusInfo statusInfo;
	@Autowired
	private BillerRepo billerRepo;
	
	
	@Autowired
	private com.jmr.obdx.repositories.McxVwBillerInfoRepo mcxVwBillerInfoRepo;
	
	@Autowired
	private LoginRepo loginRepo;
	
	private PayBillInfo payBillInfo;
	
	@Autowired
	private BasebranchCodeRepo basebranchCodeRepo;
	
	@Autowired
	private RetailCustomerRepo retailCustomerRepo;
	
	

	@Autowired
	private McxAdapter mcxAdapter;
	
	@Autowired
	private CurrencyRepo currencyRepo;
	
	@Autowired
	private TxnDataRepo transactionDataRepo;
	
	@Autowired 
	private ObjectMarshaller objectMarshaller;
	
	@Autowired
	private TxnDataRepo txnDataRepo;
	
	@Autowired
	private McxUserMRepo mcxUserMRepo;
	
	private  String hostReference;
	
	@Autowired
	private McxTransactionMRepo mcxTransactionMRepo;
	
	@Autowired
	private McxAuditLogRepo mcxAuditLogRepo;
	
	private Utility utility;
	
	 private String errorCode = null;
	 private String errorDescrption = null;
	 private String wDesc=null;
	 private String wCode = null;


	
	public UserAddedBillerInfo getUserAddedBillerInfo(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		userAddedBillerInfo = new UserAddedBillerInfo();
		List<UserAddedBillerDto> billerDtos = new ArrayList<>(0);
		Login login = loginRepo.findByUsername(authentication.getName());
	    List<Biller> billers = (List<Biller>) billerRepo.findByUserBillerInfo(login.getId());
		billers.stream().forEach(biller -> {
			System.out.println( biller.getMcxBillerOperator().getOperator());
			billerDtos.add(new UserAddedBillerDto(biller.getBillerId(), biller.getname(), biller.getMcxBillerOperator().getOperator()));
		});
		userAddedBillerInfo.setBillerDtos(billerDtos);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return userAddedBillerInfo;
	}
	
	
	public BillerInfo getBillerInfo(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		billerInfo = new BillerInfo();
		HashSet<BillerDto> billerDtos = new HashSet<>(0);
		List<McxVwBillerInfo> billers=(List<McxVwBillerInfo>)mcxVwBillerInfoRepo.getBiller();
		billers.stream().forEach(biller -> {
			billerDtos.add(new BillerDto(biller.getIdbiller(), biller.getBillerdesc(), biller.getBillercustid()));
		});
		billerInfo.setBillerDtos(billerDtos);
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		return billerInfo;
	}
	
	
	public StatusInfo registerBiller(RegisterBillerDto registerBillerDto,Authentication authentication)throws Exception {
		
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		statusInfo = new StatusInfo();
		Login login = loginRepo.findByUsername(authentication.getName());
		System.out.println(login.getId());
		billerRepo.save(new Biller(registerBillerDto.getBillerId(), registerBillerDto.getBillerReferenceNumber(), new Date(), registerBillerDto.getBillerName(), login.getId(),new McxBillerOperator(2)));
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		System.out.println(statusInfo);
		return statusInfo;
	}

	
	
	public PayBillInfo payBill(Authentication authentication,PayBillIDto payBillIDto,Locale locale,BindingResult bindingResult) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		
		
		payBillInfo = new PayBillInfo();
		String  referenceid =utility.getReferenceNumber(String.valueOf(System.currentTimeMillis()), 13);
		if (bindingResult.hasErrors()) {
			statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error -> {statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));
			});
		    }
      
       else{
      	     BasebranchCodeM basebranchCodeM=basebranchCodeRepo.baseBranchDetailsM();
        	 RetailCustomer  retailCustomer =retailCustomerRepo.findByCustomername(authentication.getName());
        	 CurrencyM customerAccountCurrencyM =currencyRepo.findByCurrencyType(payBillIDto.getFromAccountCurrency());
        	 McxTransactionM mcxTransactionM = mcxTransactionMRepo.findByProddesc("bill payment");
        		
        	 
     		Login login = loginRepo.findByUsername(authentication.getName());

        	transactionDataRepo.save(new TxnData(new McxTransactionM(mcxTransactionM.getId()), customerAccountCurrencyM, retailCustomer.getIdcusomer(), payBillIDto.getFromAccount(), payBillIDto.getFromAccountCurrency(), payBillIDto.getBillerNo(),payBillIDto.getFromAccountCurrency(), payBillIDto.getAmount(), new Date(), "Intransit", payBillIDto.getNote(),referenceid, payBillIDto.getBillerId()));
        	TxnData txnData = txnDataRepo.findByReferenceId(referenceid);
     		java.io.StringWriter sw = new StringWriter();
     		Date myDate = new Date();
            System.out.println(referenceid);
     		TransactionDetailsIo transactionDetailsIo = new TransactionDetailsIo(referenceid, mcxTransactionM.getProddesc(), payBillIDto.getBillerId(), payBillIDto.getBillerNo(), payBillIDto.getAmount(), payBillIDto.getFromAccountCurrency(), retailCustomer.getIdcusomer(), payBillIDto.getFromAccountCurrency(), payBillIDto.getBillerNo(), payBillIDto.getFromAccountCurrency(), new SimpleDateFormat("yyyy-MM-dd").format(txnData.getTransaferdate()), basebranchCodeM.getBranchcode());
     		McxHeader mcxHeader = new McxHeader("FCAT", "FCUBS", txnData.getReferenceId(),"SYSTEM", basebranchCodeM.getBranchcode(), mcxTransactionM.getService(), mcxTransactionM.getOperation());
            McxPayBillBody mcxPayBillBody = new McxPayBillBody(transactionDetailsIo);
     		CreateuptransactionIopkReq createuptransactionIopkReq = new CreateuptransactionIopkReq(mcxHeader, mcxPayBillBody);
     		PayBillSoapBody payBillSoapBody = new PayBillSoapBody(createuptransactionIopkReq);
     		PayBillSoapenvEnvelope payBillSoapenvEnvelope = new PayBillSoapenvEnvelope("http://schemas.xmlsoap.org/soap/envelope/","http://fcubs.ofss.com/service/FCUBSUPService", payBillSoapBody);
     		StringWriter requestObj= objectMarshaller.marshallerToXml(payBillSoapenvEnvelope);
     		String responseString =mcxAdapter.getAdapterResponse(requestObj, "http://192.168.1.27:7001/FCUBSUPService/FCUBSUPService", "POST");
     		byte responseStringBytr[] =responseString.getBytes();
     		System.out.println(responseString);
     		byte requestObjectBytr[] =requestObj.toString().getBytes();
     		String Status = responseString.substring(responseString.indexOf("<MSGSTAT>") +9, responseString.indexOf("</MSGSTAT>"));

     		  if(Status.equals("FAILURE")){
     		         String errorCode = responseString.substring(responseString.indexOf("<ECODE>") +7, responseString.indexOf("</ECODE>"));
     		         String errorDescrption = responseString.substring(responseString.indexOf("<EDESC>") +7, responseString.indexOf("</EDESC>"));
     		  }
     		  else{
    		      hostReference = responseString.substring(responseString.indexOf("<REFERENCE_NO>") +14, responseString.indexOf("</REFERENCE_NO>"));

     		  }
	     	  McxUserM mcxUserM = mcxUserMRepo.findById(retailCustomer.getIduser());
     		  mcxAuditLogRepo.save(new McxAuditLog(new Login(login.getRetailCustomer().getIduser()),new McxTransactionM(mcxTransactionM.getId()), txnData.getReferenceId(),  requestObjectBytr, responseStringBytr, errorCode, errorDescrption, new Date(), Status, hostReference));

     		payBillInfo.setStatus(Status);
     		payBillInfo.setFcdbRefId(referenceid);
     		payBillInfo.setHostRefId(hostReference);
              }
		     return payBillInfo;

	       }

	
	}
	
	
	
