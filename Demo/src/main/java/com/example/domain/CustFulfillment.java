package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.sql.Blob;
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

/**
 * CustFulfillment generated by hbm2java
 */
@Entity
@Table(name="CUST_FULFILLMENT"
    ,schema="FCDBADMIN_RK"
)
public class CustFulfillment  implements java.io.Serializable {


     private String idreference;
     private Mstfulfillmenttypes mstfulfillmenttypes;
     private String iduser;
     private String idcustomer;
     private Date datcreated;
     private Date lastupdatedon;
     private String flgstatus;
     private Blob msgdata;
     private Date datDispatch;
     private String flgsecured;

    public CustFulfillment() {
    }

	
    public CustFulfillment(String idreference) {
        this.idreference = idreference;
    }
    public CustFulfillment(String idreference, Mstfulfillmenttypes mstfulfillmenttypes, String iduser, String idcustomer, Date datcreated, Date lastupdatedon, String flgstatus, Blob msgdata, Date datDispatch, String flgsecured) {
       this.idreference = idreference;
       this.mstfulfillmenttypes = mstfulfillmenttypes;
       this.iduser = iduser;
       this.idcustomer = idcustomer;
       this.datcreated = datcreated;
       this.lastupdatedon = lastupdatedon;
       this.flgstatus = flgstatus;
       this.msgdata = msgdata;
       this.datDispatch = datDispatch;
       this.flgsecured = flgsecured;
    }
   
     @Id 

    
    @Column(name="IDREFERENCE", unique=true, nullable=false, length=50)
    public String getIdreference() {
        return this.idreference;
    }
    
    public void setIdreference(String idreference) {
        this.idreference = idreference;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDFULFILLMENT")
    public Mstfulfillmenttypes getMstfulfillmenttypes() {
        return this.mstfulfillmenttypes;
    }
    
    public void setMstfulfillmenttypes(Mstfulfillmenttypes mstfulfillmenttypes) {
        this.mstfulfillmenttypes = mstfulfillmenttypes;
    }

    
    @Column(name="IDUSER", length=50)
    public String getIduser() {
        return this.iduser;
    }
    
    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    
    @Column(name="IDCUSTOMER", length=50)
    public String getIdcustomer() {
        return this.idcustomer;
    }
    
    public void setIdcustomer(String idcustomer) {
        this.idcustomer = idcustomer;
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
    @Column(name="LASTUPDATEDON", length=7)
    public Date getLastupdatedon() {
        return this.lastupdatedon;
    }
    
    public void setLastupdatedon(Date lastupdatedon) {
        this.lastupdatedon = lastupdatedon;
    }

    
    @Column(name="FLGSTATUS", length=5)
    public String getFlgstatus() {
        return this.flgstatus;
    }
    
    public void setFlgstatus(String flgstatus) {
        this.flgstatus = flgstatus;
    }

    
    @Column(name="MSGDATA")
    public Blob getMsgdata() {
        return this.msgdata;
    }
    
    public void setMsgdata(Blob msgdata) {
        this.msgdata = msgdata;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DAT_DISPATCH", length=7)
    public Date getDatDispatch() {
        return this.datDispatch;
    }
    
    public void setDatDispatch(Date datDispatch) {
        this.datDispatch = datDispatch;
    }

    
    @Column(name="FLGSECURED", length=1)
    public String getFlgsecured() {
        return this.flgsecured;
    }
    
    public void setFlgsecured(String flgsecured) {
        this.flgsecured = flgsecured;
    }




}


