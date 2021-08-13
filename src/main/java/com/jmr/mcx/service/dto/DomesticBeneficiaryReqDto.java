package com.jmr.mcx.service.dto;

import javax.validation.constraints.NotNull;

public class DomesticBeneficiaryReqDto {

	@NotNull(message = "{error.required}")
	private String payeeName;

	@NotNull(message = "{error.required}")
	private String accountName;

	@NotNull(message = "{error.required}")
	private String accountNumber;

	@NotNull(message = "{error.required}")
	private String pMode;

	@NotNull(message = "{error.required}")
	private String bankName;

	@NotNull(message = "{error.required}")
	private String bankAddr;

	@NotNull(message = "{error.required}")
	private String city;

	@NotNull(message = "{error.required}")
	private String branchCode;

	@NotNull(message = "{error.required}")
	private String branchId;

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

	public String getCreatedVie() {
		return createdVie;
	}

	public void setCreatedVie(String createdVie) {
		this.createdVie = createdVie;
	}

	public String getpMode() {
		return pMode;
	}

	public void setpMode(String pMode) {
		this.pMode = pMode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddr() {
		return bankAddr;
	}

	public void setBankAddr(String bankAddr) {
		this.bankAddr = bankAddr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
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
