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
 * Txnblackout generated by hbm2java
 */
@Entity
@Table(name="TXNBLACKOUT"
    ,schema="FCDBADMIN_RK"
)
public class Txnblackout  implements java.io.Serializable {


     private BigDecimal idsequence;
     private String typeuser;
     private String idtxn;
     private Date startdate;
     private Integer starttime;
     private Date enddate;
     private Integer endtime;
     private Character blackoutflag;
     private String idEntity;
     private String idapp;
     private String idchannel;

    public Txnblackout() {
    }

	
    public Txnblackout(BigDecimal idsequence) {
        this.idsequence = idsequence;
    }
    public Txnblackout(BigDecimal idsequence, String typeuser, String idtxn, Date startdate, Integer starttime, Date enddate, Integer endtime, Character blackoutflag, String idEntity, String idapp, String idchannel) {
       this.idsequence = idsequence;
       this.typeuser = typeuser;
       this.idtxn = idtxn;
       this.startdate = startdate;
       this.starttime = starttime;
       this.enddate = enddate;
       this.endtime = endtime;
       this.blackoutflag = blackoutflag;
       this.idEntity = idEntity;
       this.idapp = idapp;
       this.idchannel = idchannel;
    }
   
     @Id 

    
    @Column(name="IDSEQUENCE", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdsequence() {
        return this.idsequence;
    }
    
    public void setIdsequence(BigDecimal idsequence) {
        this.idsequence = idsequence;
    }

    
    @Column(name="TYPEUSER", length=3)
    public String getTypeuser() {
        return this.typeuser;
    }
    
    public void setTypeuser(String typeuser) {
        this.typeuser = typeuser;
    }

    
    @Column(name="IDTXN", length=3)
    public String getIdtxn() {
        return this.idtxn;
    }
    
    public void setIdtxn(String idtxn) {
        this.idtxn = idtxn;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="STARTDATE", length=7)
    public Date getStartdate() {
        return this.startdate;
    }
    
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    
    @Column(name="STARTTIME", precision=6, scale=0)
    public Integer getStarttime() {
        return this.starttime;
    }
    
    public void setStarttime(Integer starttime) {
        this.starttime = starttime;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ENDDATE", length=7)
    public Date getEnddate() {
        return this.enddate;
    }
    
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    
    @Column(name="ENDTIME", precision=6, scale=0)
    public Integer getEndtime() {
        return this.endtime;
    }
    
    public void setEndtime(Integer endtime) {
        this.endtime = endtime;
    }

    
    @Column(name="BLACKOUTFLAG", length=1)
    public Character getBlackoutflag() {
        return this.blackoutflag;
    }
    
    public void setBlackoutflag(Character blackoutflag) {
        this.blackoutflag = blackoutflag;
    }

    
    @Column(name="ID_ENTITY", length=5)
    public String getIdEntity() {
        return this.idEntity;
    }
    
    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }

    
    @Column(name="IDAPP", length=2)
    public String getIdapp() {
        return this.idapp;
    }
    
    public void setIdapp(String idapp) {
        this.idapp = idapp;
    }

    
    @Column(name="IDCHANNEL", length=2)
    public String getIdchannel() {
        return this.idchannel;
    }
    
    public void setIdchannel(String idchannel) {
        this.idchannel = idchannel;
    }




}


