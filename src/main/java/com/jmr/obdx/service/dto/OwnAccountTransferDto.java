package com.jmr.obdx.service.dto;

import javax.validation.constraints.NotNull;

public class OwnAccountTransferDto {

	@NotNull(message = "{error.required}")
	private String accountType;

	@NotNull(message = "{error.required}")
	private String currencyCode;

	@NotNull(message = "{error.required}")
	private String toBranchCode;
	
	@NotNull(message = "{error.required}")
	private String fromBranchCode;

	@NotNull(message = "{error.required}")
	private String amount;

	@NotNull(message = "{error.required}")
	private String toAccount;

	@NotNull(message = "{error.required}")
	private String fromAccount;
	
	@NotNull(message = "{error.required}")
	private long fromAccountBalancy;
	
	private String note;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getToBranchCode() {
		return toBranchCode;
	}

	public void setToBranchCode(String toBranchCode) {
		this.toBranchCode = toBranchCode;
	}

	public String getFromBranchCode() {
		return fromBranchCode;
	}

	public void setFromBranchCode(String fromBranchCode) {
		this.fromBranchCode = fromBranchCode;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public long getFromAccountBalancy() {
		return fromAccountBalancy;
	}

	public void setFromAccountBalancy(long fromAccountBalancy) {
		this.fromAccountBalancy = fromAccountBalancy;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public OwnAccountTransferDto(String accountType, String currencyCode, String toBranchCode, String fromBranchCode,
			String amount, String toAccount, String fromAccount, long fromAccountBalancy, String note) {
		this.accountType = accountType;
		this.currencyCode = currencyCode;
		this.toBranchCode = toBranchCode;
		this.fromBranchCode = fromBranchCode;
		this.amount = amount;
		this.toAccount = toAccount;
		this.fromAccount = fromAccount;
		this.fromAccountBalancy = fromAccountBalancy;
		this.note = note;
	}

	public OwnAccountTransferDto() {
		// TODO Auto-generated constructor stub
	}

	

}
