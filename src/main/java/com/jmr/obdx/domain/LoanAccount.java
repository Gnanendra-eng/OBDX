package com.jmr.obdx.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.annotation.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
import org.springframework.web.context.annotation.SessionScope;

@ManagedBean
@SessionScope
@Entity
@Immutable
@Table(name = "VW_LOAN_ACCOUNT", schema = "JMR_OBDX")
public class LoanAccount implements java.io.Serializable {

	private String codProdCateg;
	private String idcust;
	private String idaccount;
	private String codaccttype;
	private String moduleCode;
	private String codbranch;
	private String codcurrency;
	private BigDecimal amountfinanced;
	private Date maturitydate;
	private String codproduct;
	private String productdesc;
	private BigDecimal netprincipal;
	private Date bookdate;
	private Date valuedate;
	private Date orgstartdate;
	private String primaryapplicantname;
	private String userrefno;
	private String acctstatus;
	private String userdefinedstatus;
	private String chqbook;
	private BigDecimal amountDisbursed;
	private BigDecimal tenormonths;
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
	private BigDecimal outstandingbal;
	private String topupflag;

	public LoanAccount(String codProdCateg, String idcust, String idaccount, String codaccttype, String moduleCode,
			String codbranch, String codcurrency, BigDecimal amountfinanced, Date maturitydate, String codproduct,
			String productdesc, BigDecimal netprincipal, Date bookdate, Date valuedate, Date orgstartdate,
			String primaryapplicantname, String userrefno, String acctstatus, String userdefinedstatus, String chqbook,
			BigDecimal amountDisbursed, BigDecimal tenormonths, String leaseType, BigDecimal staffFinance,
			String billRefNo, BigDecimal bankSharePercent, BigDecimal custSharePercent, Short suppGracePeriod,
			Short custGracePeriod, String altAcNo, String suppFrequencyUnit, String custFrequencyUnit,
			String leasePaymentMode, BigDecimal installments, BigDecimal outstandingbal, String topupflag) {
		this.codProdCateg = codProdCateg;
		this.idcust = idcust;
		this.idaccount = idaccount;
		this.codaccttype = codaccttype;
		this.moduleCode = moduleCode;
		this.codbranch = codbranch;
		this.codcurrency = codcurrency;
		this.amountfinanced = amountfinanced;
		this.maturitydate = maturitydate;
		this.codproduct = codproduct;
		this.productdesc = productdesc;
		this.netprincipal = netprincipal;
		this.bookdate = bookdate;
		this.valuedate = valuedate;
		this.orgstartdate = orgstartdate;
		this.primaryapplicantname = primaryapplicantname;
		this.userrefno = userrefno;
		this.acctstatus = acctstatus;
		this.userdefinedstatus = userdefinedstatus;
		this.chqbook = chqbook;
		this.amountDisbursed = amountDisbursed;
		this.tenormonths = tenormonths;
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
		this.outstandingbal = outstandingbal;
		this.topupflag = topupflag;
	}

	@Column(name = "COD_PROD_CATEG")
	public String getCodProdCateg() {
		return this.codProdCateg;
	}

	public LoanAccount() {
		// TODO Auto-generated constructor stub
	}

	public void setCodProdCateg(String codProdCateg) {
		this.codProdCateg = codProdCateg;
	}

	@Id
	@Column(name = "IDCUST")
	public String getIdcust() {
		return this.idcust;
	}

	public void setIdcust(String idcust) {
		this.idcust = idcust;
	}

	@Column(name = "IDACCOUNT")
	public String getIdaccount() {
		return this.idaccount;
	}

	public void setIdaccount(String idaccount) {
		this.idaccount = idaccount;
	}

	@Column(name = "CODACCTTYPE")
	public String getCodaccttype() {
		return this.codaccttype;
	}

	public void setCodaccttype(String codaccttype) {
		this.codaccttype = codaccttype;
	}

