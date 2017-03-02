package com.jmr.obdx.service.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class PaymentDto {

	@NotEmpty(message = "Is required")
	private String transferTO;

	@NotEmpty(message = "Is required")
	private String transferFrom;

	@NotEmpty(message = "Is required")
	private String amount;

	public String getTransferTO() {
		return transferTO;
	}

	public void setTransferTO(String transferTO) {
		this.transferTO = transferTO;
	}

	public String getTransferFrom() {
		return transferFrom;
	}

	public void setTransferFrom(String transferFrom) {
		this.transferFrom = transferFrom;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public PaymentDto(String transferTO, String transferFrom, String amount) {
		this.transferTO = transferTO;
		this.transferFrom = transferFrom;
		this.amount = amount;
	}

	public PaymentDto() {

		// TODO Auto-generated constructor stub
	}

}
