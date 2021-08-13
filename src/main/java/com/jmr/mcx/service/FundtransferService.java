package com.jmr.mcx.service;

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

import com.jmr.mcx.domain.Accountdetails;
import com.jmr.mcx.domain.McxAccountTypeM;
import com.jmr.mcx.domain.McxAuditLog;
import com.jmr.mcx.domain.McxBeneficiary;
import com.jmr.mcx.domain.McxCurrencyM;
import com.jmr.mcx.domain.McxCustomerMapping;
import com.jmr.mcx.domain.McxLogin;
import com.jmr.mcx.domain.McxTransactionData;
import com.jmr.mcx.domain.McxTransactionM;
import com.jmr.mcx.domain.McxTransferPurpose;
import com.jmr.mcx.domain.McxUser;
import com.jmr.mcx.dto.ErrorMsg;
import com.jmr.mcx.dto.StatusInfo;
import com.jmr.mcx.repositories.AccountDetailsRep;
import com.jmr.mcx.repositories.AccountTypeRepo;
import com.jmr.mcx.repositories.BeneficiaryRepo;
import com.jmr.mcx.repositories.CurrencyRepo;
import com.jmr.mcx.repositories.McxAuditLogRepo;
import com.jmr.mcx.repositories.McxCustomerMappingRepo;
import com.jmr.mcx.repositories.McxLoginRepo;
import com.jmr.mcx.repositories.McxTransactionDataRepo;
import com.jmr.mcx.repositories.McxTransactionMRepo;
import com.jmr.mcx.repositories.McxUserMRepo;
import com.jmr.mcx.service.dto.FundTransferInfo;
import com.jmr.mcx.service.dto.InternalAccountTransferDto;
import com.jmr.mcx.service.dto.OwnAccountTransferDto;
import com.jmr.mcx.util.McxAdapter;
import com.jmr.mcx.util.McxObjectMarshaller;
import com.jmr.mcx.util.Utility;
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
	private BeneficiaryRepo beneficiaryRepo;
	
	@Autowired
	private McxTransactionDataRepo transactionDataRepo;
	
	@Autowired
	private McxTransactionMRepo mcxTransactionMRepo;
	
	@Autowired
	private CurrencyRepo currencyRepo;
	
	@Autowired
	private AccountDetailsRep accountDetailsRepo;
	
	@Autowired
	private McxLoginRepo loginRepo;
	
	@Autowired
	private BeneficiaryRepo fundTransferRepo;
	
	@Autowired
	private AccountTypeRepo accountTypeRepo;
	
	@Autowired
	private McxTransactionDataRepo txnDataRepo;
	
	@Autowired 
	private McxObjectMarshaller objectMarshaller;

	@Autowired
	private McxAdapter mcxAdapter;
	
	@Autowired
	private McxAuditLogRepo mcxAuditLogRepo;
	
	@Autowired
	private McxCustomerMappingRepo mcxCustomerMappingRepo;
	
	@Autowired
	private McxUserMRepo mcxUserMRepo;
	
	 private  String hostReference;
	 private Utility utilities;
	 private FundTransferInfo fundTransferDto;
	 private static Logger logger = Logger.getLogger(FundtransferService.class);
	 private String errorCode = null;
	 private String errorDescrption = null;
	 private String wDesc=null;
	 private String wCode = null;
	 
	 /***
		 * Method used for Own Account Fund transfer
		 * @param ownAccountTransferDto - This object receives  the information of Own Account Transfer
		 * @param authentication - Hold the information of login user
		 * @param locale A Locale object represents a specific geographical, political, or cultural region
		 * @param bindingResult General interface that represents binding results
		 * @return  FCDB reference id, host reference id and Status of the transaction
		 */

	public FundTransferInfo ownAccountTransfer(Authentication authentication,OwnAccountTransferDto ownAccountTransferDto, Locale locale,BindingResult bindingResult)throws Exception{
		
		 statusInfo=new StatusInfo();
		 fundTransferDto = new FundTransferInfo();
		 String  referenceid =utilities.getReferenceNumber(String.valueOf(System.currentTimeMillis()), 13);
		if (bindingResult.hasErrors()) {
			statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error -> {statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));
			});
		    }
       /*  if(ownAccountTransferDto.getToAccount()==ownAccountTransferDto.getFromAccount() && (ownAccountTransferDto.getAmount()== 0)){
 			statusInfo.setErrorStatus(true);
			statusInfo.getErrorMsgs().add(new com.jmr.obdx.dto.ErrorMsg(messageSource.getMessage("field.accountno",new Object[] {}, locale),messageSource.getMessage("error.date.not.valid.selection",new Object[] {}, locale)));
         }
         if(ownAccountTransferDto.getFromAccountBalancy() < ownAccountTransferDto.getAmount()){
  			statusInfo.setErrorStatus(true);
 			statusInfo.getErrorMsgs().add(new com.jmr.obdx.dto.ErrorMsg(messageSource.getMessage("field.accountno",new Object[] {}, locale),messageSource.getMessage("error.not.sufficient.amount",new Object[] {}, locale)));
          }*/
         else{
       	     McxLogin mcxLogin = loginRepo.findByUserName(authentication.getName());
   		     McxCustomerMapping mcxCustomerMapping =  mcxCustomerMappingRepo.findByMcxUser(new McxUser(mcxLogin.getMcxUser().getId()));
        	 McxAccountTypeM mcxAccountTypeM =accountTypeRepo.findByDescription(ownAccountTransferDto.getAccountType());
        	 McxCurrencyM mcxCurrencyM =currencyRepo.findByCurrencyType(ownAccountTransferDto.getCurrencyCode());
        	 McxTransactionM mcxTransactionM = mcxTransactionMRepo.findByProductDescription(Utility.OAT);
         	 Accountdetails accountdetails = accountDetailsRepo.findAccountBranchByAccountId(ownAccountTransferDto.getFromAccount());
        	transactionDataRepo.save(new McxTransactionData(new McxAccountTypeM(mcxAccountTypeM.getId()), mcxCurrencyM, mcxCustomerMapping.getCustomerId(), ownAccountTransferDto.getFromAccount(), ownAccountTransferDto.getToAccount(), ownAccountTransferDto.getToBranchCode(),ownAccountTransferDto.getFromBranchCode(), ownAccountTransferDto.getAmount(), new Date(), ownAccountTransferDto.getNote(),referenceid));
        	McxTransactionData mcxTransactionData = txnDataRepo.findByReferenceId(referenceid);
     		java.io.StringWriter sw = new StringWriter();
     		Date myDate = new Date();
     		JAXBContext contextObj = JAXBContext.newInstance(com.mcx.xml.SoapenvEnvelope.class);
     		Marshaller marshallerObj = contextObj.createMarshaller();
     		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
     		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
     		
     		com.mcx.xml.ContractDetailsFull contractDetailsFull = new com.mcx.xml.ContractDetailsFull(mcxTransactionM.getProductDescription(), mcxTransactionData.getReferenceId(), 
     				                                              new SimpleDateFormat("yyyy-MM-dd").format(mcxTransactionData.getTransferDate()), 
     				                                              mcxTransactionData.getToAccountNumber(),mcxTransactionData.getFromBranchCode(),mcxTransactionData.getMcxCurrencyM().getCurrencyDescription(), mcxTransactionData.getAmount(), 
     				                                              new SimpleDateFormat("yyyy-MM-dd").format(mcxTransactionData.getTransferDate()), mcxTransactionData.getToBranchCode(), 
     				                                              mcxTransactionData.getFromAccountNumber(),mcxTransactionData.getMcxCurrencyM().getCurrencyType(), mcxTransactionData.getAmount(), mcxTransactionData.getReferenceId(), "FLEXCUBE",
     				                                              new SimpleDateFormat("yyyy-MM-dd").format(mcxTransactionData.getTransferDate()), mcxTransactionM.getProductDescription(), "N", "TESTER5", 
     				                                              new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mcxTransactionData.getTransferDate()), "U", new SimpleDateFormat("yyyy-MM-dd").format(mcxTransactionData.getTransferDate()),
     				                                              mcxTransactionM.getProductDescription(), mcxTransactionM.getTransactionMode(), mcxTransactionData.getMcxCurrencyM().getCurrencyDescription(), "FLEXCUBE");
    		
     		McxHeader mcxHeader = new McxHeader("FCAT", "FCUBS", mcxTransactionData.getReferenceId(),"SYSTEM", mcxTransactionData.getFromBranchCode(), mcxTransactionM.getService(), mcxTransactionM.getOperation());
     		McxBody  mcxBody = new McxBody(contractDetailsFull);
     		CreateContractReq createContractReq = new CreateContractReq(mcxHeader, "http://fcubs.ofss.com/service/FCUBSFTService", mcxBody);
     		SoapBody soapBody = new SoapBody(createContractReq);
     		SoapenvEnvelope soapenvEnvelope = new SoapenvEnvelope("http://schemas.xmlsoap.org/soap/envelope/","http://fcubs.ofss.com/service/FCUBSFTService", soapBody);
     		StringWriter requestObj= objectMarshaller.marshallerToXml(soapenvEnvelope);
     		System.out.println(requestObj);
     		String responseString =mcxAdapter.getAdapterResponse(requestObj, "http://192.168.1.27:7001/FCUBSFTService/FCUBSFTService", "POST");
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
     		 mcxAuditLogRepo.save(new McxAuditLog(new McxUser(mcxLogin.getMcxUser().getId()),new McxTransactionM(mcxTransactionM.getId()),new McxTransactionData(mcxTransactionData.getId()), Status, new Date(), requestObjectBytr, responseStringBytr,hostReference));
     		 fundTransferDto.setStatus(Status);
     		 fundTransferDto.setFcdbRefId(referenceid);
     		 fundTransferDto.setHostRefId(hostReference);
              }
    	   return fundTransferDto;
        }
	
	/***
	 * Method used for Internal account transfer
	 * @param InternalAccountTransferDto - This object receives  the information of Internal Account Transfer
	 * @param authentication - Hold the information of login user
	 * @param locale A Locale object represents a specific geographical, political, or cultural region
	 * @param bindingResult General interface that represents binding results
	 * @return  FCDB reference id, host reference id and Status of the transaction
	 */
	
	public FundTransferInfo internalFundTransfer(Authentication authentication,InternalAccountTransferDto internalAccountTransfer, Locale locale,BindingResult bindingResult)throws Exception{
		
		 statusInfo=new StatusInfo();
		 fundTransferDto = new FundTransferInfo();

		
		 String  referenceid =utilities.getReferenceNumber(String.valueOf(System.currentTimeMillis()), 13);
		if (bindingResult.hasErrors()) {
			statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error -> {statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));
			});
		    }
       
        else{
         McxLogin mcxLogin = loginRepo.findByUserName(authentication.getName());
  		 McxCustomerMapping mcxCustomerMapping =  mcxCustomerMappingRepo.findByMcxUser(new McxUser(mcxLogin.getMcxUser().getId()));       	 
  		 McxAccountTypeM mcxAccountTypeM =accountTypeRepo.findByDescription(internalAccountTransfer.getAccountType());
       	 McxCurrencyM mcxCurrencyM =currencyRepo.findByCurrencyType(internalAccountTransfer.getCurrencyCode());
       	 McxTransactionM mcxTransactionM = mcxTransactionMRepo.findByProductDescription(Utility.OAT);
         McxBeneficiary mcxBeneficiary=	beneficiaryRepo.findById(internalAccountTransfer.getPayeeId());

       	 transactionDataRepo.save(new McxTransactionData(new McxAccountTypeM(mcxAccountTypeM.getId()), mcxCurrencyM, mcxCustomerMapping.getCustomerId(), internalAccountTransfer.getFromAccount(), internalAccountTransfer.getFromBranchCode(), mcxBeneficiary.getAccountNumber(), internalAccountTransfer.getAmount(), new Date(),"Intransit" , internalAccountTransfer.getNote(), referenceid, new McxTransferPurpose(internalAccountTransfer.getPurpose()), mcxBeneficiary));
       	 McxTransactionData mcxTransactionData = txnDataRepo.findByReferenceId(referenceid);
    		java.io.StringWriter sw = new StringWriter();
    		Date myDate = new Date();
    		JAXBContext contextObj = JAXBContext.newInstance(com.mcx.xml.SoapenvEnvelope.class);
    		Marshaller marshallerObj = contextObj.createMarshaller();
    		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    		
    		
    		com.mcx.xml.ContractDetailsFull contractDetailsFull = new com.mcx.xml.ContractDetailsFull(mcxTransactionM.getProductDescription(), mcxTransactionData.getReferenceId(), 
    				                                              new SimpleDateFormat("yyyy-MM-dd").format(mcxTransactionData.getTransferDate()), 
    				                                              mcxTransactionData.getToAccountNumber(),mcxTransactionData.getFromBranchCode(),mcxTransactionData.getMcxCurrencyM().getCurrencyDescription(), mcxTransactionData.getAmount(), 
    				                                              new SimpleDateFormat("yyyy-MM-dd").format(mcxTransactionData.getTransferDate()), mcxTransactionData.getToBranchCode(), 
    				                                              mcxTransactionData.getFromAccountNumber(),mcxTransactionData.getMcxCurrencyM().getCurrencyType(), mcxTransactionData.getAmount(), mcxTransactionData.getReferenceId(), "FLEXCUBE",
    				                                              new SimpleDateFormat("yyyy-MM-dd").format(mcxTransactionData.getTransferDate()), mcxTransactionM.getProductDescription(), "N", "TESTER5", 
    				                                              new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mcxTransactionData.getTransferDate()), "U", new SimpleDateFormat("yyyy-MM-dd").format(mcxTransactionData.getTransferDate()),
    				                                              mcxTransactionM.getProductDescription(), mcxTransactionM.getTransactionMode(), mcxTransactionData.getMcxCurrencyM().getCurrencyDescription(), "FLEXCUBE");
   		
    		McxHeader mcxHeader = new McxHeader("FCAT", "FCUBS", mcxTransactionData.getReferenceId(),"SYSTEM", internalAccountTransfer.getFromBranchCode(), mcxTransactionM.getService(), mcxTransactionM.getOperation());
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
 		             String wCode = responseString.substring(responseString.indexOf("<WCODE>") +7, responseString.indexOf("</WCODE>"));
 		             String wDesc = responseString.substring(responseString.indexOf("<WDESC>") +7, responseString.indexOf("</WDESC>"));
                 
    		         String errorCode = responseString.substring(responseString.indexOf("<ECODE>") +7, responseString.indexOf("</ECODE>"));
    		         String errorDescrption = responseString.substring(responseString.indexOf("<EDESC>") +7, responseString.indexOf("</EDESC>"));
    		  }
    		  else{
   		      hostReference = responseString.substring(responseString.indexOf("<REFERENCE_NO>") +12, responseString.indexOf("</REFERENCE_NO>"));

    		  }
    		  byte responseStringBytr[] =responseString.getBytes();
       		  System.out.println(responseString);
       		  byte requestObjectBytr[] =requestObj.toString().getBytes();
	     	  mcxAuditLogRepo.save(new McxAuditLog(new McxUser(mcxLogin.getMcxUser().getId()),new McxTransactionM(mcxTransactionM.getId()), new McxTransactionData(mcxTransactionData.getReferenceId()), Status,new Date(), requestObjectBytr, responseStringBytr,hostReference));
    		  fundTransferDto.setStatus(Status);
      		  fundTransferDto.setFcdbRefId(referenceid);
      		  fundTransferDto.setHostRefId(hostReference);
             }
   	         return fundTransferDto; 
       }
	
	
}
