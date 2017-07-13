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
@Table(name="MCX_BILLER"
    ,schema="JMR_OBDX"
)
public class McxBiller  implements java.io.Serializable {


     private long id;
     private McxLogin mcxLogin;
     private String billerId;
     private String referenceNumber;
     private Date registrationDate;
     private String name;
     private long refBillerOpeartorId;
     private Set<McxTransactionData> mcxTransactionDatas = new HashSet<McxTransactionData>(0);

    public McxBiller() {
    }

	
    public McxBiller(long id, McxLogin mcxLogin, String billerId, String referenceNumber, Date registrationDate, String name, long refBillerOpeartorId) {
        this.id = id;
        this.mcxLogin = mcxLogin;
        this.billerId = billerId;
        this.referenceNumber = referenceNumber;
        this.registrationDate = registrationDate;
        this.name = name;
        this.refBillerOpeartorId = refBillerOpeartorId;
    }
    public McxBiller(long id, McxLogin mcxLogin, String billerId, String referenceNumber, Date registrationDate, String name, long refBillerOpeartorId, Set<McxTransactionData> mcxTransactionDatas) {
       this.id = id;
       this.mcxLogin = mcxLogin;
       this.billerId = billerId;
       this.referenceNumber = referenceNumber;
       this.registrationDate = registrationDate;
       this.name = name;
       this.refBillerOpeartorId = refBillerOpeartorId;
       this.mcxTransactionDatas = mcxTransactionDatas;
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
    public McxLogin getMcxLogin() {
        return this.mcxLogin;
    }
    
    public void setMcxLogin(McxLogin mcxLogin) {
        this.mcxLogin = mcxLogin;
    }

    
    @Column(name="BILLER_ID", nullable=false, length=55)
    public String getBillerId() {
        return this.billerId;
    }
    
    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    
    @Column(name="REFERENCE_NUMBER", nullable=false, length=100)
    public String getReferenceNumber() {
        return this.referenceNumber;
    }
    
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="REGISTRATION_DATE", nullable=false, length=7)
    public Date getRegistrationDate() {
        return this.registrationDate;
    }
    
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    
    @Column(name="NAME", nullable=false, length=200)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="REF_BILLER_OPEARTOR_ID", nullable=false, precision=10, scale=0)
    public long getRefBillerOpeartorId() {
        return this.refBillerOpeartorId;
    }
    
    public void setRefBillerOpeartorId(long refBillerOpeartorId) {
        this.refBillerOpeartorId = refBillerOpeartorId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxBiller")
    public Set<McxTransactionData> getMcxTransactionDatas() {
        return this.mcxTransactionDatas;
    }
    
    public void setMcxTransactionDatas(Set<McxTransactionData> mcxTransactionDatas) {
        this.mcxTransactionDatas = mcxTransactionDatas;
    }




}


