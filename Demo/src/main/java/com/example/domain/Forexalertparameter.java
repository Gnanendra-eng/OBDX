package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Forexalertparameter generated by hbm2java
 */
@Entity
@Table(name="FOREXALERTPARAMETER"
    ,schema="FCDBADMIN_RK"
)
public class Forexalertparameter  implements java.io.Serializable {


     private BigDecimal seqnbr;
     private String idEntity;
     private String iduser;
     private String purpose;
     private String buycurrency;
     private String sellcurrency;
     private BigDecimal targetprice;
     private Date activefrom;
     private Date activeto;
     private Character status;

    public Forexalertparameter() {
    }

	
    public Forexalertparameter(BigDecimal seqnbr) {
        this.seqnbr = seqnbr;
    }
    public Forexalertparameter(BigDecimal seqnbr, String idEntity, String iduser, String purpose, String buycurrency, String sellcurrency, BigDecimal targetprice, Date activefrom, Date activeto, Character status) {
       this.seqnbr = seqnbr;
       this.idEntity = idEntity;
       this.iduser = iduser;
       this.purpose = purpose;
       this.buycurrency = buycurrency;
       this.sellcurrency = sellcurrency;
       this.targetprice = targetprice;
       this.activefrom = activefrom;
       this.activeto = activeto;
       this.status = status;
    }
   
     @Id 

    
    @Column(name="SEQNBR", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getSeqnbr() {
        return this.seqnbr;
    }
    
    public void setSeqnbr(BigDecimal seqnbr) {
        this.seqnbr = seqnbr;
    }

    
    @Column(name="ID_ENTITY", length=5)
    public String getIdEntity() {
        return this.idEntity;
    }
    
    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }

    
    @Column(name="IDUSER", length=20)
    public String getIduser() {
        return this.iduser;
    }
    
    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    
    @Column(name="PURPOSE", length=3)
    public String getPurpose() {
        return this.purpose;
    }
    
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    
    @Column(name="BUYCURRENCY", length=3)
    public String getBuycurrency() {
        return this.buycurrency;
    }
    
    public void setBuycurrency(String buycurrency) {
        this.buycurrency = buycurrency;
    }

    
    @Column(name="SELLCURRENCY", length=3)
    public String getSellcurrency() {
        return this.sellcurrency;
    }
    
    public void setSellcurrency(String sellcurrency) {
        this.sellcurrency = sellcurrency;
    }

    
    @Column(name="TARGETPRICE", precision=22, scale=0)
    public BigDecimal getTargetprice() {
        return this.targetprice;
    }
    
    public void setTargetprice(BigDecimal targetprice) {
        this.targetprice = targetprice;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ACTIVEFROM", length=7)
    public Date getActivefrom() {
        return this.activefrom;
    }
    
    public void setActivefrom(Date activefrom) {
        this.activefrom = activefrom;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ACTIVETO", length=7)
    public Date getActiveto() {
        return this.activeto;
    }
    
    public void setActiveto(Date activeto) {
        this.activeto = activeto;
    }

    
    @Column(name="STATUS", length=1)
    public Character getStatus() {
        return this.status;
    }
    
    public void setStatus(Character status) {
        this.status = status;
    }




}


