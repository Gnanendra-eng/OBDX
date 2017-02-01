package com.jmr.obdx.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Component;

import com.jmr.obdx.service.LogoutService;
import com.jmr.obdx.util.Utility;

/***
 * @author JMR
 */
@Component
public class CustomLogoutHandler implements LogoutHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomLogoutHandler.class);

	@Autowired
	private LogoutService logoutService;

	@Override
	public void logout(HttpServletRequest request, HttpServletResponse httpServletResponse,Authentication authentication) {
		 logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
         if (authentication != null)
				logoutService.deleteSessionInfo(authentication.getName());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
	}
}
