package com.jmr.obdx.domain;

import java.util.Date;

import javax.annotation.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Immutable;
import org.springframework.web.context.annotation.SessionScope;

import com.jmr.obdx.dto.StatusInfo;


@ManagedBean
@SessionScope
@Entity
@Immutable
public class Fcat_vw_accountdetails extends StatusInfo implements java.io.Serializable {

	@Id
	@Column(name="IDCUSTOMER")
	private String IDCUSTOMER;
	@Column(name="NBRBRANCH")
	private String NBRBRANCH;
	@Column(name="NBRBRANCH")
	private Long NBRACCOUNT;
	@Column(name="ACCTTYPE")
	private String ACCTTYPE;
	@Column(name="ACCTSTATUS")
	private String ACCTSTATUS;
	@Column(name="CCYDESC")
	private String CCYDESC;
	@Column(name="BALANCE")
	private long BALANCE;
	@Column(name="OPENINGBALANCE")
	private long OPENINGBALANCE;
	@Column(name="AVAILABLEBALANCE")
	private long AVAILABLEBALANCE;
	@Column(name="ISCHQBOOK")
	private String ISCHQBOOK;
	@Column(name="ISOVERDRAFT")
	private String ISOVERDRAFT;
	@Column(name="ISSI")
	private char ISSI;
	@Column(name="NUMUNCOLLECTED")
	private long NUMUNCOLLECTED;
	@Column(name="MINBALANCE")
	private long MINBALANCE;
	@Column(name="DAILYWITHDRAWALLIMIT")
	private long DAILYWITHDRAWALLIMIT;
	@Column(name="CUSTOMERSHORTNAME")
	private String CUSTOMERSHORTNAME;
	@Column(name="CUSTOMERNAME")
	private String CUSTOMERNAME;
	@Column(name="OPENINGDATE")
	private Date OPENINGDATE;
	@Column(name="IBAN_AC_NO")
	private String IBAN_AC_NO;
	@Column(name="RELATION")
	private String RELATION;
	@Column(name="DESCACCTTYPE")
	private String DESCACCTTYPE;
	@Column(name="AMOUNTONHOLD")
	private long AMOUNTONHOLD;
	@Column(name="ODLIMIT")
	private String ODLIMIT;
	@Column(name="DAILYLIMIT")
	private String DAILYLIMIT;
	@Column(name="ELIGIBLEADV")
	private long ELIGIBLEADV;
	@Column(name="ODLMTSTRTDATE")
	private Date ODLMTSTRTDATE;
	@Column(name="ODLMTENDDATE")
	private Date ODLMTENDDATE;
	@Column(name="ORIGAVAILABLEBAL")
	private long ORIGAVAILABLEBAL;
	
