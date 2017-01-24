package com.jmr.obdx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import com.jmr.obdx.domain.AuthorityM;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.dto.UserRegDto;
import com.jmr.obdx.repositories.AuthorityMRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.util.Utility;

@Service
public class UserService {
	
	@Autowired
	private AuthorityMRepo authorityMRepo;
	
	@Autowired
	private LoginRepo loginRepo;
	
	private StatusInfo statusInfo;

	public StatusInfo userRegister(UserRegDto userRegDto,BindingResult bindingResult) throws Exception{
		  statusInfo=new StatusInfo();
	     if(bindingResult.hasErrors()){
	        statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error->{statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));});
		    return statusInfo;	
		 }
	     else{
	    	 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	 		 AuthorityM authorityM = authorityMRepo.findByTypeuser(Utility.ADMIN);
	 		/* loginRepo.save(new Login(userRegDto.getUserName(),passwordEncoder.encode(userRegDto.getPassword()),Byte.parseByte("1"),
	 				 Byte.parseByte("1"),Byte.parseByte("1"),Byte.parseByte("1") ,authorityM));*/
		     return statusInfo;	
	     }
	}

	
	
	
	
	
	
	
}
