package com.jmr.obdx.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import com.jmr.obdx.util.Utility;

/***
 * @author JMR
 */
@Component
public class CustomLogoutSuccessHandler implements LogoutSuccessHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomLogoutSuccessHandler.class);

	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse httpServletResponse, Authentication authentication)throws IOException, ServletException {
		 logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
	     httpServletResponse.setStatus(HttpServletResponse.SC_OK);
	     httpServletResponse.sendRedirect("/logout/succesfull");	
		 logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
	}
	
}
