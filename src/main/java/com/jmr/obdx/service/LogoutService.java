package com.jmr.obdx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmr.obdx.repositories.McxLoginRepo;

import com.jmr.obdx.domain.McxLogin;
import com.jmr.obdx.domain.McxUser;
import com.jmr.obdx.domain.McxUserSession;
import com.jmr.obdx.repositories.McxUserSessionRepo;
/***
 * 
 * @author Murugesh
 *
 */
@Service
public class LogoutService {

    @Autowired
    private  McxUserSessionRepo mcxUserSessionRepo;
    
    @Autowired
    private McxUserSessionRepo userSessionRepo; 
    
    @Autowired
    private McxLoginRepo loginRepo;
    
    public void deleteSessionInfo(String userName){
		
    	McxLogin loginInfo=loginRepo.findByUserName(userName);
		List<McxUserSession> userSessionInfo=mcxUserSessionRepo.findByMcxUser(new McxUser(loginInfo.getId()));
		userSessionRepo.delete(userSessionInfo);
    }
	
	
}
