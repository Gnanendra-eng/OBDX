package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EntityUserUdf generated by hbm2java
 */
@Entity
@Table(name="ENTITY_USER_UDF"
    ,schema="FCDBADMIN_RK"
)
public class EntityUserUdf  implements java.io.Serializable {


     private EntityUserUdfId id;
     private String udfValue;

    public EntityUserUdf() {
    }

	
    public EntityUserUdf(EntityUserUdfId id) {
        this.id = id;
    }
    public EntityUserUdf(EntityUserUdfId id, String udfValue) {
       this.id = id;
       this.udfValue = udfValue;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="identity", column=@Column(name="IDENTITY", nullable=false) ), 
        @AttributeOverride(name="udfKey", column=@Column(name="UDF_KEY", nullable=false) ), 
        @AttributeOverride(name="udfName", column=@Column(name="UDF_NAME", nullable=false) ) } )
    public EntityUserUdfId getId() {
        return this.id;
    }
    
    public void setId(EntityUserUdfId id) {
        this.id = id;
    }

    
    @Column(name="UDF_VALUE")
    public String getUdfValue() {
        return this.udfValue;
    }
    
    public void setUdfValue(String udfValue) {
        this.udfValue = udfValue;
    }




}


