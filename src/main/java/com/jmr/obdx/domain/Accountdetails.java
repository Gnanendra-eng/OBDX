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
@Table(name = "MCX_FCAT_VW_ACCOUNT_DETAILS", schema = "JMR_OBDX")
public class Accountdetails implements java.io.Serializable {



	@Column(name = "IDCUSTOMER")
	private String idCustomer;
	@Column(name = "NBRBRANCH")
	private String nbrBranch;
	@Id
    @Column(name = "NBRACCOUNT")
	private String nbrAccount;
    @Column(name = "ACCTTYPE")
	private String acctType;
	@Column(name = "ACCTSTATUS")
	private String acctStatus;
	@Column(name = "CCYDESC")
	private String ccyDesc;
	@Column(name = "BALANCE")
	private long balance;
	@Column(name = "OPENINGBALANCE")
	private long openingBalance;
	@Column(name = "AVAILABLEBALANCE")
	private long availableBalance;
	@Column(name = "ISCHQBOOK")
	private String isChqBook;
	@Column(name = "ISOVERDRAFT")
	private String isOverDraft;
	@Column(name = "ISSI")
	private char issi;
	@Column(name = "NUMUNCOLLECTED")
	private long numUncollected;
	@Column(name = "MINBALANCE")
	private long minBalance;
	@Column(name = "DAILYWITHDRAWALLIMIT")
	private long dailyWithDrawalLimit;
	@Column(name = "CUSTOMERSHORTNAME")
	private String customerShortName;
	@Column(name = "CUSTOMERNAME")
	private String customerName;
	@Column(name = "OPENINGDATE")
	private Date openingDate;
	@Column(name = "IBAN_AC_NO")
	private String ibanAcNo;
	@Column(name = "RELATION")
	private String relation;
	@Column(name = "DESCACCTTYPE")
	private String descAcctType;
	@Column(name = "AMOUNTONHOLD")
	private long amountOnHold;
	@Column(name = "ODLIMIT")
	private String odLimit;
	@Column(name = "DAILYLIMIT")
	private String dialyLimit;
	@Column(name = "ELIGIBLEADV")
	private long eligibleAdv;
	@Column(name = "ODLMTSTRTDATE")
	private Date odlmStartDate;
	@Column(name = "ODLMTENDDATE")
	private Date odlmEndDate;
	@Column(name = "ORIGAVAILABLEBAL")
	private long origAvailableBal;
	
	public String getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getNbrBranch() {
		return nbrBranch;
	}
	public void setNbrBranch(String nbrBranch) {
		this.nbrBranch = nbrBranch;
	}
	public String getNbrAccount() {
		return nbrAccount;
	}
	public void setNbrAccount(String nbrAccount) {
		this.nbrAccount = nbrAccount;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getAcctStatus() {
		return acctStatus;
	}
	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}
	public String getCcyDesc() {
		return ccyDesc;
	}
	public void setCcyDesc(String ccyDesc) {
		this.ccyDesc = ccyDesc;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(long openingBalance) {
		this.openingBalance = openingBalance;
	}
	public long getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(long availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getIsChqBook() {
		return isChqBook;
	}
	public void setIsChqBook(String isChqBook) {
		this.isChqBook = isChqBook;
	}
	public String getIsOverDraft() {
		return isOverDraft;
	}
	public void setIsOverDraft(String isOverDraft) {
		this.isOverDraft = isOverDraft;
	}
	public char getIssi() {
		return issi;
	}
	public void setIssi(char issi) {
		this.issi = issi;
	}
	public long getNumUncollected() {
		return numUncollected;
	}
	public void setNumUncollected(long numUncollected) {
		this.numUncollected = numUncollected;
	}
	public long getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(long minBalance) {
		this.minBalance = minBalance;
	}
	public long getDailyWithDrawalLimit() {
		return dailyWithDrawalLimit;
	}
	public void setDailyWithDrawalLimit(long dailyWithDrawalLimit) {
		this.dailyWithDrawalLimit = dailyWithDrawalLimit;
	}
	public String getCustomerShortName() {
		return customerShortName;
	}
	public void setCustomerShortName(String customerShortName) {
		this.customerShortName = customerShortName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}
	public String getIbanAcNo() {
		return ibanAcNo;
	}
	public void setIbanAcNo(String ibanAcNo) {
		this.ibanAcNo = ibanAcNo;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getDescAcctType() {
		return descAcctType;
	}
	public void setDescAcctType(String descAcctType) {
		this.descAcctType = descAcctType;
	}
	public long getAmountOnHold() {
		return amountOnHold;
	}
	public void setAmountOnHold(long amountOnHold) {
		this.amountOnHold = amountOnHold;
	}
	public String getOdLimit() {
		return odLimit;
	}
	public void setOdLimit(String odLimit) {
		this.odLimit = odLimit;
	}
	public String getDialyLimit() {
		return dialyLimit;
	}
	public void setDialyLimit(String dialyLimit) {
		this.dialyLimit = dialyLimit;
	}
	public long getEligibleAdv() {
		return eligibleAdv;
	}
	public void setEligibleAdv(long eligibleAdv) {
		this.eligibleAdv = eligibleAdv;
	}
	public Date getOdlmStartDate() {
		return odlmStartDate;
	}
	public void setOdlmStartDate(Date odlmStartDate) {
		this.odlmStartDate = odlmStartDate;
	}
	public Date getOdlmEndDate() {
		return odlmEndDate;
	}
	public void setOdlmEndDate(Date odlmEndDate) {
		this.odlmEndDate = odlmEndDate;
	}
	public long getOrigAvailableBal() {
		return origAvailableBal;
	}
	public void setOrigAvailableBal(long origAvailableBal) {
		this.origAvailableBal = origAvailableBal;
	}
	public Accountdetails(String idCustomer, String nbrBranch, String nbrAccount, String acctType, String acctStatus,
			String ccyDesc, long balance, long openingBalance, long availableBalance, String isChqBook,
			String isOverDraft, char issi, long numUncollected, long minBalance, long dailyWithDrawalLimit,
			String customerShortName, String customerName, Date openingDate, String ibanAcNo, String relation,
			String descAcctType, long amountOnHold, String odLimit, String dialyLimit, long eligibleAdv,
			Date odlmStartDate, Date odlmEndDate, long origAvailableBal) {
		super();
		this.idCustomer = idCustomer;
		this.nbrBranch = nbrBranch;
		this.nbrAccount = nbrAccount;
		this.acctType = acctType;
		this.acctStatus = acctStatus;
		this.ccyDesc = ccyDesc;
		this.balance = balance;
		this.openingBalance = openingBalance;
		this.availableBalance = availableBalance;
		this.isChqBook = isChqBook;
		this.isOverDraft = isOverDraft;
		this.issi = issi;
		this.numUncollected = numUncollected;
		this.minBalance = minBalance;
		this.dailyWithDrawalLimit = dailyWithDrawalLimit;
		this.customerShortName = customerShortName;
		this.customerName = customerName;
		this.openingDate = openingDate;
		this.ibanAcNo = ibanAcNo;
		this.relation = relation;
		this.descAcctType = descAcctType;
		this.amountOnHold = amountOnHold;
		this.odLimit = odLimit;
		this.dialyLimit = dialyLimit;
		this.eligibleAdv = eligibleAdv;
		this.odlmStartDate = odlmStartDate;
		this.odlmEndDate = odlmEndDate;
		this.origAvailableBal = origAvailableBal;
	}
	public Accountdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
}
