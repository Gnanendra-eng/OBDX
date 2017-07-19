package com.jmr.obdx.service;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.jmr.obdx.repositories.McxLoginRepo;

import com.jmr.obdx.domain.McxLogin;
import com.jmr.obdx.domain.McxUser;
import com.jmr.obdx.domain.McxUserSession;
import com.jmr.obdx.repositories.McxUserSessionRepo;
import com.jmr.obdx.util.Utility;

/***
 * @author JMR
 */
@Service
public class AuthManager {
	
	@Autowired
	private McxLoginRepo loginRepo;
	
	@Autowired
	private McxUserSessionRepo userSessionRepo;
	
	private static Logger logger = Logger.getLogger(AuthManager.class);

	@Value("${com.jmr.obdx.user.activetimeout}")
	protected Integer activeTimeOut;

	@Value("${com.jmr.obdx.user.timeout}")
	protected Integer timeOut;
	
	@Value("${com.jmr.mcx.user.session.isvalid}")
	protected String isUserValid;
	
	public String getUserAuthInfo(Authentication authentication, HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,HttpSession httpSession) throws Exception{
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		    configureHttpSession(httpServletRequest, httpServletResponse);
			createUserSessionData(authentication,httpServletRequest,httpSession);
			
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return "userprofile";
	}
	
	

	protected void createUserSessionData(Authentication authentication,HttpServletRequest httpServletRequest,HttpSession httpSession) throws Exception{
		 logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
	     UserDetails userDetails = (UserDetails) authentication.getPrincipal();
			 McxLogin mcxLogin=loginRepo.findByUserName(authentication.getName());
		 /***
		  * Modified findByMcxUser(login.getId.size == 0) to findByMcxUser(new McxUser(mcxLogin.getId())).equals(null)) by Murugesh on 17/07/2017
		  */
		 if(userSessionRepo.findByMcxUser(new McxUser(mcxLogin.getId())).equals(null)){
			 String sessionId=getRandom();
			 //userSessionDataRepo.save(new McxUserSession(sessionId,new McxUser(mcxLogin.getId())));
			 /***
			  * modified UserSession to McxUserSession and removed userSessionData by Murugesh on 17/07/2017
			  */
			
			 userSessionRepo.save(new McxUserSession(new McxUser(mcxLogin.getId()), sessionId, new Date(httpServletRequest.getSession().getCreationTime()), new Date(httpServletRequest.getSession().getLastAccessedTime()), 
					 httpServletRequest.getLocale().getLanguage(), httpServletRequest.getRemoteAddr(), timeOut,httpServletRequest.getProtocol(), activeTimeOut, Calendar.getInstance().getTimeZone().toZoneId().toString(), authentication.getName(), isUserValid ,(String) httpSession.getAttribute(Utility.DEVICE)));
		 }
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
	}
	
	
	protected static final String getRandom ()throws Exception{
		return  UUID.randomUUID().toString();
	}
	
	
	protected void configureHttpSession( HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception{
	   logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		HttpSession httpSession = httpServletRequest.getSession();
		//httpSession.setMaxInactiveInterval(timeOut);
		Cookie[] cookies = httpServletRequest.getCookies();
		if ((cookies != null) && (cookies.length > 0)) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("JSESSIONID")) {
					//cookie.setMaxAge(activeTimeOut);
					cookie.setHttpOnly(true);
					//cookie.setSecure(true);
					httpServletResponse.addCookie(cookie);
				}
			}
		}
	  logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
	}
	
}
