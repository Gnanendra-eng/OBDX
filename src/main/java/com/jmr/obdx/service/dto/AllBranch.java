package com.jmr.obdx.service.dto;

import java.util.Date;

import com.jmr.obdx.domain.TransferType;

public class AllBranch {
	
	private String branchName;
	private long branchId;
	private String branchCode;
	private String address;
	private long contactInfo;
	private String city;
	private String processingMode;
	private String isActive;
	private Date createdDate;
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public long getBranchId() {
		return branchId;
	}
	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(long contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProcessingMode() {
		return processingMode;
	}
	public void setProcessingMode(String processingMode) {
		this.processingMode = processingMode;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public AllBranch(String branchName, long branchId, String branchCode, String address, long contactInfo, String city,
			String processingMode, String isActive, Date createdDate) {
		this.branchName = branchName;
		this.branchId = branchId;
		this.branchCode = branchCode;
		this.address = address;
		this.contactInfo = contactInfo;
		this.city = city;
		this.processingMode = processingMode;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}
	public AllBranch() {
		// TODO Auto-generated constructor stub
	}
	



}
