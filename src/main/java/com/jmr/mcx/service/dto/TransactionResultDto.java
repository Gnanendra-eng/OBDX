package com.jmr.mcx.service.dto;


import java.util.List;

import com.jmr.mcx.domain.McxCustomerMappingM;


public class TransactionResultDto {
	private DomesticTransferDto domesticTransferDto;
	private ErrorDetailDto errorDetailDto;
	private List<ErrorDetailDto> errorInfo;
	private List<ViewBeneficiaryDto> beneficiaryList;
	private List<AccountDetailsDto> accountDetailList;
	public DomesticTransferDto getDomesticTransferDto() {
		return domesticTransferDto;
	}
	public void setDomesticTransferDto(DomesticTransferDto domesticTransferDto) {
		this.domesticTransferDto = domesticTransferDto;
	}
	public ErrorDetailDto getErrorDetailDto() {
		return errorDetailDto;
	}
	public void setErrorDetailDto(ErrorDetailDto errorDetailDto) {
		this.errorDetailDto = errorDetailDto;
	}
	public List<ErrorDetailDto> getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(List<ErrorDetailDto> errorInfo) {
		this.errorInfo = errorInfo;
	}
	public List<ViewBeneficiaryDto> getBeneficiaryList() {
		return beneficiaryList;
	}
	public void setBeneficiaryList(List<ViewBeneficiaryDto> beneficiaryList) {
		this.beneficiaryList = beneficiaryList;
	}
	public List<AccountDetailsDto> getAccountDetailList() {
		return accountDetailList;
	}
	public void setAccountDetailList(List<AccountDetailsDto> accountDetailList) {
		this.accountDetailList = accountDetailList;
	}
	

}
