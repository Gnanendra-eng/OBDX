package com.jmr.obdx.service.dto;

import javax.validation.constraints.NotNull;

public class BeneficiaryDto {
	
	@NotNull(message = "{error.required}")
	private String payeeName;
	
	@NotNull(message = "{error.required}")
	private long accountName;
	

	@NotNull(message = "{error.required}")
	private String accountNumber;
	
	@NotNull(message = "{error.required}")
	private String branchId;
	
	@NotNull(message = "{error.required}")
	private String nickName;
	
	@NotNull(message = "{error.required}")
	private String createdVie;

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public long getAccountName() {
		return accountName;
	}

	public void setAccountName(long accountName) {
		this.accountName = accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCreatedVie() {
		return createdVie;
	}

	public void setCreatedVie(String createdVie) {
		this.createdVie = createdVie;
	}

	public BeneficiaryDto(String payeeName, long accountName, String accountNumber, String branchId,
			String nickName, String createdVie) {
		this.payeeName = payeeName;
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.branchId = branchId;
		this.nickName = nickName;
		this.createdVie = createdVie;
	}

	public BeneficiaryDto() {
		// TODO Auto-generated constructor stub
	}
	

}
