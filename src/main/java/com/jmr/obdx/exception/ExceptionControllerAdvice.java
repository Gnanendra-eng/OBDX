package com.jmr.obdx.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.jmr.obdx.util.Utility;

/***
 * @author JMR
 */
@ControllerAdvice(annotations=Controller.class)
public class ExceptionControllerAdvice {
	
	private static final Logger logger = LoggerFactory.getLogger(ExceptionControllerAdvice.class);

	@ExceptionHandler(Exception.class)
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
	public String exception() throws Exception{		
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return "redirect:/oops";
	}
	
}
