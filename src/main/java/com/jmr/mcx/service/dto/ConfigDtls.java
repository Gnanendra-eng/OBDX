package com.jmr.mcx.service.dto;

import java.util.List;

import com.jmr.mcx.dto.StatusInfo;

public class ConfigDtls extends StatusInfo {

	private List<AllConfigDet> allConfigDtls;

	public List<AllConfigDet> getAllConfigDtls() {
		return allConfigDtls;
	}

	public void setAllConfigDtls(List<AllConfigDet> allConfigDtls) {
		this.allConfigDtls = allConfigDtls;
	}

	public ConfigDtls(List<AllConfigDet> allConfigDtls) {
		this.allConfigDtls = allConfigDtls;
	}

	public ConfigDtls() {
		// TODO Auto-generated constructor stub
	}

}
