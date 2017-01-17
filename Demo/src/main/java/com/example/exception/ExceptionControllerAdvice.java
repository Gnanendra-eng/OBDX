package com.example.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.util.DemoUtil;

/***
 * @author RISHAD K
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

	private static final Logger logger = LoggerFactory.getLogger(ExceptionControllerAdvice.class);

	@ExceptionHandler(Exception.class)
	public String exception() {		
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
		return "redirect:/oops";
	}
}
