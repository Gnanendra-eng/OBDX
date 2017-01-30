package com.jmr.obdx.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import com.jmr.obdx.service.LogoutService;

/***
 * @author JMR
 */
@Component
public class CustomLogoutSuccessHandler implements LogoutSuccessHandler {
	
	@Autowired
	private LogoutService logoutService;
    
	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse httpServletResponse, Authentication authentication)throws IOException, ServletException {
		if(authentication!=null){
			 logoutService.deleteSessionInfo(authentication.getName());		
			 httpServletResponse.setStatus(HttpServletResponse.SC_OK);
			 httpServletResponse.sendRedirect("/logout/succesfull");
		}		 
	}
	
}
