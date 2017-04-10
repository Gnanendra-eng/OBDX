package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.obdx.dto.StatusInfo;

public class BasicLoanDetailsInfo extends StatusInfo {

	private Double totalBorrowing;
	private Double currentOutStanding;
	private List<String> nbrAccounts;
	private String customerId;
	private String currencyType;

	
	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	private List<BasicLoanDetailsDto> activedBasicLoanDetailsDto = new ArrayList<>();

	private List<BasicLoanDetailsDto> closedBasicLoanDetailsDto = new ArrayList<>();

	public BasicLoanDetailsInfo() {
		// TODO Auto-generated constructor stub
	}

	public BasicLoanDetailsInfo(Double totalBorrowing, Double currentOutStanding,List<BasicLoanDetailsDto> activedBasicLoanDetailsDto,
			List<BasicLoanDetailsDto> closedBasicLoanDetailsDto,String customerId, List<String> nbrAccounts,String currencyType) {
		this.totalBorrowing = totalBorrowing;
		this.currentOutStanding = currentOutStanding;
		this.activedBasicLoanDetailsDto = activedBasicLoanDetailsDto;
		this.closedBasicLoanDetailsDto = closedBasicLoanDetailsDto;
		this.customerId=customerId;
		this.nbrAccounts=nbrAccounts;
		this.currencyType=currencyType;
	}
	
	
	public List<String> getNbrAccounts() {
		return nbrAccounts;
	}

	public void setNbrAccounts(List<String> nbrAccounts) {
		this.nbrAccounts = nbrAccounts;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public Double getTotalBorrowing() {
		return totalBorrowing;
	}

	public void setTotalBorrowing(Double totalBorrowing) {
		this.totalBorrowing = totalBorrowing;
	}

	public Double getCurrentOutStanding() {
		return currentOutStanding;
	}

	public void setCurrentOutStanding(Double currentOutStanding) {
		this.currentOutStanding = currentOutStanding;
	}

	public List<BasicLoanDetailsDto> getActivedBasicLoanDetailsDto() {
		return activedBasicLoanDetailsDto;
	}

	public void setActivedBasicLoanDetailsDto(List<BasicLoanDetailsDto> activedBasicLoanDetailsDto) {
		this.activedBasicLoanDetailsDto = activedBasicLoanDetailsDto;
	}

	public List<BasicLoanDetailsDto> getClosedBasicLoanDetailsDto() {
		return closedBasicLoanDetailsDto;
	}

	public void setClosedBasicLoanDetailsDto(List<BasicLoanDetailsDto> closedBasicLoanDetailsDto) {
		this.closedBasicLoanDetailsDto = closedBasicLoanDetailsDto;
	}

}
