package com.jmr.mcx.service.dto;

public class ErrorDetailDto {
	/*
	 * validation result
	 */
	private String result;
	/*
	 * validation message
	 */
	private String message;
	/*
	 * transaction result
	 */
	private String type;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ErrorDetailDto(String result, String message, String type) {
		super();
		this.result = result;
		this.message = message;
		this.type = type;
	}
	public ErrorDetailDto() {
		super();
	}
}
