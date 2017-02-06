package com.jmr.obdx.restcontroller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.service.UserService;
import com.jmr.obdx.service.dto.UserInfo;
import com.jmr.obdx.service.dto.UserRegDto;
import com.jmr.obdx.util.Utility;
/***
 * @author JMR
 */
@RequestMapping(value = "/user")
@RestController
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService registrationService;

	/***
	 * This method is used for user registration.
	 * 
	 * @param userRegDto  This object receives the information of the user.
	 * @param bindingResult This object receives the information of the binding result.
	 * @return This method returns statusInfo.
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<StatusInfo> userRegister(@RequestBody @Valid UserRegDto userRegDto,BindingResult bindingResult) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			StatusInfo responceObj = registrationService.userRegister(userRegDto, bindingResult);
			if (responceObj.getErrorStatus()){
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
	
	

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<UserInfo> getRegisterdUserInfo() {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			UserInfo responceObj = registrationService.getRegisterdUserInfo("rishad");
			if (responceObj.getErrorStatus()){
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<UserInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<UserInfo>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<UserInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}
