package com.jmr.obdx.service.dto;

public class PayBillIDto {
	
	private String billerId;
	private String fromAccount;
    private String relationId;
	private String amount;
	private String branchCode;
	private String fromAccountCurrency;
	private String billerNo;
	private String note;
	private String billDate;
	public String getBillerId() {
		return billerId;
	}
	public void setBillerId(String billerId) {
		this.billerId = billerId;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getRelationId() {
		return relationId;
	}
	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getFromAccountCurrency() {
		return fromAccountCurrency;
	}
	public void setFromAccountCurrency(String fromAccountCurrency) {
		this.fromAccountCurrency = fromAccountCurrency;
	}
	public String getBillerNo() {
		return billerNo;
	}
	public void setBillerNo(String billerNo) {
		this.billerNo = billerNo;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public PayBillIDto(String billerId, String fromAccount, String relationId, String amount, String branchCode,
			String fromAccountCurrency, String billerNo, String note, String billDate) {
		this.billerId = billerId;
		this.fromAccount = fromAccount;
		this.relationId = relationId;
		this.amount = amount;
		this.branchCode = branchCode;
		this.fromAccountCurrency = fromAccountCurrency;
		this.billerNo = billerNo;
		this.note = note;
		this.billDate = billDate;
	}
	public PayBillIDto() {
		// TODO Auto-generated constructor stub
	}
	
	
}