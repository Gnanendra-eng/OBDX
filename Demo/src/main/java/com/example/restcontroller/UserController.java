package com.example.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.StatusInfo;
import com.example.dto.UserInfo;
import com.example.dto.UserRegDto;
import com.example.service.UserService;
import com.example.util.DemoUtil;

/***
 * @author RISHAD K
 */
@RequestMapping(value="/user")
@RestController
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired 
	private UserService userService;
	
	@RequestMapping(value = "/roles", method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<List<String>> getUserRole(@RequestParam String userName){
		try{
			logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
			List<String> responceObj=userService.getUserRole(userName);
			logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<List<String>>(responceObj,HttpStatus.OK);	
		}catch(Exception exception){
			logger.info(DemoUtil.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<StatusInfo> userRegister(@RequestBody UserRegDto userRegDto){
		try{
			logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
			StatusInfo responceObj=userService.userRegister(userRegDto);
			if(!responceObj.getErrorStatus()){
				logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<StatusInfo>(responceObj, HttpStatus.OK);	
			}else{
				logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<StatusInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
		}catch(Exception exception){
			logger.info(DemoUtil.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<StatusInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	@RequestMapping(value="/all",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	private List<UserInfo> getAllUsers() throws Exception{
		return userService.getAllUsers();
	}
	
	
	
	
	
	
	
}
