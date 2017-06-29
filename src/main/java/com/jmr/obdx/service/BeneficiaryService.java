package com.jmr.obdx.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.BeneficiaryM;
import com.jmr.obdx.domain.BranchM;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.McxTransactionM;
import com.jmr.obdx.domain.MstBranch;
import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.BeneficiaryRepo;
import com.jmr.obdx.repositories.BranchRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.MstBranchRepo;
import com.jmr.obdx.repositories.RetailCustomerRepo;
import com.jmr.obdx.service.dto.AllPayee;
import com.jmr.obdx.service.dto.BeneficiaryDto;
import com.jmr.obdx.service.dto.PayeeInfo;
import com.jmr.obdx.util.Utility;

@Service
public class BeneficiaryService {
	
	private static Logger logger = Logger.getLogger(BeneficiaryService.class);

	
	private StatusInfo statusInfo;
	
	private List<AllPayee> allPayee;
	
	private PayeeInfo payeeInfo;

	@Autowired
	private LoginRepo loginRepo;
	
	@Autowired
	private RetailCustomerRepo retailCustomerRepo;
	
	@Autowired
	private AccountDetailsRepo accountDetailsRepo;
	
	@Autowired
	private BeneficiaryRepo beneficiaryRepo;
	
	@Autowired
	private BranchRepo branchRepo;
	
	@Autowired
	private MstBranchRepo mstBranchRepo;
	
	private Utility utilities;
	
	
	public StatusInfo addBeneficiary(BeneficiaryDto beneficiaryDto , Authentication authentication, Locale locale,BindingResult bindingResult) throws Exception{
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
		Login login = loginRepo.findByUsername(authentication.getName());
		MstBranch  mstBranch=  mstBranchRepo.findByBankCode(beneficiaryDto.getBranchId());
		Accountdetails  accountdetails=  accountDetailsRepo.findByAccountno(beneficiaryDto.getAccountNumber());


        //BranchM branchDetailsM = branchRepo.findById(beneficiaryDto.getBranchId());
   	    beneficiaryRepo.save(new BeneficiaryM( mstBranch.getBranchCode(),login.getRetailCustomer().getIdcusomer(), beneficiaryDto.getPayeeName(), beneficiaryDto.getAccountName(),beneficiaryDto.getNickName(), beneficiaryDto.getAccountNumber(), "true", new Date(),"BankAccount",new McxTransactionM(5)));
		return statusInfo; 
	}

	public PayeeInfo viewBeneficiary(Authentication authentication,Locale locale){
		
		List<BeneficiaryM> beneficiaryM = beneficiaryRepo.findBeneficiary();
		payeeInfo = new PayeeInfo();
		allPayee = new ArrayList<>();
		beneficiaryM.stream().forEach(beneficiary->{
			allPayee.add(new AllPayee(beneficiary.getId(), beneficiary.getPayyename()));
		});
		payeeInfo.setAllPayee(allPayee);

		return payeeInfo;
	}
	
	
}
