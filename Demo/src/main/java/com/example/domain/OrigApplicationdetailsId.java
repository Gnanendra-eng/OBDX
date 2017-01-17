package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrigApplicationdetailsId generated by hbm2java
 */
@Embeddable
public class OrigApplicationdetailsId  implements java.io.Serializable {


     private String idfcatref;
     private String udfname;

    public OrigApplicationdetailsId() {
    }

    public OrigApplicationdetailsId(String idfcatref, String udfname) {
       this.idfcatref = idfcatref;
       this.udfname = udfname;
    }
   


    @Column(name="IDFCATREF", nullable=false, length=35)
    public String getIdfcatref() {
        return this.idfcatref;
    }
    
    public void setIdfcatref(String idfcatref) {
        this.idfcatref = idfcatref;
    }


    @Column(name="UDFNAME", nullable=false, length=50)
    public String getUdfname() {
        return this.udfname;
    }
    
    public void setUdfname(String udfname) {
        this.udfname = udfname;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrigApplicationdetailsId) ) return false;
		 OrigApplicationdetailsId castOther = ( OrigApplicationdetailsId ) other; 
         
		 return ( (this.getIdfcatref()==castOther.getIdfcatref()) || ( this.getIdfcatref()!=null && castOther.getIdfcatref()!=null && this.getIdfcatref().equals(castOther.getIdfcatref()) ) )
 && ( (this.getUdfname()==castOther.getUdfname()) || ( this.getUdfname()!=null && castOther.getUdfname()!=null && this.getUdfname().equals(castOther.getUdfname()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdfcatref() == null ? 0 : this.getIdfcatref().hashCode() );
         result = 37 * result + ( getUdfname() == null ? 0 : this.getUdfname().hashCode() );
         return result;
   }   


}


