package com.jmr.obdx.service;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jmr.obdx.domain.AccountTypeM;
import com.jmr.obdx.domain.BasebranchCodeM;
import com.jmr.obdx.domain.CurrencyM;
import com.jmr.obdx.domain.McxAuditLog;
import com.jmr.obdx.domain.McxTransactionM;
import com.jmr.obdx.domain.McxUserM;
import com.jmr.obdx.domain.RetailCustomer;
import com.jmr.obdx.domain.TxnData;
import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.AccountTypeRepo;
import com.jmr.obdx.repositories.BasebranchCodeRepo;
import com.jmr.obdx.repositories.BeneficiaryRepo;
import com.jmr.obdx.repositories.CurrencyRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.McxAuditLogRepo;
import com.jmr.obdx.repositories.McxTransactionMRepo;
import com.jmr.obdx.repositories.McxUserMRepo;
import com.jmr.obdx.repositories.RetailCustomerRepo;
import com.jmr.obdx.repositories.TxnDataRepo;
import com.jmr.obdx.service.dto.FundTransferDto;
import com.jmr.obdx.service.dto.InternalAccountTransferDto;
import com.jmr.obdx.service.dto.OwnAccountTransferDto;
import com.jmr.obdx.util.McxAdapter;
import com.jmr.obdx.util.ObjectMarshaller;
import com.jmr.obdx.util.Utility;
import com.mcx.xml.CreateContractReq;
import com.mcx.xml.McxBody;
import com.mcx.xml.McxHeader;
import com.mcx.xml.SoapBody;
import com.mcx.xml.SoapenvEnvelope;



@Service
public class FundtransferService {

	private SoapenvEnvelope soapenvEnvelope;

	private StatusInfo statusInfo;

	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private TxnDataRepo transactionDataRepo;
	
	@Autowired
	private RetailCustomerRepo retailCustomerRepo;
	
	@Autowired
	private McxTransactionMRepo mcxTransactionMRepo;
	
	@Autowired
	private CurrencyRepo currencyRepo;
	
	@Autowired
	private AccountDetailsRepo accountDetailsRepo;
	
	@Autowired
	private LoginRepo loginRepo;
	
	@Autowired
	private BeneficiaryRepo fundTransferRepo;
	
	@Autowired
	private AccountTypeRepo accountTypeRepo;
	
	
	@Autowired
	private TxnDataRepo txnDataRepo;
	
	@Autowired 
	private ObjectMarshaller objectMarshaller;

	private Utility utilities;
	
	@Autowired
	private McxAdapter mcxAdapter;
	
	@Autowired
	private BasebranchCodeRepo basebranchCodeRepo;
	
	@Autowired
	private McxAuditLogRepo mcxAuditLogRepo;
	
	@Autowired
	private McxUserMRepo mcxUserMRepo;
	
	private  String hostReference;
	
	private FundTransferDto fundTransferDto;
	
	private static Logger logger = Logger.getLogger(FundtransferService.class);
	 private String errorCode = null;
	 private String errorDescrption = null;


