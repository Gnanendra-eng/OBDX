package com.jmr.mcx.restcontroller;

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

import com.jmr.mcx.dto.StatusInfo;
import com.jmr.mcx.service.BillerSevice;
import com.jmr.mcx.service.dto.BillerInfo;
import com.jmr.mcx.service.dto.PayBillIDto;
import com.jmr.mcx.service.dto.PayBillInfo;
import com.jmr.mcx.service.dto.RegisterBillerDto;
import com.jmr.mcx.service.dto.UserAddedBillerInfo;
import com.jmr.mcx.util.Utility;


/***
 * @author Pritiranjan Swain (JMR Infotech)
 */
@RestController
@RequestMapping(value = "/biller")
public class BillerController {

	private final Logger logger = LoggerFactory.getLogger(BillerController.class);

	@Autowired
	private BillerSevice billerSevice;
	
	/***
	 * Gives all mapped biller for the user
	 * 
	 * @param authentication - Hold the login user info.
	 * @return all mapped biller for the user
	 */

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
	
	/***
	 * Get all the biller info form UBS
	 * @param authentication - Hold the login user info.
	 * @return All biller info from UBS
	 */
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

/***
 * Used for Paybills
 * @param payBillIDto Receives the paybill info.
 * @param authentication - Hold the login user info.
 * @param locale -A Locale object represents a specific geographical, political, or cultural region. 
 * @param bindingResult-Represents binding results
 * @return  FCDB reference id,Host reference id and Status of the transaction
 */
	
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
		
		
	/***
	 * Add in biller
	 * @param registerBillerDto -Receives requested biller info.
	 * @param authentication -Hold the login user info.
	 * @return StatusInfo.
	 */

	
	
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
