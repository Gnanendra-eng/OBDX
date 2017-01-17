package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstcontactpurposeId generated by hbm2java
 */
@Embeddable
public class MstcontactpurposeId  implements java.io.Serializable {


     private String idpurpose;
     private String idcontact;

    public MstcontactpurposeId() {
    }

    public MstcontactpurposeId(String idpurpose, String idcontact) {
       this.idpurpose = idpurpose;
       this.idcontact = idcontact;
    }
   


    @Column(name="IDPURPOSE", nullable=false, length=5)
    public String getIdpurpose() {
        return this.idpurpose;
    }
    
    public void setIdpurpose(String idpurpose) {
        this.idpurpose = idpurpose;
    }


    @Column(name="IDCONTACT", nullable=false, length=5)
    public String getIdcontact() {
        return this.idcontact;
    }
    
    public void setIdcontact(String idcontact) {
        this.idcontact = idcontact;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MstcontactpurposeId) ) return false;
		 MstcontactpurposeId castOther = ( MstcontactpurposeId ) other; 
         
		 return ( (this.getIdpurpose()==castOther.getIdpurpose()) || ( this.getIdpurpose()!=null && castOther.getIdpurpose()!=null && this.getIdpurpose().equals(castOther.getIdpurpose()) ) )
 && ( (this.getIdcontact()==castOther.getIdcontact()) || ( this.getIdcontact()!=null && castOther.getIdcontact()!=null && this.getIdcontact().equals(castOther.getIdcontact()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdpurpose() == null ? 0 : this.getIdpurpose().hashCode() );
         result = 37 * result + ( getIdcontact() == null ? 0 : this.getIdcontact().hashCode() );
         return result;
   }   


}


