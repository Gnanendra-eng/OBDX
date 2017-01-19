package com.jmr.obdx.dto;

import org.hibernate.validator.constraints.NotEmpty;

/***
 * @author JMR
 */
public class UserRegDto {

	@NotEmpty(message = "fullname is Required")
	private String userName;

	@NotEmpty(message = "password is Required")
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
