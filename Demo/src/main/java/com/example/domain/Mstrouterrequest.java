package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Mstrouterrequest generated by hbm2java
 */
@Entity
@Table(name="MSTROUTERREQUEST"
    ,schema="FCDBADMIN_RK"
)
public class Mstrouterrequest  implements java.io.Serializable {


     private MstrouterrequestId id;
     private Character isenabled;
     private String description;

    public Mstrouterrequest() {
    }

	
    public Mstrouterrequest(MstrouterrequestId id) {
        this.id = id;
    }
    public Mstrouterrequest(MstrouterrequestId id, Character isenabled, String description) {
       this.id = id;
       this.isenabled = isenabled;
       this.description = description;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idrule", column=@Column(name="IDRULE", nullable=false) ), 
        @AttributeOverride(name="idrequest", column=@Column(name="IDREQUEST", nullable=false) ), 
        @AttributeOverride(name="version", column=@Column(name="VERSION", nullable=false, precision=4, scale=0) ) } )
    public MstrouterrequestId getId() {
        return this.id;
    }
    
    public void setId(MstrouterrequestId id) {
        this.id = id;
    }

    
    @Column(name="ISENABLED", length=1)
    public Character getIsenabled() {
        return this.isenabled;
    }
    
    public void setIsenabled(Character isenabled) {
        this.isenabled = isenabled;
    }

    
    @Column(name="DESCRIPTION")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


