package com.jmr.obdx.service.dto;

public class UserAddedBillerDto {

	private String idBiller;
	private String billerName;
	private String billerOperator;

	public String getBillerOperator() {
		return billerOperator;
	}

	public void setBillerOperator(String billerOperator) {
		this.billerOperator = billerOperator;
	}

	public String getIdBiller() {
		return idBiller;
	}

	public void setIdBiller(String idBiller) {
		this.idBiller = idBiller;
	}

	public String getBillerName() {
		return billerName;
	}

	public void setBillerName(String billerName) {
		this.billerName = billerName;
	}

	

	public UserAddedBillerDto(String idBiller, String billerName,String billerOperator) {
		this.idBiller = idBiller;
		this.billerName = billerName;
		this.billerOperator=billerOperator;
	}

	public UserAddedBillerDto() {
	}

}
