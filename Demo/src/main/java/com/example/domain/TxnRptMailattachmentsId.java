package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TxnRptMailattachmentsId generated by hbm2java
 */
@Embeddable
public class TxnRptMailattachmentsId  implements java.io.Serializable {


     private String iduser;
     private String reportName;

    public TxnRptMailattachmentsId() {
    }

    public TxnRptMailattachmentsId(String iduser, String reportName) {
       this.iduser = iduser;
       this.reportName = reportName;
    }
   


    @Column(name="IDUSER", nullable=false, length=10)
    public String getIduser() {
        return this.iduser;
    }
    
    public void setIduser(String iduser) {
        this.iduser = iduser;
    }


    @Column(name="REPORT_NAME", nullable=false, length=100)
    public String getReportName() {
        return this.reportName;
    }
    
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TxnRptMailattachmentsId) ) return false;
		 TxnRptMailattachmentsId castOther = ( TxnRptMailattachmentsId ) other; 
         
		 return ( (this.getIduser()==castOther.getIduser()) || ( this.getIduser()!=null && castOther.getIduser()!=null && this.getIduser().equals(castOther.getIduser()) ) )
 && ( (this.getReportName()==castOther.getReportName()) || ( this.getReportName()!=null && castOther.getReportName()!=null && this.getReportName().equals(castOther.getReportName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIduser() == null ? 0 : this.getIduser().hashCode() );
         result = 37 * result + ( getReportName() == null ? 0 : this.getReportName().hashCode() );
         return result;
   }   


}


