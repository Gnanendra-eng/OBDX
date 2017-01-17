package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstdocumentexceptionId generated by hbm2java
 */
@Embeddable
public class MstdocumentexceptionId  implements java.io.Serializable {


     private String exno;
     private String iddocument;

    public MstdocumentexceptionId() {
    }

    public MstdocumentexceptionId(String exno, String iddocument) {
       this.exno = exno;
       this.iddocument = iddocument;
    }
   


    @Column(name="EXNO", nullable=false, length=4)
    public String getExno() {
        return this.exno;
    }
    
    public void setExno(String exno) {
        this.exno = exno;
    }


    @Column(name="IDDOCUMENT", nullable=false, length=5)
    public String getIddocument() {
        return this.iddocument;
    }
    
    public void setIddocument(String iddocument) {
        this.iddocument = iddocument;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MstdocumentexceptionId) ) return false;
		 MstdocumentexceptionId castOther = ( MstdocumentexceptionId ) other; 
         
		 return ( (this.getExno()==castOther.getExno()) || ( this.getExno()!=null && castOther.getExno()!=null && this.getExno().equals(castOther.getExno()) ) )
 && ( (this.getIddocument()==castOther.getIddocument()) || ( this.getIddocument()!=null && castOther.getIddocument()!=null && this.getIddocument().equals(castOther.getIddocument()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getExno() == null ? 0 : this.getExno().hashCode() );
         result = 37 * result + ( getIddocument() == null ? 0 : this.getIddocument().hashCode() );
         return result;
   }   


}


