package com.jmr.obdx.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.jmr.obdx.domain.Login;
import com.jmr.obdx.repositories.LoginRepo;

public class LoginService implements UserDetailsService {
	
	private static Logger logger = Logger.getLogger(LoginService.class);
	
	private org.springframework.security.core.userdetails.User userDetials;

	@Autowired
	private LoginRepo loginRepo;
	

/*	private Login getUserDetails(String username) {
		Login user = loginRepo.findByUsername(username);
		return user;
	}
*/

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}

}
