package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Msttxnpassword generated by hbm2java
 */
@Entity
@Table(name="MSTTXNPASSWORD"
    ,schema="FCDBADMIN_RK"
)
public class Msttxnpassword  implements java.io.Serializable {


     private MsttxnpasswordId id;
     private String flgstatus;
     private BigDecimal amtLimit;
     private BigDecimal volLimit;
     private String idalert;

    public Msttxnpassword() {
    }

	
    public Msttxnpassword(MsttxnpasswordId id) {
        this.id = id;
    }
    public Msttxnpassword(MsttxnpasswordId id, String flgstatus, BigDecimal amtLimit, BigDecimal volLimit, String idalert) {
       this.id = id;
       this.flgstatus = flgstatus;
       this.amtLimit = amtLimit;
       this.volLimit = volLimit;
       this.idalert = idalert;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idEntity", column=@Column(name="ID_ENTITY", nullable=false, length=5) ), 
        @AttributeOverride(name="usertype", column=@Column(name="USERTYPE", nullable=false, length=3) ), 
        @AttributeOverride(name="idchannel", column=@Column(name="IDCHANNEL", nullable=false, length=2) ), 
        @AttributeOverride(name="idtxn", column=@Column(name="IDTXN", nullable=false, length=3) ) } )
    public MsttxnpasswordId getId() {
        return this.id;
    }
    
    public void setId(MsttxnpasswordId id) {
        this.id = id;
    }

    
    @Column(name="FLGSTATUS", length=1)
    public String getFlgstatus() {
        return this.flgstatus;
    }
    
    public void setFlgstatus(String flgstatus) {
        this.flgstatus = flgstatus;
    }

    
    @Column(name="AMT_LIMIT", precision=22, scale=0)
    public BigDecimal getAmtLimit() {
        return this.amtLimit;
    }
    
    public void setAmtLimit(BigDecimal amtLimit) {
        this.amtLimit = amtLimit;
    }

    
    @Column(name="VOL_LIMIT", precision=22, scale=0)
    public BigDecimal getVolLimit() {
        return this.volLimit;
    }
    
    public void setVolLimit(BigDecimal volLimit) {
        this.volLimit = volLimit;
    }

    
    @Column(name="IDALERT", length=50)
    public String getIdalert() {
        return this.idalert;
    }
    
    public void setIdalert(String idalert) {
        this.idalert = idalert;
    }




}


