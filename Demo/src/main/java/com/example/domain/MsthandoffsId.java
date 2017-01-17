package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MsthandoffsId generated by hbm2java
 */
@Embeddable
public class MsthandoffsId  implements java.io.Serializable {


     private String handofftype;
     private char flginout;

    public MsthandoffsId() {
    }

    public MsthandoffsId(String handofftype, char flginout) {
       this.handofftype = handofftype;
       this.flginout = flginout;
    }
   


    @Column(name="HANDOFFTYPE", nullable=false, length=50)
    public String getHandofftype() {
        return this.handofftype;
    }
    
    public void setHandofftype(String handofftype) {
        this.handofftype = handofftype;
    }


    @Column(name="FLGINOUT", nullable=false, length=1)
    public char getFlginout() {
        return this.flginout;
    }
    
    public void setFlginout(char flginout) {
        this.flginout = flginout;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MsthandoffsId) ) return false;
		 MsthandoffsId castOther = ( MsthandoffsId ) other; 
         
		 return ( (this.getHandofftype()==castOther.getHandofftype()) || ( this.getHandofftype()!=null && castOther.getHandofftype()!=null && this.getHandofftype().equals(castOther.getHandofftype()) ) )
 && (this.getFlginout()==castOther.getFlginout());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getHandofftype() == null ? 0 : this.getHandofftype().hashCode() );
         result = 37 * result + this.getFlginout();
         return result;
   }   


}


