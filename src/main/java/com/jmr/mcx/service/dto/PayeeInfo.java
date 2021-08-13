package com.jmr.mcx.service.dto;

import java.util.List;

import com.jmr.mcx.dto.StatusInfo;

public class PayeeInfo extends StatusInfo {
	
	private List<AllPayee> allPayee;
	private List<ViewBeneficiaryDto> benList;
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

	private List<BeneficiaryDto> beneficiaryList;

	public List<BeneficiaryDto> getBeneficiaryList() {
		return beneficiaryList;
	}

	public void setBeneficiaryList(List<BeneficiaryDto> beneficiaryList) {
		this.beneficiaryList = beneficiaryList;
	}

	public List<ViewBeneficiaryDto> getBenList() {
		return benList;
	}

	public void setBenList(List<ViewBeneficiaryDto> benList) {
		this.benList = benList;
	}

}
