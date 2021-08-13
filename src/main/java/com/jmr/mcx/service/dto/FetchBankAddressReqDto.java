package com.jmr.mcx.service.dto;

import javax.validation.constraints.NotNull;

public class FetchBankAddressReqDto {

	@NotNull(message = "{error.required}")
	private String branchCode;

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

}
