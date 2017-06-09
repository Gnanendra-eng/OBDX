package com.jmr.obdx.service;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.BranchDetailsM;
import com.jmr.obdx.domain.CurrencyM;
import com.jmr.obdx.domain.FundTransfer;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.RetailCustomer;
import com.jmr.obdx.domain.TransactionData;
import com.jmr.obdx.domain.TransferType;
import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.CurrencyRepo;
import com.jmr.obdx.repositories.FundTransferRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.RetailCustomerRepo;
import com.jmr.obdx.repositories.TransactionDataRepo;
import com.jmr.obdx.repositories.TransferTypeRepo;
import com.jmr.obdx.service.dto.InternalFundTransferDto;
import com.jmr.obdx.service.dto.OwnAccountTransferDto;


@Service
public class FundtransferService {

	

	private StatusInfo statusInfo;

	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private TransactionDataRepo transactionDataRepo;
	
	@Autowired
	private RetailCustomerRepo retailCustomerRepo;
	
	@Autowired
	private TransferTypeRepo transferTypeRepo;
	
	@Autowired
	private CurrencyRepo currencyRepo;
	
	@Autowired
	private AccountDetailsRepo accountDetailsRepo;
	
	@Autowired
	private LoginRepo loginRepo;
	
	@Autowired
	private FundTransferRepo fundTransferRepo;
	
	
	
	private static Logger logger = Logger.getLogger(FundtransferService.class);


	public StatusInfo ownAccountTransfer(Authentication authentication,OwnAccountTransferDto ownAccountTransferDto, Locale locale,BindingResult bindingResult)throws Exception{
		statusInfo=new StatusInfo();
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
        	 TransferType transferType =transferTypeRepo.findByDescription(ownAccountTransferDto.getAccountType());
        	 CurrencyM currencyM =currencyRepo.findByCurrencyType(ownAccountTransferDto.getCurrencyCode());
             transactionDataRepo.save(new TransactionData(new TransferType(transferType.getId()),currencyM,retailCustomer.getIdcusomer(),ownAccountTransferDto.getFromAccount(), ownAccountTransferDto.getToAccount(), ownAccountTransferDto.getBranchCode(), ownAccountTransferDto.getAmount(),new Date(), "Intransit"));
         }
    	 return statusInfo; 
    }
	
	public StatusInfo internalTransfer(InternalFundTransferDto internalFundTransferDto , Authentication authentication, Locale locale,BindingResult bindingResult) throws Exception{
		statusInfo=new StatusInfo();
		if (bindingResult.hasErrors()) {
			statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error -> {statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));
			});
		    }
		Login login = loginRepo.findByUsername(authentication.getName());
		RetailCustomer retailCustomer = retailCustomerRepo.findByIduser(login.getId());
		List<Accountdetails> accountdetails = accountDetailsRepo.getBasicAccountDetails(retailCustomer.getIdcusomer());
		accountdetails.stream().forEach(accountdetail ->{
			if(accountdetail.getNBRACCOUNT() != internalFundTransferDto.getAccountNumber() && accountdetail.getNBRACCOUNT() == internalFundTransferDto.getBranchId()){
			fundTransferRepo.save(new FundTransfer(internalFundTransferDto.getAccountName(),new Long( internalFundTransferDto.getAccountNumber()),new BranchDetailsM(internalFundTransferDto.getBranchId()),internalFundTransferDto.getNickName(),internalFundTransferDto.getPayeeName(),internalFundTransferDto.getTransferVie()));
			}
			/*else{
				statusInfo.setErrorStatus(true);
	 			statusInfo.getErrorMsgs().add(new com.jmr.obdx.dto.ErrorMsg(messageSource.getMessage("field.accountno",new Object[] {}, locale),messageSource.getMessage("error.not.sufficient.amount",new Object[] {}, locale)));
	 			}*/
		});
   	 return statusInfo; 
	}
	
}
