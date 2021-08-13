package com.jmr.mcx.service.dto;

public class ViewBeneficiaryDto {
	private long id;

	public ViewBeneficiaryDto(long id, String payeeName) {
		super();
		this.id = id;
		this.payeeName = payeeName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	private String payeeName;
}
