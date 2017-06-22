package com.jmr.obdx.service.dto;

public class InternalAccountTransferDto {
	
	private long payeeId;
	private String fromAccount;
	private String accountType;
	private String fromBranchCode;
	private String currencyCode;
	private String toAccount;
    private String amount;
    private String payeeName;
    private String note;
    private String purpose;
	public long getPayeeId() {
		return payeeId;
	}
	public void setPayeeId(long payeeId) {
		this.payeeId = payeeId;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getFromBranchCode() {
		return fromBranchCode;
	}
	public void setFromBranchCode(String fromBranchCode) {
		this.fromBranchCode = fromBranchCode;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public InternalAccountTransferDto(long payeeId, String fromAccount, String accountType, String fromBranchCode,
			String currencyCode, String toAccount, String amount, String payeeName, String note, String purpose) {
		this.payeeId = payeeId;
		this.fromAccount = fromAccount;
		this.accountType = accountType;
		this.fromBranchCode = fromBranchCode;
		this.currencyCode = currencyCode;
		this.toAccount = toAccount;
		this.amount = amount;
		this.payeeName = payeeName;
		this.note = note;
		this.purpose = purpose;
	}
	public InternalAccountTransferDto() {
		// TODO Auto-generated constructor stub
	}
    
    
    
}
