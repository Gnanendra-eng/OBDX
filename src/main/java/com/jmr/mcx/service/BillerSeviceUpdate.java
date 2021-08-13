package com.jmr.mcx.service;

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

import com.jmr.mcx.domain.Accountdetails;
import com.jmr.mcx.domain.McxAccountTypeM;
import com.jmr.mcx.domain.McxAuditLog;
import com.jmr.mcx.domain.McxBiller;
import com.jmr.mcx.domain.McxBillerOperator;
import com.jmr.mcx.domain.McxCurrencyM;
import com.jmr.mcx.domain.McxCustomerMapping;
import com.jmr.mcx.domain.McxLogin;
import com.jmr.mcx.domain.McxTransactionData;
import com.jmr.mcx.domain.McxTransactionM;
import com.jmr.mcx.domain.McxTransferPurpose;
import com.jmr.mcx.domain.McxUser;
import com.jmr.mcx.domain.McxVwBillerInfo;
import com.jmr.mcx.dto.ErrorMsg;
import com.jmr.mcx.dto.StatusInfo;
import com.jmr.mcx.repositories.AccountDetailsRep;
import com.jmr.mcx.repositories.CurrencyRepo;
import com.jmr.mcx.repositories.McxAuditLogRepo;
import com.jmr.mcx.repositories.McxBillerRepo;
import com.jmr.mcx.repositories.McxCustomerMappingRepo;
import com.jmr.mcx.repositories.McxLoginRepo;
import com.jmr.mcx.repositories.McxTransactionDataRepo;
import com.jmr.mcx.repositories.McxTransactionMRepo;
import com.jmr.mcx.repositories.McxUserMRepo;
import com.jmr.mcx.service.dto.BillerDto;
import com.jmr.mcx.service.dto.BillerInfo;
import com.jmr.mcx.service.dto.PayBillIDto;
import com.jmr.mcx.service.dto.PayBillInfo;
import com.jmr.mcx.service.dto.RegisterBillerDto;
import com.jmr.mcx.service.dto.UserAddedBillerDto;
import com.jmr.mcx.service.dto.UserAddedBillerInfo;
import com.jmr.mcx.util.McxAdapter;
import com.jmr.mcx.util.McxObjectMarshaller;
import com.jmr.mcx.util.Utility;
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
public class BillerSeviceUpdate {

	private static Logger logger = Logger.getLogger(BillerSevice.class);
	private UserAddedBillerInfo userAddedBillerInfo;
	private BillerInfo billerInfo;
	private StatusInfo statusInfo;
	@Autowired
	private McxBillerRepo mcxBillerRepo;
	
	
	@Autowired
	private com.jmr.mcx.repositories.McxVwBillerInfoRepo mcxVwBillerInfoRepo;
	
	@Autowired
	private McxLoginRepo loginRepo;
	
	@Autowired
	private AccountDetailsRep accountDetailsRepo;
	
	

	@Autowired
	private McxAdapter mcxAdapter;
	
	@Autowired
	private CurrencyRepo currencyRepo;
	
	@Autowired
	private McxTransactionDataRepo mcxTransactionDataRepo;
	
	@Autowired 
	private McxObjectMarshaller objectMarshaller;
	
	@Autowired
	private McxUserMRepo mcxUserMRepo;
	
	
	@Autowired
	private McxTransactionMRepo mcxTransactionMRepo;
	
	@Autowired
	private McxAuditLogRepo mcxAuditLogRepo;
	
	@Autowired
	private McxCustomerMappingRepo mcxCustomerMappingRepo;
	
	 private Utility utility;
	 private PayBillInfo payBillInfo;
	 private  String hostReference;
	 private String errorCode = null;
	 private String errorDescrption = null;
	 private String wDesc=null;
	 private String wCode = null;



	     /***
		 * Gives all mapped biller for the user
		 * 
		 * @param authentication - Hold the login user inof.
		 * @return all mapped biller for the user
		 */
	public UserAddedBillerInfo getUserAddedBillerInfo(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		userAddedBillerInfo = new UserAddedBillerInfo();
		List<UserAddedBillerDto> billerDtos = new ArrayList<>(0);
		McxLogin mcxlogin = loginRepo.findByUserName(authentication.getName());
	    List<McxBiller> mcxBillers = (List<McxBiller>) mcxBillerRepo.findByUserBillerInfo(new McxUser(mcxlogin.getMcxUser().getId()));
	    mcxBillers.stream().forEach(biller -> {
			billerDtos.add(new UserAddedBillerDto(biller.getBillerId(), biller.getName(), biller.getMcxBillerOperator().getOperator()));
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
			billerDtos.add(new BillerDto(biller.getIdBiller(), biller.getBillerDesc(), biller.getBillerCustId()));
		});
		billerInfo.setBillerDtos(billerDtos);
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		return billerInfo;
	}
	
	/***
	 * 
	 *NEED TO SEND THE BILLER OPERATOR ID IN registerBillerDto FROM FRONTEND
	 */
	
	public StatusInfo registerBiller(RegisterBillerDto registerBillerDto,Authentication authentication)throws Exception {
		
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		statusInfo = new StatusInfo();
		McxLogin mcxLogin = loginRepo.findByUserName(authentication.getName());
		McxUser mcxUser = mcxUserMRepo.findById(mcxLogin.getMcxUser(). getId());
		mcxBillerRepo.save(new McxBiller(mcxUser, registerBillerDto.getBillerId(), registerBillerDto.getBillerReferenceNumber(), new Date(), registerBillerDto.getBillerName(), new McxBillerOperator( registerBillerDto.getBillerOperatorID())));
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		System.out.println(statusInfo);
		return statusInfo;
	}


/***
 * Method Used for Paybills
 * @param payBillIDto Receives the paybill info.
 * @param authentication - Hold the login user info.
 * @param locale -A Locale object represents a specific geographical, political, or cultural region. 
 * @param bindingResult-Represents binding results
 * @return  FCDB reference id,Host reference id and Status of the transaction
 */
	
