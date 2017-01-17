package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TxnactionsId generated by hbm2java
 */
@Embeddable
public class TxnactionsId  implements java.io.Serializable {


     private String iduser;
     private String idchannel;
     private long idactionref;

    public TxnactionsId() {
    }

    public TxnactionsId(String iduser, String idchannel, long idactionref) {
       this.iduser = iduser;
       this.idchannel = idchannel;
       this.idactionref = idactionref;
    }
   


    @Column(name="IDUSER", nullable=false, length=256)
    public String getIduser() {
        return this.iduser;
    }
    
    public void setIduser(String iduser) {
        this.iduser = iduser;
    }


    @Column(name="IDCHANNEL", nullable=false, length=2)
    public String getIdchannel() {
        return this.idchannel;
    }
    
    public void setIdchannel(String idchannel) {
        this.idchannel = idchannel;
    }


    @Column(name="IDACTIONREF", nullable=false, precision=10, scale=0)
    public long getIdactionref() {
        return this.idactionref;
    }
    
    public void setIdactionref(long idactionref) {
        this.idactionref = idactionref;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TxnactionsId) ) return false;
		 TxnactionsId castOther = ( TxnactionsId ) other; 
         
		 return ( (this.getIduser()==castOther.getIduser()) || ( this.getIduser()!=null && castOther.getIduser()!=null && this.getIduser().equals(castOther.getIduser()) ) )
 && ( (this.getIdchannel()==castOther.getIdchannel()) || ( this.getIdchannel()!=null && castOther.getIdchannel()!=null && this.getIdchannel().equals(castOther.getIdchannel()) ) )
 && (this.getIdactionref()==castOther.getIdactionref());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIduser() == null ? 0 : this.getIduser().hashCode() );
         result = 37 * result + ( getIdchannel() == null ? 0 : this.getIdchannel().hashCode() );
         result = 37 * result + (int) this.getIdactionref();
         return result;
   }   


}


