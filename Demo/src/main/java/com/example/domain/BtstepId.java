package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BtstepId generated by hbm2java
 */
@Embeddable
public class BtstepId  implements java.io.Serializable {


     private String btid;
     private String step;

    public BtstepId() {
    }

    public BtstepId(String btid, String step) {
       this.btid = btid;
       this.step = step;
    }
   


    @Column(name="BTID", nullable=false, length=40)
    public String getBtid() {
        return this.btid;
    }
    
    public void setBtid(String btid) {
        this.btid = btid;
    }


    @Column(name="STEP", nullable=false, length=20)
    public String getStep() {
        return this.step;
    }
    
    public void setStep(String step) {
        this.step = step;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BtstepId) ) return false;
		 BtstepId castOther = ( BtstepId ) other; 
         
		 return ( (this.getBtid()==castOther.getBtid()) || ( this.getBtid()!=null && castOther.getBtid()!=null && this.getBtid().equals(castOther.getBtid()) ) )
 && ( (this.getStep()==castOther.getStep()) || ( this.getStep()!=null && castOther.getStep()!=null && this.getStep().equals(castOther.getStep()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getBtid() == null ? 0 : this.getBtid().hashCode() );
         result = 37 * result + ( getStep() == null ? 0 : this.getStep().hashCode() );
         return result;
   }   


}