	public FundTransferDto ownAccountTransfer(Authentication authentication,OwnAccountTransferDto ownAccountTransferDto, Locale locale,BindingResult bindingResult)throws Exception{
		
		 statusInfo=new StatusInfo();
		
		 String  referenceid =utilities.getReferenceNumber(String.valueOf(System.currentTimeMillis()), 13);
		if (bindingResult.hasErrors()) {
			statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error -> {statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));
			});
		    }
      /*   if(ownAccountTransferDto.getToAccount()==ownAccountTransferDto.getFromAccount() && (ownAccountTransferDto.getAmount()== 0)){
 			statusInfo.setErrorStatus(true);
			statusInfo.getErrorMsgs().add(new com.jmr.obdx.dto.ErrorMsg(messageSource.getMessage("field.accountno",new Object[] {}, locale),messageSource.getMessage("error.date.not.valid.selection",new Object[] {}, locale)));
         }*/
        /* if(ownAccountTransferDto.getFromAccountBalancy() < ownAccountTransferDto.getAmount()){
  			statusInfo.setErrorStatus(true);
 			statusInfo.getErrorMsgs().add(new com.jmr.obdx.dto.ErrorMsg(messageSource.getMessage("field.accountno",new Object[] {}, locale),messageSource.getMessage("error.not.sufficient.amount",new Object[] {}, locale)));
          }*/
         else{
        	
        	 
        	 BasebranchCodeM basebranchCodeM=basebranchCodeRepo.baseBranchDetailsM();
        	 RetailCustomer  retailCustomer =retailCustomerRepo.findByCustomername(authentication.getName());
        	 AccountTypeM accountTypeM =accountTypeRepo.findByDescription(ownAccountTransferDto.getAccountType());
        	 CurrencyM currencyM =currencyRepo.findByCurrencyType(ownAccountTransferDto.getCurrencyCode());
        	 McxTransactionM mcxTransactionM = mcxTransactionMRepo.findByProddesc("own account Transfer");
        	 transactionDataRepo.save(new TxnData(new McxTransactionM(mcxTransactionM.getId()), new AccountTypeM(accountTypeM.getId()), currencyM, retailCustomer.getIdcusomer(), ownAccountTransferDto.getFromAccount(), ownAccountTransferDto.getToAccount(), ownAccountTransferDto.getToBranchCode(),ownAccountTransferDto.getFromBranchCode(), ownAccountTransferDto.getAmount(), new Date(), "Intransit", ownAccountTransferDto.getNote(),referenceid));
        	 TxnData txnData = txnDataRepo.findByReferenceId(referenceid);

     		java.io.StringWriter sw = new StringWriter();
     		Date myDate = new Date();
/*
     		JAXBContext contextObj = JAXBContext.newInstance(com.mcx.xml.SoapenvEnvelope.class);
     		Marshaller marshallerObj = contextObj.createMarshaller();
     		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);*/
     		
     		
     		com.mcx.xml.ContractDetailsFull contractDetailsFull = new com.mcx.xml.ContractDetailsFull(mcxTransactionM.getProd(), txnData.getReferenceId(), 
     				                                              new SimpleDateFormat("yyyy-MM-dd").format(txnData.getTransaferdate()), 
     				                                              txnData.getToaccountno(),txnData.getFrombranchcod(),txnData.getCurrencyM().getCurrencyDesc(), txnData.getAmount(), 
     				                                              new SimpleDateFormat("yyyy-MM-dd").format(txnData.getTransaferdate()), txnData.getTobranchcod(), 
     				                                              txnData.getFromaccountno(),txnData.getCurrencyM().getCurrencyType(), txnData.getAmount(), txnData.getReferenceId(), "FLEXCUBE",
     				                                              new SimpleDateFormat("yyyy-MM-dd").format(txnData.getTransaferdate()), mcxTransactionM.getProddesc(), "N", "TESTER5", 
     				                                              new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(txnData.getTransaferdate()), "U", new SimpleDateFormat("yyyy-MM-dd").format(txnData.getTransaferdate()),
     				                                              mcxTransactionM.getProd(), mcxTransactionM.getModcd(), txnData.getCurrencyM().getCurrencyDesc(), "FLEXCUBE");
    		
     		McxHeader mcxHeader = new McxHeader("FCAT", "FCUBS", txnData.getReferenceId(),"SYSTEM", basebranchCodeM.getBranchcode(), mcxTransactionM.getService(), mcxTransactionM.getOperation());
     		McxBody  mcxBody = new McxBody(contractDetailsFull);
     		CreateContractReq createContractReq = new CreateContractReq(mcxHeader, "http://fcubs.ofss.com/service/FCUBSFTService", mcxBody);
     		SoapBody soapBody = new SoapBody(createContractReq);
     		SoapenvEnvelope soapenvEnvelope = new SoapenvEnvelope("http://schemas.xmlsoap.org/soap/envelope/","http://fcubs.ofss.com/service/FCUBSFTService", soapBody);
     		StringWriter requestObj= objectMarshaller.marshallerToXml(soapenvEnvelope);
     		System.out.println(requestObj);
     		String responseString =mcxAdapter.getAdapterResponse(requestObj, "http://192.168.1.27:7001/FCUBSFTService/FCUBSFTService", "POST");
     		
     		System.out.println(responseString);
     		
     		
     		  String Status = responseString.substring(responseString.indexOf("<MSGSTAT>") +9, responseString.indexOf("</MSGSTAT>"));

     		  if(Status.equals("FAILURE")){
     		         String errorCode = responseString.substring(responseString.indexOf("<ECODE>") +7, responseString.indexOf("</ECODE>"));
     		         String errorDescrption = responseString.substring(responseString.indexOf("<EDESC>") +7, responseString.indexOf("</EDESC>"));
     		  }
     		  else{
    		      hostReference = responseString.substring(responseString.indexOf("<REFERENCE_NO>") +12, responseString.indexOf("</REFERENCE_NO>"));

     		  }
	     		McxUserM mcxUserM = mcxUserMRepo.findById(retailCustomer.getIduser());
     		  mcxAuditLogRepo.save(new McxAuditLog(41,new McxTransactionM(mcxTransactionM.getId()), txnData.getReferenceId(),  requestObj.toString(), responseString.toString(), errorCode, errorDescrption, new Date(), Status, hostReference));

     		 fundTransferDto.setStatus(Status);
     		 fundTransferDto.setFcdbRefId(referenceid);
     		 fundTransferDto.setHostRefId(hostReference);
              }
    	 return fundTransferDto;
        }
	
