package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Btadvicetemplate generated by hbm2java
 */
@Entity
@Table(name="BTADVICETEMPLATE"
    ,schema="FCDBADMIN_RK"
)
public class Btadvicetemplate  implements java.io.Serializable {


     private BtadvicetemplateId id;

    public Btadvicetemplate() {
    }

    public Btadvicetemplate(BtadvicetemplateId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idbttxn", column=@Column(name="IDBTTXN", nullable=false, length=2) ), 
        @AttributeOverride(name="templatename", column=@Column(name="TEMPLATENAME", nullable=false, length=35) ), 
        @AttributeOverride(name="isdefault", column=@Column(name="ISDEFAULT", nullable=false, length=1) ) } )
    public BtadvicetemplateId getId() {
        return this.id;
    }
    
    public void setId(BtadvicetemplateId id) {
        this.id = id;
    }




}


