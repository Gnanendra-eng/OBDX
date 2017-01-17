package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IsRuleDataId generated by hbm2java
 */
@Embeddable
public class IsRuleDataId  implements java.io.Serializable {


     private String idEntity;
     private String idrequest;
     private String numsequence;
     private String idrule;
     private byte rulesequence;

    public IsRuleDataId() {
    }

    public IsRuleDataId(String idEntity, String idrequest, String numsequence, String idrule, byte rulesequence) {
       this.idEntity = idEntity;
       this.idrequest = idrequest;
       this.numsequence = numsequence;
       this.idrule = idrule;
       this.rulesequence = rulesequence;
    }
   


    @Column(name="ID_ENTITY", nullable=false, length=5)
    public String getIdEntity() {
        return this.idEntity;
    }
    
    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }


    @Column(name="IDREQUEST", nullable=false, length=7)
    public String getIdrequest() {
        return this.idrequest;
    }
    
    public void setIdrequest(String idrequest) {
        this.idrequest = idrequest;
    }


    @Column(name="NUMSEQUENCE", nullable=false, length=2)
    public String getNumsequence() {
        return this.numsequence;
    }
    
    public void setNumsequence(String numsequence) {
        this.numsequence = numsequence;
    }


    @Column(name="IDRULE", nullable=false, length=30)
    public String getIdrule() {
        return this.idrule;
    }
    
    public void setIdrule(String idrule) {
        this.idrule = idrule;
    }


    @Column(name="RULESEQUENCE", nullable=false, precision=2, scale=0)
    public byte getRulesequence() {
        return this.rulesequence;
    }
    
    public void setRulesequence(byte rulesequence) {
        this.rulesequence = rulesequence;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof IsRuleDataId) ) return false;
		 IsRuleDataId castOther = ( IsRuleDataId ) other; 
         
		 return ( (this.getIdEntity()==castOther.getIdEntity()) || ( this.getIdEntity()!=null && castOther.getIdEntity()!=null && this.getIdEntity().equals(castOther.getIdEntity()) ) )
 && ( (this.getIdrequest()==castOther.getIdrequest()) || ( this.getIdrequest()!=null && castOther.getIdrequest()!=null && this.getIdrequest().equals(castOther.getIdrequest()) ) )
 && ( (this.getNumsequence()==castOther.getNumsequence()) || ( this.getNumsequence()!=null && castOther.getNumsequence()!=null && this.getNumsequence().equals(castOther.getNumsequence()) ) )
 && ( (this.getIdrule()==castOther.getIdrule()) || ( this.getIdrule()!=null && castOther.getIdrule()!=null && this.getIdrule().equals(castOther.getIdrule()) ) )
 && (this.getRulesequence()==castOther.getRulesequence());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEntity() == null ? 0 : this.getIdEntity().hashCode() );
         result = 37 * result + ( getIdrequest() == null ? 0 : this.getIdrequest().hashCode() );
         result = 37 * result + ( getNumsequence() == null ? 0 : this.getNumsequence().hashCode() );
         result = 37 * result + ( getIdrule() == null ? 0 : this.getIdrule().hashCode() );
         result = 37 * result + this.getRulesequence();
         return result;
   }   


}


