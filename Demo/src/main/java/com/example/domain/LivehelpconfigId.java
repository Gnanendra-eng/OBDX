package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LivehelpconfigId generated by hbm2java
 */
@Embeddable
public class LivehelpconfigId  implements java.io.Serializable {


     private String idEntity;
     private String typeuser;
     private String idchannel;
     private String idmodule;

    public LivehelpconfigId() {
    }

    public LivehelpconfigId(String idEntity, String typeuser, String idchannel, String idmodule) {
       this.idEntity = idEntity;
       this.typeuser = typeuser;
       this.idchannel = idchannel;
       this.idmodule = idmodule;
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


    @Column(name="IDCHANNEL", nullable=false, length=2)
    public String getIdchannel() {
        return this.idchannel;
    }
    
    public void setIdchannel(String idchannel) {
        this.idchannel = idchannel;
    }


    @Column(name="IDMODULE", nullable=false, length=10)
    public String getIdmodule() {
        return this.idmodule;
    }
    
    public void setIdmodule(String idmodule) {
        this.idmodule = idmodule;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LivehelpconfigId) ) return false;
		 LivehelpconfigId castOther = ( LivehelpconfigId ) other; 
         
		 return ( (this.getIdEntity()==castOther.getIdEntity()) || ( this.getIdEntity()!=null && castOther.getIdEntity()!=null && this.getIdEntity().equals(castOther.getIdEntity()) ) )
 && ( (this.getTypeuser()==castOther.getTypeuser()) || ( this.getTypeuser()!=null && castOther.getTypeuser()!=null && this.getTypeuser().equals(castOther.getTypeuser()) ) )
 && ( (this.getIdchannel()==castOther.getIdchannel()) || ( this.getIdchannel()!=null && castOther.getIdchannel()!=null && this.getIdchannel().equals(castOther.getIdchannel()) ) )
 && ( (this.getIdmodule()==castOther.getIdmodule()) || ( this.getIdmodule()!=null && castOther.getIdmodule()!=null && this.getIdmodule().equals(castOther.getIdmodule()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEntity() == null ? 0 : this.getIdEntity().hashCode() );
         result = 37 * result + ( getTypeuser() == null ? 0 : this.getTypeuser().hashCode() );
         result = 37 * result + ( getIdchannel() == null ? 0 : this.getIdchannel().hashCode() );
         result = 37 * result + ( getIdmodule() == null ? 0 : this.getIdmodule().hashCode() );
         return result;
   }   


}


