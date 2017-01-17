package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FilestatusuploaddetId generated by hbm2java
 */
@Embeddable
public class FilestatusuploaddetId  implements java.io.Serializable {


     private String recrefno;
     private String recstatus;

    public FilestatusuploaddetId() {
    }

    public FilestatusuploaddetId(String recrefno, String recstatus) {
       this.recrefno = recrefno;
       this.recstatus = recstatus;
    }
   


    @Column(name="RECREFNO", nullable=false, length=35)
    public String getRecrefno() {
        return this.recrefno;
    }
    
    public void setRecrefno(String recrefno) {
        this.recrefno = recrefno;
    }


    @Column(name="RECSTATUS", nullable=false, length=10)
    public String getRecstatus() {
        return this.recstatus;
    }
    
    public void setRecstatus(String recstatus) {
        this.recstatus = recstatus;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FilestatusuploaddetId) ) return false;
		 FilestatusuploaddetId castOther = ( FilestatusuploaddetId ) other; 
         
		 return ( (this.getRecrefno()==castOther.getRecrefno()) || ( this.getRecrefno()!=null && castOther.getRecrefno()!=null && this.getRecrefno().equals(castOther.getRecrefno()) ) )
 && ( (this.getRecstatus()==castOther.getRecstatus()) || ( this.getRecstatus()!=null && castOther.getRecstatus()!=null && this.getRecstatus().equals(castOther.getRecstatus()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRecrefno() == null ? 0 : this.getRecrefno().hashCode() );
         result = 37 * result + ( getRecstatus() == null ? 0 : this.getRecstatus().hashCode() );
         return result;
   }   


}


