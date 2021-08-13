package com.jmr.mcx.service;

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

import com.jmr.mcx.domain.McxAuthorityM;
import com.jmr.mcx.domain.McxLogin;
import com.jmr.mcx.repositories.LoginRepo;
import com.jmr.mcx.repositories.McxLoginRepo;
import com.jmr.mcx.util.Utility;
/***
 * @author JMR
 * Modified Login to McxLogin and AuthorityM to McxAuthorityM by Murugesh on 18/07/2017
 */
@Service
public class LoginService implements UserDetailsService {

	private static Logger logger = Logger.getLogger(LoginService.class);

	private org.springframework.security.core.userdetails.User userDetials;

	@Autowired
	private McxLoginRepo loginRepo;

	
	private McxLogin getUserDetails(String userName) {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		McxLogin mcxLogin = loginRepo.findByUserName(userName);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return mcxLogin;
	}
	
	public UserDetails loadUserByUsername(String userName ) throws UsernameNotFoundException {	
		System.out.println("-------------------Login Service-------------------");
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		McxLogin mcxLogin = getUserDetails(userName);
		if ((mcxLogin == null) || (mcxLogin.getPassword() == null)) {
			logger.info("user not found");
			throw new UsernameNotFoundException("user" + userName + "not found...");
		}
		System.out.println("user name: "+mcxLogin.getUserName());
		/***
		 * Modified User constructor to get user details by Murugesh
		 */	
		userDetials = new org.springframework.security.core.userdetails.User(mcxLogin.getUserName(), mcxLogin.getPassword(),Boolean.parseBoolean(mcxLogin.getIsActive()),
				Boolean.parseBoolean(String.valueOf(mcxLogin.getAccountNonExpired())),Boolean.parseBoolean(String.valueOf(mcxLogin.getCredentialsNonExpired())),
				Boolean.parseBoolean(String.valueOf(mcxLogin.getAccountNonLocked())), 
				getMcxAuthority(new McxAuthorityM(mcxLogin.getMcxAuthorityM().getId(), mcxLogin.getMcxAuthorityM().getMcxBaseUserTypeM())));
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return userDetials;
	}

	public List<GrantedAuthority> getMcxAuthority(McxAuthorityM mcxAuthorityM) {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		List<GrantedAuthority> listOfAuthority = new ArrayList<GrantedAuthority>();
		listOfAuthority.add(new SimpleGrantedAuthority(mcxAuthorityM.getMcxBaseUserTypeM().getUserType()));
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return listOfAuthority;
	}
	
}