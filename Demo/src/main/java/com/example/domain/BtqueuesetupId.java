package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BtqueuesetupId generated by hbm2java
 */
@Embeddable
public class BtqueuesetupId  implements java.io.Serializable {


     private String logqueuename;
     private String queueconnfactory;
     private String phyqueuename;

    public BtqueuesetupId() {
    }

    public BtqueuesetupId(String logqueuename, String queueconnfactory, String phyqueuename) {
       this.logqueuename = logqueuename;
       this.queueconnfactory = queueconnfactory;
       this.phyqueuename = phyqueuename;
    }
   


    @Column(name="LOGQUEUENAME", nullable=false, length=35)
    public String getLogqueuename() {
        return this.logqueuename;
    }
    
    public void setLogqueuename(String logqueuename) {
        this.logqueuename = logqueuename;
    }


    @Column(name="QUEUECONNFACTORY", nullable=false, length=35)
    public String getQueueconnfactory() {
        return this.queueconnfactory;
    }
    
    public void setQueueconnfactory(String queueconnfactory) {
        this.queueconnfactory = queueconnfactory;
    }


    @Column(name="PHYQUEUENAME", nullable=false, length=35)
    public String getPhyqueuename() {
        return this.phyqueuename;
    }
    
    public void setPhyqueuename(String phyqueuename) {
        this.phyqueuename = phyqueuename;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BtqueuesetupId) ) return false;
		 BtqueuesetupId castOther = ( BtqueuesetupId ) other; 
         
		 return ( (this.getLogqueuename()==castOther.getLogqueuename()) || ( this.getLogqueuename()!=null && castOther.getLogqueuename()!=null && this.getLogqueuename().equals(castOther.getLogqueuename()) ) )
 && ( (this.getQueueconnfactory()==castOther.getQueueconnfactory()) || ( this.getQueueconnfactory()!=null && castOther.getQueueconnfactory()!=null && this.getQueueconnfactory().equals(castOther.getQueueconnfactory()) ) )
 && ( (this.getPhyqueuename()==castOther.getPhyqueuename()) || ( this.getPhyqueuename()!=null && castOther.getPhyqueuename()!=null && this.getPhyqueuename().equals(castOther.getPhyqueuename()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLogqueuename() == null ? 0 : this.getLogqueuename().hashCode() );
         result = 37 * result + ( getQueueconnfactory() == null ? 0 : this.getQueueconnfactory().hashCode() );
         result = 37 * result + ( getPhyqueuename() == null ? 0 : this.getPhyqueuename().hashCode() );
         return result;
   }   


}


