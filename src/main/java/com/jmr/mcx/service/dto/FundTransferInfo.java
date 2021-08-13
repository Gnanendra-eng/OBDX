package com.jmr.mcx.service.dto;

import java.util.Set;

import com.jmr.mcx.dto.ErrorMsg;
import com.jmr.mcx.dto.StatusInfo;

public class FundTransferInfo extends StatusInfo {

	private String fcdbRefId;
	private String hostRefId;
	private String status;
	public String getFcdbRefId() {
		return fcdbRefId;
	}
	public void setFcdbRefId(String fcdbRefId) {
		this.fcdbRefId = fcdbRefId;
	}
	public String getHostRefId() {
		return hostRefId;
	}
	public void setHostRefId(String hostRefId) {
		this.hostRefId = hostRefId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public FundTransferInfo(String fcdbRefId, String hostRefId, String status) {
		this.fcdbRefId = fcdbRefId;
		this.hostRefId = hostRefId;
		this.status = status;
	}
	public FundTransferInfo() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
