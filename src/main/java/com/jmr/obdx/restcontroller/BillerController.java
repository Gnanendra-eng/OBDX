package com.jmr.obdx.restcontroller;

import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.service.BillerSevice;
import com.jmr.obdx.service.dto.BillerInfo;
import com.jmr.obdx.service.dto.FundTransferInfo;
import com.jmr.obdx.service.dto.InternalAccountTransferDto;
import com.jmr.obdx.service.dto.PayBillIDto;
import com.jmr.obdx.service.dto.PayBillInfo;
import com.jmr.obdx.service.dto.RegisterBillerDto;
import com.jmr.obdx.service.dto.UserAddedBillerInfo;
import com.jmr.obdx.util.Utility;

@RestController
@RequestMapping(value = "/biller")
public class BillerController {

	private final Logger logger = LoggerFactory.getLogger(BillerController.class);

	@Autowired
	private BillerSevice billerSevice;

	@RequestMapping(value = "/user/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<UserAddedBillerInfo> getUserAddedBillerInfo(Authentication authentication) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			UserAddedBillerInfo responceObj = billerSevice.getUserAddedBillerInfo(authentication);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<UserAddedBillerInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<UserAddedBillerInfo>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<UserAddedBillerInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<BillerInfo> getBillerInfo(Authentication authentication) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			BillerInfo responceObj = billerSevice.getBillerInfo(authentication);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<BillerInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<BillerInfo>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<BillerInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	
	@RequestMapping(value = "/payBills", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<PayBillInfo> payBill(@RequestBody @Valid PayBillIDto payBillIDto, Authentication authentication, Locale locale,BindingResult bindingResult) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			PayBillInfo responceObj = billerSevice.payBill(authentication,payBillIDto,locale,bindingResult);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<PayBillInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<PayBillInfo>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<PayBillInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}	
		
		
	

	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<StatusInfo> registerBiller(@RequestBody  RegisterBillerDto registerBillerDto ,Authentication authentication) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			StatusInfo responceObj = billerSevice.registerBiller(registerBillerDto,authentication);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<StatusInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<StatusInfo>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<StatusInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
