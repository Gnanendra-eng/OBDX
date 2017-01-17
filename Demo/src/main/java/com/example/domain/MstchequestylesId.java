package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstchequestylesId generated by hbm2java
 */
@Embeddable
public class MstchequestylesId  implements java.io.Serializable {


     private String idEntity;
     private String chqstyledesc;

    public MstchequestylesId() {
    }

    public MstchequestylesId(String idEntity, String chqstyledesc) {
       this.idEntity = idEntity;
       this.chqstyledesc = chqstyledesc;
    }
   


    @Column(name="ID_ENTITY", nullable=false, length=5)
    public String getIdEntity() {
        return this.idEntity;
    }
    
    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }


    @Column(name="CHQSTYLEDESC", nullable=false)
    public String getChqstyledesc() {
        return this.chqstyledesc;
    }
    
    public void setChqstyledesc(String chqstyledesc) {
        this.chqstyledesc = chqstyledesc;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MstchequestylesId) ) return false;
		 MstchequestylesId castOther = ( MstchequestylesId ) other; 
         
		 return ( (this.getIdEntity()==castOther.getIdEntity()) || ( this.getIdEntity()!=null && castOther.getIdEntity()!=null && this.getIdEntity().equals(castOther.getIdEntity()) ) )
 && ( (this.getChqstyledesc()==castOther.getChqstyledesc()) || ( this.getChqstyledesc()!=null && castOther.getChqstyledesc()!=null && this.getChqstyledesc().equals(castOther.getChqstyledesc()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEntity() == null ? 0 : this.getIdEntity().hashCode() );
         result = 37 * result + ( getChqstyledesc() == null ? 0 : this.getChqstyledesc().hashCode() );
         return result;
   }   


}


