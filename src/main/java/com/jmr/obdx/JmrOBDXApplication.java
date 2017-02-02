package com.jmr.obdx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/***
 * @author JMR
 */
@EnableAsync
@SpringBootApplication()
public class JmrOBDXApplication {
	public static void main(String[] args) {
		SpringApplication.run(JmrOBDXApplication.class, args);
	}
}
