package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstatsId generated by hbm2java
 */
@Embeddable
public class MstatsId  implements java.io.Serializable {


     private String idapp;
     private String idtxn;
     private String numsequence;

    public MstatsId() {
    }

    public MstatsId(String idapp, String idtxn, String numsequence) {
       this.idapp = idapp;
       this.idtxn = idtxn;
       this.numsequence = numsequence;
    }
   


    @Column(name="IDAPP", nullable=false, length=2)
    public String getIdapp() {
        return this.idapp;
    }
    
    public void setIdapp(String idapp) {
        this.idapp = idapp;
    }


    @Column(name="IDTXN", nullable=false, length=3)
    public String getIdtxn() {
        return this.idtxn;
    }
    
    public void setIdtxn(String idtxn) {
        this.idtxn = idtxn;
    }


    @Column(name="NUMSEQUENCE", nullable=false, length=2)
    public String getNumsequence() {
        return this.numsequence;
    }
    
    public void setNumsequence(String numsequence) {
        this.numsequence = numsequence;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MstatsId) ) return false;
		 MstatsId castOther = ( MstatsId ) other; 
         
		 return ( (this.getIdapp()==castOther.getIdapp()) || ( this.getIdapp()!=null && castOther.getIdapp()!=null && this.getIdapp().equals(castOther.getIdapp()) ) )
 && ( (this.getIdtxn()==castOther.getIdtxn()) || ( this.getIdtxn()!=null && castOther.getIdtxn()!=null && this.getIdtxn().equals(castOther.getIdtxn()) ) )
 && ( (this.getNumsequence()==castOther.getNumsequence()) || ( this.getNumsequence()!=null && castOther.getNumsequence()!=null && this.getNumsequence().equals(castOther.getNumsequence()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdapp() == null ? 0 : this.getIdapp().hashCode() );
         result = 37 * result + ( getIdtxn() == null ? 0 : this.getIdtxn().hashCode() );
         result = 37 * result + ( getNumsequence() == null ? 0 : this.getNumsequence().hashCode() );
         return result;
   }   


}


