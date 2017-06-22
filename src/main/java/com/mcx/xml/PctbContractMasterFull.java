package com.mcx.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PctbContractMasterFull {
	
	@XmlAttribute 
	private String SRCCOD;
	
	@XmlAttribute
	private String SRCREF;
	
	
	@XmlAttribute
	private String PRDCAT;
	
	
	@XmlAttribute
	private String PRDCOD;
	
	@XmlAttribute
	private String TXNCCY;
	
	@XmlAttribute
	private String CUSACCCY;
	
	@XmlAttribute
	private Number ACTAMT;
	
	@XmlAttribute
	private String REMRK;
	
	@XmlAttribute
	private String CUSTBRN;
	
	@XmlAttribute
	private String CPACNO;
	
	
	@XmlAttribute
	private String ACBRN1;
	
	@XmlAttribute
	private String CUSACNO;
	
	
	@XmlAttribute
	private String CPBNKCOD;
	
	
	@XmlAttribute
	private String ACTDT;
	
	@XmlAttribute
	private String AUTHSTAT;

	public String getSRCCOD() {
		return SRCCOD;
	}

	public void setSRCCOD(String sRCCOD) {
		SRCCOD = sRCCOD;
	}

	public String getSRCREF() {
		return SRCREF;
	}

	public void setSRCREF(String sRCREF) {
		SRCREF = sRCREF;
	}

	public String getPRDCAT() {
		return PRDCAT;
	}

	public void setPRDCAT(String pRDCAT) {
		PRDCAT = pRDCAT;
	}

	public String getPRDCOD() {
		return PRDCOD;
	}

	public void setPRDCOD(String pRDCOD) {
		PRDCOD = pRDCOD;
	}

	public String getTXNCCY() {
		return TXNCCY;
	}

	public void setTXNCCY(String tXNCCY) {
		TXNCCY = tXNCCY;
	}

	public String getCUSACCCY() {
		return CUSACCCY;
	}

	public void setCUSACCCY(String cUSACCCY) {
		CUSACCCY = cUSACCCY;
	}

	public Number getACTAMT() {
		return ACTAMT;
	}

	public void setACTAMT(Number aCTAMT) {
		ACTAMT = aCTAMT;
	}

	public String getREMRK() {
		return REMRK;
	}

	public void setREMRK(String rEMRK) {
		REMRK = rEMRK;
	}

	public String getCUSTBRN() {
		return CUSTBRN;
	}

	public void setCUSTBRN(String cUSTBRN) {
		CUSTBRN = cUSTBRN;
	}

	public String getCPACNO() {
		return CPACNO;
	}

	public void setCPACNO(String cPACNO) {
		CPACNO = cPACNO;
	}

	public String getACBRN1() {
		return ACBRN1;
	}

	public void setACBRN1(String aCBRN1) {
		ACBRN1 = aCBRN1;
	}

	public String getCUSACNO() {
		return CUSACNO;
	}

	public void setCUSACNO(String cUSACNO) {
		CUSACNO = cUSACNO;
	}

	public String getCPBNKCOD() {
		return CPBNKCOD;
	}

	public void setCPBNKCOD(String cPBNKCOD) {
		CPBNKCOD = cPBNKCOD;
	}

	public String getACTDT() {
		return ACTDT;
	}

	public void setACTDT(String aCTDT) {
		ACTDT = aCTDT;
	}

	public String getAUTHSTAT() {
		return AUTHSTAT;
	}

	public void setAUTHSTAT(String aUTHSTAT) {
		AUTHSTAT = aUTHSTAT;
	}

	public PctbContractMasterFull(String sRCCOD, String sRCREF, String pRDCAT, String pRDCOD, String tXNCCY,
			String cUSACCCY, Number aCTAMT, String rEMRK, String cUSTBRN, String cPACNO, String aCBRN1, String cUSACNO,
			String cPBNKCOD, String aCTDT, String aUTHSTAT) {
		SRCCOD = sRCCOD;
		SRCREF = sRCREF;
		PRDCAT = pRDCAT;
		PRDCOD = pRDCOD;
		TXNCCY = tXNCCY;
		CUSACCCY = cUSACCCY;
		ACTAMT = aCTAMT;
		REMRK = rEMRK;
		CUSTBRN = cUSTBRN;
		CPACNO = cPACNO;
		ACBRN1 = aCBRN1;
		CUSACNO = cUSACNO;
		CPBNKCOD = cPBNKCOD;
		ACTDT = aCTDT;
		AUTHSTAT = aUTHSTAT;
	}

	public PctbContractMasterFull() {
		// TODO Auto-generated constructor stub
	}
	

}
