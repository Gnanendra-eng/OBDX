package com.jmr.mcx.service.dto;

import java.util.HashSet;
import java.util.Set;

import com.jmr.mcx.dto.StatusInfo;

public class BankAddressRespDtoInfo extends StatusInfo{
	private Set<BankAddressRespDto> bankAddressRespDtos = new HashSet<BankAddressRespDto>(0);

	public Set<BankAddressRespDto> getBankAddressRespDtos() {
		return bankAddressRespDtos;
	}

	public void setBankAddressRespDtos(Set<BankAddressRespDto> bankAddressRespDtos) {
		this.bankAddressRespDtos = bankAddressRespDtos;
	}


}
