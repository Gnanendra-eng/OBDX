package com.jmr.mcx.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name="MCX_TRANSACTION_DATA"
    ,schema="JMR_OBDX"
)
public class McxTransactionData  implements java.io.Serializable {

    private long id;
    private McxTransferPurpose mcxTransferPurpose;
    private McxCurrencyM mcxCurrencyM;
    private McxBiller mcxBiller;
    private McxBeneficiary mcxBeneficiary;
    private McxAccountTypeM mcxAccountTypeM;
    private String customerId;
    private String toAccountNumber;
    private String fromAccountNumber;
    private String toBranchCode;
    private String fromBranchCode;
    private String amount;
    private Date transferDate;
    private String note;
    private String referenceId;
    private Set<McxAuditLog> mcxAuditLogs = new HashSet<McxAuditLog>(0);

    public McxTransactionData() {
    }

    public McxTransactionData(long id) {
    	this.id=id;
    }

    public McxTransactionData(String  referenceId) {
    	this.referenceId=referenceId;
    }
    
    /***
     * Method for own account transfer
    
     */
    public McxTransactionData(  McxAccountTypeM mcxAccountTypeM,McxCurrencyM mcxCurrencyM, String customerId,String fromAccountNumber, String toAccountNumber, String toBranchCode, String fromBranchCode, String amount, Date transferDate, String status, String referenceId ) {
        this.mcxCurrencyM = mcxCurrencyM;
        this.mcxAccountTypeM = mcxAccountTypeM;
        this.customerId = customerId;
        this.toAccountNumber = toAccountNumber;
        this.fromAccountNumber = fromAccountNumber;
        this.toBranchCode = toBranchCode;
        this.fromBranchCode = fromBranchCode;
        this.amount = amount;
        this.transferDate = transferDate;
        this.referenceId = referenceId;
    }
    
    /***
     * Method used to paybills
     */
    public McxTransactionData( McxTransferPurpose mcxTransferPurpose, McxCurrencyM mcxCurrencyM, McxBiller mcxBiller, 
    		McxAccountTypeM mcxAccountTypeM, String customerId, String toAccountNumber, String fromAccountNumber, String toBranchCode
    		 , String amount, Date transferDate , String referenceId ) {
        this.mcxTransferPurpose = mcxTransferPurpose;
        this.mcxCurrencyM = mcxCurrencyM;
        this.mcxBiller = mcxBiller;
        this.mcxAccountTypeM = mcxAccountTypeM;
        this.customerId = customerId;
        this.toAccountNumber = toAccountNumber;
        this.fromAccountNumber = fromAccountNumber;
        this.toBranchCode = toBranchCode;
        this.amount = amount;
        this.transferDate = transferDate;
        this.referenceId = referenceId;
    }
    
    public McxTransactionData( McxTransferPurpose mcxTransferPurpose, McxCurrencyM mcxCurrencyM, McxBiller mcxBiller, McxBeneficiary mcxBeneficiary, McxAccountTypeM mcxAccountTypeM, String customerId, String toAccountNumber, String fromAccountNumber, String toBranchCode, String fromBranchCode, String amount, Date transferDate, String status, String note, String referenceId, Set<McxAuditLog> mcxAuditLogs) {
       this.mcxTransferPurpose = mcxTransferPurpose;
       this.mcxCurrencyM = mcxCurrencyM;
       this.mcxBiller = mcxBiller;
       this.mcxBeneficiary = mcxBeneficiary;
       this.mcxAccountTypeM = mcxAccountTypeM;
       this.customerId = customerId;
       this.toAccountNumber = toAccountNumber;
       this.fromAccountNumber = fromAccountNumber;
       this.toBranchCode = toBranchCode;
       this.fromBranchCode = fromBranchCode;
       this.amount = amount;
       this.transferDate = transferDate;
       this.note = note;
       this.referenceId = referenceId;
       this.mcxAuditLogs = mcxAuditLogs;
    }

/**
 * Method used for Internal Fund Transfer
 */
	public McxTransactionData(McxAccountTypeM mcxAccountTypeM,
			McxCurrencyM mcxCurrencyM, String customerId, String fromAccountNumber, String fromBranchCode,
			String toAccountNumber , String amount, Date transferDate, String string, String note,
			String referenceId, McxTransferPurpose mcxTransferPurpose, McxBeneficiary mcxBeneficiary) {
	       this.mcxAccountTypeM = mcxAccountTypeM;
	       this.mcxCurrencyM = mcxCurrencyM;
	       this.customerId = customerId;
	       this.fromAccountNumber = fromAccountNumber;
	       this.fromBranchCode = fromBranchCode;
	       this.toAccountNumber = toAccountNumber;
	       this.amount = amount;
	       this.transferDate = transferDate;
	       this.note = note;
	       this.referenceId = referenceId;
	       this.mcxTransferPurpose = mcxTransferPurpose;
	       this.mcxBeneficiary = mcxBeneficiary;
	}

