package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstuserbudgetplanId generated by hbm2java
 */
@Embeddable
public class MstuserbudgetplanId  implements java.io.Serializable {


     private String iduser;
     private String idfcatref;

    public MstuserbudgetplanId() {
    }

    public MstuserbudgetplanId(String iduser, String idfcatref) {
       this.iduser = iduser;
       this.idfcatref = idfcatref;
    }
   


    @Column(name="IDUSER", nullable=false, length=20)
    public String getIduser() {
        return this.iduser;
    }
    
    public void setIduser(String iduser) {
        this.iduser = iduser;
    }


    @Column(name="IDFCATREF", nullable=false, length=15)
    public String getIdfcatref() {
        return this.idfcatref;
    }
    
    public void setIdfcatref(String idfcatref) {
        this.idfcatref = idfcatref;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MstuserbudgetplanId) ) return false;
		 MstuserbudgetplanId castOther = ( MstuserbudgetplanId ) other; 
         
		 return ( (this.getIduser()==castOther.getIduser()) || ( this.getIduser()!=null && castOther.getIduser()!=null && this.getIduser().equals(castOther.getIduser()) ) )
 && ( (this.getIdfcatref()==castOther.getIdfcatref()) || ( this.getIdfcatref()!=null && castOther.getIdfcatref()!=null && this.getIdfcatref().equals(castOther.getIdfcatref()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIduser() == null ? 0 : this.getIduser().hashCode() );
         result = 37 * result + ( getIdfcatref() == null ? 0 : this.getIdfcatref().hashCode() );
         return result;
   }   


}


