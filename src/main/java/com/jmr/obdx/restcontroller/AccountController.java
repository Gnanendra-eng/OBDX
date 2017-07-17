package com.jmr.obdx.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jmr.obdx.service.AccountService;
import com.jmr.obdx.service.dto.AccountBranch;
import com.jmr.obdx.service.dto.AccountDetailsDto;
import com.jmr.obdx.service.dto.AccountSummaryInfo;
import com.jmr.obdx.service.dto.BasicAccountDetailsDto;
import com.jmr.obdx.service.dto.LoanSummayInfo;
import com.jmr.obdx.util.Utility;


/***
 * @author Pritiranjan Swain (JMR Infotech)
 */

@RequestMapping(value = "/user/accountdetails")
@RestController
public class AccountController {

	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	@Autowired
	private AccountService accountService;
	
	/***
	 * Returns all account number hold login user
	 * @param authentication-Hold Login user info.
	 * @return  all account number hold login user
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<BasicAccountDetailsDto> getBasicAccountDetails(Authentication authentication) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			BasicAccountDetailsDto responceObj = accountService.getBasicAccountDetails(authentication);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<BasicAccountDetailsDto>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<BasicAccountDetailsDto>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<BasicAccountDetailsDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	
	/***
	 * Return the information for a particular account
	 * 
	 * @param customerId -Hold login customerId what had mapped with login user
	 * @param nbrAccount -Hold a account info.
	 * @return - Details about a particular account
	 */
	
	@RequestMapping(value = "/{customerId}/{nbrAccount}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<AccountDetailsDto> getAccountDetails(@PathVariable("customerId") String customerId,@PathVariable("nbrAccount") String nbrAccount) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			AccountDetailsDto responceObj = accountService.getAccountDetails(customerId, nbrAccount);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<AccountDetailsDto>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<AccountDetailsDto>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<AccountDetailsDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	/***
	 * Returns account details of login user
	 * @param authentication-Hold Login user info.
	 * @return Return account details
	 */
	@RequestMapping(value="/summary",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<AccountSummaryInfo> getAccountsummary(Authentication authentication){
		try {
			logger.info(Utility.ENTERED + new Object(){}.getClass().getEnclosingMethod().getName());
			AccountSummaryInfo responceObj = accountService.getAccountSummary( authentication);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<AccountSummaryInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<AccountSummaryInfo>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<AccountSummaryInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	/***
	 * Returns sum of loan account and there details
	 * @param authentication
	 * @return Returns sum of loan account and there details
	 */
	@RequestMapping(value="/loansummary",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<LoanSummayInfo> getLoansummary(Authentication authentication){
		try {
			logger.info(Utility.ENTERED + new Object(){}.getClass().getEnclosingMethod().getName());
			LoanSummayInfo responceObj = accountService.getLoansummary( authentication);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<LoanSummayInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<LoanSummayInfo>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<LoanSummayInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/***
	 * Returns the branch details for a particular account
	 * @param nbrAccount - Hold the user input account number 
	 * @return  Returns the branch details for a particular account
	 */
	
	@RequestMapping(value = "/{nbrAccount}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<AccountBranch> getAccountBranch(@PathVariable("nbrAccount") String nbrAccount) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			AccountBranch responceObj = accountService.getAccountBranch(nbrAccount);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<AccountBranch>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<AccountBranch>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<AccountBranch>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
}
