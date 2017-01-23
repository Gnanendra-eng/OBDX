package com.jmr.obdx.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jmr.obdx.domain.AuthorityM;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.dto.UserInfo;
import com.jmr.obdx.dto.UserRegDto;
import com.jmr.obdx.repositories.AuthorityMRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.util.Utility;
/***
 * @author JMR
 */
@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private AuthorityMRepo authorityMRepo;
	
	@Autowired
	private LoginRepo loginRepo;
	
	private StatusInfo statusInfo;
	
	private UserInfo userInfo;
	
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
		 		 AuthorityM authorityM = authorityMRepo.findByTypeuser(Utility.ADMIN);
		 		 loginRepo.save(new Login(userRegDto.getUserName(),passwordEncoder.encode(userRegDto.getPassword()),"true","true","true","true" ,authorityM));
				 logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			     return statusInfo;	
		     }
		     statusInfo.setErrorStatus(true);
	    	 statusInfo.getErrorMsgs().add(new ErrorMsg(Utility.USER_NAME,Utility.ALREADY_EXISITING));
			 logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
	    	 return statusInfo;
	     }
	}
	
	/***
	 * 
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	 public UserInfo getRegisterdUserInfo( String userName) throws Exception{
	    logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		     userInfo=new UserInfo();
	    	 if(userName.isEmpty()||userName.equals("")){
	    		 userInfo.setErrorStatus(true);
	    		 userInfo.getErrorMsgs().add(new ErrorMsg(Utility.USER_NAME,Utility.ALREADY_EXISITING));
				 logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			     return userInfo;	
		     }
	    	 Login loginInfo= loginRepo.findByUsername(userName);
	    	 userInfo=new UserInfo(loginInfo.getUsername(), loginInfo.getPassword(), loginInfo.getIsactive(), loginInfo.getAccountnonexpired(),
	    			 loginInfo.getCredentialsnonexpired(), loginInfo.getAccountnonlocked());
			 logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
	    	 return userInfo;
	     }
	

}
