package com.jmr.mcx.service.dto;

import java.util.Date;

public class DisbursementDetails {

	private Date disbursalDate;
	private Double disbursedAmt;

	public Double getDisbursedAmt() {
		return disbursedAmt;
	}

	public void setDisbursedAmt(Double disbursedAmt) {
		this.disbursedAmt = disbursedAmt;
	}

	public String getDisbursalBranch() {
		return disbursalBranch;
	}

	public void setDisbursalBranch(String disbursalBranch) {
		this.disbursalBranch = disbursalBranch;
	}

	private String disbursalBranch;

	public Date getDisbursalDate() {
		return disbursalDate;
	}

	public void setDisbursalDate(Date disbursalDate) {
		this.disbursalDate = disbursalDate;
	}

}
