package com.jmr.obdx.handler;


import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.web.session.HttpSessionDestroyedEvent;

@WebListener
public class SampleListener implements ApplicationListener<HttpSessionDestroyedEvent>  {

    private static final Logger log = LoggerFactory.getLogger(SampleListener.class);

	@Override
	public void onApplicationEvent(HttpSessionDestroyedEvent event) {
		 for (SecurityContext ctx : event.getSecurityContexts() ) {
             Authentication auth = ctx.getAuthentication();
             System.out.println(auth.getName());
        }
		
	}


}
