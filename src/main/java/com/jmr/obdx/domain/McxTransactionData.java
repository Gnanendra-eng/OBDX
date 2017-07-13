package com.jmr.obdx.domain;

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
     private String status;
     private String note;
     private String referenceId;
     private long refTransactionId;
     private Set<McxAuditLog> mcxAuditLogs = new HashSet<McxAuditLog>(0);

    public McxTransactionData() {
    }

	
    public McxTransactionData(long id, McxTransferPurpose mcxTransferPurpose, McxCurrencyM mcxCurrencyM, McxBiller mcxBiller, McxBeneficiary mcxBeneficiary, McxAccountTypeM mcxAccountTypeM, String customerId, String toAccountNumber, String fromAccountNumber, String toBranchCode, String fromBranchCode, String amount, Date transferDate, String status, String referenceId, long refTransactionId) {
        this.id = id;
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
        this.status = status;
        this.referenceId = referenceId;
        this.refTransactionId = refTransactionId;
    }
    public McxTransactionData(long id, McxTransferPurpose mcxTransferPurpose, McxCurrencyM mcxCurrencyM, McxBiller mcxBiller, McxBeneficiary mcxBeneficiary, McxAccountTypeM mcxAccountTypeM, String customerId, String toAccountNumber, String fromAccountNumber, String toBranchCode, String fromBranchCode, String amount, Date transferDate, String status, String note, String referenceId, long refTransactionId, Set<McxAuditLog> mcxAuditLogs) {
       this.id = id;
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
       this.status = status;
       this.note = note;
       this.referenceId = referenceId;
       this.refTransactionId = refTransactionId;
       this.mcxAuditLogs = mcxAuditLogs;
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

    
    @Column(name="STATUS", nullable=false, length=10)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
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

    
    @Column(name="REF_TRANSACTION_ID", nullable=false, precision=10, scale=0)
    public long getRefTransactionId() {
        return this.refTransactionId;
    }
    
    public void setRefTransactionId(long refTransactionId) {
        this.refTransactionId = refTransactionId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxTransactionData")
    public Set<McxAuditLog> getMcxAuditLogs() {
        return this.mcxAuditLogs;
    }
    
    public void setMcxAuditLogs(Set<McxAuditLog> mcxAuditLogs) {
        this.mcxAuditLogs = mcxAuditLogs;
    }




}


