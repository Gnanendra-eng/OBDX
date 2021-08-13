package com.jmr.mcx.service.dto;

import java.util.Date;

import com.jmr.mcx.dto.StatusInfo;

public class AccountDetailsDto extends StatusInfo {

	private String idCustomer;
	private String nbrBranch;
	private String nbrAccount;
	private String accType;
	private String accStatus;
	private String ccyDesc;
	private Double balance;
	private long openingBalance;
	private long availableBalance;
	private String isChqBook;
	private String isOverDraft;
	private char issi;
	private long numunCollected;
	private long minBalance;
	private long dailyWithDraWalLimit;
	private String customerShortName;
	private String customerName;
	private String openingDate;
	private String ibanAcNo;
	private String relation;
	private String descAcctType;
	private long amountOnHold;
	private String odLimit;
	private String dailyLimit;
	private long eligibleAdv;
	private Date odlMtstrtDate;
	private Date odlmtendDate;
	private long origAvailableBal;

	public AccountDetailsDto() {
		// TODO Auto-generated constructor stub
	}

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

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	public String getCcyDesc() {
		return ccyDesc;
	}

	public void setCcyDesc(String ccyDesc) {
		this.ccyDesc = ccyDesc;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
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

	public long getNumunCollected() {
		return numunCollected;
	}

	public void setNumunCollected(long numunCollected) {
		this.numunCollected = numunCollected;
	}

	public long getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(long minBalance) {
		this.minBalance = minBalance;
	}

	public long getDailyWithDraWalLimit() {
		return dailyWithDraWalLimit;
	}

	public void setDailyWithDraWalLimit(long dailyWithDraWalLimit) {
		this.dailyWithDraWalLimit = dailyWithDraWalLimit;
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

	public String getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(String openingDate) {
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

	public String getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(String dailyLimit) {
		this.dailyLimit = dailyLimit;
	}

	public long getEligibleAdv() {
		return eligibleAdv;
	}

	public void setEligibleAdv(long eligibleAdv) {
		this.eligibleAdv = eligibleAdv;
	}

	public Date getOdlMtstrtDate() {
		return odlMtstrtDate;
	}

	public void setOdlMtstrtDate(Date odlMtstrtDate) {
		this.odlMtstrtDate = odlMtstrtDate;
	}

	public Date getOdlmtendDate() {
		return odlmtendDate;
	}

	public void setOdlmtendDate(Date odlmtendDate) {
		this.odlmtendDate = odlmtendDate;
	}

	public long getOrigAvailableBal() {
		return origAvailableBal;
	}

	public void setOrigAvailableBal(long origAvailableBal) {
		this.origAvailableBal = origAvailableBal;
	}

	public AccountDetailsDto(String idCustomer, String nbrBranch, String nbrAccount, String accType, String accStatus,
			String ccyDesc, Double balance, long openingBalance, long availableBalance, String isChqBook,
			String isOverDraft, char issi, long numunCollected, long minBalance, long dailyWithDraWalLimit,
			String customerShortName, String customerName, String openingDate, String ibanAcNo, String relation,
			String descAcctType, long amountOnHold, String odLimit, String dailyLimit, long eligibleAdv,
			Date odlMtstrtDate, Date odlmtendDate, long origAvailableBal) {
		this.idCustomer = idCustomer;
		this.nbrBranch = nbrBranch;
		this.nbrAccount = nbrAccount;
		this.accType = accType;
		this.accStatus = accStatus;
		this.ccyDesc = ccyDesc;
		this.balance = balance;
		this.openingBalance = openingBalance;
		this.availableBalance = availableBalance;
		this.isChqBook = isChqBook;
		this.isOverDraft = isOverDraft;
		this.issi = issi;
		this.numunCollected = numunCollected;
		this.minBalance = minBalance;
		this.dailyWithDraWalLimit = dailyWithDraWalLimit;
		this.customerShortName = customerShortName;
		this.customerName = customerName;
		this.openingDate = openingDate;
		this.ibanAcNo = ibanAcNo;
		this.relation = relation;
		this.descAcctType = descAcctType;
		this.amountOnHold = amountOnHold;
		this.odLimit = odLimit;
		this.dailyLimit = dailyLimit;
		this.eligibleAdv = eligibleAdv;
		this.odlMtstrtDate = odlMtstrtDate;
		this.odlmtendDate = odlmtendDate;
		this.origAvailableBal = origAvailableBal;
	}
// Added by Sreeja. 

	public AccountDetailsDto(String idCustomer, String nbrAccount, Double balance) {
		super();
		this.idCustomer = idCustomer;
		this.nbrAccount = nbrAccount;
		this.balance = balance;
	}

	



}
