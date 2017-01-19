package com.jmr.obdx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests().antMatchers("/login","/user/register","/user/forgetpassword")
				.permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login")
				.failureUrl("/login/authfail").usernameParameter("username").passwordParameter("password")
				.defaultSuccessUrl("/auth", true).permitAll().and().exceptionHandling()
				.accessDeniedPage("/accessdeniedpage").and().logout().logoutSuccessUrl("/logout/succesfull")
				.permitAll();

	}

	@Override
	public void configure(WebSecurity webSecurity) throws Exception {
		webSecurity.ignoring().antMatchers("/fonts/**", "/js/**", "/images/**", "/css/**", "/plugins/**", "/dist/**");
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder.userDetailsService(userDetailsService)
				.passwordEncoder(new BCryptPasswordEncoder());
	}


	protected UserDetailsService userDetailsService() {
		return userDetailsService;
	}
}
