package com.jmr.obdx.service.dto;

import java.math.BigDecimal;
import java.util.Date;

public class BasicLoanDetailsDto {

	private String userReferenceNo;
	private String productDescription;
	private String currency;
	private Double outStandingLoanAmount;
	private String branch;
	private String customerId;
	private String applicantName;
	private BigDecimal tenorMonths;
	private BigDecimal installMents;
	private String maturityDate;
	private String status;
	private BigDecimal amountDisbursed;
	private String openingDate;

	
	public BasicLoanDetailsDto(String userReferenceNo, String productDescription, String currency,
			Double outStandingLoanAmount, String branch,String customerId,String applicantName,BigDecimal tenorMonths,BigDecimal installMents,
			String maturityDate,String status,BigDecimal amountDisbursed,String openingDate) {
		this.userReferenceNo = userReferenceNo;
		this.productDescription = productDescription;
		this.currency = currency;
		this.outStandingLoanAmount = outStandingLoanAmount;
		this.branch = branch;
		this.customerId=customerId;
		this.applicantName=applicantName;
		this.tenorMonths=tenorMonths;
		this.installMents=installMents;
		this.maturityDate=maturityDate;
		this.status=status;
		this.amountDisbursed=amountDisbursed;
		this.openingDate=openingDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public BigDecimal getTenorMonths() {
		return tenorMonths;
	}

	public void setTenorMonths(BigDecimal tenorMonths) {
		this.tenorMonths = tenorMonths;
	}

	public BigDecimal getInstallMents() {
		return installMents;
	}

	public void setInstallMents(BigDecimal installMents) {
		this.installMents = installMents;
	}

	public String getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getAmountDisbursed() {
		return amountDisbursed;
	}

	public void setAmountDisbursed(BigDecimal amountDisbursed) {
		this.amountDisbursed = amountDisbursed;
	}

	public String getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
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

}
