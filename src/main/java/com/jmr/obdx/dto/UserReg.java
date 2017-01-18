package com.jmr.obdx.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserReg {

	@NotNull(message = "fullname is Required")
	@Size(min = 2, max = 30, message = "Minimum size is 2 and Maximum 30 letters")
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
