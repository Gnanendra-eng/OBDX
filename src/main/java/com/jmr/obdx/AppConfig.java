package com.jmr.obdx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
/***
 * @author JMR
 */
@Configuration
public class AppConfig {

	 @Bean
	 public HibernateJpaSessionFactoryBean sessionFactory() {
	     return new HibernateJpaSessionFactoryBean();
	 }
	 
		 
}
