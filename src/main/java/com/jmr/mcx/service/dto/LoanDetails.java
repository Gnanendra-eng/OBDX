package com.jmr.mcx.service.dto;

import java.util.Date;

public class LoanDetails {

	private Double sanctionedLoanAmt;
	private Double disbursedLoanAmt;
	private Date openingDate;
	private Date maturityDate;
	private Date valueDate;
	private String loanIssueBranch;
	private Double interestRate;
	private Integer noOfInstallments;
	private Integer paidInstallments;
	private Integer remainingInstallments;

	public Double getSanctionedLoanAmt() {
		return sanctionedLoanAmt;
	}

	public void setSanctionedLoanAmt(Double sanctionedLoanAmt) {
		this.sanctionedLoanAmt = sanctionedLoanAmt;
	}

	public Double getDisbursedLoanAmt() {
		return disbursedLoanAmt;
	}

	public void setDisbursedLoanAmt(Double disbursedLoanAmt) {
		this.disbursedLoanAmt = disbursedLoanAmt;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public String getLoanIssueBranch() {
		return loanIssueBranch;
	}

	public void setLoanIssueBranch(String loanIssueBranch) {
		this.loanIssueBranch = loanIssueBranch;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Integer getNoOfInstallments() {
		return noOfInstallments;
	}

	public void setNoOfInstallments(Integer noOfInstallments) {
		this.noOfInstallments = noOfInstallments;
	}

	public Integer getPaidInstallments() {
		return paidInstallments;
	}

	public void setPaidInstallments(Integer paidInstallments) {
		this.paidInstallments = paidInstallments;
	}

	public Integer getRemainingInstallments() {
		return remainingInstallments;
	}

	public void setRemainingInstallments(Integer remainingInstallments) {
		this.remainingInstallments = remainingInstallments;
	}

}
