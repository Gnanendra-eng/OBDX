package com.jmr.obdx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FCC_VW_MSTACCOUNT", schema = "JMR_OBDX")
public class Accountsummary implements java.io.Serializable {

	public Accountsummary() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "IDACCOUNT")
	private String IDACCOUNT;
	@Column(name = "IDCUSTOMER")
	private String IDCUSTOMER;
	@Column(name = "CODBRANCH")
	private String CODBRANCH;
	@Column(name = "CODACCTTYPE")
	private String CODACCTTYPE;
	@Column(name = "TXTACCTSTATUS")
	private String TXTACCTSTATUS;
	@Column(name = "CODACCTCURR")
	private String CODACCTCURR;
	@Column(name = "NUMBALANCE")
	private String NUMBALANCE;
	@Column(name = "NUMOPENBALANCE")
	private String NUMOPENBALANCE;
	@Column(name = "DATLASTUPDATED")
	private String DATLASTUPDATED;
	@Column(name = "NUMAVAILBAL")
	private String NUMAVAILBAL;
	@Column(name = "NUMUNCOLLECTED")
	private String NUMUNCOLLECTED;
	@Column(name = "NUMAVAILCREDIT")
	private String NUMAVAILCREDIT;
	@Column(name = "NUMMONTOVCR")
	private String NUMMONTOVCR;
	@Column(name = "NUMMONTOVDR")
	private String NUMMONTOVDR;
	@Column(name = "ACCTDESC")
	private String ACCTDESC;
	@Column(name = "ADD1")
	private String ADD1;
	@Column(name = "ADD2")
	private String ADD2;
	@Column(name = "ADD3")
	private String ADD3;
	@Column(name = "NOM1")
	private String NOM1;
	@Column(name = "NOM2")
	private String NOM2;
	@Column(name = "ADD4")
	private String ADD4;
	@Column(name = "PRDNAME")
	private String PRDNAME;
	@Column(name = "PRDTYPE")
	private String PRDTYPE;
	@Column(name = "ACCTOPENDT")
	private String ACCTOPENDT;
	@Column(name = "ODLIMIT")
	private String ODLIMIT;
	@Column(name = "ODSTARTDT")
	private String ODSTARTDT;
	@Column(name = "ODENDDT")
	private String ODENDDT;
	@Column(name = "SHADOWLIMIT")
	private String SHADOWLIMIT;
	@Column(name = "ACCRDRAMT")
	private String ACCRDRAMT;
	@Column(name = "ACCRCRAMT")
	private String ACCRCRAMT;
	@Column(name = "JOINTACCTINDICATOR")
	private String JOINTACCTINDICATOR;
	@Column(name = "CHQBOOK")
	private String CHQBOOK;
	@Column(name = "OVERDRAFT_FACILITY")
	private String OVERDRAFT_FACILITY;
	@Column(name = "NUMSTATEBIT")
	private String NUMSTATEBIT;
	@Column(name = "CHKNAME1")
	private String CHKNAME1;
	@Column(name = "CHKNAME2")
	private String CHKNAME2;
	@Column(name = "AUTOREORDERCHKREQ")
	private String AUTOREORDERCHKREQ;
	@Column(name = "AUTOREORDERCHKLVL")
	private String AUTOREORDERCHKLVL;
	@Column(name = "DIRTSTATUS")
	private String DIRTSTATUS;
	@Column(name = "NEXTCAPDT")
	private String NEXTCAPDT;
	@Column(name = "CAPFREQ")
	private String CAPFREQ;
	@Column(name = "AUTHSIGNATORY")
	private String AUTHSIGNATORY;
	@Column(name = "AUTHSIGNLIMIT")
	private String AUTHSIGNLIMIT;
	@Column(name = "SALESPERSON")
	private String SALESPERSON;
	@Column(name = "INTRODUCER")
	private String INTRODUCER;
	@Column(name = "IBANNUMBER")
	private String IBANNUMBER;
	@Column(name = "ACCTLOCKFLAG")
	private String ACCTLOCKFLAG;
	@Column(name = "DEBITACCTLOCKFLAG")
	private String DEBITACCTLOCKFLAG;
	@Column(name = "CREDITACCTLOCKFLAG")
	private String CREDITACCTLOCKFLAG;
	@Column(name = "CRLINE")
	private String CRLINE;
	@Column(name = "AVAILAMT")
	private String AVAILAMT;
	@Column(name = "CRINTRATE")
	private String CRINTRATE;
	@Column(name = "ALWDOD")
	private String ALWDOD;
	@Column(name = "UNALWDOD")
	private String UNALWDOD;
	@Column(name = "ACFROZEN")
	private String ACFROZEN;
	@Column(name = "DTIME")
	private String DTIME;
	@Column(name = "SLNO")
	private String SLNO;
	@Column(name = "PRDCODE")
	private String PRDCODE;
	@Column(name = "ILM_APPLICABLE")
	private String ILM_APPLICABLE;
	@Column(name = "ID_ENTITY")
	private String ID_ENTITY;
	@Column(name = "MATURITY_DATE")
	private String MATURITY_DATE;
	@Column(name = "NEXT_DUE_DATE")
	private String NEXT_DUE_DATE;
	@Column(name = "UDF1")
	private String UDF1;
	@Column(name = "UDF2")
	private String UDF2;
	@Column(name = "UDF3")
	private String UDF3;
	@Column(name = "UDF4")
	private String UDF4;
	@Column(name = "UDF5")
	private String UDF5;
	@Column(name = "UDF6")
	private String UDF6;
	@Column(name = "UDF7")
	private String UDF7;
	@Column(name = "UDF8")
	private String UDF8;
	@Column(name = "UDF9")
	private String UDF9;
	@Column(name = "UDF10")
	private String UDF10;

	public String getIDACCOUNT() {
		return IDACCOUNT;
	}

	public void setIDACCOUNT(String iDACCOUNT) {
		IDACCOUNT = iDACCOUNT;
	}

	public String getIDCUSTOMER() {
		return IDCUSTOMER;
	}

	public void setIDCUSTOMER(String iDCUSTOMER) {
		IDCUSTOMER = iDCUSTOMER;
	}

	public String getCODBRANCH() {
		return CODBRANCH;
	}

	public void setCODBRANCH(String cODBRANCH) {
		CODBRANCH = cODBRANCH;
	}

	public String getCODACCTTYPE() {
		return CODACCTTYPE;
	}

	public void setCODACCTTYPE(String cODACCTTYPE) {
		CODACCTTYPE = cODACCTTYPE;
	}

	public String getTXTACCTSTATUS() {
		return TXTACCTSTATUS;
	}

	public void setTXTACCTSTATUS(String tXTACCTSTATUS) {
		TXTACCTSTATUS = tXTACCTSTATUS;
	}

	public String getCODACCTCURR() {
		return CODACCTCURR;
	}

	public void setCODACCTCURR(String cODACCTCURR) {
		CODACCTCURR = cODACCTCURR;
	}

	public String getNUMBALANCE() {
		return NUMBALANCE;
	}

	public void setNUMBALANCE(String nUMBALANCE) {
		NUMBALANCE = nUMBALANCE;
	}

	public String getNUMOPENBALANCE() {
		return NUMOPENBALANCE;
	}

	public void setNUMOPENBALANCE(String nUMOPENBALANCE) {
		NUMOPENBALANCE = nUMOPENBALANCE;
	}

	public String getDATLASTUPDATED() {
		return DATLASTUPDATED;
	}

	public void setDATLASTUPDATED(String dATLASTUPDATED) {
		DATLASTUPDATED = dATLASTUPDATED;
	}

	public String getNUMAVAILBAL() {
		return NUMAVAILBAL;
	}

	public void setNUMAVAILBAL(String nUMAVAILBAL) {
		NUMAVAILBAL = nUMAVAILBAL;
	}

	public String getNUMUNCOLLECTED() {
		return NUMUNCOLLECTED;
	}

	public void setNUMUNCOLLECTED(String nUMUNCOLLECTED) {
		NUMUNCOLLECTED = nUMUNCOLLECTED;
	}

	public String getNUMAVAILCREDIT() {
		return NUMAVAILCREDIT;
	}

	public void setNUMAVAILCREDIT(String nUMAVAILCREDIT) {
		NUMAVAILCREDIT = nUMAVAILCREDIT;
	}

	public String getNUMMONTOVCR() {
		return NUMMONTOVCR;
	}

	public void setNUMMONTOVCR(String nUMMONTOVCR) {
		NUMMONTOVCR = nUMMONTOVCR;
	}

	public String getNUMMONTOVDR() {
		return NUMMONTOVDR;
	}

	public void setNUMMONTOVDR(String nUMMONTOVDR) {
		NUMMONTOVDR = nUMMONTOVDR;
	}

	public String getACCTDESC() {
		return ACCTDESC;
	}

	public void setACCTDESC(String aCCTDESC) {
		ACCTDESC = aCCTDESC;
	}

	public String getADD1() {
		return ADD1;
	}

	public void setADD1(String aDD1) {
		ADD1 = aDD1;
	}

	public String getADD2() {
		return ADD2;
	}

	public void setADD2(String aDD2) {
		ADD2 = aDD2;
	}

	public String getADD3() {
		return ADD3;
	}

	public void setADD3(String aDD3) {
		ADD3 = aDD3;
	}

	public String getNOM1() {
		return NOM1;
	}

	public void setNOM1(String nOM1) {
		NOM1 = nOM1;
	}

	public String getNOM2() {
		return NOM2;
	}

	public void setNOM2(String nOM2) {
		NOM2 = nOM2;
	}

	public String getADD4() {
		return ADD4;
	}

	public void setADD4(String aDD4) {
		ADD4 = aDD4;
	}

	public String getPRDNAME() {
		return PRDNAME;
	}

	public void setPRDNAME(String pRDNAME) {
		PRDNAME = pRDNAME;
	}

	public String getPRDTYPE() {
		return PRDTYPE;
	}

	public void setPRDTYPE(String pRDTYPE) {
		PRDTYPE = pRDTYPE;
	}

	public String getACCTOPENDT() {
		return ACCTOPENDT;
	}

	public void setACCTOPENDT(String aCCTOPENDT) {
		ACCTOPENDT = aCCTOPENDT;
	}

	public String getODLIMIT() {
		return ODLIMIT;
	}

	public void setODLIMIT(String oDLIMIT) {
		ODLIMIT = oDLIMIT;
	}

	public String getODSTARTDT() {
		return ODSTARTDT;
	}

	public void setODSTARTDT(String oDSTARTDT) {
		ODSTARTDT = oDSTARTDT;
	}

	public String getODENDDT() {
		return ODENDDT;
	}

	public void setODENDDT(String oDENDDT) {
		ODENDDT = oDENDDT;
	}

	public String getSHADOWLIMIT() {
		return SHADOWLIMIT;
	}

	public void setSHADOWLIMIT(String sHADOWLIMIT) {
		SHADOWLIMIT = sHADOWLIMIT;
	}

	public String getACCRDRAMT() {
		return ACCRDRAMT;
	}

	public void setACCRDRAMT(String aCCRDRAMT) {
		ACCRDRAMT = aCCRDRAMT;
	}

	public String getACCRCRAMT() {
		return ACCRCRAMT;
	}

	public void setACCRCRAMT(String aCCRCRAMT) {
		ACCRCRAMT = aCCRCRAMT;
	}

	public String getJOINTACCTINDICATOR() {
		return JOINTACCTINDICATOR;
	}

	public void setJOINTACCTINDICATOR(String jOINTACCTINDICATOR) {
		JOINTACCTINDICATOR = jOINTACCTINDICATOR;
	}

	public String getCHQBOOK() {
		return CHQBOOK;
	}

	public void setCHQBOOK(String cHQBOOK) {
		CHQBOOK = cHQBOOK;
	}

	public String getOVERDRAFT_FACILITY() {
		return OVERDRAFT_FACILITY;
	}

	public void setOVERDRAFT_FACILITY(String oVERDRAFT_FACILITY) {
		OVERDRAFT_FACILITY = oVERDRAFT_FACILITY;
	}

	public String getNUMSTATEBIT() {
		return NUMSTATEBIT;
	}

	public void setNUMSTATEBIT(String nUMSTATEBIT) {
		NUMSTATEBIT = nUMSTATEBIT;
	}

	public String getCHKNAME1() {
		return CHKNAME1;
	}

	public void setCHKNAME1(String cHKNAME1) {
		CHKNAME1 = cHKNAME1;
	}

	public String getCHKNAME2() {
		return CHKNAME2;
	}

	public void setCHKNAME2(String cHKNAME2) {
		CHKNAME2 = cHKNAME2;
	}

	public String getAUTOREORDERCHKREQ() {
		return AUTOREORDERCHKREQ;
	}

	public void setAUTOREORDERCHKREQ(String aUTOREORDERCHKREQ) {
		AUTOREORDERCHKREQ = aUTOREORDERCHKREQ;
	}

	public String getAUTOREORDERCHKLVL() {
		return AUTOREORDERCHKLVL;
	}

	public void setAUTOREORDERCHKLVL(String aUTOREORDERCHKLVL) {
		AUTOREORDERCHKLVL = aUTOREORDERCHKLVL;
	}

	public String getDIRTSTATUS() {
		return DIRTSTATUS;
	}

	public void setDIRTSTATUS(String dIRTSTATUS) {
		DIRTSTATUS = dIRTSTATUS;
	}

	public String getNEXTCAPDT() {
		return NEXTCAPDT;
	}

	public void setNEXTCAPDT(String nEXTCAPDT) {
		NEXTCAPDT = nEXTCAPDT;
	}

	public String getCAPFREQ() {
		return CAPFREQ;
	}

	public void setCAPFREQ(String cAPFREQ) {
		CAPFREQ = cAPFREQ;
	}

	public String getAUTHSIGNATORY() {
		return AUTHSIGNATORY;
	}

	public void setAUTHSIGNATORY(String aUTHSIGNATORY) {
		AUTHSIGNATORY = aUTHSIGNATORY;
	}

	public String getAUTHSIGNLIMIT() {
		return AUTHSIGNLIMIT;
	}

	public void setAUTHSIGNLIMIT(String aUTHSIGNLIMIT) {
		AUTHSIGNLIMIT = aUTHSIGNLIMIT;
	}

	public String getSALESPERSON() {
		return SALESPERSON;
	}

	public void setSALESPERSON(String sALESPERSON) {
		SALESPERSON = sALESPERSON;
	}

	public String getINTRODUCER() {
		return INTRODUCER;
	}

	public void setINTRODUCER(String iNTRODUCER) {
		INTRODUCER = iNTRODUCER;
	}

	public String getIBANNUMBER() {
		return IBANNUMBER;
	}

	public void setIBANNUMBER(String iBANNUMBER) {
		IBANNUMBER = iBANNUMBER;
	}

	public String getACCTLOCKFLAG() {
		return ACCTLOCKFLAG;
	}

	public void setACCTLOCKFLAG(String aCCTLOCKFLAG) {
		ACCTLOCKFLAG = aCCTLOCKFLAG;
	}

	public String getDEBITACCTLOCKFLAG() {
		return DEBITACCTLOCKFLAG;
	}

	public void setDEBITACCTLOCKFLAG(String dEBITACCTLOCKFLAG) {
		DEBITACCTLOCKFLAG = dEBITACCTLOCKFLAG;
	}

	public String getCREDITACCTLOCKFLAG() {
		return CREDITACCTLOCKFLAG;
	}

	public void setCREDITACCTLOCKFLAG(String cREDITACCTLOCKFLAG) {
		CREDITACCTLOCKFLAG = cREDITACCTLOCKFLAG;
	}

	public String getCRLINE() {
		return CRLINE;
	}

	public void setCRLINE(String cRLINE) {
		CRLINE = cRLINE;
	}

	public String getAVAILAMT() {
		return AVAILAMT;
	}

	public void setAVAILAMT(String aVAILAMT) {
		AVAILAMT = aVAILAMT;
	}

	public String getCRINTRATE() {
		return CRINTRATE;
	}

	public void setCRINTRATE(String cRINTRATE) {
		CRINTRATE = cRINTRATE;
	}

	public String getALWDOD() {
		return ALWDOD;
	}

	public void setALWDOD(String aLWDOD) {
		ALWDOD = aLWDOD;
	}

	public String getUNALWDOD() {
		return UNALWDOD;
	}

	public void setUNALWDOD(String uNALWDOD) {
		UNALWDOD = uNALWDOD;
	}

	public String getACFROZEN() {
		return ACFROZEN;
	}

	public void setACFROZEN(String aCFROZEN) {
		ACFROZEN = aCFROZEN;
	}

	public String getDTIME() {
		return DTIME;
	}

	public void setDTIME(String dTIME) {
		DTIME = dTIME;
	}

	public String getSLNO() {
		return SLNO;
	}

	public void setSLNO(String sLNO) {
		SLNO = sLNO;
	}

	public String getPRDCODE() {
		return PRDCODE;
	}

	public void setPRDCODE(String pRDCODE) {
		PRDCODE = pRDCODE;
	}

	public String getILM_APPLICABLE() {
		return ILM_APPLICABLE;
	}

	public void setILM_APPLICABLE(String iLM_APPLICABLE) {
		ILM_APPLICABLE = iLM_APPLICABLE;
	}

	public String getID_ENTITY() {
		return ID_ENTITY;
	}

	public void setID_ENTITY(String iD_ENTITY) {
		ID_ENTITY = iD_ENTITY;
	}

	public String getMATURITY_DATE() {
		return MATURITY_DATE;
	}

	public void setMATURITY_DATE(String mATURITY_DATE) {
		MATURITY_DATE = mATURITY_DATE;
	}

	public String getNEXT_DUE_DATE() {
		return NEXT_DUE_DATE;
	}

	public void setNEXT_DUE_DATE(String nEXT_DUE_DATE) {
		NEXT_DUE_DATE = nEXT_DUE_DATE;
	}

	public String getUDF1() {
		return UDF1;
	}

	public void setUDF1(String uDF1) {
		UDF1 = uDF1;
	}

	public String getUDF2() {
		return UDF2;
	}

	public void setUDF2(String uDF2) {
		UDF2 = uDF2;
	}

	public String getUDF3() {
		return UDF3;
	}

	public void setUDF3(String uDF3) {
		UDF3 = uDF3;
	}

	public String getUDF4() {
		return UDF4;
	}

	public void setUDF4(String uDF4) {
		UDF4 = uDF4;
	}

	public String getUDF5() {
		return UDF5;
	}

	public void setUDF5(String uDF5) {
		UDF5 = uDF5;
	}

	public String getUDF6() {
		return UDF6;
	}

	public void setUDF6(String uDF6) {
		UDF6 = uDF6;
	}

	public String getUDF7() {
		return UDF7;
	}

	public void setUDF7(String uDF7) {
		UDF7 = uDF7;
	}

	public String getUDF8() {
		return UDF8;
	}

	public void setUDF8(String uDF8) {
		UDF8 = uDF8;
	}

	public String getUDF9() {
		return UDF9;
	}

	public void setUDF9(String uDF9) {
		UDF9 = uDF9;
	}

	public String getUDF10() {
		return UDF10;
	}

	public void setUDF10(String uDF10) {
		UDF10 = uDF10;
	}

	public Accountsummary(String iDACCOUNT, String iDCUSTOMER, String cODBRANCH, String cODACCTTYPE,
			String tXTACCTSTATUS, String cODACCTCURR, String nUMBALANCE, String nUMOPENBALANCE, String dATLASTUPDATED,
			String nUMAVAILBAL, String nUMUNCOLLECTED, String nUMAVAILCREDIT, String nUMMONTOVCR, String nUMMONTOVDR,
			String aCCTDESC, String aDD1, String aDD2, String aDD3, String nOM1, String nOM2, String aDD4,
			String pRDNAME, String pRDTYPE, String aCCTOPENDT, String oDLIMIT, String oDSTARTDT, String oDENDDT,
			String sHADOWLIMIT, String aCCRDRAMT, String aCCRCRAMT, String jOINTACCTINDICATOR, String cHQBOOK,
			String oVERDRAFT_FACILITY, String nUMSTATEBIT, String cHKNAME1, String cHKNAME2, String aUTOREORDERCHKREQ,
			String aUTOREORDERCHKLVL, String dIRTSTATUS, String nEXTCAPDT, String cAPFREQ, String aUTHSIGNATORY,
			String aUTHSIGNLIMIT, String sALESPERSON, String iNTRODUCER, String iBANNUMBER, String aCCTLOCKFLAG,
			String dEBITACCTLOCKFLAG, String cREDITACCTLOCKFLAG, String cRLINE, String aVAILAMT, String cRINTRATE,
			String aLWDOD, String uNALWDOD, String aCFROZEN, String dTIME, String sLNO, String pRDCODE,
			String iLM_APPLICABLE, String iD_ENTITY, String mATURITY_DATE, String nEXT_DUE_DATE, String uDF1,
			String uDF2, String uDF3, String uDF4, String uDF5, String uDF6, String uDF7, String uDF8, String uDF9,
			String uDF10) {
		super();
		IDACCOUNT = iDACCOUNT;
		IDCUSTOMER = iDCUSTOMER;
		CODBRANCH = cODBRANCH;
		CODACCTTYPE = cODACCTTYPE;
		TXTACCTSTATUS = tXTACCTSTATUS;
		CODACCTCURR = cODACCTCURR;
		NUMBALANCE = nUMBALANCE;
		NUMOPENBALANCE = nUMOPENBALANCE;
		DATLASTUPDATED = dATLASTUPDATED;
		NUMAVAILBAL = nUMAVAILBAL;
		NUMUNCOLLECTED = nUMUNCOLLECTED;
		NUMAVAILCREDIT = nUMAVAILCREDIT;
		NUMMONTOVCR = nUMMONTOVCR;
		NUMMONTOVDR = nUMMONTOVDR;
		ACCTDESC = aCCTDESC;
		ADD1 = aDD1;
		ADD2 = aDD2;
		ADD3 = aDD3;
		NOM1 = nOM1;
		NOM2 = nOM2;
		ADD4 = aDD4;
		PRDNAME = pRDNAME;
		PRDTYPE = pRDTYPE;
		ACCTOPENDT = aCCTOPENDT;
		ODLIMIT = oDLIMIT;
		ODSTARTDT = oDSTARTDT;
		ODENDDT = oDENDDT;
		SHADOWLIMIT = sHADOWLIMIT;
		ACCRDRAMT = aCCRDRAMT;
		ACCRCRAMT = aCCRCRAMT;
		JOINTACCTINDICATOR = jOINTACCTINDICATOR;
		CHQBOOK = cHQBOOK;
		OVERDRAFT_FACILITY = oVERDRAFT_FACILITY;
		NUMSTATEBIT = nUMSTATEBIT;
		CHKNAME1 = cHKNAME1;
		CHKNAME2 = cHKNAME2;
		AUTOREORDERCHKREQ = aUTOREORDERCHKREQ;
		AUTOREORDERCHKLVL = aUTOREORDERCHKLVL;
		DIRTSTATUS = dIRTSTATUS;
		NEXTCAPDT = nEXTCAPDT;
		CAPFREQ = cAPFREQ;
		AUTHSIGNATORY = aUTHSIGNATORY;
		AUTHSIGNLIMIT = aUTHSIGNLIMIT;
		SALESPERSON = sALESPERSON;
		INTRODUCER = iNTRODUCER;
		IBANNUMBER = iBANNUMBER;
		ACCTLOCKFLAG = aCCTLOCKFLAG;
		DEBITACCTLOCKFLAG = dEBITACCTLOCKFLAG;
		CREDITACCTLOCKFLAG = cREDITACCTLOCKFLAG;
		CRLINE = cRLINE;
		AVAILAMT = aVAILAMT;
		CRINTRATE = cRINTRATE;
		ALWDOD = aLWDOD;
		UNALWDOD = uNALWDOD;
		ACFROZEN = aCFROZEN;
		DTIME = dTIME;
		SLNO = sLNO;
		PRDCODE = pRDCODE;
		ILM_APPLICABLE = iLM_APPLICABLE;
		ID_ENTITY = iD_ENTITY;
		MATURITY_DATE = mATURITY_DATE;
		NEXT_DUE_DATE = nEXT_DUE_DATE;
		UDF1 = uDF1;
		UDF2 = uDF2;
		UDF3 = uDF3;
		UDF4 = uDF4;
		UDF5 = uDF5;
		UDF6 = uDF6;
		UDF7 = uDF7;
		UDF8 = uDF8;
		UDF9 = uDF9;
		UDF10 = uDF10;
	}

}
