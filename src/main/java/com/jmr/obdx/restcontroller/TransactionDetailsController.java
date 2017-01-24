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

import com.jmr.obdx.domain.Fcc_vw_txnaccountactivity;
import com.jmr.obdx.dto.FccTrancationInfo;
import com.jmr.obdx.service.TransactionDetailsService;
import com.jmr.obdx.util.Utility;

/***************************
 * @author PRITIRANJAN SWAIN
 * 
 ****************************/
@RequestMapping(value = "/user")
@RestController
public class TransactionDetailsController {
// ------------------------------------------------------------------------------
		/**
		 * This method used to fetch the account details with currency and calls
		 * getMerchant() method
		 * 
		 * @param customerid
		 *            Getting the customer id from User.
		 * @param nbrAccount
		 *           Getting the Account id from User.
		 *
		 **/
//----------------------------------------------------------------------------------
	private static final Logger logger= LoggerFactory.getLogger(TransactionDetailsController.class);
	@Autowired
	private TransactionDetailsService transactiondetailsservice;
	
	@RequestMapping(value="/TransactionDetails/{customerid}/{nbrAccount}/",method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<FccTrancationInfo> getTransactionDetails(@PathVariable("customerid")  Integer customerid,@PathVariable("nbrAccount")String nbrAccount){
		try {
		 	logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());		 	
		 	FccTrancationInfo responceObj=transactiondetailsservice.getTransactionDetails(customerid, nbrAccount);
			if (responceObj.getErrorStatus()){
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
                return new ResponseEntity<FccTrancationInfo>(responceObj,HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<FccTrancationInfo>(responceObj,HttpStatus.OK);
	    }
		catch(Exception exception){
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
		 	return new ResponseEntity<FccTrancationInfo>(HttpStatus.BAD_REQUEST);
	}
	}
 }
				