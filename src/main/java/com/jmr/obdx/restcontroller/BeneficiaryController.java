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
import com.jmr.obdx.service.BeneficiaryService;
import com.jmr.obdx.service.dto.BeneficiaryDto;
import com.jmr.obdx.service.dto.PayeeInfo;
import com.jmr.obdx.util.Utility;

/***
 * @author Pritiranjan Swain (JMR Infotech)
 */
@RequestMapping(value = "/beneficiary")
@RestController
public class BeneficiaryController {
	
	private static final Logger logger = LoggerFactory.getLogger(BeneficiaryController.class);
	
	@Autowired
	private BeneficiaryService beneficiaryService;
	
	/***
	 * Adding a new Beneficiary.
	 * @param beneficiaryDto-Hold the user input Beneficiary details
	 * @param authentication- Hold the currently logined user info
	 * @param locale -A Locale object represents a specific geographical, political, or cultural region
	 * @param bindingResult-General interface that represents binding results.
	 * @return StatusInfo
	 */

	
	@RequestMapping(value = "/addbeneficiary", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<StatusInfo> addBeneficiary(@RequestBody @Valid BeneficiaryDto beneficiaryDto, Authentication authentication, Locale locale,BindingResult bindingResult) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			StatusInfo responceObj = beneficiaryService.addBeneficiary(beneficiaryDto,authentication,locale,bindingResult);
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

	
	/***
	 * Return all Beneficiary for the logined user
	 * @param authentication -Hold the currently logined user info
	 * @param locale A Locale object represents a specific geographical, political, or cultural region
	 * @return Return all Beneficiary for the logined user
	 */
	@RequestMapping(value = "/viewbeneficiary", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<PayeeInfo> viewBeneficiary( Authentication authentication, Locale locale) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			PayeeInfo responceObj = beneficiaryService.viewBeneficiary(authentication,locale);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<PayeeInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<PayeeInfo>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<PayeeInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
