package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Mstentitynetworkcodes generated by hbm2java
 */
@Entity
@Table(name="MSTENTITYNETWORKCODES"
    ,schema="FCDBADMIN_RK"
)
public class Mstentitynetworkcodes  implements java.io.Serializable {


     private MstentitynetworkcodesId id;
     private String isenabled;

    public Mstentitynetworkcodes() {
    }

	
    public Mstentitynetworkcodes(MstentitynetworkcodesId id) {
        this.id = id;
    }
    public Mstentitynetworkcodes(MstentitynetworkcodesId id, String isenabled) {
       this.id = id;
       this.isenabled = isenabled;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idEntity", column=@Column(name="ID_ENTITY", nullable=false, length=10) ), 
        @AttributeOverride(name="codDirectory", column=@Column(name="COD_DIRECTORY", nullable=false, length=10) ) } )
    public MstentitynetworkcodesId getId() {
        return this.id;
    }
    
    public void setId(MstentitynetworkcodesId id) {
        this.id = id;
    }

    
    @Column(name="ISENABLED", length=1)
    public String getIsenabled() {
        return this.isenabled;
    }
    
    public void setIsenabled(String isenabled) {
        this.isenabled = isenabled;
    }




}


