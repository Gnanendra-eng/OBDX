package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstalertchannelsId generated by hbm2java
 */
@Embeddable
public class MstalertchannelsId  implements java.io.Serializable {


     private String idalert;
     private String idnotifier;
     private String idEntity;

    public MstalertchannelsId() {
    }

    public MstalertchannelsId(String idalert, String idnotifier, String idEntity) {
       this.idalert = idalert;
       this.idnotifier = idnotifier;
       this.idEntity = idEntity;
    }
   


    @Column(name="IDALERT", nullable=false, length=50)
    public String getIdalert() {
        return this.idalert;
    }
    
    public void setIdalert(String idalert) {
        this.idalert = idalert;
    }


    @Column(name="IDNOTIFIER", nullable=false, length=50)
    public String getIdnotifier() {
        return this.idnotifier;
    }
    
    public void setIdnotifier(String idnotifier) {
        this.idnotifier = idnotifier;
    }


    @Column(name="ID_ENTITY", nullable=false, length=5)
    public String getIdEntity() {
        return this.idEntity;
    }
    
    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MstalertchannelsId) ) return false;
		 MstalertchannelsId castOther = ( MstalertchannelsId ) other; 
         
		 return ( (this.getIdalert()==castOther.getIdalert()) || ( this.getIdalert()!=null && castOther.getIdalert()!=null && this.getIdalert().equals(castOther.getIdalert()) ) )
 && ( (this.getIdnotifier()==castOther.getIdnotifier()) || ( this.getIdnotifier()!=null && castOther.getIdnotifier()!=null && this.getIdnotifier().equals(castOther.getIdnotifier()) ) )
 && ( (this.getIdEntity()==castOther.getIdEntity()) || ( this.getIdEntity()!=null && castOther.getIdEntity()!=null && this.getIdEntity().equals(castOther.getIdEntity()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdalert() == null ? 0 : this.getIdalert().hashCode() );
         result = 37 * result + ( getIdnotifier() == null ? 0 : this.getIdnotifier().hashCode() );
         result = 37 * result + ( getIdEntity() == null ? 0 : this.getIdEntity().hashCode() );
         return result;
   }   


}


