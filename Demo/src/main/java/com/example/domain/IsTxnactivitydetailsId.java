package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IsTxnactivitydetailsId generated by hbm2java
 */
@Embeddable
public class IsTxnactivitydetailsId  implements java.io.Serializable {


     private String idEntity;
     private String idunitholder;
     private String txnnumber;
     private String idfund;
     private long numserial;

    public IsTxnactivitydetailsId() {
    }

    public IsTxnactivitydetailsId(String idEntity, String idunitholder, String txnnumber, String idfund, long numserial) {
       this.idEntity = idEntity;
       this.idunitholder = idunitholder;
       this.txnnumber = txnnumber;
       this.idfund = idfund;
       this.numserial = numserial;
    }
   


    @Column(name="ID_ENTITY", nullable=false, length=5)
    public String getIdEntity() {
        return this.idEntity;
    }
    
    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }


    @Column(name="IDUNITHOLDER", nullable=false, length=16)
    public String getIdunitholder() {
        return this.idunitholder;
    }
    
    public void setIdunitholder(String idunitholder) {
        this.idunitholder = idunitholder;
    }


    @Column(name="TXNNUMBER", nullable=false, length=25)
    public String getTxnnumber() {
        return this.txnnumber;
    }
    
    public void setTxnnumber(String txnnumber) {
        this.txnnumber = txnnumber;
    }


    @Column(name="IDFUND", nullable=false, length=10)
    public String getIdfund() {
        return this.idfund;
    }
    
    public void setIdfund(String idfund) {
        this.idfund = idfund;
    }


    @Column(name="NUMSERIAL", nullable=false, precision=18, scale=0)
    public long getNumserial() {
        return this.numserial;
    }
    
    public void setNumserial(long numserial) {
        this.numserial = numserial;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof IsTxnactivitydetailsId) ) return false;
		 IsTxnactivitydetailsId castOther = ( IsTxnactivitydetailsId ) other; 
         
		 return ( (this.getIdEntity()==castOther.getIdEntity()) || ( this.getIdEntity()!=null && castOther.getIdEntity()!=null && this.getIdEntity().equals(castOther.getIdEntity()) ) )
 && ( (this.getIdunitholder()==castOther.getIdunitholder()) || ( this.getIdunitholder()!=null && castOther.getIdunitholder()!=null && this.getIdunitholder().equals(castOther.getIdunitholder()) ) )
 && ( (this.getTxnnumber()==castOther.getTxnnumber()) || ( this.getTxnnumber()!=null && castOther.getTxnnumber()!=null && this.getTxnnumber().equals(castOther.getTxnnumber()) ) )
 && ( (this.getIdfund()==castOther.getIdfund()) || ( this.getIdfund()!=null && castOther.getIdfund()!=null && this.getIdfund().equals(castOther.getIdfund()) ) )
 && (this.getNumserial()==castOther.getNumserial());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEntity() == null ? 0 : this.getIdEntity().hashCode() );
         result = 37 * result + ( getIdunitholder() == null ? 0 : this.getIdunitholder().hashCode() );
         result = 37 * result + ( getTxnnumber() == null ? 0 : this.getTxnnumber().hashCode() );
         result = 37 * result + ( getIdfund() == null ? 0 : this.getIdfund().hashCode() );
         result = 37 * result + (int) this.getNumserial();
         return result;
   }   


}