	@Id
	public String getIDCUSTOMER() {
		return IDCUSTOMER;
	}
	public void setIDCUSTOMER(String iDCUSTOMER) {
		IDCUSTOMER = iDCUSTOMER;
	}
	public String getNBRBRANCH() {
		return NBRBRANCH;
	}
	public void setNBRBRANCH(String nBRBRANCH) {
		NBRBRANCH = nBRBRANCH;
	}
	public Long getNBRACCOUNT() {
		return NBRACCOUNT;
	}
	public void setNBRACCOUNT(Long nBRACCOUNT) {
		NBRACCOUNT = nBRACCOUNT;
	}
	public String getACCTTYPE() {
		return ACCTTYPE;
	}
	public void setACCTTYPE(String aCCTTYPE) {
		ACCTTYPE = aCCTTYPE;
	}
	public String getACCTSTATUS() {
		return ACCTSTATUS;
	}
	public void setACCTSTATUS(String aCCTSTATUS) {
		ACCTSTATUS = aCCTSTATUS;
	}
	public String getCCYDESC() {
		return CCYDESC;
	}
	public void setCCYDESC(String cCYDESC) {
		CCYDESC = cCYDESC;
	}
	public long getBALANCE() {
		return BALANCE;
	}
	public void setBALANCE(long bALANCE) {
		BALANCE = bALANCE;
	}
	public long getOPENINGBALANCE() {
		return OPENINGBALANCE;
	}
	public void setOPENINGBALANCE(long oPENINGBALANCE) {
		OPENINGBALANCE = oPENINGBALANCE;
	}
	public long getAVAILABLEBALANCE() {
		return AVAILABLEBALANCE;
	}
	public void setAVAILABLEBALANCE(long aVAILABLEBALANCE) {
		AVAILABLEBALANCE = aVAILABLEBALANCE;
	}
	public String getISCHQBOOK() {
		return ISCHQBOOK;
	}
	public void setISCHQBOOK(String iSCHQBOOK) {
		ISCHQBOOK = iSCHQBOOK;
	}
	public String getISOVERDRAFT() {
		return ISOVERDRAFT;
	}
	public void setISOVERDRAFT(String iSOVERDRAFT) {
		ISOVERDRAFT = iSOVERDRAFT;
	}
	public char getISSI() {
		return ISSI;
	}
	public void setISSI(char iSSI) {
		ISSI = iSSI;
	}
	public long getNUMUNCOLLECTED() {
		return NUMUNCOLLECTED;
	}
	public void setNUMUNCOLLECTED(long nUMUNCOLLECTED) {
		NUMUNCOLLECTED = nUMUNCOLLECTED;
	}
	public long getMINBALANCE() {
		return MINBALANCE;
	}
	public void setMINBALANCE(long mINBALANCE) {
		MINBALANCE = mINBALANCE;
	}
	public long getDAILYWITHDRAWALLIMIT() {
		return DAILYWITHDRAWALLIMIT;
	}
	public void setDAILYWITHDRAWALLIMIT(long dAILYWITHDRAWALLIMIT) {
		DAILYWITHDRAWALLIMIT = dAILYWITHDRAWALLIMIT;
	}
	public String getCUSTOMERSHORTNAME() {
		return CUSTOMERSHORTNAME;
	}
	public void setCUSTOMERSHORTNAME(String cUSTOMERSHORTNAME) {
		CUSTOMERSHORTNAME = cUSTOMERSHORTNAME;
	}
	public String getCUSTOMERNAME() {
		return CUSTOMERNAME;
	}
	public void setCUSTOMERNAME(String cUSTOMERNAME) {
		CUSTOMERNAME = cUSTOMERNAME;
	}
	public Date getOPENINGDATE() {
		return OPENINGDATE;
	}
	public void setOPENINGDATE(Date oPENINGDATE) {
		OPENINGDATE = oPENINGDATE;
	}
	public String getIBAN_AC_NO() {
		return IBAN_AC_NO;
	}
	public void setIBAN_AC_NO(String iBAN_AC_NO) {
		IBAN_AC_NO = iBAN_AC_NO;
	}
	public String getRELATION() {
		return RELATION;
	}
	public void setRELATION(String rELATION) {
		RELATION = rELATION;
	}
	public String getDESCACCTTYPE() {
		return DESCACCTTYPE;
	}
	public void setDESCACCTTYPE(String dESCACCTTYPE) {
		DESCACCTTYPE = dESCACCTTYPE;
	}
	public long getAMOUNTONHOLD() {
		return AMOUNTONHOLD;
	}
	public void setAMOUNTONHOLD(long aMOUNTONHOLD) {
		AMOUNTONHOLD = aMOUNTONHOLD;
	}
	public String getODLIMIT() {
		return ODLIMIT;
	}
	public void setODLIMIT(String oDLIMIT) {
		ODLIMIT = oDLIMIT;
	}
	public String getDAILYLIMIT() {
		return DAILYLIMIT;
	}
	public void setDAILYLIMIT(String dAILYLIMIT) {
		DAILYLIMIT = dAILYLIMIT;
	}
	public long getELIGIBLEADV() {
		return ELIGIBLEADV;
	}
	public void setELIGIBLEADV(long eLIGIBLEADV) {
		ELIGIBLEADV = eLIGIBLEADV;
	}
	public Date getODLMTSTRTDATE() {
		return ODLMTSTRTDATE;
	}
	public void setODLMTSTRTDATE(Date oDLMTSTRTDATE) {
		ODLMTSTRTDATE = oDLMTSTRTDATE;
	}
	public Date getODLMTENDDATE() {
		return ODLMTENDDATE;
	}
	public void setODLMTENDDATE(Date oDLMTENDDATE) {
		ODLMTENDDATE = oDLMTENDDATE;
	}
	public long getORIGAVAILABLEBAL() {
		return ORIGAVAILABLEBAL;
	}
	public void setORIGAVAILABLEBAL(long oRIGAVAILABLEBAL) {
		ORIGAVAILABLEBAL = oRIGAVAILABLEBAL;
	}
	
	public Fcat_vw_accountdetails()
	{
		
	}
	public Fcat_vw_accountdetails(String iDCUSTOMER, String nBRBRANCH, Long nBRACCOUNT, String aCCTTYPE,
			String aCCTSTATUS, String cCYDESC, long bALANCE, long oPENINGBALANCE, long aVAILABLEBALANCE,
			String iSCHQBOOK, String iSOVERDRAFT, char iSSI, long nUMUNCOLLECTED, long mINBALANCE,
			long dAILYWITHDRAWALLIMIT, String cUSTOMERSHORTNAME, String cUSTOMERNAME, Date oPENINGDATE,
			String iBAN_AC_NO, String rELATION, String dESCACCTTYPE, long aMOUNTONHOLD, String oDLIMIT, String dAILYLIMIT,
			long eLIGIBLEADV, Date oDLMTSTRTDATE, Date oDLMTENDDATE, long oRIGAVAILABLEBAL) {
		super();
		IDCUSTOMER = iDCUSTOMER;
		NBRBRANCH = nBRBRANCH;
		NBRACCOUNT = nBRACCOUNT;
		ACCTTYPE = aCCTTYPE;
		ACCTSTATUS = aCCTSTATUS;
		CCYDESC = cCYDESC;
		BALANCE = bALANCE;
		OPENINGBALANCE = oPENINGBALANCE;
		AVAILABLEBALANCE = aVAILABLEBALANCE;
		ISCHQBOOK = iSCHQBOOK;
		ISOVERDRAFT = iSOVERDRAFT;
		ISSI = iSSI;
		NUMUNCOLLECTED = nUMUNCOLLECTED;
		MINBALANCE = mINBALANCE;
		DAILYWITHDRAWALLIMIT = dAILYWITHDRAWALLIMIT;
		CUSTOMERSHORTNAME = cUSTOMERSHORTNAME;
		CUSTOMERNAME = cUSTOMERNAME;
		OPENINGDATE = oPENINGDATE;
		IBAN_AC_NO = iBAN_AC_NO;
		RELATION = rELATION;
		DESCACCTTYPE = dESCACCTTYPE;
		AMOUNTONHOLD = aMOUNTONHOLD;
		ODLIMIT = oDLIMIT;
		DAILYLIMIT = dAILYLIMIT;
		ELIGIBLEADV = eLIGIBLEADV;
		ODLMTSTRTDATE = oDLMTSTRTDATE;
		ODLMTENDDATE = oDLMTENDDATE;
		ORIGAVAILABLEBAL = oRIGAVAILABLEBAL;
	}
	
	
	}

