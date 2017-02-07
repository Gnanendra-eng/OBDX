package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.obdx.dto.StatusInfo;

public class AccountSummaryInfo extends StatusInfo {

	public List<AccountSummaryDto> getAccountSummaryDtos() {
		return accountSummaryDtos;
	}

	public void setAccountSummaryDtos(List<AccountSummaryDto> accountSummaryDtos) {
		this.accountSummaryDtos = accountSummaryDtos;
	}

	private List<AccountSummaryDto> accountSummaryDtos = new ArrayList<>();

	public AccountSummaryInfo(List<AccountSummaryDto> accountSummaryDtos) {
		this.accountSummaryDtos = accountSummaryDtos;
	}

}
