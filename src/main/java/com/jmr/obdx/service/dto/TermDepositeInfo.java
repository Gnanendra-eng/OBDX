package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.obdx.dto.StatusInfo;

public class TermDepositeInfo extends StatusInfo {

	private Double totalTermDeposits;
	private List<String> nbrAccounts;
	private String customerId;


	public List<String> getNbrAccounts() {
		return nbrAccounts;
	}

	public void setNbrAccounts(List<String> nbrAccounts) {
		this.nbrAccounts = nbrAccounts;
	}

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

	public TermDepositeInfo(List<TermDepositeDto> tempDepositeSummary, Double totalTermDeposits,List<String> nbrAccounts,String customerId) {
		this.tempDepositeSummary = tempDepositeSummary;
		this.totalTermDeposits = totalTermDeposits;
		this.nbrAccounts=nbrAccounts;
		this.customerId=customerId;
		
	}

	public TermDepositeInfo() {
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

}
