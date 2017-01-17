package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FcatTMstbranch generated by hbm2java
 */
@Entity
@Table(name="FCAT_T_MSTBRANCH"
    ,schema="FCDBADMIN_RK"
)
public class FcatTMstbranch  implements java.io.Serializable {


     private FcatTMstbranchId id;
     private String txtbranchdesc1;
     private String txtbranchdesc2;
     private String txtbranchdesc3;
     private String nambranch;
     private String codbranchcurr;
     private Date dtime;
     private BigDecimal slno;
     private String city;
     private String state;
     private String country;
     private String swiftAddress;

    public FcatTMstbranch() {
    }

	
    public FcatTMstbranch(FcatTMstbranchId id) {
        this.id = id;
    }
    public FcatTMstbranch(FcatTMstbranchId id, String txtbranchdesc1, String txtbranchdesc2, String txtbranchdesc3, String nambranch, String codbranchcurr, Date dtime, BigDecimal slno, String city, String state, String country, String swiftAddress) {
       this.id = id;
       this.txtbranchdesc1 = txtbranchdesc1;
       this.txtbranchdesc2 = txtbranchdesc2;
       this.txtbranchdesc3 = txtbranchdesc3;
       this.nambranch = nambranch;
       this.codbranchcurr = codbranchcurr;
       this.dtime = dtime;
       this.slno = slno;
       this.city = city;
       this.state = state;
       this.country = country;
       this.swiftAddress = swiftAddress;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idEntity", column=@Column(name="ID_ENTITY", nullable=false, length=5) ), 
        @AttributeOverride(name="codbranch", column=@Column(name="CODBRANCH", nullable=false, length=5) ) } )
    public FcatTMstbranchId getId() {
        return this.id;
    }
    
    public void setId(FcatTMstbranchId id) {
        this.id = id;
    }

    
    @Column(name="TXTBRANCHDESC1", length=105)
    public String getTxtbranchdesc1() {
        return this.txtbranchdesc1;
    }
    
    public void setTxtbranchdesc1(String txtbranchdesc1) {
        this.txtbranchdesc1 = txtbranchdesc1;
    }

    
    @Column(name="TXTBRANCHDESC2", length=105)
    public String getTxtbranchdesc2() {
        return this.txtbranchdesc2;
    }
    
    public void setTxtbranchdesc2(String txtbranchdesc2) {
        this.txtbranchdesc2 = txtbranchdesc2;
    }

    
    @Column(name="TXTBRANCHDESC3", length=105)
    public String getTxtbranchdesc3() {
        return this.txtbranchdesc3;
    }
    
    public void setTxtbranchdesc3(String txtbranchdesc3) {
        this.txtbranchdesc3 = txtbranchdesc3;
    }

    
    @Column(name="NAMBRANCH", length=105)
    public String getNambranch() {
        return this.nambranch;
    }
    
    public void setNambranch(String nambranch) {
        this.nambranch = nambranch;
    }

    
    @Column(name="CODBRANCHCURR", length=3)
    public String getCodbranchcurr() {
        return this.codbranchcurr;
    }
    
    public void setCodbranchcurr(String codbranchcurr) {
        this.codbranchcurr = codbranchcurr;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DTIME", length=7)
    public Date getDtime() {
        return this.dtime;
    }
    
    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    
    @Column(name="SLNO", precision=38, scale=0)
    public BigDecimal getSlno() {
        return this.slno;
    }
    
    public void setSlno(BigDecimal slno) {
        this.slno = slno;
    }

    
    @Column(name="CITY", length=105)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="STATE", length=105)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    
    @Column(name="COUNTRY", length=105)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    
    @Column(name="SWIFT_ADDRESS", length=12)
    public String getSwiftAddress() {
        return this.swiftAddress;
    }
    
    public void setSwiftAddress(String swiftAddress) {
        this.swiftAddress = swiftAddress;
    }




}


