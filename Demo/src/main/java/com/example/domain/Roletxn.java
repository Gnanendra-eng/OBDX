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
 * Roletxn generated by hbm2java
 */
@Entity
@Table(name="ROLETXN"
    ,schema="FCDBADMIN_RK"
)
public class Roletxn  implements java.io.Serializable {


     private RoletxnId id;
     private Msttxn msttxn;
     private String flginit;
     private String flgauth;
     private String flgview;
     private String selectedPrivileges;

    public Roletxn() {
    }

	
    public Roletxn(RoletxnId id, Msttxn msttxn) {
        this.id = id;
        this.msttxn = msttxn;
    }
    public Roletxn(RoletxnId id, Msttxn msttxn, String flginit, String flgauth, String flgview, String selectedPrivileges) {
       this.id = id;
       this.msttxn = msttxn;
       this.flginit = flginit;
       this.flgauth = flgauth;
       this.flgview = flgview;
       this.selectedPrivileges = selectedPrivileges;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idrole", column=@Column(name="IDROLE", nullable=false, length=20) ), 
        @AttributeOverride(name="idtxn", column=@Column(name="IDTXN", nullable=false, length=3) ) } )
    public RoletxnId getId() {
        return this.id;
    }
    
    public void setId(RoletxnId id) {
        this.id = id;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDTXN", nullable=false, insertable=false, updatable=false)
    public Msttxn getMsttxn() {
        return this.msttxn;
    }
    
    public void setMsttxn(Msttxn msttxn) {
        this.msttxn = msttxn;
    }

    
    @Column(name="FLGINIT", length=1)
    public String getFlginit() {
        return this.flginit;
    }
    
    public void setFlginit(String flginit) {
        this.flginit = flginit;
    }

    
    @Column(name="FLGAUTH", length=1)
    public String getFlgauth() {
        return this.flgauth;
    }
    
    public void setFlgauth(String flgauth) {
        this.flgauth = flgauth;
    }

    
    @Column(name="FLGVIEW", length=1)
    public String getFlgview() {
        return this.flgview;
    }
    
    public void setFlgview(String flgview) {
        this.flgview = flgview;
    }

    
    @Column(name="SELECTED_PRIVILEGES", length=20)
    public String getSelectedPrivileges() {
        return this.selectedPrivileges;
    }
    
    public void setSelectedPrivileges(String selectedPrivileges) {
        this.selectedPrivileges = selectedPrivileges;
    }




}


