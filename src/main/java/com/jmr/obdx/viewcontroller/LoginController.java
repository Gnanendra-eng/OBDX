 package com.jmr.obdx.viewcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jmr.obdx.util.Utility;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	private String getLogin() throws Exception{
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			return "redirect:/auth";
		}
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return "login";
	}
	
	
	
	
	@RequestMapping(value = "/authfail", method = RequestMethod.GET)
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
	
	@RequestMapping(value = "/auth", method = RequestMethod.GET)
	private String get()throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return "hi";
	}
	
}