	public PayBillInfo payBill(Authentication authentication,PayBillIDto payBillIDto,Locale locale,BindingResult bindingResult) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		

		payBillInfo = new PayBillInfo();
		String  referenceId =utility.getReferenceNumber(String.valueOf(System.currentTimeMillis()), 13);
		if (bindingResult.hasErrors()) {
			statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error -> {statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));
			});
		    }
      
       else{
      	    //BasebranchCodeM basebranchCodeM=basebranchCodeRepo.baseBranchDetailsM();
      	    McxLogin mcxLogin = loginRepo.findByUserName(authentication.getName());
  		    McxCustomerMapping mcxCustomerMapping =  mcxCustomerMappingRepo.findByMcxUser(new McxUser(mcxLogin.getMcxUser().getId()));
        	McxCurrencyM customerAccountCurrencyM =currencyRepo.findByCurrencyType(payBillIDto.getFromAccountCurrency());
        	McxTransactionM mcxTransactionM = mcxTransactionMRepo.findByProductDescription(Utility.BP);
        	Accountdetails accountdetails = accountDetailsRepo.findAccountBranchByAccountId(payBillIDto.getFromAccount());
        	mcxTransactionDataRepo.save(new McxTransactionData(new McxTransferPurpose(payBillIDto.getTransactionPurposeId()), new McxCurrencyM(payBillIDto.getFromAccountCurrency()), new McxBiller(payBillIDto.getBillerId()), new McxAccountTypeM(payBillIDto.getAccountType()), mcxCustomerMapping.getCustomerId(), payBillIDto.getBillerNo(), payBillIDto.getFromAccount(), payBillIDto.getBranchCode(), payBillIDto.getAmount(),new Date(),referenceId));
        	McxTransactionData mcxTransactionData = mcxTransactionDataRepo.findByReferenceId(referenceId);
     		java.io.StringWriter sw = new StringWriter();
     		Date myDate = new Date();
     		TransactionDetailsIo transactionDetailsIo = new TransactionDetailsIo(referenceId, mcxTransactionM.getProductDescription(), payBillIDto.getBillerId(), payBillIDto.getBillerNo(), payBillIDto.getAmount(), payBillIDto.getFromAccountCurrency(), mcxCustomerMapping.getCustomerId(), payBillIDto.getFromAccountCurrency(), payBillIDto.getBillerNo(), payBillIDto.getFromAccountCurrency(), new SimpleDateFormat("yyyy-MM-dd").format(mcxTransactionData.getTransferDate()), accountdetails.getNbrBranch());
     		McxHeader mcxHeader = new McxHeader("FCAT", "FCUBS", mcxTransactionData.getReferenceId(),"SYSTEM", accountdetails.getNbrBranch(), mcxTransactionM.getService(), mcxTransactionM.getOperation());
            McxPayBillBody mcxPayBillBody = new McxPayBillBody(transactionDetailsIo);
     		CreateuptransactionIopkReq createuptransactionIopkReq = new CreateuptransactionIopkReq(mcxHeader, mcxPayBillBody);
     		PayBillSoapBody payBillSoapBody = new PayBillSoapBody(createuptransactionIopkReq);
     		PayBillSoapenvEnvelope payBillSoapenvEnvelope = new PayBillSoapenvEnvelope("http://schemas.xmlsoap.org/soap/envelope/","http://fcubs.ofss.com/service/FCUBSUPService", payBillSoapBody);
     		StringWriter requestObj= objectMarshaller.marshallerToXml(payBillSoapenvEnvelope);
     		String responseString =mcxAdapter.getAdapterResponse(requestObj, "http://192.168.1.27:7001/FCUBSUPService/FCUBSUPService", "POST");
     		byte responseStringByte[] =responseString.getBytes();
     		System.out.println(responseString);
     		byte requestObjectByte[] =requestObj.toString().getBytes();
     		String Status = responseString.substring(responseString.indexOf("<MSGSTAT>") +9, responseString.indexOf("</MSGSTAT>"));

     		  if(Status.equals("FAILURE")){
     		         String errorCode = responseString.substring(responseString.indexOf("<ECODE>") +7, responseString.indexOf("</ECODE>"));
     		         String errorDescrption = responseString.substring(responseString.indexOf("<EDESC>") +7, responseString.indexOf("</EDESC>"));
     		  }
     		  else{
    		      hostReference = responseString.substring(responseString.indexOf("<REFERENCE_NO>") +14, responseString.indexOf("</REFERENCE_NO>"));

     		  }
	     	  McxUser mcxUser = mcxUserMRepo.findById(mcxCustomerMapping.getMcxUser().getId());
	     	  
     		  mcxAuditLogRepo.save(new McxAuditLog(new McxUser(mcxUser.getId()), new McxTransactionM(mcxTransactionM.getId()),new McxTransactionData(mcxTransactionData.getId()), Status, new Date(), requestObjectByte, responseStringByte,hostReference));

     		payBillInfo.setStatus(Status);
     		payBillInfo.setFcdbRefId(referenceId);
     		payBillInfo.setHostRefId(hostReference);
              }
		     return payBillInfo;

	       }

	
	}
	
	
	
