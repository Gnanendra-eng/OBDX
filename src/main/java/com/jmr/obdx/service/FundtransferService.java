package com.jmr.obdx.service;

import java.util.Date;
import java.util.List;
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
import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.BranchM;
import com.jmr.obdx.domain.CurrencyM;
import com.jmr.obdx.domain.BeneficiaryM;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.McxTransactionM;
import com.jmr.obdx.domain.RetailCustomer;
import com.jmr.obdx.domain.TxnData;
import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.AccountTypeRepo;
import com.jmr.obdx.repositories.CurrencyRepo;
import com.jmr.obdx.repositories.BeneficiaryRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.McxTransactionMRepo;
import com.jmr.obdx.repositories.RetailCustomerRepo;
import com.jmr.obdx.repositories.TxnDataRepo;
import com.jmr.obdx.service.dto.BeneficiaryDto;
import com.jmr.obdx.service.dto.OwnAccountTransferDto;
import com.jmr.obdx.util.Utility;
import com.mcx.xml.ADDL;
import com.mcx.xml.CREATEPCCONTRACT_FSFS_REQ;
import com.mcx.xml.PctbContractMasterFull;


@Service
public class FundtransferService {

	

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
	
	private Utility utilities;
	
	
	
	private static Logger logger = Logger.getLogger(FundtransferService.class);


	public StatusInfo ownAccountTransfer(Authentication authentication,OwnAccountTransferDto ownAccountTransferDto, Locale locale,BindingResult bindingResult)throws Exception{
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
        /* if(ownAccountTransferDto.getFromAccountBalancy() < ownAccountTransferDto.getAmount()){
  			statusInfo.setErrorStatus(true);
 			statusInfo.getErrorMsgs().add(new com.jmr.obdx.dto.ErrorMsg(messageSource.getMessage("field.accountno",new Object[] {}, locale),messageSource.getMessage("error.not.sufficient.amount",new Object[] {}, locale)));
          }*/
         else{
        	 RetailCustomer  retailCustomer =retailCustomerRepo.findByCustomername(authentication.getName());
        	 AccountTypeM accountTypeM =accountTypeRepo.findByDescription(ownAccountTransferDto.getAccountType());
        	 CurrencyM currencyM =currencyRepo.findByCurrencyType(ownAccountTransferDto.getCurrencyCode());
        	 
        	 McxTransactionM mcxTransactionM = mcxTransactionMRepo.findByProddesc("own account Transfer");
        	 transactionDataRepo.save(new TxnData(new McxTransactionM(mcxTransactionM.getId()), new AccountTypeM(accountTypeM.getId()), currencyM, retailCustomer.getIdcusomer(), ownAccountTransferDto.getFromAccount(), ownAccountTransferDto.getToAccount(), ownAccountTransferDto.getBranchCode(), ownAccountTransferDto.getAmount(), new Date(), "Intransit", ownAccountTransferDto.getNote(),referenceid));
         }
    	 return statusInfo; 
    }
	
	/*public StatusInfo ownAccountTransferXml() throws Exception{
		
	    JAXBContext contextObj = JAXBContext.newInstance(PctbContractMasterFull.class); 
	    Marshaller marshallerObj = contextObj.createMarshaller();  
	    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    PctbContractMasterFull pctbContractMasterFull= new PctbContractMasterFull("FCDB", "FCDB", pRDCAT, pRDCOD, tXNCCY, cUSACCCY, aCTAMT, rEMRK, cUSTBRN, cPACNO, aCBRN1, cUSACNO, cPBNKCOD, aCTDT, aUTHSTAT);
	    ADDL addl = new ADDL(pARAM, nAME, vALUE);
	    CREATEPCCONTRACT_FSFS_REQ createpccontract_FSFS_REQ = new CREATEPCCONTRACT_FSFS_REQ(fCUBS_HEADER, sOURCE, uBSCOMP, mSGID, cORRELID, uSERID, bRANCH, sERVICE, oPERATION, sOURCE_OPERATION, aDDL, fCUBS_BODY, pctbContractMasterFull);
	    

		
		
	}*/
	
}
