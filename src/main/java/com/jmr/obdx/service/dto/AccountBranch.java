package com.jmr.obdx.service.dto;

import com.jmr.obdx.dto.StatusInfo;

public class AccountBranch extends StatusInfo{
	
	private String accountId;
	private String branchCod;
	private String branchName;
	private String accName;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getBranchCod() {
		return branchCod;
	}
	public void setBranchCod(String branchCod) {
		this.branchCod = branchCod;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public AccountBranch(String accountId, String branchCod, String branchName, String accName) {
		this.accountId = accountId;
		this.branchCod = branchCod;
		this.branchName = branchName;
		this.accName = accName;
	}
	public AccountBranch() {
		// TODO Auto-generated constructor stub
	}


	
	
}
