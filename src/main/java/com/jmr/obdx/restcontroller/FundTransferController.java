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
import com.jmr.obdx.service.FundtransferService;
import com.jmr.obdx.service.dto.BeneficiaryDto;
import com.jmr.obdx.service.dto.InternalAccountTransferDto;
import com.jmr.obdx.service.dto.OwnAccountTransferDto;
import com.jmr.obdx.util.Utility;

@RestController
@RequestMapping(value = "/fundtransfer")
public class FundTransferController {
	
	@Autowired
	private FundtransferService fundtransferService;
	
	private final Logger logger = LoggerFactory.getLogger(FundTransferController.class);

	@RequestMapping(value = "/ownaccount", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<StatusInfo> ownAccountTransfer(@RequestBody @Valid OwnAccountTransferDto ownAccountTransferDto, Authentication authentication, Locale locale,BindingResult bindingResult) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			StatusInfo responceObj = fundtransferService.ownAccountTransfer(authentication,ownAccountTransferDto,locale,bindingResult);
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
		
	
/*	@RequestMapping(value = "/internal", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<StatusInfo> internalFundTransfer(@RequestBody @Valid InternalAccountTransferDto internalAccountTransfer, Authentication authentication, Locale locale,BindingResult bindingResult) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			StatusInfo responceObj = fundtransferService.internalFundTransfer(authentication,internalAccountTransfer,locale,bindingResult);
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

		
		
		
	}*/

}
