package com.jmr.obdx.service.dto;

import java.util.HashSet;

import com.jmr.obdx.dto.StatusInfo;

public class BillerInfo extends StatusInfo {

	private HashSet<BillerDto> billerDtos = new HashSet<>(0);

	public HashSet<BillerDto> getBillerDtos() {
		return billerDtos;
	}

	public void setBillerDtos(HashSet<BillerDto> billerDtos) {
		this.billerDtos = billerDtos;
	}
}
