package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.obdx.dto.StatusInfo;

public class TermDepositeInfo extends StatusInfo {

	private Double totalTermDeposits;

	private List<TermDepositeDto> tempDepositeSummary = new ArrayList<>(0);

	public List<TermDepositeDto> getTempDepositeSummary() {
		return tempDepositeSummary;
	}

	public void setTempDepositeSummary(List<TermDepositeDto> tempDepositeSummary) {
		this.tempDepositeSummary = tempDepositeSummary;
	}

	public Double getTotalTermDeposits() {
		return totalTermDeposits;
	}

	public void setTotalTermDeposits(Double totalTermDeposits) {
		this.totalTermDeposits = totalTermDeposits;
	}

	public TermDepositeInfo(List<TermDepositeDto> tempDepositeSummary, Double totalTermDeposits) {
		this.tempDepositeSummary = tempDepositeSummary;
		this.totalTermDeposits = totalTermDeposits;
	}

	public TermDepositeInfo() {
	}

}
