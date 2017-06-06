package com.jmr.obdx.service.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class OwnAccountTransferDto {
	
	@NotEmpty(message = "Is required")
	private String accountType;
	
	@NotEmpty(message = "Is required")
	private long currencyCode;
	
	@NotEmpty(message = "Is required")
	private String bankCoad;

	@NotEmpty(message = "Is required")
	private String sourceAccountNo;
	
	@NotEmpty(message = "Is required")
	private String destinationAccountNo;
	
	@NotEmpty(message = "Is required")
	private Integer amount;
	
	@NotEmpty(message = "Is required")
	private Integer toAccount;
	
	@NotEmpty(message = "Is required")
	private Integer fromAccount;

	@NotEmpty(message = "Is required")
	private String note;
	


	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(long currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getBankCoad() {
		return bankCoad;
	}

	public void setBankCoad(String bankCoad) {
		this.bankCoad = bankCoad;
	}

	public String getSourceAccountNo() {
		return sourceAccountNo;
	}

	public void setSourceAccountNo(String sourceAccountNo) {
		this.sourceAccountNo = sourceAccountNo;
	}

	public String getDestinationAccountNo() {
		return destinationAccountNo;
	}

	public void setDestinationAccountNo(String destinationAccountNo) {
		this.destinationAccountNo = destinationAccountNo;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getToAccount() {
		return toAccount;
	}

	public void setToAccount(Integer toAccount) {
		this.toAccount = toAccount;
	}

	public Integer getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(Integer fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public OwnAccountTransferDto(String accountType, long currencyCode, String bankCoad, String sourceAccountNo,
			String destinationAccountNo, Integer amount, Integer toAccount, Integer fromAccount, String note) {
		this.accountType = accountType;
		this.currencyCode = currencyCode;
		this.bankCoad = bankCoad;
		this.sourceAccountNo = sourceAccountNo;
		this.destinationAccountNo = destinationAccountNo;
		this.amount = amount;
		this.toAccount = toAccount;
		this.fromAccount = fromAccount;
		this.note = note;
	}

	public OwnAccountTransferDto() {
		// TODO Auto-generated constructor stub
	}


	
	
}
