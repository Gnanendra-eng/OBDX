package com.jmr.obdx.domain;

import java.util.Date;

import javax.annotation.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;
import org.springframework.web.context.annotation.SessionScope;

import com.jmr.obdx.dto.StatusInfo;
@ManagedBean
@SessionScope
@Entity
@Immutable
public class Fcc_vw_txnaccountactivity extends StatusInfo implements java.io.Serializable {
	
	@Id
	@Column(name="NBRACCOUNT")
	private String NBRACCOUNT;
	@Column(name="BRANCHCODE")
	private String BRANCHCODE;
	@Column(name ="CUSTOMERNO")
	private Integer CUSTOMERNO;
	@Column(name="DATVALUEDATE")
	private Date DATVALUEDATE;
    @Column(name="TXNDATE")
	private Date TXNDATE;
	@Column(name="POSTINGDATE")
	private Date POSTINGDATE;
	@Column(name="CODTXNCURR")
	private String CODTXNCURR;
	@Column(name="NAMBRANCH")
	private String NAMBRANCH;
	@Column(name="TXNAMOUNT")
	private float TXNAMOUNT;
	@Column(name="CODDRCR")
	private String CODDRCR;
	@Column(name="TXTREFERENCENO")
	private String TXTREFERENCENO;
	@Column(name="CODTXNTYPE")
	private String CODTXNTYPE;
	@Column(name="DESCRIPTION")
	private String DESCRIPTION;
	@Column(name="SRNO")
	private long SRNO;
	@Column(name="TXNCODE")
	private String TXNCODE;
	@Column(name="SWIFTCODE")
	private String SWIFTCODE;
	@Column(name="TXNMODULE")
	private String TXNMODULE;
	@Column(name="USERREFERENCENO")
	private String USERREFERENCENO;
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
	public Date getDATVALUEDATE() {
		return DATVALUEDATE;
	}
	public void setDATVALUEDATE(Date dATVALUEDATE) {
		DATVALUEDATE = dATVALUEDATE;
	}
	public Date getTXNDATE() {
		return TXNDATE;
	}
	public void setTXNDATE(Date tXNDATE) {
		TXNDATE = tXNDATE;
	}
	public Date getPOSTINGDATE() {
		return POSTINGDATE;
	}
	public void setPOSTINGDATE(Date pOSTINGDATE) {
		POSTINGDATE = pOSTINGDATE;
	}
	public String getCODTXNCURR() {
		return CODTXNCURR;
	}
	public void setCODTXNCURR(String cODTXNCURR) {
		CODTXNCURR = cODTXNCURR;
	}
	public String getNAMBRANCH() {
		return NAMBRANCH;
	}
	public void setNAMBRANCH(String nAMBRANCH) {
		NAMBRANCH = nAMBRANCH;
	}
	public float getTXNAMOUNT() {
		return TXNAMOUNT;
	}
	public void setTXNAMOUNT(float tXNAMOUNT) {
		TXNAMOUNT = tXNAMOUNT;
	}
	public String getCODDRCR() {
		return CODDRCR;
	}
	public void setCODDRCR(String cODDRCR) {
		CODDRCR = cODDRCR;
	}
	public String getTXTREFERENCENO() {
		return TXTREFERENCENO;
	}
	public void setTXTREFERENCENO(String tXTREFERENCENO) {
		TXTREFERENCENO = tXTREFERENCENO;
	}
	public String getCODTXNTYPE() {
		return CODTXNTYPE;
	}
	public void setCODTXNTYPE(String cODTXNTYPE) {
		CODTXNTYPE = cODTXNTYPE;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public long getSRNO() {
		return SRNO;
	}
	public void setSRNO(long sRNO) {
		SRNO = sRNO;
	}
	public String getTXNCODE() {
		return TXNCODE;
	}
	public void setTXNCODE(String tXNCODE) {
		TXNCODE = tXNCODE;
	}
	public String getSWIFTCODE() {
		return SWIFTCODE;
	}
	public void setSWIFTCODE(String sWIFTCODE) {
		SWIFTCODE = sWIFTCODE;
	}
	public String getTXNMODULE() {
		return TXNMODULE;
	}
	public void setTXNMODULE(String tXNMODULE) {
		TXNMODULE = tXNMODULE;
	}
	public String getUSERREFERENCENO() {
		return USERREFERENCENO;
	}
	public void setUSERREFERENCENO(String uSERREFERENCENO) {
		USERREFERENCENO = uSERREFERENCENO;
	}
	public Fcc_vw_txnaccountactivity()
	{
		
	}
	public Fcc_vw_txnaccountactivity(String nBRACCOUNT, String bRANCHCODE, Integer cUSTOMERNO, Date dATVALUEDATE,
			Date tXNDATE, Date pOSTINGDATE, String cODTXNCURR, String nAMBRANCH, float tXNAMOUNT, String cODDRCR,
			String tXTREFERENCENO, String cODTXNTYPE, String dESCRIPTION, long sRNO, String tXNCODE, String sWIFTCODE,
			String tXNMODULE, String uSERREFERENCENO) {
		super();
		NBRACCOUNT = nBRACCOUNT;
		BRANCHCODE = bRANCHCODE;
		CUSTOMERNO = cUSTOMERNO;
		DATVALUEDATE = dATVALUEDATE;
		TXNDATE = tXNDATE;
		POSTINGDATE = pOSTINGDATE;
		CODTXNCURR = cODTXNCURR;
		NAMBRANCH = nAMBRANCH;
		TXNAMOUNT = tXNAMOUNT;
		CODDRCR = cODDRCR;
		TXTREFERENCENO = tXTREFERENCENO;
		CODTXNTYPE = cODTXNTYPE;
		DESCRIPTION = dESCRIPTION;
		SRNO = sRNO;
		TXNCODE = tXNCODE;
		SWIFTCODE = sWIFTCODE;
		TXNMODULE = tXNMODULE;
		USERREFERENCENO = uSERREFERENCENO;
	}
	


}
