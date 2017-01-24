package com.jmr.obdx.dto;

public class Fcc_vw_txnaccountactivityDto {
	
	private String NBRACCOUNT;
	private String BRANCHCODE;
	private Integer CUSTOMERNO;
	public String getNBRACCOUNT() {
		return NBRACCOUNT;
	}
	public void setNBRACCOUNT(String nBRACCOUNT) {
		NBRACCOUNT = nBRACCOUNT;
	}
	public String getBRANCHCODE() {
		return BRANCHCODE;
	}
	public void setBRANCHCODE(String bRANCHCODE) {
		BRANCHCODE = bRANCHCODE;
	}
	public Integer getCUSTOMERNO() {
		return CUSTOMERNO;
	}
	public void setCUSTOMERNO(Integer cUSTOMERNO) {
		CUSTOMERNO = cUSTOMERNO;
	}
	public Fcc_vw_txnaccountactivityDto(String nBRACCOUNT, String bRANCHCODE, Integer cUSTOMERNO) {
		NBRACCOUNT = nBRACCOUNT;
		BRANCHCODE = bRANCHCODE;
		CUSTOMERNO = cUSTOMERNO;
	}

	

}
