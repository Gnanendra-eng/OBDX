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
 * IsLkpacctcode generated by hbm2java
 */
@Entity
@Table(name="IS_LKPACCTCODE"
    ,schema="FCDBADMIN_RK"
)
public class IsLkpacctcode  implements java.io.Serializable {


     private IsLkpacctcodeId id;
     private Mstentity mstentity;

    public IsLkpacctcode() {
    }

    public IsLkpacctcode(IsLkpacctcodeId id, Mstentity mstentity) {
       this.id = id;
       this.mstentity = mstentity;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="codaccttype", column=@Column(name="CODACCTTYPE", nullable=false, length=25) ), 
        @AttributeOverride(name="idEntity", column=@Column(name="ID_ENTITY", nullable=false, length=5) ) } )
    public IsLkpacctcodeId getId() {
        return this.id;
    }
    
    public void setId(IsLkpacctcodeId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ENTITY", nullable=false, insertable=false, updatable=false)
    public Mstentity getMstentity() {
        return this.mstentity;
    }
    
    public void setMstentity(Mstentity mstentity) {
        this.mstentity = mstentity;
    }




}


