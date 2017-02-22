package com.jmr.obdx.exception;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;

/***
 * @author JMR
 */
@ControllerAdvice(annotations = RestController.class)
public class ExceptionRestControllerAdvice {
	
	private static final Logger logger = LoggerFactory.getLogger(ExceptionRestControllerAdvice.class);
    private StatusInfo statusInfo;
	private Set<ErrorMsg> errorMsgs;
	
/*	@ExceptionHandler(value = Exception.class)
	private ResponseEntity<StatusInfo> exception(Exception exception)throws Exception{
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		statusInfo=new StatusInfo();
		errorMsgs = new HashSet<ErrorMsg>(0);
		errorMsgs.add(new ErrorMsg("Exception", Throwables.getRootCause(exception).getMessage()));
		statusInfo=new StatusInfo(true, errorMsgs);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return new ResponseEntity<StatusInfo>(statusInfo,HttpStatus.INTERNAL_SERVER_ERROR);
	}*/
	
}
