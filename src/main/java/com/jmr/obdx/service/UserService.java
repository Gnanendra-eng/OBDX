package com.jmr.obdx.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jmr.obdx.domain.McxAuthorityM;
import com.jmr.obdx.domain.McxLogin;
import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.repositories.McxAuthorityMRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.service.dto.UserRegDto;
import com.jmr.obdx.util.Utility;
/***
 * @author JMR
 */
@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private McxAuthorityMRepo mcxAuthorityMRepo;
	
	@Autowired
	private LoginRepo loginRepo;
	
	private StatusInfo statusInfo;
	
	
	/***
	 * This method is used for user registration.
	 * 
	 * @param userRegDto This object receives the information of the user.
	 * @param bindingResult  This object receives the information of the binding result.
	 * @return This method returns statusInfo.
	 * @throws Exception This object receives the information of the exception.
	 */
	public StatusInfo userRegister(UserRegDto userRegDto,BindingResult bindingResult) throws Exception{
		   logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		   statusInfo=new StatusInfo();
	     if(bindingResult.hasErrors()){
	        statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error->{statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));});
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		    return statusInfo;	
		 }
	     else{
	    	 if(loginRepo.findByUsername(userRegDto.getUserName()) == null){
	    		 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    		 /***
	    		  * Modified findByTypeUser() to findByMcxBaseUserTypeM() and McxLogin() constructor by Murugesh
	    		  */
	    		 McxAuthorityM mcxAuthorityM = mcxAuthorityMRepo.findByMcxBaseUserTypeM(Utility.ADMIN);
	    		 
		 		 loginRepo.save(new McxLogin(userRegDto.getUserName(),passwordEncoder.encode(userRegDto.getPassword()),"true","true","true","true" ,mcxAuthorityM));
				 logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			     return statusInfo;	
		     }
		     statusInfo.setErrorStatus(true);
	    	 statusInfo.getErrorMsgs().add(new ErrorMsg(Utility.USER_NAME,Utility.ALREADY_EXISITING));
			 logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
	    	 return statusInfo;
	     }
	}

}