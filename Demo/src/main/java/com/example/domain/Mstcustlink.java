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
import javax.persistence.UniqueConstraint;

/**
 * Mstcustlink generated by hbm2java
 */
@Entity
@Table(name="MSTCUSTLINK"
    ,schema="FCDBADMIN_RK"
    , uniqueConstraints = @UniqueConstraint(columnNames={"IDCUSTPRIMARY", "IDENTITYPRIMARY", "IDCUSTSECONDARY", "IDENTITYSECONDARY"}) 
)
public class Mstcustlink  implements java.io.Serializable {


     private BigDecimal idcustgroup;
     private String idcustprimary;
     private String identityprimary;
     private String idcustsecondary;
     private String identitysecondary;
     private String custdescprimary;
     private String custdescsecondary;
     private Date datcreated;
     private Date datmodified;
     private String initiator;
     private String typeuser;

    public Mstcustlink() {
    }

	
    public Mstcustlink(BigDecimal idcustgroup) {
        this.idcustgroup = idcustgroup;
    }
    public Mstcustlink(BigDecimal idcustgroup, String idcustprimary, String identityprimary, String idcustsecondary, String identitysecondary, String custdescprimary, String custdescsecondary, Date datcreated, Date datmodified, String initiator, String typeuser) {
       this.idcustgroup = idcustgroup;
       this.idcustprimary = idcustprimary;
       this.identityprimary = identityprimary;
       this.idcustsecondary = idcustsecondary;
       this.identitysecondary = identitysecondary;
       this.custdescprimary = custdescprimary;
       this.custdescsecondary = custdescsecondary;
       this.datcreated = datcreated;
       this.datmodified = datmodified;
       this.initiator = initiator;
       this.typeuser = typeuser;
    }
   
     @Id 

    
    @Column(name="IDCUSTGROUP", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdcustgroup() {
        return this.idcustgroup;
    }
    
    public void setIdcustgroup(BigDecimal idcustgroup) {
        this.idcustgroup = idcustgroup;
    }

    
    @Column(name="IDCUSTPRIMARY", length=20)
    public String getIdcustprimary() {
        return this.idcustprimary;
    }
    
    public void setIdcustprimary(String idcustprimary) {
        this.idcustprimary = idcustprimary;
    }

    
    @Column(name="IDENTITYPRIMARY", length=5)
    public String getIdentityprimary() {
        return this.identityprimary;
    }
    
    public void setIdentityprimary(String identityprimary) {
        this.identityprimary = identityprimary;
    }

    
    @Column(name="IDCUSTSECONDARY", length=20)
    public String getIdcustsecondary() {
        return this.idcustsecondary;
    }
    
    public void setIdcustsecondary(String idcustsecondary) {
        this.idcustsecondary = idcustsecondary;
    }

    
    @Column(name="IDENTITYSECONDARY", length=5)
    public String getIdentitysecondary() {
        return this.identitysecondary;
    }
    
    public void setIdentitysecondary(String identitysecondary) {
        this.identitysecondary = identitysecondary;
    }

    
    @Column(name="CUSTDESCPRIMARY", length=150)
    public String getCustdescprimary() {
        return this.custdescprimary;
    }
    
    public void setCustdescprimary(String custdescprimary) {
        this.custdescprimary = custdescprimary;
    }

    
    @Column(name="CUSTDESCSECONDARY", length=150)
    public String getCustdescsecondary() {
        return this.custdescsecondary;
    }
    
    public void setCustdescsecondary(String custdescsecondary) {
        this.custdescsecondary = custdescsecondary;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATCREATED", length=7)
    public Date getDatcreated() {
        return this.datcreated;
    }
    
    public void setDatcreated(Date datcreated) {
        this.datcreated = datcreated;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATMODIFIED", length=7)
    public Date getDatmodified() {
        return this.datmodified;
    }
    
    public void setDatmodified(Date datmodified) {
        this.datmodified = datmodified;
    }

    
    @Column(name="INITIATOR", length=50)
    public String getInitiator() {
        return this.initiator;
    }
    
    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    
    @Column(name="TYPEUSER", length=3)
    public String getTypeuser() {
        return this.typeuser;
    }
    
    public void setTypeuser(String typeuser) {
        this.typeuser = typeuser;
    }




}


