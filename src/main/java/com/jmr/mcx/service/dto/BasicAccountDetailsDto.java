package com.jmr.mcx.service.dto;

import java.util.List;

import com.jmr.mcx.dto.StatusInfo;

public class BasicAccountDetailsDto extends StatusInfo {

	private List<String> nbrAccounts;
	private String customerId;

	public String getCustomerId() {
		return customerId;
	}

	public BasicAccountDetailsDto() {
	}

	public BasicAccountDetailsDto(String customerId, List<String> nbrAccounts) {
		this.customerId = customerId;
		this.nbrAccounts = nbrAccounts;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<String> getNbrAccounts() {
		return nbrAccounts;
	}

	public void setNbrAccounts(List<String> nbrAccounts) {
		this.nbrAccounts = nbrAccounts;
	}

}
