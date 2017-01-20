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
/***
 * @author JMR
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
	/***
	 * 
	 * 
	 *@param  httpSecurity This object receives the information of the http security.
	 *@throws Exception This object receives the information of the exception.
	 */
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests().antMatchers("/login","/user/register")
				.permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login")
				.failureUrl("/login/authfail").usernameParameter("userName").passwordParameter("password")
				.defaultSuccessUrl("/auth", true).permitAll().and().exceptionHandling()
				.accessDeniedPage("/accessdenied").and().logout().logoutSuccessUrl("/logout/succesfull")
				.permitAll();

	}

	/***
	 * 
	 * 
	 * @param authenticationManagerBuilder This object receives the information of the authentication manager builder.
	 * @throws Exception This object receives the information of the exception.
	 */
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}

	/***
	 * 
	 *@param webSecurity This object receives the information of the web security.
	 *@throws Exception This object receives the information of the exception. 
	 */
	@Override
	public void configure(WebSecurity webSecurity) throws Exception {
		webSecurity.ignoring().antMatchers("/fonts/**", "/js/**", "/images/**", "/css/**", "/plugins/**", "/dist/**");
	}
	
}
