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
@Table(name = "MCX_VW_LOAN_ACCOUNT", schema = "JMR_OBDX")
public class LoanAccount_old implements java.io.Serializable {

	private String codProdCateg;
	private String idCust;
	private String idAccount;
	private String codAcctType;
	private String moduleCode;
	private String codBranch;
	private String codCurrency;
	private BigDecimal amountFinanced;
	private Date maturityDate;
	private String codProduct;
	private String productDesc;
	private BigDecimal netPrincipal;
	private Date bookDate;
	private Date valueDate;
	private Date orgStartDate;
	private String primaryApplicantName;
	private String userRefNo;
	private String acctStatus;
	private String userDefinedStatus;
	private String chqBook;
	private BigDecimal amountDisbursed;
	private BigDecimal tenorMonths;
	private String leaseType;
	private BigDecimal staffFinance;
	private String billRefNo;
	private BigDecimal bankSharePercent;
	private BigDecimal custSharePercent;
	private Short suppGracePeriod;
	private Short custGracePeriod;
	private String altAcNo;
	private String suppFrequencyUnit;
	private String custFrequencyUnit;
	private String leasePaymentMode;
	private BigDecimal installments;
	private BigDecimal outstandingBal;
	private String topupFlag;

	
	public LoanAccount_old(String codProdCateg, String idCust, String idAccount, String codAcctType, String moduleCode,
			String codBranch, String codCurrency, BigDecimal amountFinanced, Date maturityDate, String codProduct,
			String productDesc, BigDecimal netPrincipal, Date bookDate, Date valueDate, Date orgStartDate,
			String primaryApplicantName, String userRefNo, String acctStatus, String userDefinedStatus, String chqBook,
			BigDecimal amountDisbursed, BigDecimal tenorMonths, String leaseType, BigDecimal staffFinance,
			String billRefNo, BigDecimal bankSharePercent, BigDecimal custSharePercent, Short suppGracePeriod,
			Short custGracePeriod, String altAcNo, String suppFrequencyUnit, String custFrequencyUnit,
			String leasePaymentMode, BigDecimal installments, BigDecimal outstandingBal, String topupFlag) {
		super();
		this.codProdCateg = codProdCateg;
		this.idCust = idCust;
		this.idAccount = idAccount;
		this.codAcctType = codAcctType;
		this.moduleCode = moduleCode;
		this.codBranch = codBranch;
		this.codCurrency = codCurrency;
		this.amountFinanced = amountFinanced;
		this.maturityDate = maturityDate;
		this.codProduct = codProduct;
		this.productDesc = productDesc;
		this.netPrincipal = netPrincipal;
		this.bookDate = bookDate;
		this.valueDate = valueDate;
		this.orgStartDate = orgStartDate;
		this.primaryApplicantName = primaryApplicantName;
		this.userRefNo = userRefNo;
		this.acctStatus = acctStatus;
		this.userDefinedStatus = userDefinedStatus;
		this.amountDisbursed = amountDisbursed;
		this.tenorMonths = tenorMonths;
		this.leaseType = leaseType;
		this.staffFinance = staffFinance;
		this.billRefNo = billRefNo;
		this.bankSharePercent = bankSharePercent;
		this.custSharePercent = custSharePercent;
		this.suppGracePeriod = suppGracePeriod;
		this.custGracePeriod = custGracePeriod;
		this.altAcNo = altAcNo;
		this.suppFrequencyUnit = suppFrequencyUnit;
		this.custFrequencyUnit = custFrequencyUnit;
		this.leasePaymentMode = leasePaymentMode;
		this.installments = installments;
		this.outstandingBal = outstandingBal;
		this.topupFlag = topupFlag;
	}

	@Column(name = "COD_PROD_CATEG")
	public String getCodProdCateg() {
		return this.codProdCateg;
	}

	public LoanAccount_old() {
		// TODO Auto-generated constructor stub
	}

	public void setCodProdCateg(String codProdCateg) {
		this.codProdCateg = codProdCateg;
	}

	@Id
	@Column(name = "IDCUST")
	public String getIdCust() {
		return this.idCust;
	}

	public void setIdCust(String idCust) {
		this.idCust = idCust;
	}

