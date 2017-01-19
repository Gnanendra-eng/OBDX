package com.jmr.obdx.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Login;
import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.util.Utility;

@Service
public class UserNameService {
	private static final Logger logger = LoggerFactory.getLogger(UserNameService.class);

	
	@Autowired
	private LoginRepo loginRepo;
	private StatusInfo statusInfo;
	


	public StatusInfo getUserName(String userName) throws Exception{
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		statusInfo = new StatusInfo();
		Login login = loginRepo.findByUsername(userName);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		if (login == null) {
	        statusInfo.setErrorStatus(true);
	        statusInfo.getErrorMsgs().add(new ErrorMsg("userName", "Not a Valid User"));
	        return statusInfo;
	       }
		 
		return statusInfo;
			
	}

}
