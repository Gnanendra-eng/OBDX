package com.jmr.obdx.service.dto;

import javax.validation.constraints.NotNull;

public class InternalFundTransferDto {
	
	@NotNull(message = "{error.required}")
	private String payeeName;
	
	@NotNull(message = "{error.required}")
	private long accountName;

}
