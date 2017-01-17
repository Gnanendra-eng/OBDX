package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstcustomerId generated by hbm2java
 */
@Embeddable
public class MstcustomerId  implements java.io.Serializable {


     private String idcust;
     private String idEntity;

    public MstcustomerId() {
    }

    public MstcustomerId(String idcust, String idEntity) {
       this.idcust = idcust;
       this.idEntity = idEntity;
    }
   


    @Column(name="IDCUST", nullable=false, length=20)
    public String getIdcust() {
        return this.idcust;
    }
    
    public void setIdcust(String idcust) {
        this.idcust = idcust;
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
		 if ( !(other instanceof MstcustomerId) ) return false;
		 MstcustomerId castOther = ( MstcustomerId ) other; 
         
		 return ( (this.getIdcust()==castOther.getIdcust()) || ( this.getIdcust()!=null && castOther.getIdcust()!=null && this.getIdcust().equals(castOther.getIdcust()) ) )
 && ( (this.getIdEntity()==castOther.getIdEntity()) || ( this.getIdEntity()!=null && castOther.getIdEntity()!=null && this.getIdEntity().equals(castOther.getIdEntity()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdcust() == null ? 0 : this.getIdcust().hashCode() );
         result = 37 * result + ( getIdEntity() == null ? 0 : this.getIdEntity().hashCode() );
         return result;
   }   


}