	@Column(name = "IDACCOUNT")
	public String getIdAccount() {
		return this.idAccount;
	}

	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}

	@Column(name = "CODACCTTYPE")
	public String getCodAcctType() {
		return this.codAcctType;
	}

	public void setCodAcctType(String codAcctType) {
		this.codAcctType = codAcctType;
	}

	@Column(name = "MODULE_CODE")
	public String getModuleCode() {
		return this.moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	@Column(name = "CODBRANCH")
	public String getCodBranch() {
		return this.codBranch;
	}

	public void setCodBranch(String codBranch) {
		this.codBranch = codBranch;
	}

	@Column(name = "CODCURRENCY")
	public String getCodCurrency() {
		return this.codCurrency;
	}

	public void setCodCurrency(String codCurrency) {
		this.codCurrency = codCurrency;
	}

	@Column(name = "AMOUNTFINANCED")
	public BigDecimal getAmountFinanced() {
		return this.amountFinanced;
	}

	public void setAmountFinanced(BigDecimal amountFinanced) {
		this.amountFinanced = amountFinanced;
	}

	@Column(name = "MATURITYDATE")
	public Date getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	@Column(name = "CODPRODUCT")
	public String getCodProduct() {
		return this.codProduct;
	}

	public void setCodProduct(String codProduct) {
		this.codProduct = codProduct;
	}

	@Column(name = "PRODUCTDESC")
	public String getProductDesc() {
		return this.productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	@Column(name = "NETPRINCIPAL")
	public BigDecimal getNetPrincipal() {
		return this.netPrincipal;
	}

	public void setNetPrincipal(BigDecimal netPrincipal) {
		this.netPrincipal = netPrincipal;
	}

	@Column(name = "BOOKDATE")
	public Date getBookDate() {
		return this.bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	@Column(name = "VALUEDATE")
	public Date getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	@Column(name = "ORGSTARTDATE")
	public Date getOrgStartDate() {
		return this.orgStartDate;
	}

	public void setOrgStartDate(Date orgStartDate) {
		this.orgStartDate = orgStartDate;
	}

	@Column(name = "PRIMARYAPPLICANTNAME")
	public String getPrimaryApplicantName() {
		return this.primaryApplicantName;
	}

	public void setPrimaryApplicantName(String primaryApplicantName) {
		this.primaryApplicantName = primaryApplicantName;
	}

	@Column(name = "USERREFNO")
	public String getUserRefNo() {
		return this.userRefNo;
	}

	public void setUserRefNo(String userRefNo) {
		this.userRefNo = userRefNo;
	}

	@Column(name = "ACCTSTATUS")
	public String getAcctStatus() {
		return this.acctStatus;
	}

	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}

	@Column(name = "USERDEFINEDSTATUS")
	public String getUserDefinedStatus() {
		return this.userDefinedStatus;
	}

	public void setUserDefinedStatus(String userDefinedStatus) {
		this.userDefinedStatus = userDefinedStatus;
	}

	@Column(name = "CHQBOOK")
	public String getChqBook() {
		return this.chqBook;
	}

	public void setChqBook(String chqBook) {
		this.chqBook = chqBook;
	}

	@Column(name = "AMOUNT_DISBURSED")
	public BigDecimal getAmountDisbursed() {
		return this.amountDisbursed;
	}

	public void setAmountDisbursed(BigDecimal amountDisbursed) {
		this.amountDisbursed = amountDisbursed;
	}

	@Column(name = "TENORMONTHS")
	public BigDecimal getTenorMonths() {
		return this.tenorMonths;
	}

	public void setTenorMonths(BigDecimal tenorMonths) {
		this.tenorMonths = tenorMonths;
	}

	@Column(name = "LEASE_TYPE")
	public String getLeaseType() {
		return this.leaseType;
	}

	public void setLeaseType(String leaseType) {
		this.leaseType = leaseType;
	}

	@Column(name = "STAFF_FINANCE")
	public BigDecimal getStaffFinance() {
		return this.staffFinance;
	}

	public void setStaffFinance(BigDecimal staffFinance) {
		this.staffFinance = staffFinance;
	}

	@Column(name = "BILL_REF_NO")
	public String getBillRefNo() {
		return this.billRefNo;
	}

	public void setBillRefNo(String billRefNo) {
		this.billRefNo = billRefNo;
	}

	@Column(name = "BANK_SHARE_PERCENT")
	public BigDecimal getBankSharePercent() {
		return this.bankSharePercent;
	}

	public void setBankSharePercent(BigDecimal bankSharePercent) {
		this.bankSharePercent = bankSharePercent;
	}

	@Column(name = "CUST_SHARE_PERCENT")
	public BigDecimal getCustSharePercent() {
		return this.custSharePercent;
	}

	public void setCustSharePercent(BigDecimal custSharePercent) {
		this.custSharePercent = custSharePercent;
	}

	@Column(name = "SUPP_GRACE_PERIOD")
	public Short getSuppGracePeriod() {
		return this.suppGracePeriod;
	}

	public void setSuppGracePeriod(Short suppGracePeriod) {
		this.suppGracePeriod = suppGracePeriod;
	}

	@Column(name = "CUST_GRACE_PERIOD")
	public Short getCustGracePeriod() {
		return this.custGracePeriod;
	}

	public void setCustGracePeriod(Short custGracePeriod) {
		this.custGracePeriod = custGracePeriod;
	}

	@Column(name = "ALT_AC_NO")
	public String getAltAcNo() {
		return this.altAcNo;
	}

	public void setAltAcNo(String altAcNo) {
		this.altAcNo = altAcNo;
	}

	@Column(name = "SUPP_FREQUENCY_UNIT")
	public String getSuppFrequencyUnit() {
		return this.suppFrequencyUnit;
	}

	public void setSuppFrequencyUnit(String suppFrequencyUnit) {
		this.suppFrequencyUnit = suppFrequencyUnit;
	}

	@Column(name = "CUST_FREQUENCY_UNIT")
	public String getCustFrequencyUnit() {
		return this.custFrequencyUnit;
	}

	public void setCustFrequencyUnit(String custFrequencyUnit) {
		this.custFrequencyUnit = custFrequencyUnit;
	}

	@Column(name = "LEASE_PAYMENT_MODE")
	public String getLeasePaymentMode() {
		return this.leasePaymentMode;
	}

	public void setLeasePaymentMode(String leasePaymentMode) {
		this.leasePaymentMode = leasePaymentMode;
	}

	@Column(name = "INSTALLMENTS")
	public BigDecimal getInstallments() {
		return this.installments;
	}

	public void setInstallments(BigDecimal installments) {
		this.installments = installments;
	}

	@Column(name = "OUTSTANDINGBAL")
	public BigDecimal getOutstandingBal() {
		return this.outstandingBal;
	}

	public void setOutstandingBal(BigDecimal outstandingBal) {
		this.outstandingBal = outstandingBal;
	}

	@Column(name = "TOPUPFLAG")
	public String getTopupFlag() {
		return this.topupFlag;
	}

	public void setTopupFlag(String topupFlag) {
		this.topupFlag = topupFlag;
	}
}
