package com.jmr.obdx.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name = "FCC_VW_TXNACCOUNTACTIVITY", schema = "JMR_OBDX")
public class VwTxnaccountactivity implements java.io.Serializable {

	private String nbraccount;
	private String branchcode;
	private String customerno;
	private Date datvaluedate;
	private Date txndate;
	private Date postingdate;
	private String codtxncurr;
	private String amounttag;
	private String prodType;
	private String nambranch;
	private BigDecimal txnamount;
	private String coddrcr;
	private String txtreferenceno;
	private String codtxntype;
	private String description;
	private BigDecimal srno;
	private String txncode;
	private String swiftcode;
	private String txnmodule;
	private String userreferenceno;
	private String virtualAcNo;
	private String remitterName;
	private String txntypedesc;

	public VwTxnaccountactivity() {
	}

	public VwTxnaccountactivity(String nbraccount, String branchcode, String customerno, Date datvaluedate,
			Date txndate, Date postingdate, String codtxncurr, String amounttag, String prodType, String nambranch,
			BigDecimal txnamount, String coddrcr, String txtreferenceno, String codtxntype, String description,
			BigDecimal srno, String txncode, String swiftcode, String txnmodule, String userreferenceno,
			String virtualAcNo, String remitterName, String txntypedesc) {
		this.nbraccount = nbraccount;
		this.branchcode = branchcode;
		this.customerno = customerno;
		this.datvaluedate = datvaluedate;
		this.txndate = txndate;
		this.postingdate = postingdate;
		this.codtxncurr = codtxncurr;
		this.amounttag = amounttag;
		this.prodType = prodType;
		this.nambranch = nambranch;
		this.txnamount = txnamount;
		this.coddrcr = coddrcr;
		this.txtreferenceno = txtreferenceno;
		this.codtxntype = codtxntype;
		this.description = description;
		this.srno = srno;
		this.txncode = txncode;
		this.swiftcode = swiftcode;
		this.txnmodule = txnmodule;
		this.userreferenceno = userreferenceno;
		this.virtualAcNo = virtualAcNo;
		this.remitterName = remitterName;
		this.txntypedesc = txntypedesc;
	}

	@Column(name = "NBRACCOUNT", length = 80)
	public String getNbraccount() {
		return this.nbraccount;
	}

	public void setNbraccount(String nbraccount) {
		this.nbraccount = nbraccount;
	}

	@Column(name = "BRANCHCODE", length = 12)
	public String getBranchcode() {
		return this.branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}
	
	
	@Column(name = "CUSTOMERNO", length = 36)
	public String getCustomerno() {
		return this.customerno;
	}

	public void setCustomerno(String customerno) {
		this.customerno = customerno;
	}

	@Column(name = "DATVALUEDATE", length = 7)
	public Date getDatvaluedate() {
		return this.datvaluedate;
	}

	public void setDatvaluedate(Date datvaluedate) {
		this.datvaluedate = datvaluedate;
	}

	@Column(name = "TXNDATE", length = 7)
	public Date getTxndate() {
		return this.txndate;
	}

	public void setTxndate(Date txndate) {
		this.txndate = txndate;
	}

	@Column(name = "POSTINGDATE", length = 7)
	public Date getPostingdate() {
		return this.postingdate;
	}

	public void setPostingdate(Date postingdate) {
		this.postingdate = postingdate;
	}

	@Column(name = "CODTXNCURR", length = 12)
	public String getCodtxncurr() {
		return this.codtxncurr;
	}

	public void setCodtxncurr(String codtxncurr) {
		this.codtxncurr = codtxncurr;
	}

	@Column(name = "AMOUNTTAG", length = 140)
	public String getAmounttag() {
		return this.amounttag;
	}

	public void setAmounttag(String amounttag) {
		this.amounttag = amounttag;
	}

	@Column(name = "PROD_TYPE", length = 3)
	public String getProdType() {
		return this.prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	@Column(name = "NAMBRANCH", length = 420)
	public String getNambranch() {
		return this.nambranch;
	}

	public void setNambranch(String nambranch) {
		this.nambranch = nambranch;
	}

	@Column(name = "TXNAMOUNT", precision = 22, scale = 0)
	public BigDecimal getTxnamount() {
		return this.txnamount;
	}

	public void setTxnamount(BigDecimal txnamount) {
		this.txnamount = txnamount;
	}

	@Column(name = "CODDRCR", length = 4)
	public String getCoddrcr() {
		return this.coddrcr;
	}

	public void setCoddrcr(String coddrcr) {
		this.coddrcr = coddrcr;
	}

	@Column(name = "TXTREFERENCENO", length = 64)
	public String getTxtreferenceno() {
		return this.txtreferenceno;
	}

	public void setTxtreferenceno(String txtreferenceno) {
		this.txtreferenceno = txtreferenceno;
	}

	@Column(name = "CODTXNTYPE", length = 12)
	public String getCodtxntype() {
		return this.codtxntype;
	}

	public void setCodtxntype(String codtxntype) {
		this.codtxntype = codtxntype;
	}

	@Column(name = "DESCRIPTION", length = 4000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Id
	@Column(name = "SRNO", precision = 20, scale = 0)
	public BigDecimal getSrno() {
		return this.srno;
	}

	public void setSrno(BigDecimal srno) {
		this.srno = srno;
	}

	@Column(name = "TXNCODE", length = 12)
	public String getTxncode() {
		return this.txncode;
	}

	public void setTxncode(String txncode) {
		this.txncode = txncode;
	}

	@Column(name = "SWIFTCODE", length = 12)
	public String getSwiftcode() {
		return this.swiftcode;
	}

	public void setSwiftcode(String swiftcode) {
		this.swiftcode = swiftcode;
	}

	@Column(name = "TXNMODULE", length = 12)
	public String getTxnmodule() {
		return this.txnmodule;
	}

	public void setTxnmodule(String txnmodule) {
		this.txnmodule = txnmodule;
	}

	@Column(name = "USERREFERENCENO", length = 420)
	public String getUserreferenceno() {
		return this.userreferenceno;
	}

	public void setUserreferenceno(String userreferenceno) {
		this.userreferenceno = userreferenceno;
	}

	@Column(name = "VIRTUAL_AC_NO", length = 80)
	public String getVirtualAcNo() {
		return this.virtualAcNo;
	}

	public void setVirtualAcNo(String virtualAcNo) {
		this.virtualAcNo = virtualAcNo;
	}

	@Column(name = "REMITTER_NAME", length = 200)
	public String getRemitterName() {
		return this.remitterName;
	}

	public void setRemitterName(String remitterName) {
		this.remitterName = remitterName;
	}

	@Column(name = "TXNTYPEDESC", length = 420)
	public String getTxntypedesc() {
		return this.txntypedesc;
	}

	public void setTxntypedesc(String txntypedesc) {
		this.txntypedesc = txntypedesc;
	}

}
