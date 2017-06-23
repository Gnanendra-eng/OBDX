package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.obdx.dto.StatusInfo;

public class UserAddedBillerInfo extends StatusInfo{
	
	private List<UserAddedBillerDto> userAddedBillerDtos=new ArrayList<>(0);


	public List<UserAddedBillerDto> getBillerDtos() {
		return userAddedBillerDtos;
	}

	public void setBillerDtos(List<UserAddedBillerDto> userAddedBillerDtos) {
		this.userAddedBillerDtos = userAddedBillerDtos;
	}

	public UserAddedBillerInfo(List<UserAddedBillerDto> userAddedBillerDtos) {
		this.userAddedBillerDtos = userAddedBillerDtos;
	}


	public UserAddedBillerInfo() {
	}

}
