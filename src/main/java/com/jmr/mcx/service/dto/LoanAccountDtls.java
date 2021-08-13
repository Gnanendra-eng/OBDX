package com.jmr.mcx.service.dto;
public class LoanAccountDtls {

	private String userReferenceNo;
	private String productDescription;
	private String currency;
	private Double outStandingLoanAmount;
	private String accNumber;
	private String branch;
	private String accStatus;

	public LoanAccountDtls(String userReferenceNo, String productDescription, String currency,
			Double outStandingLoanAmount, String branch, String accNumber, String accStatus) {
		this.userReferenceNo = userReferenceNo;
		this.productDescription = productDescription;
		this.currency = currency;
		this.outStandingLoanAmount = outStandingLoanAmount;
		this.branch = branch;
		this.accNumber = accNumber;
		this.accStatus = accStatus;

	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	public String getUserReferenceNo() {
		return userReferenceNo;
	}

	public void setUserReferenceNo(String userReferenceNo) {
		this.userReferenceNo = userReferenceNo;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getOutStandingLoanAmount() {
		return outStandingLoanAmount;
	}

	public void setOutStandingLoanAmount(Double outStandingLoanAmount) {
		this.outStandingLoanAmount = outStandingLoanAmount;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

}
