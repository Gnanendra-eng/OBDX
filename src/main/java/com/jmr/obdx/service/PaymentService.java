package com.jmr.obdx.service;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.RetailCustomer;
import com.jmr.obdx.domain.TermDepositeM;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.AccountSummaryRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.RetailCustomerRepo;
import com.jmr.obdx.service.dto.AccountDetailsDto;
import com.jmr.obdx.service.dto.AccountSummaryDto;
import com.jmr.obdx.service.dto.PaymentInfoDto;
import com.jmr.obdx.service.dto.PaymentUpdate;
import com.jmr.obdx.service.dto.Paymentinfo;
import com.jmr.obdx.service.dto.TermDepositeDto;
import com.jmr.obdx.util.Utility;

@Service
public class PaymentService {
	
	private final static Logger logger = LoggerFactory.getLogger(PaymentService.class);
	
	private Paymentinfo paymentinfo;
	private List<PaymentInfoDto> paymentSummary;

	
	@Autowired
	private AccountDetailsRepo accountDetailsRepo;

	@Autowired
	private LoginRepo loginRepo;
	
	
	@Autowired
	private RetailCustomerRepo retailCustomerRepo;
	
	public Paymentinfo getPaymentDetails(Authentication authentication) throws Exception{
	  logger.info(Utility.ENTERED, new Object() {}.getClass().getEnclosingMethod());
		Login login = loginRepo.findByUsername(authentication.getName());
		RetailCustomer retailCustomer = retailCustomerRepo.findByIduser(login.getId());
		paymentinfo = new Paymentinfo();
		paymentSummary = new ArrayList<>();
		List<Accountdetails> accountdetails = accountDetailsRepo.getBasicAccountDetails(retailCustomer.getIdcusomer());
		accountdetails.stream().forEachOrdered(accountdetail ->{
			paymentSummary.add(new PaymentInfoDto(accountdetail.getNBRACCOUNT(),String.valueOf(accountdetail.getBALANCE())));
		});
	
    paymentinfo =new Paymentinfo(paymentSummary);
    return paymentinfo;
	}

	

	public PaymentUpdate getUpdateAmount(com.jmr.obdx.service.dto.PaymentDto paymentDto) {
		
		
		return null;
	}
}
