package com.jmr.obdx.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.AuthorityM;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.repositories.McxLoginRepo;
import com.jmr.obdx.util.Utility;
/***
 * @author JMR
 */
@Service
public class LoginService implements UserDetailsService {

	private static Logger logger = Logger.getLogger(LoginService.class);

	private org.springframework.security.core.userdetails.User userDetials;

	@Autowired
	private McxLoginRepo loginRepo;

	
	private Login getUserDetails(String userName) {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		Login login = loginRepo.findByUserName(userName);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return login;
	}
	
	public UserDetails loadUserByUsername(String userName ) throws UsernameNotFoundException {	
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		Login userLogin = getUserDetails(userName);
		if ((userLogin == null) || (userLogin.getPassword() == null)) {
			logger.info("user not found");
			throw new UsernameNotFoundException("user" + userName + "not found...");
		}
		userDetials = new org.springframework.security.core.userdetails.User(userLogin.getUsername(), userLogin.getPassword(),Boolean.parseBoolean(userLogin.getIsactive()),
				Boolean.parseBoolean(String.valueOf(userLogin.getAccountnonexpired())),Boolean.parseBoolean(String.valueOf(userLogin.getCredentialsnonexpired())),Boolean.parseBoolean(String.valueOf(userLogin.getAccountnonlocked())), getAuthority(new AuthorityM(userLogin.getAuthorityM().getId(), userLogin.getAuthorityM().getTypeuser())));
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return userDetials;
	}

	public List<GrantedAuthority> getAuthority(AuthorityM authorityM) {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		List<GrantedAuthority> listOfAuthority = new ArrayList<GrantedAuthority>();
		listOfAuthority.add(new SimpleGrantedAuthority(authorityM.getTypeuser()));
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return listOfAuthority;
	}
	
}