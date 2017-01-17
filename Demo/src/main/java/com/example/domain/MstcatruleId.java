package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstcatruleId generated by hbm2java
 */
@Embeddable
public class MstcatruleId  implements java.io.Serializable {


     private String idcustgrp;
     private String idrule;

    public MstcatruleId() {
    }

    public MstcatruleId(String idcustgrp, String idrule) {
       this.idcustgrp = idcustgrp;
       this.idrule = idrule;
    }
   


    @Column(name="IDCUSTGRP", nullable=false, length=20)
    public String getIdcustgrp() {
        return this.idcustgrp;
    }
    
    public void setIdcustgrp(String idcustgrp) {
        this.idcustgrp = idcustgrp;
    }


    @Column(name="IDRULE", nullable=false, length=30)
    public String getIdrule() {
        return this.idrule;
    }
    
    public void setIdrule(String idrule) {
        this.idrule = idrule;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MstcatruleId) ) return false;
		 MstcatruleId castOther = ( MstcatruleId ) other; 
         
		 return ( (this.getIdcustgrp()==castOther.getIdcustgrp()) || ( this.getIdcustgrp()!=null && castOther.getIdcustgrp()!=null && this.getIdcustgrp().equals(castOther.getIdcustgrp()) ) )
 && ( (this.getIdrule()==castOther.getIdrule()) || ( this.getIdrule()!=null && castOther.getIdrule()!=null && this.getIdrule().equals(castOther.getIdrule()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdcustgrp() == null ? 0 : this.getIdcustgrp().hashCode() );
         result = 37 * result + ( getIdrule() == null ? 0 : this.getIdrule().hashCode() );
         return result;
   }   


}


