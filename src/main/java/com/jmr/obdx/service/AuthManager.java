package com.jmr.obdx.service;

import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.UserSessionData;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.UserSessionDataRepo;

/***
 * @author JMR
 */
@Service
public class AuthManager {
	
	@Autowired
	private UserSessionDataRepo userSessionDataRepo;
	
	@Autowired
	private LoginRepo loginRepo;
	
	public String getUserRole(Authentication authentication, HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception{
		    configureHttpSession(httpServletRequest, httpServletResponse);
			//createUserSessionData(authentication);

			
		    UserDetails userDetails = (UserDetails) authentication.getPrincipal();
			//System.out.println(userDetails.getAuthorities().toString());

			
			
			
			
			
			return "userprofile";
	}
	
	

	protected void createUserSessionData(Authentication authentication) throws Exception{
		Login login=loginRepo.findByUsername(authentication.getName());
		userSessionDataRepo.save(new UserSessionData(new Login(login.getId()), getRandom()));
	}
	
	
	protected static final String getRandom ()throws Exception{
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	protected void configureHttpSession( HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception{
		HttpSession httpSession = httpServletRequest.getSession();
		httpSession.setMaxInactiveInterval(300);
		Cookie[] cookies = httpServletRequest.getCookies();
		if ((cookies != null) && (cookies.length > 0)) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("JSESSIONID")) {
					cookie.setMaxAge(86400);
					cookie.setHttpOnly(true);
					//cookie.setSecure(true);
					httpServletResponse.addCookie(cookie);
				}
			}
		}
	}

	
	
	
}
