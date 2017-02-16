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

import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.UserSession;
import com.jmr.obdx.domain.UserSessionData;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.UserSessionDataRepo;
import com.jmr.obdx.repositories.UserSessionRepo;
import com.jmr.obdx.util.Utility;

/***
 * @author JMR
 */
@Service
public class AuthManager {
	
	@Autowired
	private UserSessionDataRepo userSessionDataRepo;
	
	@Autowired
	private LoginRepo loginRepo;
	
	@Autowired
	private UserSessionRepo userSessionRepo;
	
	private static Logger logger = Logger.getLogger(AuthManager.class);

	@Value("${com.jmr.obdx.user.activetimeout}")
	protected Integer activeTimeOut;

	@Value("${com.jmr.obdx.user.timeout}")
	protected Integer timeOut;
	
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
		 Login login=loginRepo.findByUsername(authentication.getName());
		 if(userSessionRepo.findByIduser(login.getId()).size()==0){
			 String idSession=getRandom();
			 userSessionDataRepo.save(new UserSessionData(idSession,login.getId()));
			 userSessionRepo.save(new UserSession(idSession,new Date(httpServletRequest.getSession().getCreationTime()),
					 new Date(httpServletRequest.getSession().getLastAccessedTime()),login.getId(),httpServletRequest.getRemoteAddr(),
					 httpServletRequest.getSession().getId(),httpServletRequest.getProtocol(),authentication.getName(),Calendar.getInstance().getTimeZone().toZoneId().toString(),
					 httpServletRequest.getLocale().getLanguage(),userDetails.getAuthorities().toString().replaceAll("\\[", "").replaceAll("\\]",""),timeOut,activeTimeOut,false,(String) httpSession.getAttribute(Utility.DEVICE))); 
		 }
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
	}
	
	
	protected static final String getRandom ()throws Exception{
		return  UUID.randomUUID().toString();
	}
	
	
	protected void configureHttpSession( HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception{
	   logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		HttpSession httpSession = httpServletRequest.getSession();
		httpSession.setMaxInactiveInterval(timeOut);
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
