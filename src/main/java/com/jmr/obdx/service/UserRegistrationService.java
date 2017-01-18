package com.jmr.obdx.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jmr.obdx.dto.UserRegDto;

@Service
public class UserRegistrationService {
	
	
	public void userRegister(UserRegDto userRegDto,BindingResult bindingResult){
	        if(bindingResult.hasErrors()){
			  HashMap<String,String> hashMap=new HashMap<>();
			  bindingResult.getFieldErrors().forEach(error->{ hashMap.put(error.getField(), error.getDefaultMessage());
		     });
		
	}
		
  }
	
}
