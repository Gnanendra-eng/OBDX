package com.jmr.obdx.service;

import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.BeneficiaryM;
import com.jmr.obdx.domain.BranchDetailsM;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.RetailCustomer;
import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.BeneficiaryRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.RetailCustomerRepo;
import com.jmr.obdx.service.dto.BeneficiaryDto;

@Service
public class BeneficiaryService {
	
	private static Logger logger = Logger.getLogger(BeneficiaryService.class);

	
	private StatusInfo statusInfo;

	@Autowired
	private LoginRepo loginRepo;
	
	@Autowired
	private RetailCustomerRepo retailCustomerRepo;
	
	@Autowired
	private AccountDetailsRepo accountDetailsRepo;
	
	@Autowired
	private BeneficiaryRepo beneficiaryRepo;
	
	
	
	public StatusInfo addBeneficiary(BeneficiaryDto internalFundTransferDto , Authentication authentication, Locale locale,BindingResult bindingResult) throws Exception{
		statusInfo=new StatusInfo();
		if (bindingResult.hasErrors()) {
			statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error -> {statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));
			});
		    }
		/*Login login = loginRepo.findByUsername(authentication.getName());
		RetailCustomer retailCustomer = retailCustomerRepo.findByIduser(login.getId());
		List<Accountdetails> accountdetails = accountDetailsRepo.getBasicAccountDetails(retailCustomer.getIdcusomer());
		accountdetails.stream().forEach(accountdetail ->{
			if(accountdetail.getNBRACCOUNT() != internalFundTransferDto.getAccountNumber() && accountdetail.getNBRACCOUNT() == internalFundTransferDto.getBranchId()){
			}
			else{
				statusInfo.setErrorStatus(true);
	 			statusInfo.getErrorMsgs().add(new com.jmr.obdx.dto.ErrorMsg(messageSource.getMessage("field.accountno",new Object[] {}, locale),messageSource.getMessage("error.not.sufficient.amount",new Object[] {}, locale)));
	 			}
		});*/
		beneficiaryRepo.save(new BeneficiaryM(internalFundTransferDto.getAccountName(), new Long(internalFundTransferDto.getAccountNumber()), new BranchDetailsM(internalFundTransferDto.getBranchId()),internalFundTransferDto.getNickName(),internalFundTransferDto.getPayeeName(),internalFundTransferDto.getCreatedVie()));
   	    return statusInfo; 
	}

}
