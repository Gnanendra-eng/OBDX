package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MobileenablerdefaultfieldmapId generated by hbm2java
 */
@Embeddable
public class MobileenablerdefaultfieldmapId  implements java.io.Serializable {


     private String idEntity;
     private String usertype;
     private String idchannel;
     private String useragent;
     private String tgtappfieldname;

    public MobileenablerdefaultfieldmapId() {
    }

    public MobileenablerdefaultfieldmapId(String idEntity, String usertype, String idchannel, String useragent, String tgtappfieldname) {
       this.idEntity = idEntity;
       this.usertype = usertype;
       this.idchannel = idchannel;
       this.useragent = useragent;
       this.tgtappfieldname = tgtappfieldname;
    }
   


    @Column(name="ID_ENTITY", nullable=false, length=5)
    public String getIdEntity() {
        return this.idEntity;
    }
    
    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }


    @Column(name="USERTYPE", nullable=false, length=3)
    public String getUsertype() {
        return this.usertype;
    }
    
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }


    @Column(name="IDCHANNEL", nullable=false, length=2)
    public String getIdchannel() {
        return this.idchannel;
    }
    
    public void setIdchannel(String idchannel) {
        this.idchannel = idchannel;
    }


    @Column(name="USERAGENT", nullable=false, length=50)
    public String getUseragent() {
        return this.useragent;
    }
    
    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }


    @Column(name="TGTAPPFIELDNAME", nullable=false, length=100)
    public String getTgtappfieldname() {
        return this.tgtappfieldname;
    }
    
    public void setTgtappfieldname(String tgtappfieldname) {
        this.tgtappfieldname = tgtappfieldname;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MobileenablerdefaultfieldmapId) ) return false;
		 MobileenablerdefaultfieldmapId castOther = ( MobileenablerdefaultfieldmapId ) other; 
         
		 return ( (this.getIdEntity()==castOther.getIdEntity()) || ( this.getIdEntity()!=null && castOther.getIdEntity()!=null && this.getIdEntity().equals(castOther.getIdEntity()) ) )
 && ( (this.getUsertype()==castOther.getUsertype()) || ( this.getUsertype()!=null && castOther.getUsertype()!=null && this.getUsertype().equals(castOther.getUsertype()) ) )
 && ( (this.getIdchannel()==castOther.getIdchannel()) || ( this.getIdchannel()!=null && castOther.getIdchannel()!=null && this.getIdchannel().equals(castOther.getIdchannel()) ) )
 && ( (this.getUseragent()==castOther.getUseragent()) || ( this.getUseragent()!=null && castOther.getUseragent()!=null && this.getUseragent().equals(castOther.getUseragent()) ) )
 && ( (this.getTgtappfieldname()==castOther.getTgtappfieldname()) || ( this.getTgtappfieldname()!=null && castOther.getTgtappfieldname()!=null && this.getTgtappfieldname().equals(castOther.getTgtappfieldname()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEntity() == null ? 0 : this.getIdEntity().hashCode() );
         result = 37 * result + ( getUsertype() == null ? 0 : this.getUsertype().hashCode() );
         result = 37 * result + ( getIdchannel() == null ? 0 : this.getIdchannel().hashCode() );
         result = 37 * result + ( getUseragent() == null ? 0 : this.getUseragent().hashCode() );
         result = 37 * result + ( getTgtappfieldname() == null ? 0 : this.getTgtappfieldname().hashCode() );
         return result;
   }   


}


