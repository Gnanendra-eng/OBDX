package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MstmapcoordinatesId generated by hbm2java
 */
@Embeddable
public class MstmapcoordinatesId  implements java.io.Serializable {


     private String idEntity;
     private String bankCode;
     private String branchCode;
     private String locationtype;
     private String latitude;
     private String longitude;

    public MstmapcoordinatesId() {
    }

    public MstmapcoordinatesId(String idEntity, String bankCode, String branchCode, String locationtype, String latitude, String longitude) {
       this.idEntity = idEntity;
       this.bankCode = bankCode;
       this.branchCode = branchCode;
       this.locationtype = locationtype;
       this.latitude = latitude;
       this.longitude = longitude;
    }
   


    @Column(name="ID_ENTITY", nullable=false, length=4)
    public String getIdEntity() {
        return this.idEntity;
    }
    
    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }


    @Column(name="BANK_CODE", nullable=false, length=4)
    public String getBankCode() {
        return this.bankCode;
    }
    
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }


    @Column(name="BRANCH_CODE", nullable=false, length=3)
    public String getBranchCode() {
        return this.branchCode;
    }
    
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }


    @Column(name="LOCATIONTYPE", nullable=false, length=2)
    public String getLocationtype() {
        return this.locationtype;
    }
    
    public void setLocationtype(String locationtype) {
        this.locationtype = locationtype;
    }


    @Column(name="LATITUDE", nullable=false, length=32)
    public String getLatitude() {
        return this.latitude;
    }
    
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


    @Column(name="LONGITUDE", nullable=false, length=32)
    public String getLongitude() {
        return this.longitude;
    }
    
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MstmapcoordinatesId) ) return false;
		 MstmapcoordinatesId castOther = ( MstmapcoordinatesId ) other; 
         
		 return ( (this.getIdEntity()==castOther.getIdEntity()) || ( this.getIdEntity()!=null && castOther.getIdEntity()!=null && this.getIdEntity().equals(castOther.getIdEntity()) ) )
 && ( (this.getBankCode()==castOther.getBankCode()) || ( this.getBankCode()!=null && castOther.getBankCode()!=null && this.getBankCode().equals(castOther.getBankCode()) ) )
 && ( (this.getBranchCode()==castOther.getBranchCode()) || ( this.getBranchCode()!=null && castOther.getBranchCode()!=null && this.getBranchCode().equals(castOther.getBranchCode()) ) )
 && ( (this.getLocationtype()==castOther.getLocationtype()) || ( this.getLocationtype()!=null && castOther.getLocationtype()!=null && this.getLocationtype().equals(castOther.getLocationtype()) ) )
 && ( (this.getLatitude()==castOther.getLatitude()) || ( this.getLatitude()!=null && castOther.getLatitude()!=null && this.getLatitude().equals(castOther.getLatitude()) ) )
 && ( (this.getLongitude()==castOther.getLongitude()) || ( this.getLongitude()!=null && castOther.getLongitude()!=null && this.getLongitude().equals(castOther.getLongitude()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEntity() == null ? 0 : this.getIdEntity().hashCode() );
         result = 37 * result + ( getBankCode() == null ? 0 : this.getBankCode().hashCode() );
         result = 37 * result + ( getBranchCode() == null ? 0 : this.getBranchCode().hashCode() );
         result = 37 * result + ( getLocationtype() == null ? 0 : this.getLocationtype().hashCode() );
         result = 37 * result + ( getLatitude() == null ? 0 : this.getLatitude().hashCode() );
         result = 37 * result + ( getLongitude() == null ? 0 : this.getLongitude().hashCode() );
         return result;
   }   


}


