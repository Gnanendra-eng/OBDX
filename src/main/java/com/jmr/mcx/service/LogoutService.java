package com.jmr.mcx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmr.mcx.domain.McxLogin;
import com.jmr.mcx.domain.McxUser;
import com.jmr.mcx.domain.McxUserSession;
import com.jmr.mcx.repositories.McxLoginRepo;
import com.jmr.mcx.repositories.McxUserSessionRepo;
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