	@Id 
    @Column(name="ID", unique=true, nullable=false, precision=10, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REF_TRANSFER_PURPOSE_ID", nullable=false)
    public McxTransferPurpose getMcxTransferPurpose() {
        return this.mcxTransferPurpose;
    }
    
    public void setMcxTransferPurpose(McxTransferPurpose mcxTransferPurpose) {
        this.mcxTransferPurpose = mcxTransferPurpose;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REF_CURRENCY_ID", nullable=false)
    public McxCurrencyM getMcxCurrencyM() {
        return this.mcxCurrencyM;
    }
    
    public void setMcxCurrencyM(McxCurrencyM mcxCurrencyM) {
        this.mcxCurrencyM = mcxCurrencyM;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REF_BILLER_ID", nullable=false)
    public McxBiller getMcxBiller() {
        return this.mcxBiller;
    }
    
    public void setMcxBiller(McxBiller mcxBiller) {
        this.mcxBiller = mcxBiller;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REF_BENEFICIARY_ID", nullable=false)
    public McxBeneficiary getMcxBeneficiary() {
        return this.mcxBeneficiary;
    }
    
    public void setMcxBeneficiary(McxBeneficiary mcxBeneficiary) {
        this.mcxBeneficiary = mcxBeneficiary;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REF_ACCOUNT_TYPE_ID", nullable=false)
    public McxAccountTypeM getMcxAccountTypeM() {
        return this.mcxAccountTypeM;
    }
    
    public void setMcxAccountTypeM(McxAccountTypeM mcxAccountTypeM) {
        this.mcxAccountTypeM = mcxAccountTypeM;
    }

    @Column(name="CUSTOMER_ID", nullable=false, length=150)
    public String getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    @Column(name="TO_ACCOUNT_NUMBER", nullable=false, length=150)
    public String getToAccountNumber() {
        return this.toAccountNumber;
    }
    
    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }
    
    @Column(name="FROM_ACCOUNT_NUMBER", nullable=false, length=150)
    public String getFromAccountNumber() {
        return this.fromAccountNumber;
    }
    
    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    @Column(name="TO_BRANCH_CODE", nullable=false, length=150)
    public String getToBranchCode() {
        return this.toBranchCode;
    }
    
    public void setToBranchCode(String toBranchCode) {
        this.toBranchCode = toBranchCode;
    }
    
    @Column(name="FROM_BRANCH_CODE", nullable=false, length=150)
    public String getFromBranchCode() {
        return this.fromBranchCode;
    }
    
    public void setFromBranchCode(String fromBranchCode) {
        this.fromBranchCode = fromBranchCode;
    }
    
    @Column(name="AMOUNT", nullable=false, length=150)
    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="TRANSFER_DATE", nullable=false, length=7)
    public Date getTransferDate() {
        return this.transferDate;
    }
    
    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    @Column(name="NOTE", length=500)
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    @Column(name="REFERENCE_ID", nullable=false, length=150)
    public String getReferenceId() {
        return this.referenceId;
    }
    
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="mcxTransactionData")
    public Set<McxAuditLog> getMcxAuditLogs() {
        return this.mcxAuditLogs;
    }
    
    public void setMcxAuditLogs(Set<McxAuditLog> mcxAuditLogs) {
        this.mcxAuditLogs = mcxAuditLogs;
    }
}


