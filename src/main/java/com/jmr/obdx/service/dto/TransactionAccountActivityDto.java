package com.jmr.obdx.service.dto;

public class TransactionAccountActivityDto {

	private String transactionDate;
	private String transactionDescription;
	private String transactionReferenceNo;
	private Double transactionAmount;
	private String transactionType;
	private Double balance;
	private String ccyDesc;


	public TransactionAccountActivityDto(String transactionType, String transactionDate, String transactionDescription,
			String transactionReferenceNo, Double transactionAmount, Double balance,String ccyDesc) {
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.transactionDescription = transactionDescription;
		this.transactionReferenceNo = transactionReferenceNo;
		this.transactionAmount = transactionAmount;
		this.balance = balance;
		this.ccyDesc=ccyDesc;
	}
	

	public String getCcyDesc() {
		return ccyDesc;
	}

	public void setCcyDesc(String ccyDesc) {
		this.ccyDesc = ccyDesc;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public TransactionAccountActivityDto() {
		// TODO Auto-generated constructor stub
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getTransactionReferenceNo() {
		return transactionReferenceNo;
	}

	public void setTransactionReferenceNo(String transactionReferenceNo) {
		this.transactionReferenceNo = transactionReferenceNo;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
