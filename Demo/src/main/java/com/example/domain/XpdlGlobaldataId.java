package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * XpdlGlobaldataId generated by hbm2java
 */
@Embeddable
public class XpdlGlobaldataId  implements java.io.Serializable {


     private BigDecimal typefile;
     private String namfile;
     private short idver;

    public XpdlGlobaldataId() {
    }

    public XpdlGlobaldataId(BigDecimal typefile, String namfile, short idver) {
       this.typefile = typefile;
       this.namfile = namfile;
       this.idver = idver;
    }
   


    @Column(name="TYPEFILE", nullable=false, precision=22, scale=0)
    public BigDecimal getTypefile() {
        return this.typefile;
    }
    
    public void setTypefile(BigDecimal typefile) {
        this.typefile = typefile;
    }


    @Column(name="NAMFILE", nullable=false)
    public String getNamfile() {
        return this.namfile;
    }
    
    public void setNamfile(String namfile) {
        this.namfile = namfile;
    }


    @Column(name="IDVER", nullable=false, precision=4, scale=0)
    public short getIdver() {
        return this.idver;
    }
    
    public void setIdver(short idver) {
        this.idver = idver;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof XpdlGlobaldataId) ) return false;
		 XpdlGlobaldataId castOther = ( XpdlGlobaldataId ) other; 
         
		 return ( (this.getTypefile()==castOther.getTypefile()) || ( this.getTypefile()!=null && castOther.getTypefile()!=null && this.getTypefile().equals(castOther.getTypefile()) ) )
 && ( (this.getNamfile()==castOther.getNamfile()) || ( this.getNamfile()!=null && castOther.getNamfile()!=null && this.getNamfile().equals(castOther.getNamfile()) ) )
 && (this.getIdver()==castOther.getIdver());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTypefile() == null ? 0 : this.getTypefile().hashCode() );
         result = 37 * result + ( getNamfile() == null ? 0 : this.getNamfile().hashCode() );
         result = 37 * result + this.getIdver();
         return result;
   }   


}


