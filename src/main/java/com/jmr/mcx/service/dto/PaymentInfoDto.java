package com.jmr.mcx.service.dto;

public class PaymentInfoDto {

	private String idAccount;
	private String numBalance;
	private String currencyType;

	public String getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}

	public String getNumBalance() {
		return numBalance;
	}

	public void setNumBalance(String numBalance) {
		this.numBalance = numBalance;
	}

	public PaymentInfoDto() {

	}

	public PaymentInfoDto(String idAccount, String numBalance,String currencyType) {
		this.idAccount = idAccount;
		this.numBalance = numBalance;
		this.currencyType=currencyType;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

}
