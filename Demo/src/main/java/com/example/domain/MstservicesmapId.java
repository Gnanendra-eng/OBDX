package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstservicesmapId generated by hbm2java
 */
@Embeddable
public class MstservicesmapId  implements java.io.Serializable {


     private String idEntity;
     private String typeuser;
     private String namservice;
     private BigDecimal inputversion;
     private BigDecimal outputversion;

    public MstservicesmapId() {
    }

    public MstservicesmapId(String idEntity, String typeuser, String namservice, BigDecimal inputversion, BigDecimal outputversion) {
       this.idEntity = idEntity;
       this.typeuser = typeuser;
       this.namservice = namservice;
       this.inputversion = inputversion;
       this.outputversion = outputversion;
    }
   


    @Column(name="ID_ENTITY", nullable=false, length=5)
    public String getIdEntity() {
        return this.idEntity;
    }
    
    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }


    @Column(name="TYPEUSER", nullable=false, length=3)
    public String getTypeuser() {
        return this.typeuser;
    }
    
    public void setTypeuser(String typeuser) {
        this.typeuser = typeuser;
    }


    @Column(name="NAMSERVICE", nullable=false)
    public String getNamservice() {
        return this.namservice;
    }
    
    public void setNamservice(String namservice) {
        this.namservice = namservice;
    }


    @Column(name="INPUTVERSION", nullable=false, precision=22, scale=0)
    public BigDecimal getInputversion() {
        return this.inputversion;
    }
    
    public void setInputversion(BigDecimal inputversion) {
        this.inputversion = inputversion;
    }


    @Column(name="OUTPUTVERSION", nullable=false, precision=22, scale=0)
    public BigDecimal getOutputversion() {
        return this.outputversion;
    }
    
    public void setOutputversion(BigDecimal outputversion) {
        this.outputversion = outputversion;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MstservicesmapId) ) return false;
		 MstservicesmapId castOther = ( MstservicesmapId ) other; 
         
		 return ( (this.getIdEntity()==castOther.getIdEntity()) || ( this.getIdEntity()!=null && castOther.getIdEntity()!=null && this.getIdEntity().equals(castOther.getIdEntity()) ) )
 && ( (this.getTypeuser()==castOther.getTypeuser()) || ( this.getTypeuser()!=null && castOther.getTypeuser()!=null && this.getTypeuser().equals(castOther.getTypeuser()) ) )
 && ( (this.getNamservice()==castOther.getNamservice()) || ( this.getNamservice()!=null && castOther.getNamservice()!=null && this.getNamservice().equals(castOther.getNamservice()) ) )
 && ( (this.getInputversion()==castOther.getInputversion()) || ( this.getInputversion()!=null && castOther.getInputversion()!=null && this.getInputversion().equals(castOther.getInputversion()) ) )
 && ( (this.getOutputversion()==castOther.getOutputversion()) || ( this.getOutputversion()!=null && castOther.getOutputversion()!=null && this.getOutputversion().equals(castOther.getOutputversion()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEntity() == null ? 0 : this.getIdEntity().hashCode() );
         result = 37 * result + ( getTypeuser() == null ? 0 : this.getTypeuser().hashCode() );
         result = 37 * result + ( getNamservice() == null ? 0 : this.getNamservice().hashCode() );
         result = 37 * result + ( getInputversion() == null ? 0 : this.getInputversion().hashCode() );
         result = 37 * result + ( getOutputversion() == null ? 0 : this.getOutputversion().hashCode() );
         return result;
   }   


}


