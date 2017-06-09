package com.jmr.obdx.service.dto;

import javax.validation.constraints.NotNull;

public class BeneficiaryDto {

	@NotNull(message = "{error.required}")
	private String payeeName;
	
	@NotNull(message = "{error.required}")
	private long accountName;
	
	@NotNull(message = "{error.required}")
	private long branchId;
	
	@NotNull(message = "{error.required}")
	private String nickName;
	
	@NotNull(message = "{error.required}")
	private long accountNumber;
	private long swiftCode;
	private long ncc;
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public long getAccountName() {
		return accountName;
	}
	public void setAccountName(long accountName) {
		this.accountName = accountName;
	}
	public long getBranchId() {
		return branchId;
	}
	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getSwiftCode() {
		return swiftCode;
	}
	public void setSwiftCode(long swiftCode) {
		this.swiftCode = swiftCode;
	}
	public long getNcc() {
		return ncc;
	}
	public void setNcc(long ncc) {
		this.ncc = ncc;
	}
	public BeneficiaryDto(String payeeName, long accountName, long branchId, String nickName, long accountNumber,
			long swiftCode, long ncc) {
		this.payeeName = payeeName;
		this.accountName = accountName;
		this.branchId = branchId;
		this.nickName = nickName;
		this.accountNumber = accountNumber;
		this.swiftCode = swiftCode;
		this.ncc = ncc;
	}
	public BeneficiaryDto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
