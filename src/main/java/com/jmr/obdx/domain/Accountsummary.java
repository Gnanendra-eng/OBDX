package com.jmr.obdx.domain;

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
@Table(name = "FCC_VW_MSTACCOUNT", schema = "JMR_OBDX")
public class Accountsummary implements java.io.Serializable {

	public Accountsummary() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "IDACCOUNT")
	private String idAccount;
	@Column(name = "IDCUSTOMER")
	private String idCustomer;
	@Column(name = "CODBRANCH")
	private String codBranch;
	@Column(name = "CODACCTTYPE")
	private String codAcctType;
	@Column(name = "TXTACCTSTATUS")
	private String txtAcctStatus;
	@Column(name = "CODACCTCURR")
	private String codAcctCurr;
	@Column(name = "NUMBALANCE")
	private String numBalance;
	@Column(name = "NUMOPENBALANCE")
	private String numOpenBalance;
	@Column(name = "DATLASTUPDATED")
	private String datLastUpdated;
	@Column(name = "NUMAVAILBAL")
	private String numAvailBal;
	@Column(name = "NUMUNCOLLECTED")
	private String numUncollected;
	@Column(name = "NUMAVAILCREDIT")
	private String numAvailCredit;
	@Column(name = "NUMMONTOVCR")
	private String numMontOvCr;
	@Column(name = "NUMMONTOVDR")
	private String numMontOvDr;
	@Column(name = "ACCTDESC")
	private String acctDesc;
	@Column(name = "ADD1")
	private String add1;
	@Column(name = "ADD2")
	private String add2;
	@Column(name = "ADD3")
	private String add3;
	@Column(name = "NOM1")
	private String nom1;
	@Column(name = "NOM2")
	private String nom2;
	@Column(name = "ADD4")
	private String add4;
	@Column(name = "PRDNAME")
	private String prdName;
	@Column(name = "PRDTYPE")
	private String prdType;
	@Column(name = "ACCTOPENDT")
	private String acctOpenDt;
	@Column(name = "ODLIMIT")
	private String odLimit;
	@Column(name = "ODSTARTDT")
	private String odStartDt;
	@Column(name = "ODENDDT")
	private String odEndDt;
	@Column(name = "SHADOWLIMIT")
	private String shadowLimit;
	@Column(name = "ACCRDRAMT")
	private String accrDrAmt;
	@Column(name = "ACCRCRAMT")
	private String accrCrAmt;
	@Column(name = "JOINTACCTINDICATOR")
	private String jointAcctIndicatior;
	@Column(name = "CHQBOOK")
	private String chqBook;
	@Column(name = "OVERDRAFT_FACILITY")
	private String overDraftFecility;
	@Column(name = "NUMSTATEBIT")
	private String numStateBit;
	@Column(name = "CHKNAME1")
	private String chkName1;
	@Column(name = "CHKNAME2")
	private String chkName2;
	@Column(name = "AUTOREORDERCHKREQ")
	private String autoreOrderChkReq;
	@Column(name = "AUTOREORDERCHKLVL")
	private String autoreOrderChkLvl;
	@Column(name = "DIRTSTATUS")
	private String dirtStatus;
	@Column(name = "NEXTCAPDT")
	private String nextCapDt;
	@Column(name = "CAPFREQ")
	private String capFreq;
	@Column(name = "AUTHSIGNATORY")
	private String authSignAtory;
	@Column(name = "AUTHSIGNLIMIT")
	private String authSignLimit;
	@Column(name = "SALESPERSON")
	private String salesPerson;
	@Column(name = "INTRODUCER")
	private String introducer;
	@Column(name = "IBANNUMBER")
	private String ibanNumber;
	@Column(name = "ACCTLOCKFLAG")
	private String acctLockFlag;
	@Column(name = "DEBITACCTLOCKFLAG")
	private String debitAcctLockFlag;
	@Column(name = "CREDITACCTLOCKFLAG")
	private String creditAcctLockFlag;
	@Column(name = "CRLINE")
	private String crLine;
	@Column(name = "AVAILAMT")
	private String availAmt;
	@Column(name = "CRINTRATE")
	private String crIntRate;
	@Column(name = "ALWDOD")
	private String alwDod;
	@Column(name = "UNALWDOD")
	private String unAlwDod;
	@Column(name = "ACFROZEN")
	private String acFrozen;
	@Column(name = "DTIME")
	private String dTime;
	@Column(name = "SLNO")
	private String slNo;
	@Column(name = "PRDCODE")
	private String prdCode;
	@Column(name = "ILM_APPLICABLE")
	private String ilmApplicable;
	@Column(name = "ID_ENTITY")
	private String idEntity;
	@Column(name = "MATURITY_DATE")
	private String maturityDate;
	@Column(name = "NEXT_DUE_DATE")
	private String nextDueDate;
	@Column(name = "UDF1")
	private String udf1;
	@Column(name = "UDF2")
	private String udf2;
	@Column(name = "UDF3")
	private String udf3;
	@Column(name = "UDF4")
	private String udf4;
	@Column(name = "UDF5")
	private String udf5;
	@Column(name = "UDF6")
	private String udf6;
	@Column(name = "UDF7")
	private String udf7;
	@Column(name = "UDF8")
	private String udf8;
	@Column(name = "UDF9")
	private String udf9;
	@Column(name = "UDF10")
	private String udf10;
	public String getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}
	public String getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getCodBranch() {
		return codBranch;
	}
	public void setCodBranch(String codBranch) {
		this.codBranch = codBranch;
	}
	public String getCodAcctType() {
		return codAcctType;
	}
	public void setCodAcctType(String codAcctType) {
		this.codAcctType = codAcctType;
	}
	public String getTxtAcctStatus() {
		return txtAcctStatus;
	}
	public void setTxtAcctStatus(String txtAcctStatus) {
		this.txtAcctStatus = txtAcctStatus;
	}
	public String getCodAcctCurr() {
		return codAcctCurr;
	}
	public void setCodAcctCurr(String codAcctCurr) {
		this.codAcctCurr = codAcctCurr;
	}
	public String getNumBalance() {
		return numBalance;
	}
	public void setNumBalance(String numBalance) {
		this.numBalance = numBalance;
	}
	public String getNumOpenBalance() {
		return numOpenBalance;
	}
	public void setNumOpenBalance(String numOpenBalance) {
		this.numOpenBalance = numOpenBalance;
	}
	public String getDatLastUpdated() {
		return datLastUpdated;
	}
	public void setDatLastUpdated(String datLastUpdated) {
		this.datLastUpdated = datLastUpdated;
	}
	public String getNumAvailBal() {
		return numAvailBal;
	}
	public void setNumAvailBal(String numAvailBal) {
		this.numAvailBal = numAvailBal;
	}
	public String getNumUncollected() {
		return numUncollected;
	}
	public void setNumUncollected(String numUncollected) {
		this.numUncollected = numUncollected;
	}
	public String getNumAvailCredit() {
		return numAvailCredit;
	}
	public void setNumAvailCredit(String numAvailCredit) {
		this.numAvailCredit = numAvailCredit;
	}
	public String getNumMontOvCr() {
		return numMontOvCr;
	}
	public void setNumMontOvCr(String numMontOvCr) {
		this.numMontOvCr = numMontOvCr;
	}
	public String getNumMontOvDr() {
		return numMontOvDr;
	}
	public void setNumMontOvDr(String numMontOvDr) {
		this.numMontOvDr = numMontOvDr;
	}
	public String getAcctDesc() {
		return acctDesc;
	}
	public void setAcctDesc(String acctDesc) {
		this.acctDesc = acctDesc;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getAdd3() {
		return add3;
	}
	public void setAdd3(String add3) {
		this.add3 = add3;
	}
	public String getNom1() {
		return nom1;
	}
	public void setNom1(String nom1) {
		this.nom1 = nom1;
	}
	public String getNom2() {
		return nom2;
	}
	public void setNom2(String nom2) {
		this.nom2 = nom2;
	}
	public String getAdd4() {
		return add4;
	}
	public void setAdd4(String add4) {
		this.add4 = add4;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public String getPrdType() {
		return prdType;
	}
	public void setPrdType(String prdType) {
		this.prdType = prdType;
	}
	public String getAcctOpenDt() {
		return acctOpenDt;
	}
	public void setAcctOpenDt(String acctOpenDt) {
		this.acctOpenDt = acctOpenDt;
	}
	public String getOdLimit() {
		return odLimit;
	}
	public void setOdLimit(String odLimit) {
		this.odLimit = odLimit;
	}
	public String getOdStartDt() {
		return odStartDt;
	}
	public void setOdStartDt(String odStartDt) {
		this.odStartDt = odStartDt;
	}
	public String getOdEndDt() {
		return odEndDt;
	}
	public void setOdEndDt(String odEndDt) {
		this.odEndDt = odEndDt;
	}
	public String getShadowLimit() {
		return shadowLimit;
	}
	public void setShadowLimit(String shadowLimit) {
		this.shadowLimit = shadowLimit;
	}
	public String getAccrDrAmt() {
		return accrDrAmt;
	}
	public void setAccrDrAmt(String accrDrAmt) {
		this.accrDrAmt = accrDrAmt;
	}
	public String getAccrCrAmt() {
		return accrCrAmt;
	}
	public void setAccrCrAmt(String accrCrAmt) {
		this.accrCrAmt = accrCrAmt;
	}
	public String getJointAcctIndicatior() {
		return jointAcctIndicatior;
	}
	public void setJointAcctIndicatior(String jointAcctIndicatior) {
		this.jointAcctIndicatior = jointAcctIndicatior;
	}
	public String getChqBook() {
		return chqBook;
	}
	public void setChqBook(String chqBook) {
		this.chqBook = chqBook;
	}
	public String getOverDraftFecility() {
		return overDraftFecility;
	}
	public void setOverDraftFecility(String overDraftFecility) {
		this.overDraftFecility = overDraftFecility;
	}
	public String getNumStateBit() {
		return numStateBit;
	}
	public void setNumStateBit(String numStateBit) {
		this.numStateBit = numStateBit;
	}
	public String getChkName1() {
		return chkName1;
	}
	public void setChkName1(String chkName1) {
		this.chkName1 = chkName1;
	}
	public String getChkName2() {
		return chkName2;
	}
	public void setChkName2(String chkName2) {
		this.chkName2 = chkName2;
	}
	public String getAutoreOrderChkReq() {
		return autoreOrderChkReq;
	}
	public void setAutoreOrderChkReq(String autoreOrderChkReq) {
		this.autoreOrderChkReq = autoreOrderChkReq;
	}
	public String getAutoreOrderChkLvl() {
		return autoreOrderChkLvl;
	}
	public void setAutoreOrderChkLvl(String autoreOrderChkLvl) {
		this.autoreOrderChkLvl = autoreOrderChkLvl;
	}
	public String getDirtStatus() {
		return dirtStatus;
	}
	public void setDirtStatus(String dirtStatus) {
		this.dirtStatus = dirtStatus;
	}
	public String getNextCapDt() {
		return nextCapDt;
	}
	public void setNextCapDt(String nextCapDt) {
		this.nextCapDt = nextCapDt;
	}
	public String getCapFreq() {
		return capFreq;
	}
	public void setCapFreq(String capFreq) {
		this.capFreq = capFreq;
	}
	public String getAuthSignAtory() {
		return authSignAtory;
	}
	public void setAuthSignAtory(String authSignAtory) {
		this.authSignAtory = authSignAtory;
	}
	public String getAuthSignLimit() {
		return authSignLimit;
	}
	public void setAuthSignLimit(String authSignLimit) {
		this.authSignLimit = authSignLimit;
	}
	public String getSalesPerson() {
		return salesPerson;
	}
	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}
	public String getIntroducer() {
		return introducer;
	}
	public void setIntroducer(String introducer) {
		this.introducer = introducer;
	}
	public String getIbanNumber() {
		return ibanNumber;
	}
	public void setIbanNumber(String ibanNumber) {
		this.ibanNumber = ibanNumber;
	}
	public String getAcctLockFlag() {
		return acctLockFlag;
	}
	public void setAcctLockFlag(String acctLockFlag) {
		this.acctLockFlag = acctLockFlag;
	}
	public String getDebitAcctLockFlag() {
		return debitAcctLockFlag;
	}
	public void setDebitAcctLockFlag(String debitAcctLockFlag) {
		this.debitAcctLockFlag = debitAcctLockFlag;
	}
	public String getCreditAcctLockFlag() {
		return creditAcctLockFlag;
	}
	public void setCreditAcctLockFlag(String creditAcctLockFlag) {
		this.creditAcctLockFlag = creditAcctLockFlag;
	}
	public String getCrLine() {
		return crLine;
	}
	public void setCrLine(String crLine) {
		this.crLine = crLine;
	}
	public String getAvailAmt() {
		return availAmt;
	}
	public void setAvailAmt(String availAmt) {
		this.availAmt = availAmt;
	}
	public String getCrIntRate() {
		return crIntRate;
	}
	public void setCrIntRate(String crIntRate) {
		this.crIntRate = crIntRate;
	}
	public String getAlwDod() {
		return alwDod;
	}
	public void setAlwDod(String alwDod) {
		this.alwDod = alwDod;
	}
	public String getUnAlwDod() {
		return unAlwDod;
	}
	public void setUnAlwDod(String unAlwDod) {
		this.unAlwDod = unAlwDod;
	}
	public String getAcFrozen() {
		return acFrozen;
	}
	public void setAcFrozen(String acFrozen) {
		this.acFrozen = acFrozen;
	}
	public String getdTime() {
		return dTime;
	}
	public void setdTime(String dTime) {
		this.dTime = dTime;
	}
	public String getSlNo() {
		return slNo;
	}
	public void setSlNo(String slNo) {
		this.slNo = slNo;
	}
	public String getPrdCode() {
		return prdCode;
	}
	public void setPrdCode(String prdCode) {
		this.prdCode = prdCode;
	}
	public String getIlmApplicable() {
		return ilmApplicable;
	}
	public void setIlmApplicable(String ilmApplicable) {
		this.ilmApplicable = ilmApplicable;
	}
	public String getIdEntity() {
		return idEntity;
	}
	public void setIdEntity(String idEntity) {
		this.idEntity = idEntity;
	}
	public String getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}
	public String getNextDueDate() {
		return nextDueDate;
	}
	public void setNextDueDate(String nextDueDate) {
		this.nextDueDate = nextDueDate;
	}
	public String getUdf1() {
		return udf1;
	}
	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}
	public String getUdf2() {
		return udf2;
	}
	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}
	public String getUdf3() {
		return udf3;
	}
	public void setUdf3(String udf3) {
		this.udf3 = udf3;
	}
	public String getUdf4() {
		return udf4;
	}
	public void setUdf4(String udf4) {
		this.udf4 = udf4;
	}
	public String getUdf5() {
		return udf5;
	}
	public void setUdf5(String udf5) {
		this.udf5 = udf5;
	}
	public String getUdf6() {
		return udf6;
	}
	public void setUdf6(String udf6) {
		this.udf6 = udf6;
	}
	public String getUdf7() {
		return udf7;
	}
	public void setUdf7(String udf7) {
		this.udf7 = udf7;
	}
	public String getUdf8() {
		return udf8;
	}
	public void setUdf8(String udf8) {
		this.udf8 = udf8;
	}
	public String getUdf9() {
		return udf9;
	}
	public void setUdf9(String udf9) {
		this.udf9 = udf9;
	}
	public String getUdf10() {
		return udf10;
	}
	public void setUdf10(String udf10) {
		this.udf10 = udf10;
	}
	public Accountsummary(String idAccount, String idCustomer, String codBranch, String codAcctType,
			String txtAcctStatus, String codAcctCurr, String numBalance, String numOpenBalance, String datLastUpdated,
			String numAvailBal, String numUncollected, String numAvailCredit, String numMontOvCr, String numMontOvDr,
			String acctDesc, String add1, String add2, String add3, String nom1, String nom2, String add4,
			String prdName, String prdType, String acctOpenDt, String odLimit, String odStartDt, String odEndDt,
			String shadowLimit, String accrDrAmt, String accrCrAmt, String jointAcctIndicatior, String chqBook,
			String overDraftFecility, String numStateBit, String chkName1, String chkName2, String autoreOrderChkReq,
			String autoreOrderChkLvl, String dirtStatus, String nextCapDt, String capFreq, String authSignAtory,
			String authSignLimit, String salesPerson, String introducer, String ibanNumber, String acctLockFlag,
			String debitAcctLockFlag, String creditAcctLockFlag, String crLine, String availAmt, String crIntRate,
			String alwDod, String unAlwDod, String acFrozen, String dTime, String slNo, String prdCode,
			String ilmApplicable, String idEntity, String maturityDate, String nextDueDate, String udf1, String udf2,
			String udf3, String udf4, String udf5, String udf6, String udf7, String udf8, String udf9, String udf10) {
		this.idAccount = idAccount;
		this.idCustomer = idCustomer;
		this.codBranch = codBranch;
		this.codAcctType = codAcctType;
		this.txtAcctStatus = txtAcctStatus;
		this.codAcctCurr = codAcctCurr;
		this.numBalance = numBalance;
		this.numOpenBalance = numOpenBalance;
		this.datLastUpdated = datLastUpdated;
		this.numAvailBal = numAvailBal;
		this.numUncollected = numUncollected;
		this.numAvailCredit = numAvailCredit;
		this.numMontOvCr = numMontOvCr;
		this.numMontOvDr = numMontOvDr;
		this.acctDesc = acctDesc;
		this.add1 = add1;
		this.add2 = add2;
		this.add3 = add3;
		this.nom1 = nom1;
		this.nom2 = nom2;
		this.add4 = add4;
		this.prdName = prdName;
		this.prdType = prdType;
		this.acctOpenDt = acctOpenDt;
		this.odLimit = odLimit;
		this.odStartDt = odStartDt;
		this.odEndDt = odEndDt;
		this.shadowLimit = shadowLimit;
		this.accrDrAmt = accrDrAmt;
		this.accrCrAmt = accrCrAmt;
		this.jointAcctIndicatior = jointAcctIndicatior;
		this.chqBook = chqBook;
		this.overDraftFecility = overDraftFecility;
		this.numStateBit = numStateBit;
		this.chkName1 = chkName1;
		this.chkName2 = chkName2;
		this.autoreOrderChkReq = autoreOrderChkReq;
		this.autoreOrderChkLvl = autoreOrderChkLvl;
		this.dirtStatus = dirtStatus;
		this.nextCapDt = nextCapDt;
		this.capFreq = capFreq;
		this.authSignAtory = authSignAtory;
		this.authSignLimit = authSignLimit;
		this.salesPerson = salesPerson;
		this.introducer = introducer;
		this.ibanNumber = ibanNumber;
		this.acctLockFlag = acctLockFlag;
		this.debitAcctLockFlag = debitAcctLockFlag;
		this.creditAcctLockFlag = creditAcctLockFlag;
		this.crLine = crLine;
		this.availAmt = availAmt;
		this.crIntRate = crIntRate;
		this.alwDod = alwDod;
		this.unAlwDod = unAlwDod;
		this.acFrozen = acFrozen;
		this.dTime = dTime;
		this.slNo = slNo;
		this.prdCode = prdCode;
		this.ilmApplicable = ilmApplicable;
		this.idEntity = idEntity;
		this.maturityDate = maturityDate;
		this.nextDueDate = nextDueDate;
		this.udf1 = udf1;
		this.udf2 = udf2;
		this.udf3 = udf3;
		this.udf4 = udf4;
		this.udf5 = udf5;
		this.udf6 = udf6;
		this.udf7 = udf7;
		this.udf8 = udf8;
		this.udf9 = udf9;
		this.udf10 = udf10;
	}
}
