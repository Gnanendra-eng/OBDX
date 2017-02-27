package com.jmr.obdx.service.dto;

public class BillerDto {

	private String idBiller;
	private String billerName;
	private String billerProfile;
	

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

	public String getBillerProfile() {
		return billerProfile;
	}

	public void setBillerProfile(String billerProfile) {
		this.billerProfile = billerProfile;
	}

	public BillerDto(String idBiller, String billerName, String billerProfile) {
		this.idBiller = idBiller;
		this.billerName = billerName;
		this.billerProfile = billerProfile;
	}

	public BillerDto() {
	}

}
