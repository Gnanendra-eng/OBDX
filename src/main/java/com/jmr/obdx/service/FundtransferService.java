package com.jmr.obdx.service;

import java.util.Date;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import com.jmr.obdx.domain.CurrencyM;
import com.jmr.obdx.domain.RetailCustomer;
import com.jmr.obdx.domain.TransactionData;
import com.jmr.obdx.domain.TransferType;
import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.repositories.RetailCustomerRepo;
import com.jmr.obdx.repositories.TransactionDataRepo;
import com.jmr.obdx.repositories.TransferTypeRepo;
import com.jmr.obdx.service.dto.OwnAccountTransferDto;

@Service
public class FundtransferService {
	
	
	@Autowired
	private StatusInfo statusInfo;
	
	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private TransactionDataRepo transactionDataRepo;
	
	@Autowired
	private RetailCustomerRepo retailCustomerRepo;
	
	@Autowired
	private TransferTypeRepo transferTypeRepo;
	
	private static Logger logger = Logger.getLogger(FundtransferService.class);

	public StatusInfo ownAccountTransfer(Authentication authentication,OwnAccountTransferDto ownAccountTransferDto,BindingResult bindingResult, Locale locale)throws Exception{
		if (bindingResult.hasErrors()) {
			statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error -> {statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));
			});
		 } 	
         if(ownAccountTransferDto.getSourceAccountNo()==ownAccountTransferDto.getDestinationAccountNo() && (ownAccountTransferDto.getAmount()== 0)){
 			statusInfo.setErrorStatus(true);
			statusInfo.getErrorMsgs().add(new com.jmr.obdx.dto.ErrorMsg(messageSource.getMessage("field.accountno",new Object[] {}, locale),messageSource.getMessage("error.date.not.valid.selection",new Object[] {}, locale)));
         }
         else{
        	 RetailCustomer  retailCustomer =retailCustomerRepo.findByCustomername(authentication.getName());
        	 TransferType transferType =transferTypeRepo.findByTransactionDatas(ownAccountTransferDto.getAccountType());
             transactionDataRepo.save(new TransactionData(new TransferType(transferType.getId()),new CurrencyM( ownAccountTransferDto.getCurrencyCode()),retailCustomer.getIdcusomer(), ownAccountTransferDto.getFromAccount(), ownAccountTransferDto.getToAccount(), ownAccountTransferDto.getBankCoad(), ownAccountTransferDto.getAmount(),new Date(), "Intransit"));
         }
    	 return statusInfo; 
    }
}
