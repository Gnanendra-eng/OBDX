package com.jmr.mcx.service;
/*package com.jmr.obdx.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.RetailCustomer;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.JmrcurrencymRepo;
import com.jmr.obdx.repositories.McxLoginRepo;
import com.jmr.obdx.repositories.RetailCustomerRepo;
import com.jmr.obdx.service.dto.OwnAccountPaymentDto;
import com.jmr.obdx.service.dto.PaymentInfoDto;
import com.jmr.obdx.service.dto.PaymentUpdate;
import com.jmr.obdx.service.dto.Paymentinfo;
import com.jmr.obdx.util.Utility;

@Service
public class PaymentService {
	
	private final static Logger logger = LoggerFactory.getLogger(PaymentService.class);
	private Paymentinfo paymentinfo;
	
	@Autowired
	private AccountDetailsRepo accountDetailsRepo;

	@Autowired
	private McxLoginRepo loginRepo;

	@Autowired
	private RetailCustomerRepo retailCustomerRepo;
	
	@Autowired
	private JmrcurrencymRepo jmrcurrencymRepo;
	
	public Paymentinfo getPaymentDetails(Authentication authentication) throws Exception{
		logger.info(Utility.ENTERED, new Object() {}.getClass().getEnclosingMethod());
		paymentinfo=new Paymentinfo();
		Login login = loginRepo.findByUserName(authentication.getName());
		RetailCustomer retailCustomer = retailCustomerRepo.findByIduser(login.getId());
		List<Accountdetails> accountdetails = accountDetailsRepo.findAllAccountByCustomerId(retailCustomer.getIdcusomer());
		List<String> jmrcurrencyms=jmrcurrencymRepo.findByJmrCurrencyShortName();
		accountdetails.stream().forEachOrdered(accountdetail -> {
			paymentinfo.getPaymentInfoDtos().add(new PaymentInfoDto(accountdetail.getNBRACCOUNT(), String.valueOf(accountdetail.getBALANCE()),accountdetail.getCCYDESC()));
		});
		paymentinfo.setCurrencies(jmrcurrencyms);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return paymentinfo;
	}

	public PaymentUpdate getUpdateAmount(OwnAccountPaymentDto ownAccountPaymentDto) {

		
		
		return null;
	
	
	}
	
	
	
}
*/