package com.jmr.obdx.service.dto;

import javax.validation.constraints.NotNull;

public class BeneficiaryDto {
	
	@NotNull(message = "{error.required}")
	private String payeeName;
	
	@NotNull(message = "{error.required}")
	private String accountName;
	

	@NotNull(message = "{error.required}")
	private Long accountNumber;
	
	@NotNull(message = "{error.required}")
	private Long  branchId;
	
	@NotNull(message = "{error.required}")
	private String nickName;
	
	private String createdVie;

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
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

	public BeneficiaryDto(String payeeName, String accountName, Long accountNumber, Long branchId,
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