	@Column(name = "MODULE_CODE")
	public String getModuleCode() {
		return this.moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	@Column(name = "CODBRANCH")
	public String getCodbranch() {
		return this.codbranch;
	}

	public void setCodbranch(String codbranch) {
		this.codbranch = codbranch;
	}

	@Column(name = "CODCURRENCY")
	public String getCodcurrency() {
		return this.codcurrency;
	}

	public void setCodcurrency(String codcurrency) {
		this.codcurrency = codcurrency;
	}

	@Column(name = "AMOUNTFINANCED")
	public BigDecimal getAmountfinanced() {
		return this.amountfinanced;
	}

	public void setAmountfinanced(BigDecimal amountfinanced) {
		this.amountfinanced = amountfinanced;
	}

	@Column(name = "MATURITYDATE")
	public Date getMaturitydate() {
		return this.maturitydate;
	}

	public void setMaturitydate(Date maturitydate) {
		this.maturitydate = maturitydate;
	}

	@Column(name = "CODPRODUCT")
	public String getCodproduct() {
		return this.codproduct;
	}

	public void setCodproduct(String codproduct) {
		this.codproduct = codproduct;
	}

	@Column(name = "PRODUCTDESC")
	public String getProductdesc() {
		return this.productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}

	@Column(name = "NETPRINCIPAL")
	public BigDecimal getNetprincipal() {
		return this.netprincipal;
	}

	public void setNetprincipal(BigDecimal netprincipal) {
		this.netprincipal = netprincipal;
	}

	@Column(name = "BOOKDATE")
	public Date getBookdate() {
		return this.bookdate;
	}

	public void setBookdate(Date bookdate) {
		this.bookdate = bookdate;
	}

	@Column(name = "VALUEDATE")
	public Date getValuedate() {
		return this.valuedate;
	}

	public void setValuedate(Date valuedate) {
		this.valuedate = valuedate;
	}

	@Column(name = "ORGSTARTDATE")
	public Date getOrgstartdate() {
		return this.orgstartdate;
	}

	public void setOrgstartdate(Date orgstartdate) {
		this.orgstartdate = orgstartdate;
	}

	@Column(name = "PRIMARYAPPLICANTNAME")
	public String getPrimaryapplicantname() {
		return this.primaryapplicantname;
	}

	public void setPrimaryapplicantname(String primaryapplicantname) {
		this.primaryapplicantname = primaryapplicantname;
	}

	@Column(name = "USERREFNO")
	public String getUserrefno() {
		return this.userrefno;
	}

	public void setUserrefno(String userrefno) {
		this.userrefno = userrefno;
	}

	@Column(name = "ACCTSTATUS")
	public String getAcctstatus() {
		return this.acctstatus;
	}

	public void setAcctstatus(String acctstatus) {
		this.acctstatus = acctstatus;
	}

	@Column(name = "USERDEFINEDSTATUS")
	public String getUserdefinedstatus() {
		return this.userdefinedstatus;
	}

	public void setUserdefinedstatus(String userdefinedstatus) {
		this.userdefinedstatus = userdefinedstatus;
	}

	@Column(name = "CHQBOOK")
	public String getChqbook() {
		return this.chqbook;
	}

	public void setChqbook(String chqbook) {
		this.chqbook = chqbook;
	}

	@Column(name = "AMOUNT_DISBURSED")
	public BigDecimal getAmountDisbursed() {
		return this.amountDisbursed;
	}

	public void setAmountDisbursed(BigDecimal amountDisbursed) {
		this.amountDisbursed = amountDisbursed;
	}

	@Column(name = "TENORMONTHS")
	public BigDecimal getTenormonths() {
		return this.tenormonths;
	}

	public void setTenormonths(BigDecimal tenormonths) {
		this.tenormonths = tenormonths;
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
	public BigDecimal getOutstandingbal() {
		return this.outstandingbal;
	}

	public void setOutstandingbal(BigDecimal outstandingbal) {
		this.outstandingbal = outstandingbal;
	}

	@Column(name = "TOPUPFLAG")
	public String getTopupflag() {
		return this.topupflag;
	}

	public void setTopupflag(String topupflag) {
		this.topupflag = topupflag;
	}
}
