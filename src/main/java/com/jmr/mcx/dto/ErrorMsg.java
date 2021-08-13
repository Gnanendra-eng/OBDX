package com.jmr.mcx.dto;

/***
 * @author JMR
 */
public class ErrorMsg {

	private String field;
	private String errorMsg;

	public ErrorMsg(String field, String errorMsg) {
		this.field = field;
		this.errorMsg = errorMsg;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
