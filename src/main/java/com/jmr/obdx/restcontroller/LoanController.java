/*package com.jmr.obdx.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jmr.obdx.service.LoanService;
import com.jmr.obdx.service.dto.BasicLoanDetailsInfo;
import com.jmr.obdx.util.Utility;

@RequestMapping(value = "/user/loan")
@RestController
public class LoanController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoanController.class);

	@Autowired
	private LoanService loanService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<BasicLoanDetailsInfo> getBasicLoanDetails(Authentication authentication) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			BasicLoanDetailsInfo responceObj =loanService.getBasicLoanDetails(authentication);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<BasicLoanDetailsInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<BasicLoanDetailsInfo>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<BasicLoanDetailsInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
		

}
*/