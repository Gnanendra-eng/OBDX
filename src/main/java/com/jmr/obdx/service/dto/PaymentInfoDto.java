package com.jmr.obdx.service.dto;

public class PaymentInfoDto {

	private String idAccount;
	private String numBalance;

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
	
	public PaymentInfoDto(String idAccount, String numBalance) {
		this.idAccount = idAccount;
		this.numBalance = numBalance;
	}

}
