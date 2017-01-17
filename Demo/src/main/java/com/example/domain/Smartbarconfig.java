package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Smartbarconfig generated by hbm2java
 */
@Entity
@Table(name="SMARTBARCONFIG"
    ,schema="FCDBADMIN_RK"
)
public class Smartbarconfig  implements java.io.Serializable {


     private SmartbarconfigId id;
     private Character isexpanded;

    public Smartbarconfig() {
    }

	
    public Smartbarconfig(SmartbarconfigId id) {
        this.id = id;
    }
    public Smartbarconfig(SmartbarconfigId id, Character isexpanded) {
       this.id = id;
       this.isexpanded = isexpanded;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idEntity", column=@Column(name="ID_ENTITY", nullable=false, length=5) ), 
        @AttributeOverride(name="usertype", column=@Column(name="USERTYPE", nullable=false, length=3) ), 
        @AttributeOverride(name="idChannel", column=@Column(name="ID_CHANNEL", nullable=false, length=2) ), 
        @AttributeOverride(name="idrequest", column=@Column(name="IDREQUEST", nullable=false, length=50) ) } )
    public SmartbarconfigId getId() {
        return this.id;
    }
    
    public void setId(SmartbarconfigId id) {
        this.id = id;
    }

    
    @Column(name="ISEXPANDED", length=1)
    public Character getIsexpanded() {
        return this.isexpanded;
    }
    
    public void setIsexpanded(Character isexpanded) {
        this.isexpanded = isexpanded;
    }




}


