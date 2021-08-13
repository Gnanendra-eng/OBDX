package com.jmr.mcx.service.dto;

import com.jmr.mcx.dto.StatusInfo;

public class UserInfo extends StatusInfo {

	public UserInfo(String userName, String password, String isactive, String accountnonexpired,
			String credentialsnonexpired, String accountnonlocked) {
		this.userName = userName;
		this.password = password;
		this.isactive = isactive;
		this.accountnonexpired = accountnonexpired;
		this.credentialsnonexpired = credentialsnonexpired;
		this.accountnonlocked = accountnonlocked;
	}

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserInfo() {
	
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getAccountnonexpired() {
		return accountnonexpired;
	}

	public void setAccountnonexpired(String accountnonexpired) {
		this.accountnonexpired = accountnonexpired;
	}

	public String getCredentialsnonexpired() {
		return credentialsnonexpired;
	}

	public void setCredentialsnonexpired(String credentialsnonexpired) {
		this.credentialsnonexpired = credentialsnonexpired;
	}

	public String getAccountnonlocked() {
		return accountnonlocked;
	}

	public void setAccountnonlocked(String accountnonlocked) {
		this.accountnonlocked = accountnonlocked;
	}

	private String isactive;
	private String accountnonexpired;
	private String credentialsnonexpired;
	private String accountnonlocked;

}
