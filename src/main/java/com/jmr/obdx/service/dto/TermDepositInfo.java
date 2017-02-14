package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.restcontroller.TermDepositeController;

public class TermDepositInfo extends StatusInfo{
	

	private Double sumOfActiveTermDeposite;
	private Double sumOfInactiveTermDeposite;
	private List<AccountSummaryDto> inactivetermdeposite = new ArrayList<>();
	private List<AccountSummaryDto> activeTermDepositeDtos = new ArrayList<>();
	public TermDepositInfo(Double sumOfActiveTermDeposite, Double sumOfInactiveTermDeposite,
			List<AccountSummaryDto> inactivetermdeposite, List<AccountSummaryDto> activeTermDepositeDtos) {
		this.sumOfActiveTermDeposite = sumOfActiveTermDeposite;
		this.sumOfInactiveTermDeposite = sumOfInactiveTermDeposite;
		this.inactivetermdeposite = inactivetermdeposite;
		this.activeTermDepositeDtos = activeTermDepositeDtos;
	}
	public TermDepositInfo(List<TermDepositeController> termDeposite) {
	}
	public Double getSumOfActiveTermDeposite() {
		return sumOfActiveTermDeposite;
	}
	public void setSumOfActiveTermDeposite(Double sumOfActiveTermDeposite) {
		this.sumOfActiveTermDeposite = sumOfActiveTermDeposite;
	}
	public Double getSumOfInactiveTermDeposite() {
		return sumOfInactiveTermDeposite;
	}
	public void setSumOfInactiveTermDeposite(Double sumOfInactiveTermDeposite) {
		this.sumOfInactiveTermDeposite = sumOfInactiveTermDeposite;
	}
	public List<AccountSummaryDto> getInactivetermdeposite() {
		return inactivetermdeposite;
	}
	public void setInactivetermdeposite(List<AccountSummaryDto> inactivetermdeposite) {
		this.inactivetermdeposite = inactivetermdeposite;
	}
	public List<AccountSummaryDto> getActiveTermDepositeDtos() {
		return activeTermDepositeDtos;
	}
	public void setActiveTermDepositeDtos(List<AccountSummaryDto> activeTermDepositeDtos) {
		this.activeTermDepositeDtos = activeTermDepositeDtos;
	}
	
	

	

}
