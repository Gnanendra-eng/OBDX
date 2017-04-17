package com.jmr.obdx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "VW_MSTTDDETAILS", schema = "JMR_OBDX")
public class TermDepositeM implements java.io.Serializable {

	@Id
	@Column(name = "idaccount")
	private String idaccount;
	@Column(name = "codaccttype")
	private String codaccttype;
	@Column(name = "codbranch")
	private String codbranch;
	@Column(name = "acctdesc")
	private String acctdesc;
	@Column(name = "depositamt")
	private String depositamt;
	@Column(name = "accountclass")
	private String accountclass;
	@Column(name = "jointacctindicator")
	private String jointacctindicator;
	@Column(name = "nominee1")
	private String nominee1;
	@Column(name = "nominee2")
	private String nominee2;
	@Column(name = "rate")
	private String rate;
	@Column(name = "apy")
	private String apy;
	@Column(name = "bookaccount")
	private String bookaccount;
	@Column(name = "bookbranch")
	private String bookbranch;
	@Column(name = "ccy")
	private String ccy;
	@Column(name = "customerid")
	private String customerid;
	@Column(name = "primarycustomerid")
	private String primarycustomerid;
	@Column(name = "maturitydate")
	private String maturitydate;
	@Column(name = "depositdate")
	private String depositdate;
	@Column(name = "rollovertype")
	private String rollovertype;
	@Column(name = "rolloveramt")
	private String rolloveramt;
	@Column(name = "acyaccruedcric")
	private String acyaccruedcric;
	@Column(name = "intcap")
	private String intcap;
	@Column(name = "altacctno")
	private String altacctno;
	@Column(name = "proddesc")
	private String proddesc;
	@Column(name = "autorollover")
	private String autorollover;
	@Column(name = "closeonmaturity")
	private String closeonmaturity;
	@Column(name = "numavlbalance")
	private String numavlbalance;
	@Column(name = "modeofoperation")
	private String modeofoperation;
	@Column(name = "tdstatus")
	private String tdstatus;
	@Column(name = "holdamount")
	private String holdamount;
	@Column(name = "customername")
	private String customername;
	@Column(name = "allow_topup")
	private String allow_topup;
	@Column(name = "blk_open_days")
	private String blk_open_days;
	@Column(name = "blk_open_months")
	private String blk_open_months;
	@Column(name = "blk_mat_days")
	private String blk_mat_days;
	@Column(name = "blk_mat_months")
	private String blk_mat_months;
	@Column(name = "partial_liquidation")
	private String partial_liquidation;
	@Column(name = "valuedate")
	private String valuedate;

	public String getIdaccount() {
		return idaccount;
	}

	public void setIdaccount(String idaccount) {
		this.idaccount = idaccount;
	}

	public String getCodaccttype() {
		return codaccttype;
	}

	public void setCodaccttype(String codaccttype) {
		this.codaccttype = codaccttype;
	}

	public String getCodbranch() {
		return codbranch;
	}

	public void setCodbranch(String codbranch) {
		this.codbranch = codbranch;
	}

	public String getAcctdesc() {
		return acctdesc;
	}

	public void setAcctdesc(String acctdesc) {
		this.acctdesc = acctdesc;
	}

	public String getDepositamt() {
		return depositamt;
	}

	public void setDepositamt(String depositamt) {
		this.depositamt = depositamt;
	}

	public String getAccountclass() {
		return accountclass;
	}

	public void setAccountclass(String accountclass) {
		this.accountclass = accountclass;
	}

	public String getJointacctindicator() {
		return jointacctindicator;
	}

	public void setJointacctindicator(String jointacctindicator) {
		this.jointacctindicator = jointacctindicator;
	}

	public String getNominee1() {
		return nominee1;
	}

	public void setNominee1(String nominee1) {
		this.nominee1 = nominee1;
	}

	public String getNominee2() {
		return nominee2;
	}

