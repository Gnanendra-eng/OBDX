package com.jmr.obdx.viewcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jmr.obdx.util.Utility;

@Controller
public class ProfileController {

	private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);

	@RequestMapping(value = "/userprofile", method = RequestMethod.GET)
	private String getProfile()throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		
		
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return "profile";
	}
}
