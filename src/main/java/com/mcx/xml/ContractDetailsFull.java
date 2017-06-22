/*package com.mcx.xml;

import javax.xml.bind.annotation.XmlElement;

public class ContractDetailsFull {
	
	
	
	@XmlElement(name="PROD")
	private String prod;

	@XmlElement(name ="USERREFNO")
	private String userRefNO;

	@XmlElement(name ="DRVALDT")
	private String drvaldt;

	@XmlElement(name ="CRBRN")
	private String crben;

	@XmlElement(name ="CRACC")
	private String crAcc;

	@XmlElement(name ="CRCCY")
	private String crCcy;

	@XmlElement(name ="CRAMT")
	private long crAmt;

	@XmlElement(name ="CRVALDT")
	private String crvaldt;

	

	@XmlElement(name ="DBTBRN")
	private String dbtbrn;

	@XmlElement(name ="DBTACC")
	private String  dbtAcc;

	@XmlElement(name ="DRCCY")
	private String drCcy;

	@XmlElement(name ="DR_AMOUNT")
	private int drAmount;

	@XmlElement
	private long SPREADCD;

	@XmlElement
	private int AMTSTTLACY;
	
	@XmlElement
	private String CHRGBEARER;
	
	@XmlElement
	private String RTCD;
	
	@XmlElement
	private String RTPICKDT;

	@XmlElement
	private String MSGCD;

	@XmlElement
	private String MSGDT;

	@XmlElement
	private String SOURCEREFNO;

	@XmlElement
	private String SOURCECD;

	@XmlElement
	private String ACCTINGASOF;
	
	@XmlElement
	private String ACCOUNTING_DATE;

	@XmlElement
	private String MULTCUSTTRNASF;

	@XmlElement
	private String PRODDESC;

	@XmlElement
	private String OVEROVERDRFT;

	@XmlElement
	private String BYORDEROF2;

	@XmlElement
	private String ULTBEN1;
	
	@XmlElement
	private String MAKER;

	@XmlElement
	private String MAKDTTIME;

	@XmlElement
	private String AUTHSTAT;

	@XmlElement
	private String PROCESSTAT;

	@XmlElement
	private String REMITMSG;

	@XmlElement
	private String CRACCDESC;
	
	@XmlElement
	private String DRACCDESC;

	
	@XmlElement
	private String RTREFRS;

	@XmlElement
	private String STULTBEN;

	@XmlElement
	private String STOURSELVES;

	@XmlElement
	private String RATETYPE;

	@XmlElement
	private long BASERATE;

	@XmlElement
	private String BOOKDT;
	
	@XmlElement
	private long VERNO;

	@XmlElement
	private long LATVERNO;

	@XmlElement
	private String BANKOPERCD;

	@XmlElement
	private String USRREF;
	
	@XmlElement
	private String PRDCD;

	@XmlElement
	private String CPTY;

	@XmlElement
	private String MODCD;
	
	@XmlElement
	private String CONCCY;

	@XmlElement
	private String SOURCE;

	@XmlElement
	private String TXNSTAT;

	@XmlElement
	private String ONCEAUTH;

	public String getCONTREFNO() {
		return CONTREFNO;
	}

	public void setCONTREFNO(String cONTREFNO) {
		CONTREFNO = cONTREFNO;
	}

	public String getPROD() {
		return PROD;
	}

	public void setPROD(String pROD) {
		PROD = pROD;
	}

	public String getUSERREFNO() {
		return USERREFNO;
	}

	public void setUSERREFNO(String uSERREFNO) {
		USERREFNO = uSERREFNO;
	}

	public String getDRVALDT() {
		return DRVALDT;
	}

	public void setDRVALDT(String dRVALDT) {
		DRVALDT = dRVALDT;
	}

	public String getCRBRN() {
		return CRBRN;
	}

	public void setCRBRN(String cRBRN) {
		CRBRN = cRBRN;
	}

	public String getCRACC() {
		return CRACC;
	}

	public void setCRACC(String cRACC) {
		CRACC = cRACC;
	}

	public String getCRCCY() {
		return CRCCY;
	}

	public void setCRCCY(String cRCCY) {
		CRCCY = cRCCY;
	}

	public long getCRAMT() {
		return CRAMT;
	}

	public void setCRAMT(long cRAMT) {
		CRAMT = cRAMT;
	}

	public String getCRVALDT() {
		return CRVALDT;
	}

	public void setCRVALDT(String cRVALDT) {
		CRVALDT = cRVALDT;
	}

	public long getEXG_RATE() {
		return EXG_RATE;
	}

	public void setEXG_RATE(long eXG_RATE) {
		EXG_RATE = eXG_RATE;
	}

	public String getDBTBRN() {
		return DBTBRN;
	}

	public void setDBTBRN(String dBTBRN) {
		DBTBRN = dBTBRN;
	}

	public String getDBTACC() {
		return DBTACC;
	}

	public void setDBTACC(String dBTACC) {
		DBTACC = dBTACC;
	}

	public String getDRCCY() {
		return DRCCY;
	}

	public void setDRCCY(String dRCCY) {
		DRCCY = dRCCY;
	}

	public int getDR_AMOUNT() {
		return DR_AMOUNT;
	}

	public void setDR_AMOUNT(int dR_AMOUNT) {
		DR_AMOUNT = dR_AMOUNT;
	}

	public long getSPREADCD() {
		return SPREADCD;
	}

	public void setSPREADCD(long sPREADCD) {
		SPREADCD = sPREADCD;
	}

	public int getAMTSTTLACY() {
		return AMTSTTLACY;
	}

	public void setAMTSTTLACY(int aMTSTTLACY) {
		AMTSTTLACY = aMTSTTLACY;
	}

	public String getCHRGBEARER() {
		return CHRGBEARER;
	}

	public void setCHRGBEARER(String cHRGBEARER) {
		CHRGBEARER = cHRGBEARER;
	}

	public String getRTCD() {
		return RTCD;
	}

	public void setRTCD(String rTCD) {
		RTCD = rTCD;
	}

	public String getRTPICKDT() {
		return RTPICKDT;
	}

	public void setRTPICKDT(String rTPICKDT) {
		RTPICKDT = rTPICKDT;
	}

	public String getMSGCD() {
		return MSGCD;
	}

	public void setMSGCD(String mSGCD) {
		MSGCD = mSGCD;
	}

	public String getMSGDT() {
		return MSGDT;
	}

	public void setMSGDT(String mSGDT) {
		MSGDT = mSGDT;
	}

	public String getSOURCEREFNO() {
		return SOURCEREFNO;
	}

	public void setSOURCEREFNO(String sOURCEREFNO) {
		SOURCEREFNO = sOURCEREFNO;
	}

	public String getSOURCECD() {
		return SOURCECD;
	}

	public void setSOURCECD(String sOURCECD) {
		SOURCECD = sOURCECD;
	}

	public String getACCTINGASOF() {
		return ACCTINGASOF;
	}

	public void setACCTINGASOF(String aCCTINGASOF) {
		ACCTINGASOF = aCCTINGASOF;
	}

	public String getACCOUNTING_DATE() {
		return ACCOUNTING_DATE;
	}

	public void setACCOUNTING_DATE(String aCCOUNTING_DATE) {
		ACCOUNTING_DATE = aCCOUNTING_DATE;
	}

	public String getMULTCUSTTRNASF() {
		return MULTCUSTTRNASF;
	}

	public void setMULTCUSTTRNASF(String mULTCUSTTRNASF) {
		MULTCUSTTRNASF = mULTCUSTTRNASF;
	}

	public String getPRODDESC() {
		return PRODDESC;
	}

	public void setPRODDESC(String pRODDESC) {
		PRODDESC = pRODDESC;
	}

	public String getOVEROVERDRFT() {
		return OVEROVERDRFT;
	}

	public void setOVEROVERDRFT(String oVEROVERDRFT) {
		OVEROVERDRFT = oVEROVERDRFT;
	}

	public String getBYORDEROF2() {
		return BYORDEROF2;
	}

	public void setBYORDEROF2(String bYORDEROF2) {
		BYORDEROF2 = bYORDEROF2;
	}

	public String getULTBEN1() {
		return ULTBEN1;
	}

	public void setULTBEN1(String uLTBEN1) {
		ULTBEN1 = uLTBEN1;
	}

	public String getMAKER() {
		return MAKER;
	}

	public void setMAKER(String mAKER) {
		MAKER = mAKER;
	}

	public String getMAKDTTIME() {
		return MAKDTTIME;
	}

	public void setMAKDTTIME(String mAKDTTIME) {
		MAKDTTIME = mAKDTTIME;
	}

	public String getAUTHSTAT() {
		return AUTHSTAT;
	}

	public void setAUTHSTAT(String aUTHSTAT) {
		AUTHSTAT = aUTHSTAT;
	}

	public String getPROCESSTAT() {
		return PROCESSTAT;
	}

	public void setPROCESSTAT(String pROCESSTAT) {
		PROCESSTAT = pROCESSTAT;
	}

	public String getREMITMSG() {
		return REMITMSG;
	}

	public void setREMITMSG(String rEMITMSG) {
		REMITMSG = rEMITMSG;
	}

	public String getCRACCDESC() {
		return CRACCDESC;
	}

	public void setCRACCDESC(String cRACCDESC) {
		CRACCDESC = cRACCDESC;
	}

	public String getDRACCDESC() {
		return DRACCDESC;
	}

	public void setDRACCDESC(String dRACCDESC) {
		DRACCDESC = dRACCDESC;
	}

	public String getRTREFRS() {
		return RTREFRS;
	}

	public void setRTREFRS(String rTREFRS) {
		RTREFRS = rTREFRS;
	}

	public String getSTULTBEN() {
		return STULTBEN;
	}

	public void setSTULTBEN(String sTULTBEN) {
		STULTBEN = sTULTBEN;
	}

	public String getSTOURSELVES() {
		return STOURSELVES;
	}

	public void setSTOURSELVES(String sTOURSELVES) {
		STOURSELVES = sTOURSELVES;
	}

	public String getRATETYPE() {
		return RATETYPE;
	}

	public void setRATETYPE(String rATETYPE) {
		RATETYPE = rATETYPE;
	}

	public long getBASERATE() {
		return BASERATE;
	}

	public void setBASERATE(long bASERATE) {
		BASERATE = bASERATE;
	}

	public String getBOOKDT() {
		return BOOKDT;
	}

	public void setBOOKDT(String bOOKDT) {
		BOOKDT = bOOKDT;
	}

	public long getVERNO() {
		return VERNO;
	}

	public void setVERNO(long vERNO) {
		VERNO = vERNO;
	}

	public long getLATVERNO() {
		return LATVERNO;
	}

	public void setLATVERNO(long lATVERNO) {
		LATVERNO = lATVERNO;
	}

	public String getBANKOPERCD() {
		return BANKOPERCD;
	}

	public void setBANKOPERCD(String bANKOPERCD) {
		BANKOPERCD = bANKOPERCD;
	}

	public String getUSRREF() {
		return USRREF;
	}

	public void setUSRREF(String uSRREF) {
		USRREF = uSRREF;
	}

	public String getPRDCD() {
		return PRDCD;
	}

	public void setPRDCD(String pRDCD) {
		PRDCD = pRDCD;
	}

	public String getCPTY() {
		return CPTY;
	}

	public void setCPTY(String cPTY) {
		CPTY = cPTY;
	}

	public String getMODCD() {
		return MODCD;
	}

	public void setMODCD(String mODCD) {
		MODCD = mODCD;
	}

	public String getCONCCY() {
		return CONCCY;
	}

	public void setCONCCY(String cONCCY) {
		CONCCY = cONCCY;
	}

	public String getSOURCE() {
		return SOURCE;
	}

	public void setSOURCE(String sOURCE) {
		SOURCE = sOURCE;
	}

	public String getTXNSTAT() {
		return TXNSTAT;
	}

	public void setTXNSTAT(String tXNSTAT) {
		TXNSTAT = tXNSTAT;
	}

	public String getONCEAUTH() {
		return ONCEAUTH;
	}

	public void setONCEAUTH(String oNCEAUTH) {
		ONCEAUTH = oNCEAUTH;
	}

	public ContractDetailsFull(String cONTREFNO, String pROD, String uSERREFNO, String dRVALDT, String cRBRN, String cRACC,
			String cRCCY, long cRAMT, String cRVALDT, long eXG_RATE, String dBTBRN, String dBTACC, String dRCCY,
			int dR_AMOUNT, long sPREADCD, int aMTSTTLACY, String cHRGBEARER, String rTCD, String rTPICKDT,
			String mSGCD, String mSGDT, String sOURCEREFNO, String sOURCECD, String aCCTINGASOF, String aCCOUNTING_DATE,
			String mULTCUSTTRNASF, String pRODDESC, String oVEROVERDRFT, String bYORDEROF2, String uLTBEN1,
			String mAKER, String mAKDTTIME, String aUTHSTAT, String pROCESSTAT, String rEMITMSG, String cRACCDESC,
			String dRACCDESC, String rTREFRS, String sTULTBEN, String sTOURSELVES, String rATETYPE, long bASERATE,
			String bOOKDT, long vERNO, long lATVERNO, String bANKOPERCD, String uSRREF, String pRDCD, String cPTY,
			String mODCD, String cONCCY, String sOURCE, String tXNSTAT, String oNCEAUTH) {
		CONTREFNO = cONTREFNO;
		PROD = pROD;
		USERREFNO = uSERREFNO;
		DRVALDT = dRVALDT;
		CRBRN = cRBRN;
		CRACC = cRACC;
		CRCCY = cRCCY;
		CRAMT = cRAMT;
		CRVALDT = cRVALDT;
		EXG_RATE = eXG_RATE;
		DBTBRN = dBTBRN;
		DBTACC = dBTACC;
		DRCCY = dRCCY;
		DR_AMOUNT = dR_AMOUNT;
		SPREADCD = sPREADCD;
		AMTSTTLACY = aMTSTTLACY;
		CHRGBEARER = cHRGBEARER;
		RTCD = rTCD;
		RTPICKDT = rTPICKDT;
		MSGCD = mSGCD;
		MSGDT = mSGDT;
		SOURCEREFNO = sOURCEREFNO;
		SOURCECD = sOURCECD;
		ACCTINGASOF = aCCTINGASOF;
		ACCOUNTING_DATE = aCCOUNTING_DATE;
		MULTCUSTTRNASF = mULTCUSTTRNASF;
		PRODDESC = pRODDESC;
		OVEROVERDRFT = oVEROVERDRFT;
		BYORDEROF2 = bYORDEROF2;
		ULTBEN1 = uLTBEN1;
		MAKER = mAKER;
		MAKDTTIME = mAKDTTIME;
		AUTHSTAT = aUTHSTAT;
		PROCESSTAT = pROCESSTAT;
		REMITMSG = rEMITMSG;
		CRACCDESC = cRACCDESC;
		DRACCDESC = dRACCDESC;
		RTREFRS = rTREFRS;
		STULTBEN = sTULTBEN;
		STOURSELVES = sTOURSELVES;
		RATETYPE = rATETYPE;
		BASERATE = bASERATE;
		BOOKDT = bOOKDT;
		VERNO = vERNO;
		LATVERNO = lATVERNO;
		BANKOPERCD = bANKOPERCD;
		USRREF = uSRREF;
		PRDCD = pRDCD;
		CPTY = cPTY;
		MODCD = mODCD;
		CONCCY = cONCCY;
		SOURCE = sOURCE;
		TXNSTAT = tXNSTAT;
		ONCEAUTH = oNCEAUTH;
	}

	public ContractDetailsFull() {
		// TODO Auto-generated constructor stub
	}
	
	

	
}



*/