package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entityudfrequestxref generated by hbm2java
 */
@Entity
@Table(name="ENTITYUDFREQUESTXREF"
    ,schema="FCDBADMIN_RK"
)
public class Entityudfrequestxref  implements java.io.Serializable {


     private EntityudfrequestxrefId id;

    public Entityudfrequestxref() {
    }

    public Entityudfrequestxref(EntityudfrequestxrefId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idrequest", column=@Column(name="IDREQUEST", nullable=false, length=20) ), 
        @AttributeOverride(name="idEntity", column=@Column(name="ID_ENTITY", nullable=false, length=5) ), 
        @AttributeOverride(name="idudf", column=@Column(name="IDUDF", nullable=false, length=40) ) } )
    public EntityudfrequestxrefId getId() {
        return this.id;
    }
    
    public void setId(EntityudfrequestxrefId id) {
        this.id = id;
    }




}


