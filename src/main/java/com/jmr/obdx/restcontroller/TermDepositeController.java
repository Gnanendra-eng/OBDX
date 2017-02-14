package com.jmr.obdx.restcontroller;

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

import com.jmr.obdx.service.TermDepositeService;
import com.jmr.obdx.service.dto.TermDepositeInfo;
import com.jmr.obdx.util.Utility;

@RequestMapping(value = "/user/termdeposit")
@RestController
public class TermDepositeController {
	
	private static final Logger logger = LoggerFactory.getLogger(TermDepositeController.class);
	
	@Autowired
	private TermDepositeService termDepositeService;
	
	@RequestMapping(value="/",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<TermDepositeInfo> getTermSummary(Authentication authentication){
		try 
		{
			logger.info(Utility.ENTERED + new Object(){}.getClass().getEnclosingMethod().getName());
			TermDepositeInfo responceObj =termDepositeService.getTermDeposite( authentication);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<TermDepositeInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<TermDepositeInfo>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<TermDepositeInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
			
		
		
	}
	

}
