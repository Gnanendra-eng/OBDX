package com.jmr.obdx.service.dto;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class OwnAccountPaymentDto {

	@NotEmpty(message = "Is required")
	private String transferType;

	@NotEmpty(message = "Is required")
	private String sourceAccountNo;

	@NotEmpty(message = "Is required")
	private String sourceAccountCurrencyType;

	@NotEmpty(message = "Is required")
	private String destinationAccountNo;

	@NotEmpty(message = "Is required")
	private String destinationAccountCurrencyType;

	@NotEmpty(message = "Is required")
	private String amount;

	@NotEmpty(message = "Is required")
	private String currencyType;

	@NotEmpty(message = "Is required")
	private Date transferDate;

	@NotEmpty(message = "Is required")
	private String note;

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public String getSourceAccountNo() {
		return sourceAccountNo;
	}

	public void setSourceAccountNo(String sourceAccountNo) {
		this.sourceAccountNo = sourceAccountNo;
	}

	public String getSourceAccountCurrencyType() {
		return sourceAccountCurrencyType;
	}

	public void setSourceAccountCurrencyType(String sourceAccountCurrencyType) {
		this.sourceAccountCurrencyType = sourceAccountCurrencyType;
	}

	public String getDestinationAccountNo() {
		return destinationAccountNo;
	}

	public void setDestinationAccountNo(String destinationAccountNo) {
		this.destinationAccountNo = destinationAccountNo;
	}

	public String getDestinationAccountCurrencyType() {
		return destinationAccountCurrencyType;
	}

	public void setDestinationAccountCurrencyType(String destinationAccountCurrencyType) {
		this.destinationAccountCurrencyType = destinationAccountCurrencyType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public Date getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}

	public OwnAccountPaymentDto(String transferType, String sourceAccountNo, String sourceAccountCurrencyType,
			String destinationAccountNo, String destinationAccountCurrencyType, String amount, String currencyType,
			Date transferDate, String note) {
		this.transferType = transferType;
		this.sourceAccountNo = sourceAccountNo;
		this.sourceAccountCurrencyType = sourceAccountCurrencyType;
		this.destinationAccountNo = destinationAccountNo;
		this.destinationAccountCurrencyType = destinationAccountCurrencyType;
		this.amount = amount;
		this.currencyType = currencyType;
		this.transferDate = transferDate;
		this.note = note;
	}

	public OwnAccountPaymentDto() {
		// TODO Auto-generated constructor stub
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
