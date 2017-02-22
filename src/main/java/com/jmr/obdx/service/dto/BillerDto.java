package com.jmr.obdx.service.dto;

public class BillerDto {

	private String idbiller;
	private String billername;
	private String billerprofile;

	public String getIdbiller() {
		return idbiller;
	}

	public void setIdbiller(String idbiller) {
		this.idbiller = idbiller;
	}

	public String getBillername() {
		return billername;
	}

	public void setBillername(String billername) {
		this.billername = billername;
	}

	public String getBillerprofile() {
		return billerprofile;
	}

	public void setBillerprofile(String billerprofile) {
		this.billerprofile = billerprofile;
	}

	public BillerDto() {
		
	}

	public BillerDto(String idbiller, String billername, String billerprofile) {
		this.idbiller = idbiller;
		this.billername = billername;
		this.billerprofile = billerprofile;
	}

}
