package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.obdx.dto.StatusInfo;

public class AccountSummaryInfo extends StatusInfo {

	private Double sumOfSavingsAndCurrent;
	private Double sumOfLoans;
	private Double sumOfContractAndTermdepostit;
	private List<String> nbrAccounts;
	private List<AccountSummaryDto> savingsAndCurrent = new ArrayList<>();
	private List<AccountSummaryDto> loans = new ArrayList<>();
	private List<AccountSummaryDto> contractAndTermdeposit = new ArrayList<>();
	private String customerId;
	private String currencyType;

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Double getSumOfSavingsAndCurrent() {
		return sumOfSavingsAndCurrent;
	}

	public List<String> getNbrAccounts() {
		return nbrAccounts;
	}

	public void setNbrAccounts(List<String> nbrAccounts) {
		this.nbrAccounts = nbrAccounts;
	}

	public void setSumOfSavingsAndCurrent(Double sumOfSavingsAndCurrent) {
		this.sumOfSavingsAndCurrent = sumOfSavingsAndCurrent;
	}

	public Double getSumOfLoans() {
		return sumOfLoans;
	}

	public void setSumOfLoans(Double sumOfLoans) {
		this.sumOfLoans = sumOfLoans;
	}

	public Double getSumOfContractAndTermdepostit() {
		return sumOfContractAndTermdepostit;
	}

	public void setSumOfContractAndTermdepostit(Double sumOfContractAndTermdepostit) {
		this.sumOfContractAndTermdepostit = sumOfContractAndTermdepostit;
	}

	public List<AccountSummaryDto> getSavingsAndCurrent() {
		return savingsAndCurrent;
	}

	public void setSavingsAndCurrent(List<AccountSummaryDto> savingsAndCurrent) {
		this.savingsAndCurrent = savingsAndCurrent;
	}

	public List<AccountSummaryDto> getLoans() {
		return loans;
	}

	public void setLoans(List<AccountSummaryDto> loans) {
		this.loans = loans;
	}

	public List<AccountSummaryDto> getContractAndTermdeposit() {
		return contractAndTermdeposit;
	}

	public void setContractAndTermdeposit(List<AccountSummaryDto> contractAndTermdeposit) {
		this.contractAndTermdeposit = contractAndTermdeposit;
	}

	public AccountSummaryInfo(Double sumOfSavingsAndCurrent, Double sumOfLoans, Double sumOfContractAndTermdepostit,
			List<AccountSummaryDto> savingsAndCurrent, List<AccountSummaryDto> loans,
			List<AccountSummaryDto> contractAndTermdeposit, List<String> nbrAccounts, String customerId,String currencyType) {

		this.sumOfSavingsAndCurrent = sumOfSavingsAndCurrent;
		this.sumOfLoans = sumOfLoans;
		this.sumOfContractAndTermdepostit = sumOfContractAndTermdepostit;
		this.savingsAndCurrent = savingsAndCurrent;
		this.loans = loans;
		this.contractAndTermdeposit = contractAndTermdeposit;
		this.nbrAccounts = nbrAccounts;
		this.customerId = customerId;
		this.currencyType=currencyType;
	}

	public AccountSummaryInfo() {

	}
}