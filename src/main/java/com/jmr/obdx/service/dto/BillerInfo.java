package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.obdx.dto.StatusInfo;

public class BillerInfo extends StatusInfo{
	
	private List<BillerDto> billerDtos=new ArrayList<>(0);


	public List<BillerDto> getBillerDtos() {
		return billerDtos;
	}

	public void setBillerDtos(List<BillerDto> billerDtos) {
		this.billerDtos = billerDtos;
	}

	public BillerInfo(List<BillerDto> billerDtos) {
		this.billerDtos = billerDtos;
	}


	public BillerInfo() {
	}

}
