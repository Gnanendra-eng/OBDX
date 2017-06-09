package com.jmr.obdx.service.dto;

import javax.validation.constraints.NotNull;

public class OwnAccountTransferDto {

	@NotNull(message = "{error.required}")
	private String accountType;

	@NotNull(message = "{error.required}")
	private String currencyCode;

	@NotNull(message = "{error.required}")
	private Integer branchCode;

	@NotNull(message = "{error.required}")
	private Integer amount;

	@NotNull(message = "{error.required}")
	private long toAccount;

	@NotNull(message = "{error.required}")
	private long fromAccount;
	
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

	public Integer getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(Integer branchCode) {
		this.branchCode = branchCode;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public long getToAccount() {
		return toAccount;
	}

	public void setToAccount(long toAccount) {
		this.toAccount = toAccount;
	}

	public long getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(long fromAccount) {
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

	public OwnAccountTransferDto(String accountType, String currencyCode, Integer branchCode, Integer amount,
			long toAccount, long fromAccount, long fromAccountBalancy, String note) {
		this.accountType = accountType;
		this.currencyCode = currencyCode;
		this.branchCode = branchCode;
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
