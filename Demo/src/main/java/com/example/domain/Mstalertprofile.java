package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Mstalertprofile generated by hbm2java
 */
@Entity
@Table(name="MSTALERTPROFILE"
    ,schema="FCDBADMIN_RK"
)
public class Mstalertprofile  implements java.io.Serializable {


     private String iduser;
     private String idapp;
     private Character usertype;
     private Date dateCreated;
     private String namBranch;
     private String makerid;
     private Date datMntMaker;
     private String checkerid;
     private Date datMntChecker;
     private Character flgActive;
     private String chrgRcvryAcct;
     private String custName;

    public Mstalertprofile() {
    }

	
    public Mstalertprofile(String iduser) {
        this.iduser = iduser;
    }
    public Mstalertprofile(String iduser, String idapp, Character usertype, Date dateCreated, String namBranch, String makerid, Date datMntMaker, String checkerid, Date datMntChecker, Character flgActive, String chrgRcvryAcct, String custName) {
       this.iduser = iduser;
       this.idapp = idapp;
       this.usertype = usertype;
       this.dateCreated = dateCreated;
       this.namBranch = namBranch;
       this.makerid = makerid;
       this.datMntMaker = datMntMaker;
       this.checkerid = checkerid;
       this.datMntChecker = datMntChecker;
       this.flgActive = flgActive;
       this.chrgRcvryAcct = chrgRcvryAcct;
       this.custName = custName;
    }
   
     @Id 

    
    @Column(name="IDUSER", unique=true, nullable=false, length=10)
    public String getIduser() {
        return this.iduser;
    }
    
    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    
    @Column(name="IDAPP", length=2)
    public String getIdapp() {
        return this.idapp;
    }
    
    public void setIdapp(String idapp) {
        this.idapp = idapp;
    }

    
    @Column(name="USERTYPE", length=1)
    public Character getUsertype() {
        return this.usertype;
    }
    
    public void setUsertype(Character usertype) {
        this.usertype = usertype;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_CREATED", length=7)
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    
    @Column(name="NAM_BRANCH", length=5)
    public String getNamBranch() {
        return this.namBranch;
    }
    
    public void setNamBranch(String namBranch) {
        this.namBranch = namBranch;
    }

    
    @Column(name="MAKERID", length=20)
    public String getMakerid() {
        return this.makerid;
    }
    
    public void setMakerid(String makerid) {
        this.makerid = makerid;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DAT_MNT_MAKER", length=7)
    public Date getDatMntMaker() {
        return this.datMntMaker;
    }
    
    public void setDatMntMaker(Date datMntMaker) {
        this.datMntMaker = datMntMaker;
    }

    
    @Column(name="CHECKERID", length=20)
    public String getCheckerid() {
        return this.checkerid;
    }
    
    public void setCheckerid(String checkerid) {
        this.checkerid = checkerid;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DAT_MNT_CHECKER", length=7)
    public Date getDatMntChecker() {
        return this.datMntChecker;
    }
    
    public void setDatMntChecker(Date datMntChecker) {
        this.datMntChecker = datMntChecker;
    }

    
    @Column(name="FLG_ACTIVE", length=1)
    public Character getFlgActive() {
        return this.flgActive;
    }
    
    public void setFlgActive(Character flgActive) {
        this.flgActive = flgActive;
    }

    
    @Column(name="CHRG_RCVRY_ACCT", length=20)
    public String getChrgRcvryAcct() {
        return this.chrgRcvryAcct;
    }
    
    public void setChrgRcvryAcct(String chrgRcvryAcct) {
        this.chrgRcvryAcct = chrgRcvryAcct;
    }

    
    @Column(name="CUST_NAME", length=50)
    public String getCustName() {
        return this.custName;
    }
    
    public void setCustName(String custName) {
        this.custName = custName;
    }




}


