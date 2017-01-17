package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstgroupId generated by hbm2java
 */
@Embeddable
public class MstgroupId  implements java.io.Serializable {


     private String idEntity;
     private String idgroup;

    public MstgroupId() {
    }

    public MstgroupId(String idEntity, String idgroup) {
       this.idEntity = idEntity;
       this.idgroup = idgroup;
    }
   


    @Column(name="ID_ENTITY", nullable=false, length=5)
    public String getIdEntity() {
        return this.idEntity;
    }
    
    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }


    @Column(name="IDGROUP", nullable=false, length=20)
    public String getIdgroup() {
        return this.idgroup;
    }
    
    public void setIdgroup(String idgroup) {
        this.idgroup = idgroup;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MstgroupId) ) return false;
		 MstgroupId castOther = ( MstgroupId ) other; 
         
		 return ( (this.getIdEntity()==castOther.getIdEntity()) || ( this.getIdEntity()!=null && castOther.getIdEntity()!=null && this.getIdEntity().equals(castOther.getIdEntity()) ) )
 && ( (this.getIdgroup()==castOther.getIdgroup()) || ( this.getIdgroup()!=null && castOther.getIdgroup()!=null && this.getIdgroup().equals(castOther.getIdgroup()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEntity() == null ? 0 : this.getIdEntity().hashCode() );
         result = 37 * result + ( getIdgroup() == null ? 0 : this.getIdgroup().hashCode() );
         return result;
   }   


}


