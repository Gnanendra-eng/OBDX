package com.jmr.obdx.service.dto;

public class RegisterBillerDto {

	private String billerId;
	private String billerReferenceNumber;
	private String billerName;

	public String getBillerId() {
		return billerId;
	}

	public void setBillerId(String billerId) {
		this.billerId = billerId;
	}

	public String getBillerReferenceNumber() {
		return billerReferenceNumber;
	}

	public void setBillerReferenceNumber(String billerReferenceNumber) {
		this.billerReferenceNumber = billerReferenceNumber;
	}

	public String getBillerName() {
		return billerName;
	}

	public void setBillerName(String billerName) {
		this.billerName = billerName;
	}

	public long getBillerOperatorID() {
		return billerOperatorID;
	}

	public RegisterBillerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterBillerDto(String billerId, String billerReferenceNumber, String billerName, long billerOperatorID) {
		super();
		this.billerId = billerId;
		this.billerReferenceNumber = billerReferenceNumber;
		this.billerName = billerName;
		this.billerOperatorID = billerOperatorID;
	}

	public void setBillerOperatorID(long billerOperatorID) {
		this.billerOperatorID = billerOperatorID;
	}

	private long billerOperatorID;
}
