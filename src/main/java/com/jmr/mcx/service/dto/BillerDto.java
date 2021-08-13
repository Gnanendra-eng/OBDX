package com.jmr.mcx.service.dto;

public class BillerDto {

	private String billerID;
	private String billerDescription;

	public String getBillerID() {
		return billerID;
	}

	public void setBillerID(String billerID) {
		this.billerID = billerID;
	}

	public String getBillerDescription() {
		return billerDescription;
	}

	public BillerDto(String billerID, String billerDescription, String billerCustomerId) {
		super();
		this.billerID = billerID;
		this.billerDescription = billerDescription;
		this.billerCustomerId = billerCustomerId;
	}

	public BillerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setBillerDescription(String billerDescription) {
		this.billerDescription = billerDescription;
	}

	public String getBillerCustomerId() {
		return billerCustomerId;
	}

	public void setBillerCustomerId(String billerCustomerId) {
		this.billerCustomerId = billerCustomerId;
	}

	private String billerCustomerId;
}
