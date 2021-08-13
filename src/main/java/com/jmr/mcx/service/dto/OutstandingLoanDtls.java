package com.jmr.mcx.service.dto;

import java.util.Date;

public class OutstandingLoanDtls {

	private Date nextInstallmentDate;
	private Double nextInstallmentAmt;
	private Double installmentArrears;
	private Double principleBal;
	private Double prepayPenaltyAmt;
	private Double penalties;
	private Double feesAndCharges;
	private Double intrAmtStillToBePaid;
	private Double loanOutstanding;

	public Date getNextInstallmentDate() {
		return nextInstallmentDate;
	}

	public void setNextInstallmentDate(Date nextInstallmentDate) {
		this.nextInstallmentDate = nextInstallmentDate;
	}

	public Double getNextInstallmentAmt() {
		return nextInstallmentAmt;
	}

	public void setNextInstallmentAmt(Double nextInstallmentAmt) {
		this.nextInstallmentAmt = nextInstallmentAmt;
	}

	public Double getInstallmentArrears() {
		return installmentArrears;
	}

	public void setInstallmentArrears(Double installmentArrears) {
		this.installmentArrears = installmentArrears;
	}

	public Double getPrincipleBal() {
		return principleBal;
	}

	public void setPrincipleBal(Double principleBal) {
		this.principleBal = principleBal;
	}

	public Double getPrepayPenaltyAmt() {
		return prepayPenaltyAmt;
	}

	public void setPrepayPenaltyAmt(Double prepayPenaltyAmt) {
		this.prepayPenaltyAmt = prepayPenaltyAmt;
	}

	public Double getPenalties() {
		return penalties;
	}

	public void setPenalties(Double penalties) {
		this.penalties = penalties;
	}

	public Double getFeesAndCharges() {
		return feesAndCharges;
	}

	public void setFeesAndCharges(Double feesAndCharges) {
		this.feesAndCharges = feesAndCharges;
	}

	public Double getIntrAmtStillToBePaid() {
		return intrAmtStillToBePaid;
	}

	public void setIntrAmtStillToBePaid(Double intrAmtStillToBePaid) {
		this.intrAmtStillToBePaid = intrAmtStillToBePaid;
	}

	public Double getLoanOutstanding() {
		return loanOutstanding;
	}

	public void setLoanOutstanding(Double loanOutstanding) {
		this.loanOutstanding = loanOutstanding;
	}

}
