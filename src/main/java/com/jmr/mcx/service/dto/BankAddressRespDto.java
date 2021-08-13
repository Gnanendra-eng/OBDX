package com.jmr.mcx.service.dto;

import com.jmr.mcx.dto.StatusInfo;

public class BankAddressRespDto extends StatusInfo {
	private String bankName;
	private String branchCode;
	private String natId;
	private String bankAddress1;
	private String bankAddress2;
	private String bankAddress3;
	private String bankAddress4;
	private String city;

	public BankAddressRespDto() {
		super();
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getNatId() {
		return natId;
	}

	public void setNatId(String natId) {
		this.natId = natId;
	}

	public String getBankAddress1() {
		return bankAddress1;
	}

	public void setBankAddress1(String bankAddress1) {
		this.bankAddress1 = bankAddress1;
	}

	public String getBankAddress2() {
		return bankAddress2;
	}

	public void setBankAddress2(String bankAddress2) {
		this.bankAddress2 = bankAddress2;
	}

	public String getBankAddress3() {
		return bankAddress3;
	}

	public void setBankAddress3(String bankAddress3) {
		this.bankAddress3 = bankAddress3;
	}

	public String getBankAddress4() {
		return bankAddress4;
	}

	public void setBankAddress4(String bankAddress4) {
		this.bankAddress4 = bankAddress4;
	}

	public BankAddressRespDto(String bankName, String branchCode, String natId, String bankAddress1,
			String bankAddress2, String bankAddress3, String bankAddress4) {
		super();
		this.bankName = bankName;
		this.branchCode = branchCode;
		this.natId = natId;
		this.bankAddress1 = bankAddress1;
		this.bankAddress2 = bankAddress2;
		this.bankAddress3 = bankAddress3;
		this.bankAddress4 = bankAddress4;
	}

	public BankAddressRespDto(String bankName, String bankAddress1, String city) {
		super();
		this.bankName = bankName;
		this.bankAddress1 = bankAddress1;
		this.city = city;
	}

}
