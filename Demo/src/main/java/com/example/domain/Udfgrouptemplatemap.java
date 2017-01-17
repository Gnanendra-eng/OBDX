package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Udfgrouptemplatemap generated by hbm2java
 */
@Entity
@Table(name="UDFGROUPTEMPLATEMAP"
    ,schema="FCDBADMIN_RK"
)
public class Udfgrouptemplatemap  implements java.io.Serializable {


     private UdfgrouptemplatemapId id;
     private Mstusertypes mstusertypes;
     private Boolean styleid;

    public Udfgrouptemplatemap() {
    }

	
    public Udfgrouptemplatemap(UdfgrouptemplatemapId id) {
        this.id = id;
    }
    public Udfgrouptemplatemap(UdfgrouptemplatemapId id, Mstusertypes mstusertypes, Boolean styleid) {
       this.id = id;
       this.mstusertypes = mstusertypes;
       this.styleid = styleid;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idgroup", column=@Column(name="IDGROUP", nullable=false, length=40) ), 
        @AttributeOverride(name="idtemplate", column=@Column(name="IDTEMPLATE", nullable=false, length=60) ), 
        @AttributeOverride(name="idlang", column=@Column(name="IDLANG", nullable=false, length=3) ), 
        @AttributeOverride(name="iddevice", column=@Column(name="IDDEVICE", nullable=false, length=2) ) } )
    public UdfgrouptemplatemapId getId() {
        return this.id;
    }
    
    public void setId(UdfgrouptemplatemapId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TYPEUSER")
    public Mstusertypes getMstusertypes() {
        return this.mstusertypes;
    }
    
    public void setMstusertypes(Mstusertypes mstusertypes) {
        this.mstusertypes = mstusertypes;
    }

    
    @Column(name="STYLEID", precision=1, scale=0)
    public Boolean getStyleid() {
        return this.styleid;
    }
    
    public void setStyleid(Boolean styleid) {
        this.styleid = styleid;
    }




}


