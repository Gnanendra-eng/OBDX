package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrigApplicationShareId generated by hbm2java
 */
@Embeddable
public class OrigApplicationShareId  implements java.io.Serializable {


     private String idfcatref;
     private String typeCommChnl;
     private String idCommChnl;

    public OrigApplicationShareId() {
    }

    public OrigApplicationShareId(String idfcatref, String typeCommChnl, String idCommChnl) {
       this.idfcatref = idfcatref;
       this.typeCommChnl = typeCommChnl;
       this.idCommChnl = idCommChnl;
    }
   


    @Column(name="IDFCATREF", nullable=false, length=35)
    public String getIdfcatref() {
        return this.idfcatref;
    }
    
    public void setIdfcatref(String idfcatref) {
        this.idfcatref = idfcatref;
    }


    @Column(name="TYPE_COMM_CHNL", nullable=false, length=2)
    public String getTypeCommChnl() {
        return this.typeCommChnl;
    }
    
    public void setTypeCommChnl(String typeCommChnl) {
        this.typeCommChnl = typeCommChnl;
    }


    @Column(name="ID_COMM_CHNL", nullable=false)
    public String getIdCommChnl() {
        return this.idCommChnl;
    }
    
    public void setIdCommChnl(String idCommChnl) {
        this.idCommChnl = idCommChnl;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrigApplicationShareId) ) return false;
		 OrigApplicationShareId castOther = ( OrigApplicationShareId ) other; 
         
		 return ( (this.getIdfcatref()==castOther.getIdfcatref()) || ( this.getIdfcatref()!=null && castOther.getIdfcatref()!=null && this.getIdfcatref().equals(castOther.getIdfcatref()) ) )
 && ( (this.getTypeCommChnl()==castOther.getTypeCommChnl()) || ( this.getTypeCommChnl()!=null && castOther.getTypeCommChnl()!=null && this.getTypeCommChnl().equals(castOther.getTypeCommChnl()) ) )
 && ( (this.getIdCommChnl()==castOther.getIdCommChnl()) || ( this.getIdCommChnl()!=null && castOther.getIdCommChnl()!=null && this.getIdCommChnl().equals(castOther.getIdCommChnl()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdfcatref() == null ? 0 : this.getIdfcatref().hashCode() );
         result = 37 * result + ( getTypeCommChnl() == null ? 0 : this.getTypeCommChnl().hashCode() );
         result = 37 * result + ( getIdCommChnl() == null ? 0 : this.getIdCommChnl().hashCode() );
         return result;
   }   


}


