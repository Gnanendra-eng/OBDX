package com.jmr.obdx.service.dto;

import javax.validation.constraints.NotNull;

public class BeneficiaryDto {
	
	@NotNull(message = "{error.required}")
	private String payeeName;
	
	@NotNull(message = "{error.required}")
	private String accountName;
	

	@NotNull(message = "{error.required}")
	private String accountNumber;
	
	@NotNull(message = "{error.required}")
	private String  branchId;
	
	@NotNull(message = "{error.required}")
	private String nickName;
	
	private String createdVie;
	
	private String mcxTransferViaType;
	
	private String mcxTransferType;
	
	private String swiftCode;
	
	private String ncc;

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

	public BeneficiaryDto(String payeeName, String accountName, String accountNumber, String branchId,
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

	public String getMcxTransferViaType() {
		return mcxTransferViaType;
	}

	public void setMcxTransferViaType(String mcxTransferViaType) {
		this.mcxTransferViaType = mcxTransferViaType;
	}

	public String getMcxTransferType() {
		return mcxTransferType;
	}

	public void setMcxTransferType(String mcxTransferType) {
		this.mcxTransferType = mcxTransferType;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public String getNcc() {
		return ncc;
	}

	public void setNcc(String ncc) {
		this.ncc = ncc;
	}
	

}
