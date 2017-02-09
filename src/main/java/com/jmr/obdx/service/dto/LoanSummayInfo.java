package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.obdx.dto.StatusInfo;

public class LoanSummayInfo extends StatusInfo {
	
	private Double loansummary;
	private List<AccountSummaryDto> loanPending = new ArrayList<>();
	public Double getLoansummary() {
		return loansummary;
	}
	public void setLoansummary(Double loansummary) {
		this.loansummary = loansummary;
	}
	public List<AccountSummaryDto> getLoanPending() {
		return loanPending;
	}
	public void setLoanPending(List<AccountSummaryDto> loanPending) {
		this.loanPending = loanPending;
	}
	public LoanSummayInfo(Double loansummary, List<AccountSummaryDto> loanPending) {
		this.loansummary = loansummary;
		this.loanPending = loanPending;
	}
	public LoanSummayInfo() {
		
	}
	public LoanSummayInfo(Boolean errorStatus) {
		
	}

	
	

}
