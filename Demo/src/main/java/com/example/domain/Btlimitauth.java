package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Btlimitauth generated by hbm2java
 */
@Entity
@Table(name="BTLIMITAUTH"
    ,schema="FCDBADMIN_RK"
)
public class Btlimitauth  implements java.io.Serializable {


     private String btid;
     private Btcustreg btcustreg;
     private BigDecimal filelimit;
     private BigDecimal reclimit;
     private BigDecimal typeauth;
     private Character flgreleasereq;

    public Btlimitauth() {
    }

	
    public Btlimitauth(Btcustreg btcustreg) {
        this.btcustreg = btcustreg;
    }
    public Btlimitauth(Btcustreg btcustreg, BigDecimal filelimit, BigDecimal reclimit, BigDecimal typeauth, Character flgreleasereq) {
       this.btcustreg = btcustreg;
       this.filelimit = filelimit;
       this.reclimit = reclimit;
       this.typeauth = typeauth;
       this.flgreleasereq = flgreleasereq;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="btcustreg"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="BTID", unique=true, nullable=false, length=40)
    public String getBtid() {
        return this.btid;
    }
    
    public void setBtid(String btid) {
        this.btid = btid;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Btcustreg getBtcustreg() {
        return this.btcustreg;
    }
    
    public void setBtcustreg(Btcustreg btcustreg) {
        this.btcustreg = btcustreg;
    }

    
    @Column(name="FILELIMIT", precision=22, scale=0)
    public BigDecimal getFilelimit() {
        return this.filelimit;
    }
    
    public void setFilelimit(BigDecimal filelimit) {
        this.filelimit = filelimit;
    }

    
    @Column(name="RECLIMIT", precision=22, scale=0)
    public BigDecimal getReclimit() {
        return this.reclimit;
    }
    
    public void setReclimit(BigDecimal reclimit) {
        this.reclimit = reclimit;
    }

    
    @Column(name="TYPEAUTH", precision=22, scale=0)
    public BigDecimal getTypeauth() {
        return this.typeauth;
    }
    
    public void setTypeauth(BigDecimal typeauth) {
        this.typeauth = typeauth;
    }

    
    @Column(name="FLGRELEASEREQ", length=1)
    public Character getFlgreleasereq() {
        return this.flgreleasereq;
    }
    
    public void setFlgreleasereq(Character flgreleasereq) {
        this.flgreleasereq = flgreleasereq;
    }




}


