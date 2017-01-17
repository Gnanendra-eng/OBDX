package com.example.viewcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dto.LoginInfo;
import com.example.service.UserService;
import com.example.util.DemoUtil;

/***
 * @author RISHAD K
 */
@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired 
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	private String getLogin(Model model) throws Exception{
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
		model.addAttribute("loginInfo", new LoginInfo());
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
		return "login";
	}
	
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	private String getProfile( @ModelAttribute LoginInfo loginInfo,Model model) throws Exception{
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
		List<String> responceObj=userService.getUserRole(loginInfo.getUserName());
		model.addAttribute("responceObj", responceObj);
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
		return "profile";
	}
	

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	private String getSignup()throws Exception {
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
		return "signup";
	}
	
	@RequestMapping(value = "/authfail", method = RequestMethod.GET)
	private String getAuthFail() throws Exception{
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
		return "login-authfail";
	}

	@RequestMapping(value = "/logout/succesfull", method = RequestMethod.GET)
	private String getLogout()throws Exception {
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
		return "logout";
	}
	
	@RequestMapping(value = "/oops", method = RequestMethod.GET)
	private String getException()throws Exception {
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
		return "exception";
	}
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	private String getHome()throws Exception {
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
		return "home";
	}
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	private String getIndex()throws Exception {
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
		return "index";
	}
	
	

	@RequestMapping(value = "/template", method = RequestMethod.GET)
	private String getTemplate()throws Exception {
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
		return "template";
	}
	
	

}
