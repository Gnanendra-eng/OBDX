package com.jmr.obdx.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jmr.obdx.domain.Fcat_vw_accountdetails;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.util.Utility;

/***************************
 * @author PRITIRANJAN SWAIN
 * 
 ****************************/

@Repository
public class AccountDetailsService {
	// ------------------------------------------------------------------------------
			/**
			 * This method used to fetch the account details with currency and calls
			 * getMerchant() method
			 * 
			 * @param customerid
			 *            Getting the customer id from AccountDetailsControllers.
			 * @param nbrAccount
			 *           Getting the Account id from AccountDetailsControllers.
			 *@throws Exception
			 *            If a fatal error occurs.
			 **/
	//----------------------------------------------------------------------------------
	private static final Logger logger = LoggerFactory.getLogger(AccountDetailsService.class);
	@Autowired
	private Fcat_vw_accountdetails fcc_vw_accountdetails;
	@Autowired
	private AccountDetailsRepo accountDetailsRepo;
	
	public Fcat_vw_accountdetails getAccountDetails(String customerid ,long nbrAccount)  throws Exception
	{
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		return accountDetailsRepo.getAccountDetails(customerid, nbrAccount);
		}
	

}
	

