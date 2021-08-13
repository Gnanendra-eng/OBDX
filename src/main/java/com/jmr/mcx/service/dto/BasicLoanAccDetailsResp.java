package com.jmr.mcx.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.jmr.mcx.dto.StatusInfo;

public class BasicLoanAccDetailsResp extends StatusInfo {

	private String customerId;

	private List<LoanAccountDtls> activedBasicLoanDetails = new ArrayList<>();

	private List<LoanAccountDtls> closedBasicLoanDetails = new ArrayList<>();

	public BasicLoanAccDetailsResp(List<LoanAccountDtls> activedBasicLoanDetails,
			List<LoanAccountDtls> closedBasicLoanDetails, String customerId) {

		this.activedBasicLoanDetails = activedBasicLoanDetails;
		this.closedBasicLoanDetails = closedBasicLoanDetails;
		this.customerId = customerId;
	}

	public BasicLoanAccDetailsResp() {

	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<LoanAccountDtls> getActivedBasicLoanDetails() {
		return activedBasicLoanDetails;
	}

	public void setActivedBasicLoanDetails(List<LoanAccountDtls> activedBasicLoanDetails) {
		this.activedBasicLoanDetails = activedBasicLoanDetails;
	}

	public List<LoanAccountDtls> getClosedBasicLoanDetails() {
		return closedBasicLoanDetails;
	}

	public void setClosedBasicLoanDetails(List<LoanAccountDtls> closedBasicLoanDetails) {
		this.closedBasicLoanDetails = closedBasicLoanDetails;
	}

}