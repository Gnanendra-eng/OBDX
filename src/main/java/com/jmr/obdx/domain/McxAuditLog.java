package com.jmr.obdx.domain;

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


/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name="MCX_AUDIT_LOG"
    ,schema="JMR_OBDX"
)
public class McxAuditLog  implements java.io.Serializable {

     private long id;
     private McxUser mcxUser;
     private McxTransactionM mcxTransactionM;
     private McxTransactionData mcxTransactionData;
     private String status;
     private Date transactionDate;
     private String hostReferenceId;
     private byte [] requestData;
     private byte [] responseData;

    public McxAuditLog() {
    }

    public McxAuditLog(McxUser mcxUser, McxTransactionM mcxTransactionM, McxTransactionData mcxTransactionData, String status, Date transactionDate, byte [] requestData, byte [] responseData,String hostReferenceId) {
        this.mcxUser = mcxUser;
        this.mcxTransactionM = mcxTransactionM;
        this.mcxTransactionData = mcxTransactionData;
        this.status = status;
        this.transactionDate = transactionDate;
        this.requestData = requestData;
        this.responseData = responseData;
        this.hostReferenceId = hostReferenceId;

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
    @JoinColumn(name="REF_USER_ID", nullable=false)
    public McxUser getMcxUser() {
        return this.mcxUser;
    }
    
    public void setMcxUser(McxUser mcxUser) {
        this.mcxUser = mcxUser;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REF_TRANSACTION_ID", nullable=false)
    public McxTransactionM getMcxTransactionM() {
        return this.mcxTransactionM;
    }
    
    public void setMcxTransactionM(McxTransactionM mcxTransactionM) {
        this.mcxTransactionM = mcxTransactionM;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REF_TRANSACTION_DATA_ID", nullable=false)
    public McxTransactionData getMcxTransactionData() {
        return this.mcxTransactionData;
    }
    
    public void setMcxTransactionData(McxTransactionData mcxTransactionData) {
        this.mcxTransactionData = mcxTransactionData;
    }

    
    @Column(name="STATUS", nullable=false, length=5)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="TRANSACTION_DATE", nullable=false, length=7)
    public Date getTransactionDate() {
        return this.transactionDate;
    }
    
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    
    @Column(name="HOST_REFERENCE_ID", length=100)
    public String getHostReferenceId() {
        return this.hostReferenceId;
    }
    
    public void setHostReferenceId(String hostReferenceId) {
        this.hostReferenceId = hostReferenceId;
    }

    @Column(name="REQUEST_DATA", nullable=false)
    public byte [] getRequestData() {
        return this.requestData;
    }
    
    public void setRequestData(byte [] requestData) {
        this.requestData = requestData;
    }
    
    @Column(name="RESPONSE_DATA", nullable=false)
    public byte [] getResponseData() {
        return this.responseData;
    }
    
    public void setResponseData(byte [] responseData) {
        this.responseData = responseData;
    }
}