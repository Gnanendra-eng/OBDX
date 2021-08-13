package com.jmr.mcx.service.dto;

import javax.validation.constraints.NotNull;

public class FetchLoanAccReq {
	@NotNull(message = "{error.required}")
	private String accNo;

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

}
