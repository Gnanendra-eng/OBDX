package com.jmr.mcx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.WebApplicationInitializer;

/***
 * @author JMR
 */
@ComponentScan
@EnableAsync
@SpringBootApplication
public class JmrOBDXApplication extends SpringBootServletInitializer implements WebApplicationInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(JmrOBDXApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JmrOBDXApplication.class);
	}


}


