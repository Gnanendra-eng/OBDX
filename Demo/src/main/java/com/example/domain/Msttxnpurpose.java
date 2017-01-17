package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Msttxnpurpose generated by hbm2java
 */
@Entity
@Table(name="MSTTXNPURPOSE"
    ,schema="FCDBADMIN_RK"
)
public class Msttxnpurpose  implements java.io.Serializable {


     private MsttxnpurposeId id;
     private String purposedescription;

    public Msttxnpurpose() {
    }

	
    public Msttxnpurpose(MsttxnpurposeId id) {
        this.id = id;
    }
    public Msttxnpurpose(MsttxnpurposeId id, String purposedescription) {
       this.id = id;
       this.purposedescription = purposedescription;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="identity", column=@Column(name="IDENTITY", nullable=false, length=5) ), 
        @AttributeOverride(name="typeuser", column=@Column(name="TYPEUSER", nullable=false, length=3) ), 
        @AttributeOverride(name="idtxn", column=@Column(name="IDTXN", nullable=false, length=10) ), 
        @AttributeOverride(name="purposecode", column=@Column(name="PURPOSECODE", nullable=false, length=50) ) } )
    public MsttxnpurposeId getId() {
        return this.id;
    }
    
    public void setId(MsttxnpurposeId id) {
        this.id = id;
    }

    
    @Column(name="PURPOSEDESCRIPTION", length=100)
    public String getPurposedescription() {
        return this.purposedescription;
    }
    
    public void setPurposedescription(String purposedescription) {
        this.purposedescription = purposedescription;
    }




}


