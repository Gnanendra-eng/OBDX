package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.obdx.dto.StatusInfo;

public class Paymentinfo extends StatusInfo {

	private List<PaymentInfoDto> paymentSummary = new ArrayList<>(0);

	public List<PaymentInfoDto> getPaymentSummary() {
		return paymentSummary;
	}

	public void setPaymentSummary(List<PaymentInfoDto> paymentSummary) {
		this.paymentSummary = paymentSummary;
	}

	public Paymentinfo(List<PaymentInfoDto> paymentSummary) {
		this.paymentSummary = paymentSummary;
	}

	public Paymentinfo() {

	}

}
