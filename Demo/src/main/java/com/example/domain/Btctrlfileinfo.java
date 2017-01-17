package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Btctrlfileinfo generated by hbm2java
 */
@Entity
@Table(name="BTCTRLFILEINFO"
    ,schema="FCDBADMIN_RK"
)
public class Btctrlfileinfo  implements java.io.Serializable {


     private String filerefno;
     private BigDecimal nbrrecords;
     private BigDecimal totamount;
     private BigDecimal nbrdebits;
     private BigDecimal nbrcredits;

    public Btctrlfileinfo() {
    }

	
    public Btctrlfileinfo(String filerefno) {
        this.filerefno = filerefno;
    }
    public Btctrlfileinfo(String filerefno, BigDecimal nbrrecords, BigDecimal totamount, BigDecimal nbrdebits, BigDecimal nbrcredits) {
       this.filerefno = filerefno;
       this.nbrrecords = nbrrecords;
       this.totamount = totamount;
       this.nbrdebits = nbrdebits;
       this.nbrcredits = nbrcredits;
    }
   
     @Id 

    
    @Column(name="FILEREFNO", unique=true, nullable=false, length=35)
    public String getFilerefno() {
        return this.filerefno;
    }
    
    public void setFilerefno(String filerefno) {
        this.filerefno = filerefno;
    }

    
    @Column(name="NBRRECORDS", precision=38, scale=0)
    public BigDecimal getNbrrecords() {
        return this.nbrrecords;
    }
    
    public void setNbrrecords(BigDecimal nbrrecords) {
        this.nbrrecords = nbrrecords;
    }

    
    @Column(name="TOTAMOUNT", scale=4)
    public BigDecimal getTotamount() {
        return this.totamount;
    }
    
    public void setTotamount(BigDecimal totamount) {
        this.totamount = totamount;
    }

    
    @Column(name="NBRDEBITS", precision=38, scale=0)
    public BigDecimal getNbrdebits() {
        return this.nbrdebits;
    }
    
    public void setNbrdebits(BigDecimal nbrdebits) {
        this.nbrdebits = nbrdebits;
    }

    
    @Column(name="NBRCREDITS", precision=38, scale=0)
    public BigDecimal getNbrcredits() {
        return this.nbrcredits;
    }
    
    public void setNbrcredits(BigDecimal nbrcredits) {
        this.nbrcredits = nbrcredits;
    }




}


