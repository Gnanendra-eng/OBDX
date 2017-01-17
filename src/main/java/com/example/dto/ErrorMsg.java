package com.example.dto;

/***
 * @author RISHAD K
 */
public class ErrorMsg {

	private String field;
	private String errorMsg;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public ErrorMsg(String field, String errorMsg) {
		this.field = field;
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
