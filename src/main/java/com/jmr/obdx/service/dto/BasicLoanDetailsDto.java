package com.jmr.obdx.service.dto;

import java.math.BigDecimal;

public class BasicLoanDetailsDto {

	private String userReferenceNo;
	private String productDescription;
	private String currency;
	private BigDecimal outStandingLoanAmount;
	private String branch;

	public BasicLoanDetailsDto(String userReferenceNo, String productDescription, String currency,
			BigDecimal outStandingLoanAmount, String branch) {
		this.userReferenceNo = userReferenceNo;
		this.productDescription = productDescription;
		this.currency = currency;
		this.outStandingLoanAmount = outStandingLoanAmount;
		this.branch = branch;
	}

	public String getUserReferenceNo() {
		return userReferenceNo;
	}

	public void setUserReferenceNo(String userReferenceNo) {
		this.userReferenceNo = userReferenceNo;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getOutStandingLoanAmount() {
		return outStandingLoanAmount;
	}

	public void setOutStandingLoanAmount(BigDecimal outStandingLoanAmount) {
		this.outStandingLoanAmount = outStandingLoanAmount;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
