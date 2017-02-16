package com.jmr.obdx.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.core.session.SessionDestroyedEvent;
import org.springframework.stereotype.Component;

import com.jmr.obdx.util.Utility;

@Component
public class LogoutListener implements ApplicationListener<SessionDestroyedEvent> {

	private static final Logger logger = LoggerFactory.getLogger(LogoutListener.class);


	@Override
	public void onApplicationEvent(SessionDestroyedEvent event) {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());

		System.out.println(event.getId());
		
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());

	}

}
