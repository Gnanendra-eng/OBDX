package com.jmr.mcx.service.dto;

import org.hibernate.validator.constraints.NotEmpty;

/***
 * @author JMR
 */
public class UserRegDto {

	@NotEmpty(message = "Is required")
	private String userName;

	@NotEmpty(message = "Is required")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
