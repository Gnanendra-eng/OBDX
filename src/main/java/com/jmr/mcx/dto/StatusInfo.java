package com.jmr.mcx.dto;

import java.util.HashSet;
import java.util.Set;

/***
 * @author JMR
 */
public class StatusInfo {

	private Boolean errorStatus = false;

	private Set<ErrorMsg> errorMsgs = new HashSet<ErrorMsg>(0);

	public StatusInfo() {

	}

	public Boolean getErrorStatus() {
		return errorStatus;
	}

	public void setErrorStatus(Boolean errorStatus) {
		this.errorStatus = errorStatus;
	}

	public Set<ErrorMsg> getErrorMsgs() {
		return errorMsgs;
	}

	public void setErrorMsgs(Set<ErrorMsg> errorMsgs) {
		this.errorMsgs = errorMsgs;
	}

	public StatusInfo(Boolean errorStatus) {
		this.errorStatus = errorStatus;
	}

	public StatusInfo(Boolean errorStatus, Set<ErrorMsg> errorMsgs) {
		this.errorStatus = errorStatus;
		this.errorMsgs = errorMsgs;
	}

}
