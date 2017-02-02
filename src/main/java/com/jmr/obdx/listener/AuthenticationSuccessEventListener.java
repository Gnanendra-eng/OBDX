package com.jmr.obdx.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

import com.jmr.obdx.util.Utility;

@Component
public class AuthenticationSuccessEventListener  implements ApplicationListener<AuthenticationSuccessEvent>{

	private static final Logger logger = LoggerFactory.getLogger(AuthenticationSuccessEventListener.class);

	@Override
	public void onApplicationEvent(AuthenticationSuccessEvent event) {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		
		
		
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());

		
	}

}
