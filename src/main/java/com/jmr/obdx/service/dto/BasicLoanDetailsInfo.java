package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.obdx.dto.StatusInfo;

public class BasicLoanDetailsInfo extends StatusInfo {

	private Double totalBorrowing;
	private Double currentOutStanding;

	private List<BasicLoanDetailsDto> activedBasicLoanDetailsDto = new ArrayList<>();

	private List<BasicLoanDetailsDto> closedBasicLoanDetailsDto = new ArrayList<>();

	public BasicLoanDetailsInfo() {
		// TODO Auto-generated constructor stub
	}

	public BasicLoanDetailsInfo(Double totalBorrowing, Double currentOutStanding,List<BasicLoanDetailsDto> activedBasicLoanDetailsDto, List<BasicLoanDetailsDto> closedBasicLoanDetailsDto) {
		this.totalBorrowing = totalBorrowing;
		this.currentOutStanding = currentOutStanding;
		this.activedBasicLoanDetailsDto = activedBasicLoanDetailsDto;
		this.closedBasicLoanDetailsDto = closedBasicLoanDetailsDto;
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
