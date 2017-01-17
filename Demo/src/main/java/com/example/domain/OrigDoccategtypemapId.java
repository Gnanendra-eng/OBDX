package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrigDoccategtypemapId generated by hbm2java
 */
@Embeddable
public class OrigDoccategtypemapId  implements java.io.Serializable {


     private String idEntity;
     private String usertype;
     private String prodcateg;
     private String prodcode;
     private String doccateg;
     private String doctype;

    public OrigDoccategtypemapId() {
    }

    public OrigDoccategtypemapId(String idEntity, String usertype, String prodcateg, String prodcode, String doccateg, String doctype) {
       this.idEntity = idEntity;
       this.usertype = usertype;
       this.prodcateg = prodcateg;
       this.prodcode = prodcode;
       this.doccateg = doccateg;
       this.doctype = doctype;
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


    @Column(name="PRODCATEG", nullable=false, length=10)
    public String getProdcateg() {
        return this.prodcateg;
    }
    
    public void setProdcateg(String prodcateg) {
        this.prodcateg = prodcateg;
    }


    @Column(name="PRODCODE", nullable=false, length=10)
    public String getProdcode() {
        return this.prodcode;
    }
    
    public void setProdcode(String prodcode) {
        this.prodcode = prodcode;
    }


    @Column(name="DOCCATEG", nullable=false, length=20)
    public String getDoccateg() {
        return this.doccateg;
    }
    
    public void setDoccateg(String doccateg) {
        this.doccateg = doccateg;
    }


    @Column(name="DOCTYPE", nullable=false, length=20)
    public String getDoctype() {
        return this.doctype;
    }
    
    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrigDoccategtypemapId) ) return false;
		 OrigDoccategtypemapId castOther = ( OrigDoccategtypemapId ) other; 
         
		 return ( (this.getIdEntity()==castOther.getIdEntity()) || ( this.getIdEntity()!=null && castOther.getIdEntity()!=null && this.getIdEntity().equals(castOther.getIdEntity()) ) )
 && ( (this.getUsertype()==castOther.getUsertype()) || ( this.getUsertype()!=null && castOther.getUsertype()!=null && this.getUsertype().equals(castOther.getUsertype()) ) )
 && ( (this.getProdcateg()==castOther.getProdcateg()) || ( this.getProdcateg()!=null && castOther.getProdcateg()!=null && this.getProdcateg().equals(castOther.getProdcateg()) ) )
 && ( (this.getProdcode()==castOther.getProdcode()) || ( this.getProdcode()!=null && castOther.getProdcode()!=null && this.getProdcode().equals(castOther.getProdcode()) ) )
 && ( (this.getDoccateg()==castOther.getDoccateg()) || ( this.getDoccateg()!=null && castOther.getDoccateg()!=null && this.getDoccateg().equals(castOther.getDoccateg()) ) )
 && ( (this.getDoctype()==castOther.getDoctype()) || ( this.getDoctype()!=null && castOther.getDoctype()!=null && this.getDoctype().equals(castOther.getDoctype()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEntity() == null ? 0 : this.getIdEntity().hashCode() );
         result = 37 * result + ( getUsertype() == null ? 0 : this.getUsertype().hashCode() );
         result = 37 * result + ( getProdcateg() == null ? 0 : this.getProdcateg().hashCode() );
         result = 37 * result + ( getProdcode() == null ? 0 : this.getProdcode().hashCode() );
         result = 37 * result + ( getDoccateg() == null ? 0 : this.getDoccateg().hashCode() );
         result = 37 * result + ( getDoctype() == null ? 0 : this.getDoctype().hashCode() );
         return result;
   }   


}


