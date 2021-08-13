package com.jmr.mcx.service.dto;

import com.jmr.mcx.dto.StatusInfo;

public class LoanAccResp extends StatusInfo {

	private LoanAccDetails accDetails;
	private LoanDetails loanDetails;
	private DisbursementDetails disbrsDetails;
	private OutstandingLoanDtls outstandngLoanDtls;

	public LoanAccDetails getAccDetails() {
		return accDetails;
	}

	public void setAccDetails(LoanAccDetails accDetails) {
		this.accDetails = accDetails;
	}

	public LoanDetails getLoanDetails() {
		return loanDetails;
	}

	public void setLoanDetails(LoanDetails loanDetails) {
		this.loanDetails = loanDetails;
	}

	public DisbursementDetails getDisbrsDetails() {
		return disbrsDetails;
	}

	public void setDisbrsDetails(DisbursementDetails disbrsDetails) {
		this.disbrsDetails = disbrsDetails;
	}

	public OutstandingLoanDtls getOutstandngLoanDtls() {
		return outstandngLoanDtls;
	}

	public void setOutstandngLoanDtls(OutstandingLoanDtls outstandngLoanDtls) {
		this.outstandngLoanDtls = outstandngLoanDtls;
	}

}
