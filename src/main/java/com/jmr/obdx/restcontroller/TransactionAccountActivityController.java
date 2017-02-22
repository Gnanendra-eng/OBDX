package com.jmr.obdx.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jmr.obdx.service.TransactionAccountActivityService;
import com.jmr.obdx.service.dto.TransactionAccountActivityInfo;
import com.jmr.obdx.util.Utility;

@RequestMapping(value = "/user/transactionactivity")
@RestController
public class TransactionAccountActivityController {

	private static final Logger logger = LoggerFactory.getLogger(TransactionAccountActivityController.class);

	@Autowired
	private TransactionAccountActivityService transactionAccountActivityService;

	@RequestMapping(value = "/{customerId}/{nbrAccount}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<TransactionAccountActivityInfo> getTransactionAccountActivityInfo(@PathVariable("customerId") String customerId,@PathVariable("nbrAccount") String nbrAccount) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			TransactionAccountActivityInfo responceObj = transactionAccountActivityService.getTransactionAccountActivityInfo(customerId, nbrAccount);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<TransactionAccountActivityInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<TransactionAccountActivityInfo>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<TransactionAccountActivityInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/lastfive/{customerId}/{nbrAccount}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<TransactionAccountActivityInfo> getLastFiveTransactionAccountActivityInfo(@PathVariable("customerId") String customerId,@PathVariable("nbrAccount") String nbrAccount) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			TransactionAccountActivityInfo responceObj = transactionAccountActivityService.getLastFiveTransactionAccountActivityInfo(customerId, nbrAccount);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<TransactionAccountActivityInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<TransactionAccountActivityInfo>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<TransactionAccountActivityInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
