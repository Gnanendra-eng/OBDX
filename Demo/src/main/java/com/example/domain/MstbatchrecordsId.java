package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstbatchrecordsId generated by hbm2java
 */
@Embeddable
public class MstbatchrecordsId  implements java.io.Serializable {


     private String idrequest;
     private String idfiletype;

    public MstbatchrecordsId() {
    }

    public MstbatchrecordsId(String idrequest, String idfiletype) {
       this.idrequest = idrequest;
       this.idfiletype = idfiletype;
    }
   


    @Column(name="IDREQUEST", nullable=false)
    public String getIdrequest() {
        return this.idrequest;
    }
    
    public void setIdrequest(String idrequest) {
        this.idrequest = idrequest;
    }


    @Column(name="IDFILETYPE", nullable=false, length=40)
    public String getIdfiletype() {
        return this.idfiletype;
    }
    
    public void setIdfiletype(String idfiletype) {
        this.idfiletype = idfiletype;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MstbatchrecordsId) ) return false;
		 MstbatchrecordsId castOther = ( MstbatchrecordsId ) other; 
         
		 return ( (this.getIdrequest()==castOther.getIdrequest()) || ( this.getIdrequest()!=null && castOther.getIdrequest()!=null && this.getIdrequest().equals(castOther.getIdrequest()) ) )
 && ( (this.getIdfiletype()==castOther.getIdfiletype()) || ( this.getIdfiletype()!=null && castOther.getIdfiletype()!=null && this.getIdfiletype().equals(castOther.getIdfiletype()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdrequest() == null ? 0 : this.getIdrequest().hashCode() );
         result = 37 * result + ( getIdfiletype() == null ? 0 : this.getIdfiletype().hashCode() );
         return result;
   }   


}


