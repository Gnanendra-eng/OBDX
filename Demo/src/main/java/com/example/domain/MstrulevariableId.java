package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstrulevariableId generated by hbm2java
 */
@Embeddable
public class MstrulevariableId  implements java.io.Serializable {


     private String idapp;
     private String idrule;
     private byte idindex;

    public MstrulevariableId() {
    }

    public MstrulevariableId(String idapp, String idrule, byte idindex) {
       this.idapp = idapp;
       this.idrule = idrule;
       this.idindex = idindex;
    }
   


    @Column(name="IDAPP", nullable=false, length=2)
    public String getIdapp() {
        return this.idapp;
    }
    
    public void setIdapp(String idapp) {
        this.idapp = idapp;
    }


    @Column(name="IDRULE", nullable=false, length=30)
    public String getIdrule() {
        return this.idrule;
    }
    
    public void setIdrule(String idrule) {
        this.idrule = idrule;
    }


    @Column(name="IDINDEX", nullable=false, precision=2, scale=0)
    public byte getIdindex() {
        return this.idindex;
    }
    
    public void setIdindex(byte idindex) {
        this.idindex = idindex;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MstrulevariableId) ) return false;
		 MstrulevariableId castOther = ( MstrulevariableId ) other; 
         
		 return ( (this.getIdapp()==castOther.getIdapp()) || ( this.getIdapp()!=null && castOther.getIdapp()!=null && this.getIdapp().equals(castOther.getIdapp()) ) )
 && ( (this.getIdrule()==castOther.getIdrule()) || ( this.getIdrule()!=null && castOther.getIdrule()!=null && this.getIdrule().equals(castOther.getIdrule()) ) )
 && (this.getIdindex()==castOther.getIdindex());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdapp() == null ? 0 : this.getIdapp().hashCode() );
         result = 37 * result + ( getIdrule() == null ? 0 : this.getIdrule().hashCode() );
         result = 37 * result + this.getIdindex();
         return result;
   }   


}


