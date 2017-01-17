package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OrigAppOfflineProcess generated by hbm2java
 */
@Entity
@Table(name="ORIG_APP_OFFLINE_PROCESS"
    ,schema="FCDBADMIN_RK"
)
public class OrigAppOfflineProcess  implements java.io.Serializable {


     private BigDecimal idseq;
     private String idfcatref;
     private Blob requestblob;
     private String servicename;
     private BigDecimal serviceversion;

    public OrigAppOfflineProcess() {
    }

	
    public OrigAppOfflineProcess(BigDecimal idseq) {
        this.idseq = idseq;
    }
    public OrigAppOfflineProcess(BigDecimal idseq, String idfcatref, Blob requestblob, String servicename, BigDecimal serviceversion) {
       this.idseq = idseq;
       this.idfcatref = idfcatref;
       this.requestblob = requestblob;
       this.servicename = servicename;
       this.serviceversion = serviceversion;
    }
   
     @Id 

    
    @Column(name="IDSEQ", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdseq() {
        return this.idseq;
    }
    
    public void setIdseq(BigDecimal idseq) {
        this.idseq = idseq;
    }

    
    @Column(name="IDFCATREF", length=35)
    public String getIdfcatref() {
        return this.idfcatref;
    }
    
    public void setIdfcatref(String idfcatref) {
        this.idfcatref = idfcatref;
    }

    
    @Column(name="REQUESTBLOB")
    public Blob getRequestblob() {
        return this.requestblob;
    }
    
    public void setRequestblob(Blob requestblob) {
        this.requestblob = requestblob;
    }

    
    @Column(name="SERVICENAME")
    public String getServicename() {
        return this.servicename;
    }
    
    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    
    @Column(name="SERVICEVERSION", precision=22, scale=0)
    public BigDecimal getServiceversion() {
        return this.serviceversion;
    }
    
    public void setServiceversion(BigDecimal serviceversion) {
        this.serviceversion = serviceversion;
    }




}