	public void setNominee2(String nominee2) {
		this.nominee2 = nominee2;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getApy() {
		return apy;
	}

	public void setApy(String apy) {
		this.apy = apy;
	}

	public String getBookaccount() {
		return bookaccount;
	}

	public void setBookaccount(String bookaccount) {
		this.bookaccount = bookaccount;
	}

	public String getBookbranch() {
		return bookbranch;
	}

	public void setBookbranch(String bookbranch) {
		this.bookbranch = bookbranch;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getPrimarycustomerid() {
		return primarycustomerid;
	}

	public void setPrimarycustomerid(String primarycustomerid) {
		this.primarycustomerid = primarycustomerid;
	}

	public String getMaturitydate() {
		return maturitydate;
	}

	public void setMaturitydate(String maturitydate) {
		this.maturitydate = maturitydate;
	}

	public String getDepositdate() {
		return depositdate;
	}

	public void setDepositdate(String depositdate) {
		this.depositdate = depositdate;
	}

	public String getRollovertype() {
		return rollovertype;
	}

	public void setRollovertype(String rollovertype) {
		this.rollovertype = rollovertype;
	}

	public String getRolloveramt() {
		return rolloveramt;
	}

	public void setRolloveramt(String rolloveramt) {
		this.rolloveramt = rolloveramt;
	}

	public String getAcyaccruedcric() {
		return acyaccruedcric;
	}

	public void setAcyaccruedcric(String acyaccruedcric) {
		this.acyaccruedcric = acyaccruedcric;
	}

	public String getIntcap() {
		return intcap;
	}

	public void setIntcap(String intcap) {
		this.intcap = intcap;
	}

	public String getAltacctno() {
		return altacctno;
	}

	public void setAltacctno(String altacctno) {
		this.altacctno = altacctno;
	}

	public String getProddesc() {
		return proddesc;
	}

	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}

	public String getAutorollover() {
		return autorollover;
	}

	public void setAutorollover(String autorollover) {
		this.autorollover = autorollover;
	}

	public String getCloseonmaturity() {
		return closeonmaturity;
	}

	public void setCloseonmaturity(String closeonmaturity) {
		this.closeonmaturity = closeonmaturity;
	}

	public String getNumavlbalance() {
		return numavlbalance;
	}

	public void setNumavlbalance(String numavlbalance) {
		this.numavlbalance = numavlbalance;
	}

	public String getModeofoperation() {
		return modeofoperation;
	}

	public void setModeofoperation(String modeofoperation) {
		this.modeofoperation = modeofoperation;
	}

	public String getTdstatus() {
		return tdstatus;
	}

	public void setTdstatus(String tdstatus) {
		this.tdstatus = tdstatus;
	}

	public String getHoldamount() {
		return holdamount;
	}

	public void setHoldamount(String holdamount) {
		this.holdamount = holdamount;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getAllow_topup() {
		return allow_topup;
	}

	public void setAllow_topup(String allow_topup) {
		this.allow_topup = allow_topup;
	}

	public String getBlk_open_days() {
		return blk_open_days;
	}

	public void setBlk_open_days(String blk_open_days) {
		this.blk_open_days = blk_open_days;
	}

	public String getBlk_open_months() {
		return blk_open_months;
	}

	public void setBlk_open_months(String blk_open_months) {
		this.blk_open_months = blk_open_months;
	}

	public String getBlk_mat_days() {
		return blk_mat_days;
	}

	public void setBlk_mat_days(String blk_mat_days) {
		this.blk_mat_days = blk_mat_days;
	}

	public String getBlk_mat_months() {
		return blk_mat_months;
	}

	public void setBlk_mat_months(String blk_mat_months) {
		this.blk_mat_months = blk_mat_months;
	}

	public String getPartial_liquidation() {
		return partial_liquidation;
	}

	public void setPartial_liquidation(String partial_liquidation) {
		this.partial_liquidation = partial_liquidation;
	}

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	public TermDepositeM(String idaccount, String codaccttype, String codbranch, String acctdesc, String depositamt,
			String accountclass, String jointacctindicator, String nominee1, String nominee2, String rate, String apy,
			String bookaccount, String bookbranch, String ccy, String customerid, String primarycustomerid,
			String maturitydate, String depositdate, String rollovertype, String rolloveramt, String acyaccruedcric,
			String intcap, String altacctno, String proddesc, String autorollover, String closeonmaturity,
			String numavlbalance, String modeofoperation, String tdstatus, String holdamount, String customername,
			String allow_topup, String blk_open_days, String blk_open_months, String blk_mat_days,
			String blk_mat_months, String partial_liquidation, String valuedate) {
		super();
		this.idaccount = idaccount;
		this.codaccttype = codaccttype;
		this.codbranch = codbranch;
		this.acctdesc = acctdesc;
		this.depositamt = depositamt;
		this.accountclass = accountclass;
		this.jointacctindicator = jointacctindicator;
		this.nominee1 = nominee1;
		this.nominee2 = nominee2;
		this.rate = rate;
		this.apy = apy;
		this.bookaccount = bookaccount;
		this.bookbranch = bookbranch;
		this.ccy = ccy;
		this.customerid = customerid;
		this.primarycustomerid = primarycustomerid;
		this.maturitydate = maturitydate;
		this.depositdate = depositdate;
		this.rollovertype = rollovertype;
		this.rolloveramt = rolloveramt;
		this.acyaccruedcric = acyaccruedcric;
		this.intcap = intcap;
		this.altacctno = altacctno;
		this.proddesc = proddesc;
		this.autorollover = autorollover;
		this.closeonmaturity = closeonmaturity;
		this.numavlbalance = numavlbalance;
		this.modeofoperation = modeofoperation;
		this.tdstatus = tdstatus;
		this.holdamount = holdamount;
		this.customername = customername;
		this.allow_topup = allow_topup;
		this.blk_open_days = blk_open_days;
		this.blk_open_months = blk_open_months;
		this.blk_mat_days = blk_mat_days;
		this.blk_mat_months = blk_mat_months;
		this.partial_liquidation = partial_liquidation;
		this.valuedate = valuedate;
	}

	public TermDepositeM() {

	}

}