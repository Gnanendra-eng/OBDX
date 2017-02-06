package com.jmr.obdx.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.RetailCustomer;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.RetailCustomerRepo;
import com.jmr.obdx.service.dto.AccountDetailsDto;
import com.jmr.obdx.service.dto.BasicAccountDetailsDto;
import com.jmr.obdx.util.Utility;

@Service
public class AccountService {

	private static Logger logger = Logger.getLogger(AccountService.class);
	
	@Autowired
	private RetailCustomerRepo retailCustomerRepo;

	@Autowired
	private LoginRepo loginRepo;

	@Autowired
	private AccountDetailsRepo accountDetailsRepo;

	private BasicAccountDetailsDto basicAccountDetailsDto;
	
	private AccountDetailsDto accountDetailsDto;
	
	public BasicAccountDetailsDto getBasicAccountDetails(Authentication authentication) throws Exception{
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		basicAccountDetailsDto=new BasicAccountDetailsDto(); 
		Login login = loginRepo.findByUsername(authentication.getName());
		RetailCustomer retailCustomer = retailCustomerRepo.findByIduser(login.getId());
		List<Accountdetails> accountdetails = accountDetailsRepo.getBasicAccountDetails(retailCustomer.getIdcusomer());
		List<String>  tempAccountDetails=new ArrayList<>();
		accountdetails.stream().forEach(accountdetail -> {
			tempAccountDetails.add(accountdetail.getNBRACCOUNT());
		});
		basicAccountDetailsDto.setNbrAccounts(tempAccountDetails);
		basicAccountDetailsDto.setCustomerId(retailCustomer.getIdcusomer());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return basicAccountDetailsDto;
	}
	
	public AccountDetailsDto getAccountDetails(String customerId,String nbrAccount) throws Exception{
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		accountDetailsDto=new AccountDetailsDto();
		Accountdetails accountdetail = accountDetailsRepo.getAccountDetails(customerId,nbrAccount);
		accountDetailsDto=new AccountDetailsDto(accountdetail.getIDCUSTOMER(), accountdetail.getNBRBRANCH(), 
					accountdetail.getNBRACCOUNT(), accountdetail.getACCTTYPE(), accountdetail.getACCTSTATUS(),
					accountdetail.getCCYDESC(),accountdetail.getBALANCE(), accountdetail.getOPENINGBALANCE(), accountdetail.getAVAILABLEBALANCE(),
					accountdetail.getISCHQBOOK(), accountdetail.getISOVERDRAFT(),accountdetail.getISSI(), accountdetail.getNUMUNCOLLECTED(), accountdetail.getMINBALANCE(),
					accountdetail.getDAILYWITHDRAWALLIMIT(), accountdetail.getCUSTOMERSHORTNAME(), accountdetail.getCUSTOMERNAME(), accountdetail.getOPENINGDATE(), 
					accountdetail.getIBAN_AC_NO(), accountdetail.getRELATION(), accountdetail.getDESCACCTTYPE(), 
					accountdetail.getAMOUNTONHOLD(), accountdetail.getODLIMIT(), accountdetail.getDAILYLIMIT(), accountdetail.getELIGIBLEADV(), accountdetail.getODLMTSTRTDATE(), 
					accountdetail.getODLMTENDDATE(), accountdetail.getORIGAVAILABLEBAL());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return accountDetailsDto;
	}
	
}
