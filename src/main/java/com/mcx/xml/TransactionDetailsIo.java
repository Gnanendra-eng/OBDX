package com.mcx.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TransactionDetailsIo {

	@XmlElement(name="XREF")
	private String fcdbRefId;
	
	@XmlElement(name ="PRD")
	private String prodDesc;
	
	@XmlElement(name ="INSTID")
	private String  billerId;
	
	@XmlElement(name ="BILLNO")
	private String billerRefId;
	
	@XmlElement(name ="BAMT")
	private String amountPay;
	
	
	@XmlElement(name ="BCCY")
	private String billerCurrency;
	
	
	@XmlElement(name ="CUSTACNO")
	private String customerId;
	
	@XmlElement(name ="ACCCY")
	private String idCustomerCurrency;
	
	@XmlElement(name ="CONSNO")
	private String billerAccount;
	
	
	public String getBillerAccount() {
		return billerAccount;
	}


	public void setBillerAccount(String billerAccount) {
		this.billerAccount = billerAccount;
	}


	@XmlElement(name ="TXNCCY")
	private String customerCurrencyCode;
	
	
	@XmlElement(name ="TXNDATE")
	private String txnDate;
	
	
	@XmlElement(name ="TXNBRN")
	private String txnBranch;


	public String getFcdbRefId() {
		return fcdbRefId;
	}


	public void setFcdbRefId(String fcdbRefId) {
		this.fcdbRefId = fcdbRefId;
	}


	public String getProdDesc() {
		return prodDesc;
	}


	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}


	public String getBillerId() {
		return billerId;
	}


	public void setBillerId(String billerId) {
		this.billerId = billerId;
	}


	public String getBillerRefId() {
		return billerRefId;
	}


	public void setBillerRefId(String billerRefId) {
		this.billerRefId = billerRefId;
	}


	public String getAmountPay() {
		return amountPay;
	}


	public void setAmountPay(String amountPay) {
		this.amountPay = amountPay;
	}


	public String getBillerCurrency() {
		return billerCurrency;
	}


	public void setBillerCurrency(String billerCurrency) {
		this.billerCurrency = billerCurrency;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getIdCustomerCurrency() {
		return idCustomerCurrency;
	}


	public void setIdCustomerCurrency(String idCustomerCurrency) {
		this.idCustomerCurrency = idCustomerCurrency;
	}


	

	public String getCustomerCurrencyCode() {
		return customerCurrencyCode;
	}


	public void setCustomerCurrencyCode(String customerCurrencyCode) {
		this.customerCurrencyCode = customerCurrencyCode;
	}


	public String getTxnDate() {
		return txnDate;
	}


	public void setTxnDate(String txnDate) {
		this.txnDate = txnDate;
	}


	public String getTxnBranch() {
		return txnBranch;
	}


	public void setTxnBranch(String txnBranch) {
		this.txnBranch = txnBranch;
	}


	public TransactionDetailsIo(String fcdbRefId, String prodDesc, String billerId, String billerRefId,
			String amountPay, String billerCurrency, String customerId, String idCustomerCurrency, String billerAccount,
			String customerCurrencyCode, String txnDate, String txnBranch) {
		this.fcdbRefId = fcdbRefId;
		this.prodDesc = prodDesc;
		this.billerId = billerId;
		this.billerRefId = billerRefId;
		this.amountPay = amountPay;
		this.billerCurrency = billerCurrency;
		this.customerId = customerId;
		this.idCustomerCurrency = idCustomerCurrency;
		this.billerAccount = billerAccount;
		this.customerCurrencyCode = customerCurrencyCode;
		this.txnDate = txnDate;
		this.txnBranch = txnBranch;
	}


	public TransactionDetailsIo() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
