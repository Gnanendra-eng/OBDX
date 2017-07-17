package com.jmr.obdx.service.dto;

import java.util.List;

import com.jmr.obdx.dto.StatusInfo;

public class PayeeInfo extends StatusInfo {
	
	private List<AllPayee> allPayee;

	public List<AllPayee> getAllPayee() {
		return allPayee;
	}

	public void setAllPayee(List<AllPayee> allPayee) {
		this.allPayee = allPayee;
	}

	public PayeeInfo(List<AllPayee> allPayee) {
		this.allPayee = allPayee;
	}

	public PayeeInfo() {
		// TODO Auto-generated constructor stub
	}

	

}
