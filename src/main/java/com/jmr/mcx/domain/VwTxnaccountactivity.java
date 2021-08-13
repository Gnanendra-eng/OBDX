package com.jmr.mcx.domain;

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

	private String nbrAccount;
	private String branchCode;
	private String customerNo;
	private Date datValueDate;
	private Date txnDate;
	private Date postingDate;
	private String codTxnCurr;
	private String amountTag;
	private String prodType;
	private String namBranch;
	private BigDecimal txnAmount;
	private String coddrcr;
	private String txtReferenceNo;
	private String codTxnType;
	private String description;
	private BigDecimal srNo;
	private String txnCode;
	private String swiftCode;
	private String txnModule;
	private String userReferenceNo;
	private String virtualAcNo;
	private String remitterName;
	private String txnTypeDesc;

	public VwTxnaccountactivity() {
	}

	public VwTxnaccountactivity(String nbrAccount, String branchCode, String customerNo, Date datValueDate,
			Date txnDate, Date postingDate, String codTxnCurr, String amountTag, String prodType, String namBranch,
			BigDecimal txnAmount, String coddrcr, String txtReferenceNo, String codTxnType, String description,
			BigDecimal srNo, String txnCode, String swiftCode, String txnModule, String userReferenceNo,
			String virtualAcNo, String remitterName, String txnTypeDesc) {
		super();
		this.nbrAccount = nbrAccount;
		this.branchCode = branchCode;
		this.customerNo = customerNo;
		this.datValueDate = datValueDate;
		this.txnDate = txnDate;
		this.postingDate = postingDate;
		this.codTxnCurr = codTxnCurr;
		this.amountTag = amountTag;
		this.prodType = prodType;
		this.namBranch = namBranch;
		this.txnAmount = txnAmount;
		this.coddrcr = coddrcr;
		this.txtReferenceNo = txtReferenceNo;
		this.codTxnType = codTxnType;
		this.description = description;
		this.srNo = srNo;
		this.txnCode = txnCode;
		this.swiftCode = swiftCode;
		this.txnModule = txnModule;
		this.userReferenceNo = userReferenceNo;
		this.virtualAcNo = virtualAcNo;
		this.remitterName = remitterName;
		this.txnTypeDesc = txnTypeDesc;
	}
	
	@Id
	@Column(name = "SRNO", precision = 20, scale = 0)
	public BigDecimal getSrNo() {
		return this.srNo;
	}
	
	@Column(name = "NBRACCOUNT", length = 80)
	public String getNbrAccount() {
		return this.nbrAccount;
	}

	public void setNbrAccount(String nbrAccount) {
		this.nbrAccount = nbrAccount;
	}

	@Column(name = "BRANCHCODE", length = 12)
	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	
	
	@Column(name = "CUSTOMERNO", length = 36)
	public String getCustomerNo() {
		return this.customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	@Column(name = "DATVALUEDATE", length = 7)
	public Date getDatValueDate() {
		return this.datValueDate;
	}

	public void setDatValueDate(Date datValueDate) {
		this.datValueDate = datValueDate;
	}

	@Column(name = "TXNDATE", length = 7)
	public Date getTxnDate() {
		return this.txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	@Column(name = "POSTINGDATE", length = 7)
	public Date getPostingDate() {
		return this.postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}

	@Column(name = "CODTXNCURR", length = 12)
	public String getCodTxnCurr() {
		return this.codTxnCurr;
	}

	public void setCodTxnCurr(String codTxnCurr) {
		this.codTxnCurr = codTxnCurr;
	}

	@Column(name = "AMOUNTTAG", length = 140)
	public String getAmountTag() {
		return this.amountTag;
	}

	public void setAmountTag(String amountTag) {
		this.amountTag = amountTag;
	}

	@Column(name = "PROD_TYPE", length = 3)
	public String getProdType() {
		return this.prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	@Column(name = "NAMBRANCH", length = 420)
	public String getNamBranch() {
		return this.namBranch;
	}

	public void setNamBranch(String namBranch) {
		this.namBranch = namBranch;
	}

	@Column(name = "TXNAMOUNT", precision = 22, scale = 0)
	public BigDecimal getTxnAmount() {
		return this.txnAmount;
	}

	public void setTxnAmount(BigDecimal txnAmount) {
		this.txnAmount = txnAmount;
	}

	@Column(name = "CODDRCR", length = 4)
	public String getCoddrcr() {
		return this.coddrcr;
	}

	public void setCoddrcr(String coddrcr) {
		this.coddrcr = coddrcr;
	}

	@Column(name = "TXTREFERENCENO", length = 64)
	public String getTxtReferenceNo() {
		return this.txtReferenceNo;
	}

	public void setTxtReferenceNo(String txtReferenceNo) {
		this.txtReferenceNo = txtReferenceNo;
	}

	@Column(name = "CODTXNTYPE", length = 12)
	public String getCodTxnType() {
		return this.codTxnType;
	}

	public void setCodTxnType(String codTxnType) {
		this.codTxnType = codTxnType;
	}

	@Column(name = "DESCRIPTION", length = 4000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSrNo(BigDecimal srNo) {
		this.srNo = srNo;
	}

	@Column(name = "TXNCODE", length = 12)
	public String getTxnCode() {
		return this.txnCode;
	}

	public void setTxnCode(String txnCode) {
		this.txnCode = txnCode;
	}

	@Column(name = "SWIFTCODE", length = 12)
	public String getSwiftCode() {
		return this.swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	@Column(name = "TXNMODULE", length = 12)
	public String getTxnModule() {
		return this.txnModule;
	}

	public void setTxnModule(String txnModule) {
		this.txnModule = txnModule;
	}

	@Column(name = "USERREFERENCENO", length = 420)
	public String getUserReferenceNo() {
		return this.userReferenceNo;
	}

	public void setUserReferenceNo(String userReferenceNo) {
		this.userReferenceNo = userReferenceNo;
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
	public String getTxnTypeDesc() {
		return this.txnTypeDesc;
	}

	public void setTxnTypeDesc(String txnTypeDesc) {
		this.txnTypeDesc = txnTypeDesc;
	}

}
