package com.jmr.obdx.service.dto;

public class AllPayee {
	
	private  long id;
	private String payeeName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public AllPayee() {
		// TODO Auto-generated constructor stub
	}
	public AllPayee(long id, String payeeName) {
		this.id = id;
		this.payeeName = payeeName;
	}
	

}
