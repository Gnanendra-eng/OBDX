package com.jmr.obdx.domain;

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
@Table(name = "VW_MSTTDDETAILS", schema = "JMR_OBDX")
public class TermDepositeM implements java.io.Serializable {

	@Id
	@Column(name = "IDACCOUNT")
	private String idAccount;
	@Column(name = "CODACCTTYPE")
	private String codAcctType;
	@Column(name = "CODBRANCH")
	private String codBranch;
	@Column(name = "ACCTDESC")
	private String acctDesc;
	@Column(name = "DEPOSITAMT")
	private String depositAmt;
	@Column(name = "ACCOUNTCLASS")
	private String accountClass;
	@Column(name = "JOINTACCTINDICATOR")
	private String jointAcctIndicator;
	@Column(name = "NOMINEE1")
	private String nominee1;
	@Column(name = "NOMINEE2")
	private String nominee2;
	@Column(name = "RATE")
	private String rate;
	@Column(name = "APY")
	private String apy;
	@Column(name = "BOOKACCOUNT")
	private String bookAccount;
	@Column(name = "BOOKBRANCH")
	private String bookBranch;
	@Column(name = "CCY")
	private String ccy;
	@Column(name = "CUSTOMERID")
	private String customerId;
	@Column(name = "PRIMARYCUSTOMERID")
	private String primaryCustomerId;
	@Column(name = "MATURITYDATE")
	private String maturityDate;
	@Column(name = "DEPOSITDATE")
	private Date depositDate;
	@Column(name = "ROLLOVERTYPE")
	private String rolloverType;
	@Column(name = "ROLLOVERAMT")
	private String rolloverAmt;
	@Column(name = "ACYACCRUEDCRIC")
	private String acaccruedcric;
	@Column(name = "INTCAP")
	private String intCap;
	@Column(name = "ALTACCTNO")
	private String altAcctNo;
	@Column(name = "PRODDESC")
	private String prodDesc;
	@Column(name = "AUTOROLLOVER")
	private String autoRollover;
	@Column(name = "CLOSEONMATURITY")
	private String closeOnMaturity;
	@Column(name = "NUMAVLBALANCE")
	private String numAvlBalance;
	@Column(name = "MODEOFOPERATION")
	private String modeOfOperation;
	@Column(name = "TDSTATUS")
	private String tdStatus;
	@Column(name = "HOLDAMOUNT")
	private String holdAmount;
	@Column(name = "CUSTOMERNAME")
	private String customerName;
	@Column(name = "ALLOW_TOPUP")
	private String allowTopup;
	@Column(name = "BLK_OPEN_DAYS")
	private String blkOpenDays;
	@Column(name = "BLK_OPEN_MONTHS")
	private String blkOpenMonths;
	@Column(name = "BLK_MAT_DAYS")
	private String blkMatDays;
	@Column(name = "BLK_MAT_MONTHS")
	private String blkMatMonths;
	@Column(name = "PARTIAL_LIQUIDATION")
	private String partialLiquidation;
	@Column(name = "VALUEDATE")
	private String valueDate;
	public String getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}
	public String getCodAcctType() {
		return codAcctType;
	}
	public void setCodAcctType(String codAcctType) {
		this.codAcctType = codAcctType;
	}
	public String getCodBranch() {
		return codBranch;
	}
	public void setCodBranch(String codBranch) {
		this.codBranch = codBranch;
	}
	public String getAcctDesc() {
		return acctDesc;
	}
	public void setAcctDesc(String acctDesc) {
		this.acctDesc = acctDesc;
	}
	public String getDepositAmt() {
		return depositAmt;
	}
	public void setDepositAmt(String depositAmt) {
		this.depositAmt = depositAmt;
	}
	public String getAccountClass() {
		return accountClass;
	}
	public void setAccountClass(String accountClass) {
		this.accountClass = accountClass;
	}
	public String getJointAcctIndicator() {
		return jointAcctIndicator;
	}
	public void setJointAcctIndicator(String jointAcctIndicator) {
		this.jointAcctIndicator = jointAcctIndicator;
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
	public String getBookAccount() {
		return bookAccount;
	}
	public void setBookAccount(String bookAccount) {
		this.bookAccount = bookAccount;
	}
	public String getBookBranch() {
		return bookBranch;
	}
	public void setBookBranch(String bookBranch) {
		this.bookBranch = bookBranch;
	}
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPrimaryCustomerId() {
		return primaryCustomerId;
	}
	public void setPrimaryCustomerId(String primaryCustomerId) {
		this.primaryCustomerId = primaryCustomerId;
	}
	public String getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}
	public Date getDepositDate() {
		return depositDate;
	}
	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
	}
	public String getRolloverType() {
		return rolloverType;
	}
	public void setRolloverType(String rolloverType) {
		this.rolloverType = rolloverType;
	}
	public String getRolloverAmt() {
		return rolloverAmt;
	}
	public void setRolloverAmt(String rolloverAmt) {
		this.rolloverAmt = rolloverAmt;
	}
	public String getAcaccruedcric() {
		return acaccruedcric;
	}
	public void setAcaccruedcric(String acaccruedcric) {
		this.acaccruedcric = acaccruedcric;
	}
	public String getIntCap() {
		return intCap;
	}
	public void setIntCap(String intCap) {
		this.intCap = intCap;
	}
	public String getAltAcctNo() {
		return altAcctNo;
	}
	public void setAltAcctNo(String altAcctNo) {
		this.altAcctNo = altAcctNo;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public String getAutoRollover() {
		return autoRollover;
	}
	public void setAutoRollover(String autoRollover) {
		this.autoRollover = autoRollover;
	}
	public String getCloseOnMaturity() {
		return closeOnMaturity;
	}
	public void setCloseOnMaturity(String closeOnMaturity) {
		this.closeOnMaturity = closeOnMaturity;
	}
	public String getNumAvlBalance() {
		return numAvlBalance;
	}
	public void setNumAvlBalance(String numAvlBalance) {
		this.numAvlBalance = numAvlBalance;
	}
	public String getModeOfOperation() {
		return modeOfOperation;
	}
	public void setModeOfOperation(String modeOfOperation) {
		this.modeOfOperation = modeOfOperation;
	}
	public String getTdStatus() {
		return tdStatus;
	}
	public void setTdStatus(String tdStatus) {
		this.tdStatus = tdStatus;
	}
	public String getHoldAmount() {
		return holdAmount;
	}
	public void setHoldAmount(String holdAmount) {
		this.holdAmount = holdAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAllowTopup() {
		return allowTopup;
	}
	public void setAllowTopup(String allowTopup) {
		this.allowTopup = allowTopup;
	}
	public String getBlkOpenDays() {
		return blkOpenDays;
	}
	public void setBlkOpenDays(String blkOpenDays) {
		this.blkOpenDays = blkOpenDays;
	}
	public String getBlkOpenMonths() {
		return blkOpenMonths;
	}
	public void setBlkOpenMonths(String blkOpenMonths) {
		this.blkOpenMonths = blkOpenMonths;
	}
	public String getBlkMatDays() {
		return blkMatDays;
	}
	public void setBlkMatDays(String blkMatDays) {
		this.blkMatDays = blkMatDays;
	}
	public String getBlkMatMonths() {
		return blkMatMonths;
	}
	public void setBlkMatMonths(String blkMatMonths) {
		this.blkMatMonths = blkMatMonths;
	}
	public String getPartialLiquidation() {
		return partialLiquidation;
	}
	public void setPartialLiquidation(String partialLiquidation) {
		this.partialLiquidation = partialLiquidation;
	}
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public TermDepositeM(String idAccount, String codAcctType, String codBranch, String acctDesc, String depositAmt,
			String accountClass, String jointAcctIndicator, String nominee1, String nominee2, String rate, String apy,
			String bookAccount, String bookBranch, String ccy, String customerId, String primaryCustomerId,
			String maturityDate, Date depositDate, String rolloverType, String rolloverAmt, String acaccruedcric,
			String intCap, String altAcctNo, String prodDesc, String autoRollover, String closeOnMaturity,
			String numAvlBalance, String modeOfOperation, String tdStatus, String holdAmount, String customerName,
			String allowTopup, String blkOpenDays, String blkOpenMonths, String blkMatDays, String blkMatMonths,
			String partialLiquidation, String valueDate) {
		super();
		this.idAccount = idAccount;
		this.codAcctType = codAcctType;
		this.codBranch = codBranch;
		this.acctDesc = acctDesc;
		this.depositAmt = depositAmt;
		this.accountClass = accountClass;
		this.jointAcctIndicator = jointAcctIndicator;
		this.nominee1 = nominee1;
		this.nominee2 = nominee2;
		this.rate = rate;
		this.apy = apy;
		this.bookAccount = bookAccount;
		this.bookBranch = bookBranch;
		this.ccy = ccy;
		this.customerId = customerId;
		this.primaryCustomerId = primaryCustomerId;
		this.maturityDate = maturityDate;
		this.depositDate = depositDate;
		this.rolloverType = rolloverType;
		this.rolloverAmt = rolloverAmt;
		this.acaccruedcric = acaccruedcric;
		this.intCap = intCap;
		this.altAcctNo = altAcctNo;
		this.prodDesc = prodDesc;
		this.autoRollover = autoRollover;
		this.closeOnMaturity = closeOnMaturity;
		this.numAvlBalance = numAvlBalance;
		this.modeOfOperation = modeOfOperation;
		this.tdStatus = tdStatus;
		this.holdAmount = holdAmount;
		this.customerName = customerName;
		this.allowTopup = allowTopup;
		this.blkOpenDays = blkOpenDays;
		this.blkOpenMonths = blkOpenMonths;
		this.blkMatDays = blkMatDays;
		this.blkMatMonths = blkMatMonths;
		this.partialLiquidation = partialLiquidation;
		this.valueDate = valueDate;
	}
	public TermDepositeM() {
		super();
		// TODO Auto-generated constructor stub
	}
}