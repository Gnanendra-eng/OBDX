package com.jmr.mcx.service.dto;

import java.util.HashSet;
import java.util.Set;

import com.jmr.mcx.dto.StatusInfo;

public class BeneficiaryDtoInfo extends StatusInfo {
	private Set<BeneficiaryDto> beneficiaryDtos = new HashSet<BeneficiaryDto>(0);

	public Set<BeneficiaryDto> getBeneficiaryDtos() {
		return beneficiaryDtos;
	}

	public void setBeneficiaryDtos(Set<BeneficiaryDto> beneficiaryDtos) {
		this.beneficiaryDtos = beneficiaryDtos;
	}

}