/*	public StatusInfo internalFundTransfer(Authentication authentication,InternalAccountTransferDto internalAccountTransfer, Locale locale,BindingResult bindingResult)throws Exception{
		
		 statusInfo=new StatusInfo();
		
		 String  referenceid =utilities.getReferenceNumber(String.valueOf(System.currentTimeMillis()), 13);
		if (bindingResult.hasErrors()) {
			statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error -> {statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));
			});
		    }
        if(ownAccountTransferDto.getToAccount()==ownAccountTransferDto.getFromAccount() && (ownAccountTransferDto.getAmount()== 0)){
			statusInfo.setErrorStatus(true);
			statusInfo.getErrorMsgs().add(new com.jmr.obdx.dto.ErrorMsg(messageSource.getMessage("field.accountno",new Object[] {}, locale),messageSource.getMessage("error.date.not.valid.selection",new Object[] {}, locale)));
        }
        if(ownAccountTransferDto.getFromAccountBalancy() < ownAccountTransferDto.getAmount()){
 			statusInfo.setErrorStatus(true);
			statusInfo.getErrorMsgs().add(new com.jmr.obdx.dto.ErrorMsg(messageSource.getMessage("field.accountno",new Object[] {}, locale),messageSource.getMessage("error.not.sufficient.amount",new Object[] {}, locale)));
         }
        else{
       	
       	 
       	 BasebranchCodeM basebranchCodeM=basebranchCodeRepo.baseBranchDetailsM();
       	 RetailCustomer  retailCustomer =retailCustomerRepo.findByCustomername(authentication.getName());
       	 AccountTypeM accountTypeM =accountTypeRepo.findByDescription(internalAccountTransfer.getAccountType());
       	 CurrencyM currencyM =currencyRepo.findByCurrencyType(internalAccountTransfer.getCurrencyCode());
       	 McxTransactionM mcxTransactionM = mcxTransactionMRepo.findByProddesc("own account Transfer");
       	 transactionDataRepo.save(new TxnData(new McxTransactionM(mcxTransactionM.getId()), new AccountTypeM(accountTypeM.getId()), currencyM, retailCustomer.getIdcusomer(), internalAccountTransfer.getFromAccount(), internalAccountTransfer.getToAccount(), internalAccountTransfer.getToBranchCode(),internalAccountTransfer.getFromBranchCode(), internalAccountTransfer.getAmount(), new Date(), "Intransit", internalAccountTransfer.getNote(),referenceid));
       	 TxnData txnData = txnDataRepo.findByReferenceId(referenceid);

    		java.io.StringWriter sw = new StringWriter();
    		Date myDate = new Date();

    		JAXBContext contextObj = JAXBContext.newInstance(com.mcx.xml.SoapenvEnvelope.class);
    		Marshaller marshallerObj = contextObj.createMarshaller();
    		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    		
    		
    		com.mcx.xml.ContractDetailsFull contractDetailsFull = new com.mcx.xml.ContractDetailsFull(mcxTransactionM.getProd(), txnData.getReferenceId(), 
    				                                              new SimpleDateFormat("yyyy-MM-dd").format(txnData.getTransaferdate()), 
    				                                              txnData.getToaccountno(),txnData.getFrombranchcod(),txnData.getCurrencyM().getCurrencyDesc(), txnData.getAmount(), 
    				                                              new SimpleDateFormat("yyyy-MM-dd").format(txnData.getTransaferdate()), txnData.getTobranchcod(), 
    				                                              txnData.getFromaccountno(),txnData.getCurrencyM().getCurrencyType(), txnData.getAmount(), txnData.getReferenceId(), "FLEXCUBE",
    				                                              new SimpleDateFormat("yyyy-MM-dd").format(txnData.getTransaferdate()), mcxTransactionM.getProddesc(), "N", "TESTER5", 
    				                                              new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(txnData.getTransaferdate()), "U", new SimpleDateFormat("yyyy-MM-dd").format(txnData.getTransaferdate()),
    				                                              mcxTransactionM.getProd(), mcxTransactionM.getModcd(), txnData.getCurrencyM().getCurrencyDesc(), "FLEXCUBE");
   		
    		McxHeader mcxHeader = new McxHeader("FCAT", "FCUBS", txnData.getReferenceId(),"SYSTEM", basebranchCodeM.getBranchcode(), mcxTransactionM.getService(), mcxTransactionM.getOperation());
    		McxBody  mcxBody = new McxBody(contractDetailsFull);
    		CreateContractReq createContractReq = new CreateContractReq(mcxHeader, "http://fcubs.ofss.com/service/FCUBSFTService", mcxBody);
    		SoapBody soapBody = new SoapBody(createContractReq);
    		SoapenvEnvelope soapenvEnvelope = new SoapenvEnvelope("http://schemas.xmlsoap.org/soap/envelope/","http://fcubs.ofss.com/service/FCUBSFTService", soapBody);
    		StringWriter requestObj= objectMarshaller.marshallerToXml(soapenvEnvelope);
    		System.out.println(requestObj);
    		String responseString =mcxAdapter.getAdapterResponse(requestObj, "http://192.168.1.27:7001/FCUBSFTService/FCUBSFTService", "POST");
    		
    		System.out.println(responseString);
    		
    		
    		  String Status = responseString.substring(responseString.indexOf("<MSGSTAT>") +9, responseString.indexOf("</MSGSTAT>"));

    		  if(Status.equals("FAILURE")){
    		         String errorCode = responseString.substring(responseString.indexOf("<ECODE>") +7, responseString.indexOf("</ECODE>"));
    		         String errorDescrption = responseString.substring(responseString.indexOf("<EDESC>") +7, responseString.indexOf("</EDESC>"));
    		  }
    		  else{
   		      hostReference = responseString.substring(responseString.indexOf("<REFERENCE_NO>") +12, responseString.indexOf("</REFERENCE_NO>"));

    		  }
	     		McxUserM mcxUserM = mcxUserMRepo.findById(retailCustomer.getIduser());
    		  mcxAuditLogRepo.save(new McxAuditLog(41,new McxTransactionM(mcxTransactionM.getId()), txnData.getReferenceId(),  requestObj.toString(), responseString.toString(), errorCode, errorDescrption, new Date(), Status, hostReference));


             }
   	 return statusInfo; 
       }
	*/
	
}
