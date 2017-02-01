 package com.jmr.obdx.viewcontroller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jmr.obdx.util.Utility;

@org.springframework.stereotype.Controller
public class LoginController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String getHome() throws Exception{
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return "redirect:/login";
	}

	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	private String getLogin(HttpSession httpSession) throws Exception{
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			return "redirect:/auth";
		}
		httpSession.setAttribute(Utility.DEVICE, Utility.DEVICE_ID);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return "login";
	}

	@RequestMapping(value = "/login/authfail", method = RequestMethod.GET)
	private String getAuthFail() throws Exception{
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return "login-authfail";
	}

	@RequestMapping(value = "/logout/succesfull", method = RequestMethod.GET)
	private String getLogout()throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return "logout";
	}
	
	@RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
	private String getAccessdenied()throws Exception { 
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return "accessdenied";
	}
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	private String test()throws Exception { 
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return "test";
	}
	
}
