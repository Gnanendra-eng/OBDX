package com.jmr.obdx.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.jmr.obdx.domain.AuthorityM;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.util.Utility;


@Repository
public class LoginService implements UserDetailsService {

	private static Logger logger = Logger.getLogger(LoginService.class);

	private org.springframework.security.core.userdetails.User userDetials;

	@Autowired
	private LoginRepo loginRepo;

	private Login getUserDetails(String userName) {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		Login login = loginRepo.findByUsername(userName);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return login;
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		Login userLogin = getUserDetails(userName);
		if ((userLogin == null) || (userLogin.getPassword() == null)) {
			throw new UsernameNotFoundException("user" + userName + "not found...");
		}
		AuthorityM obj = new AuthorityM();
		obj.setId(userLogin.getAuthorityM().getId());
		userDetials = new org.springframework.security.core.userdetails.User(userName, userLogin.getPassword(),
				Boolean.parseBoolean(String.valueOf(userLogin.getIsactive())),
				Boolean.parseBoolean(String.valueOf(userLogin.getAccountnonexpired())),
				Boolean.parseBoolean(String.valueOf(userLogin.getCredentialsnonexpired())),
				Boolean.parseBoolean(String.valueOf(userLogin.getAccountnonlocked())), getAuthority(obj));
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
