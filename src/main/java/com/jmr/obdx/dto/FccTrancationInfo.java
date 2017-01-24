package com.jmr.obdx.dto;

import java.util.HashSet;

public class FccTrancationInfo extends StatusInfo {

	private HashSet<Fcc_vw_txnaccountactivityDto> fcc_vw_txnaccountactivityDtos = new HashSet<>(0);

	public HashSet<Fcc_vw_txnaccountactivityDto> getFcc_vw_txnaccountactivityDtos() {
		return fcc_vw_txnaccountactivityDtos;
	}

	public void setFcc_vw_txnaccountactivityDtos(HashSet<Fcc_vw_txnaccountactivityDto> fcc_vw_txnaccountactivityDtos) {
		this.fcc_vw_txnaccountactivityDtos = fcc_vw_txnaccountactivityDtos;
	}

	public FccTrancationInfo(HashSet<Fcc_vw_txnaccountactivityDto> fcc_vw_txnaccountactivityDtos) {

		this.fcc_vw_txnaccountactivityDtos = fcc_vw_txnaccountactivityDtos;
	}

	public FccTrancationInfo() {

	}

}
