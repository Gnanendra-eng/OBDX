package com.jmr.obdx.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.jmr.obdx.domain.Fcat_vw_accountdetails;
import com.jmr.obdx.domain.Fcc_vw_txnaccountactivity;
import com.jmr.obdx.domain.Login;
@Component
public class HibernateConnectionUtil {
	public static SessionFactory getSessionFactory() {
		{
			// create configuration using hibernate API
			Configuration configuration = new Configuration();
			configuration.setProperty("connection.driver_class",
			"oracle.jdbc.OracleDriver");
			configuration.setProperty("hibernate.connection.url",
			"jdbc:oracle:thin:@192.168.1.45:1521:FCDB");
			configuration.setProperty("hibernate.connection.username", "FCDBB001_RK");
			configuration.setProperty("hibernate.connection.password", "fcdb");
			configuration.addAnnotatedClass(Fcat_vw_accountdetails.class);
			configuration.addAnnotatedClass(Fcc_vw_txnaccountactivity.class);
			

			return configuration.buildSessionFactory();
			}
		}
	}


