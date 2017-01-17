package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ComplaintsHistoryId generated by hbm2java
 */
@Embeddable
public class ComplaintsHistoryId  implements java.io.Serializable {


     private String claimReferenceNum;
     private String resolutionNum;

    public ComplaintsHistoryId() {
    }

    public ComplaintsHistoryId(String claimReferenceNum, String resolutionNum) {
       this.claimReferenceNum = claimReferenceNum;
       this.resolutionNum = resolutionNum;
    }
   


    @Column(name="CLAIM_REFERENCE_NUM", nullable=false, length=20)
    public String getClaimReferenceNum() {
        return this.claimReferenceNum;
    }
    
    public void setClaimReferenceNum(String claimReferenceNum) {
        this.claimReferenceNum = claimReferenceNum;
    }


    @Column(name="RESOLUTION_NUM", nullable=false, length=5)
    public String getResolutionNum() {
        return this.resolutionNum;
    }
    
    public void setResolutionNum(String resolutionNum) {
        this.resolutionNum = resolutionNum;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ComplaintsHistoryId) ) return false;
		 ComplaintsHistoryId castOther = ( ComplaintsHistoryId ) other; 
         
		 return ( (this.getClaimReferenceNum()==castOther.getClaimReferenceNum()) || ( this.getClaimReferenceNum()!=null && castOther.getClaimReferenceNum()!=null && this.getClaimReferenceNum().equals(castOther.getClaimReferenceNum()) ) )
 && ( (this.getResolutionNum()==castOther.getResolutionNum()) || ( this.getResolutionNum()!=null && castOther.getResolutionNum()!=null && this.getResolutionNum().equals(castOther.getResolutionNum()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getClaimReferenceNum() == null ? 0 : this.getClaimReferenceNum().hashCode() );
         result = 37 * result + ( getResolutionNum() == null ? 0 : this.getResolutionNum().hashCode() );
         return result;
   }   


}


