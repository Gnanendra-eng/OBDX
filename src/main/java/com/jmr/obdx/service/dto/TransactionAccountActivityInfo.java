package com.jmr.obdx.service.dto;

import java.util.HashSet;
import java.util.Set;

import com.jmr.obdx.dto.StatusInfo;

public class TransactionAccountActivityInfo extends StatusInfo {

	private Set<TransactionAccountActivityDto> transactionAccountActivityDtos = new HashSet<TransactionAccountActivityDto>(0);

	public Set<TransactionAccountActivityDto> getTransactionAccountActivityDtos() {
		return transactionAccountActivityDtos;
	}

	public void setTransactionAccountActivityDtos(Set<TransactionAccountActivityDto> transactionAccountActivityDtos) {
		this.transactionAccountActivityDtos = transactionAccountActivityDtos;
	}

	public TransactionAccountActivityInfo() {
		// TODO Auto-generated constructor stub
	}

	public TransactionAccountActivityInfo(Set<TransactionAccountActivityDto> transactionAccountActivityDtos) {
		this.transactionAccountActivityDtos = transactionAccountActivityDtos;
	}
}
