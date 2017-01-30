package com.jmr.obdx.viewcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.jmr.obdx.service.AuthManager;
import com.jmr.obdx.util.Utility;

/***
 * @author JMR
 */
@Controller
public class AuthController {

	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

	@Autowired
	private AuthManager authManager;

	@RequestMapping(value = "/auth", method = RequestMethod.GET)
	private ModelAndView getUserAuthInfo(Authentication authentication, HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse, ModelAndView modelAndView) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			String responceView = authManager.getUserRole(authentication, httpServletRequest,httpServletResponse);
			if(responceView!=null){
				modelAndView.setStatus(HttpStatus.OK);
				modelAndView.setView(new RedirectView(responceView));
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return modelAndView;	
			}else{
				modelAndView.setStatus(HttpStatus.BAD_REQUEST);
				modelAndView.setView(new RedirectView(Utility.VIEW_BAD_REQUEST));
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return modelAndView;	
			}
		} catch (Exception exception) {
			modelAndView.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
			modelAndView.setView(new RedirectView(Utility.VIEW_OPPS));
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return modelAndView;
		}
		
	}
		
}
