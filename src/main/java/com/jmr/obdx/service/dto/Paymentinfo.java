package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.obdx.dto.StatusInfo;

public class Paymentinfo extends StatusInfo {

	private List<String> Currencies;

	private List<PaymentInfoDto> paymentInfoDtos = new ArrayList<>(0);

	public List<PaymentInfoDto> getPaymentInfoDtos() {
		return paymentInfoDtos;
	}

	public void setPaymentInfoDtos(List<PaymentInfoDto> paymentInfoDtos) {
		this.paymentInfoDtos = paymentInfoDtos;
	}

	public Paymentinfo(List<PaymentInfoDto> paymentInfoDtos, List<String> Currencies) {
		this.paymentInfoDtos = paymentInfoDtos;
		this.Currencies = Currencies;
	}

	public List<String> getCurrencies() {
		return Currencies;
	}

	public void setCurrencies(List<String> currencies) {
		Currencies = currencies;
	}

	public Paymentinfo() {

	}

}
