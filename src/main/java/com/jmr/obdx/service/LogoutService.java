package com.jmr.obdx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.UserSession;
import com.jmr.obdx.domain.UserSessionData;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.UserSessionDataRepo;
import com.jmr.obdx.repositories.UserSessionRepo;

@Service
public class LogoutService {

    @Autowired
    private  UserSessionDataRepo userSessionDataRepo;
    
    
    @Autowired
    private UserSessionRepo userSessionRepo; 
    
    @Autowired
    private LoginRepo loginRepo;
    
    
    public void deleteSessionInfo(String userName){
    	Login loginInfo=loginRepo.findByUsername(userName);
		List<UserSessionData> userSessionDataInfo=userSessionDataRepo.findByIduser(loginInfo.getId());
		List<UserSession> userSessionInfo=userSessionRepo.findByIduser(loginInfo.getId());
		userSessionRepo.delete(userSessionInfo);
		userSessionDataRepo.delete(userSessionDataInfo);
    }
	
	
}
