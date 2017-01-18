package com.jmr.obdx.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jmr.obdx.util.Utility;

/***
 * @author RISHAD K
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

	private static final Logger logger = LoggerFactory.getLogger(ExceptionControllerAdvice.class);

	@ExceptionHandler(Exception.class)
	public String exception() {		
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return "redirect:/oops";
	}
}
