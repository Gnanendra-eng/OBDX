/*package com.jmr.obdx.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="MCX_TXN_DATA"
    ,schema="JMR_OBDX"
)
public class McxTxnData  implements java.io.Serializable {


     private long id;
     private McxTransactionM mcxTransactionM;
     private long customerid;
     private long accountTypeId;
     private long fromaccountno;
     private String branchcod;
     private long amount;
     private long currencyCodeId;
     private Date transaferdate;
     private String status;
     private long toaccountno;
     private String note;
     private long beneficiaryId;
     private String referenceId;

    public McxTxnData() {
    }

	
    public McxTxnData(long id) {
        this.id = id;
    }
    public McxTxnData(long id, McxTransactionM mcxTransactionM, long customerid, long accountTypeId, long fromaccountno, String branchcod, long amount, long currencyCodeId, Date transaferdate, String status, long toaccountno, String note, long beneficiaryId, String referenceId) {
       this.id = id;
       this.mcxTransactionM = mcxTransactionM;
       this.customerid = customerid;
       this.accountTypeId = accountTypeId;
       this.fromaccountno = fromaccountno;
       this.branchcod = branchcod;
       this.amount = amount;
       this.currencyCodeId = currencyCodeId;
       this.transaferdate = transaferdate;
       this.status = status;
       this.toaccountno = toaccountno;
       this.note = note;
       this.beneficiaryId = beneficiaryId;
       this.referenceId = referenceId;
    }
   
    
    
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=22, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TXN_ID")
    public McxTransactionM getMcxTransactionM() {
        return this.mcxTransactionM;
    }
    
    public void setMcxTransactionM(McxTransactionM mcxTransactionM) {
        this.mcxTransactionM = mcxTransactionM;
    }

    
    @Column(name="CUSTOMERID", precision=22, scale=0)
    public long getCustomerid() {
        return this.customerid;
    }
    
    public void setCustomerid(long customerid) {
        this.customerid = customerid;
    }

    
    @Column(name="ACCOUNT_TYPE_ID", precision=22, scale=0)
    public long getAccountTypeId() {
        return this.accountTypeId;
    }
    
    public void setAccountTypeId(long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    
    @Column(name="FROMACCOUNTNO", precision=22, scale=0)
    public long getFromaccountno() {
        return this.fromaccountno;
    }
    
    public void setFromaccountno(long fromaccountno) {
        this.fromaccountno = fromaccountno;
    }

    
    @Column(name="BRANCHCOD", length=10)
    public String getBranchcod() {
        return this.branchcod;
    }
    
    public void setBranchcod(String branchcod) {
        this.branchcod = branchcod;
    }

    
    @Column(name="AMOUNT", precision=22, scale=0)
    public long getAmount() {
        return this.amount;
    }
    
    public void setAmount(long amount) {
        this.amount = amount;
    }

    
    @Column(name="CURRENCY_CODE_ID", precision=22, scale=0)
    public long getCurrencyCodeId() {
        return this.currencyCodeId;
    }
    
    public void setCurrencyCodeId(long currencyCodeId) {
        this.currencyCodeId = currencyCodeId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="TRANSAFERDATE", length=7)
    public Date getTransaferdate() {
        return this.transaferdate;
    }
    
    public void setTransaferdate(Date transaferdate) {
        this.transaferdate = transaferdate;
    }

    
    @Column(name="STATUS", length=10)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="TOACCOUNTNO", precision=22, scale=0)
    public long getToaccountno() {
        return this.toaccountno;
    }
    
    public void setToaccountno(long toaccountno) {
        this.toaccountno = toaccountno;
    }

    
    @Column(name="NOTE", length=50)
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    
    @Column(name="BENEFICIARY_ID", precision=22, scale=0)
    public long getBeneficiaryId() {
        return this.beneficiaryId;
    }
    
    public void setBeneficiaryId(long beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    
    @Column(name="REFERENCE_ID", length=150)
    public String getReferenceId() {
        return this.referenceId;
    }
    
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }




}

*/