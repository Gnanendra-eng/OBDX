package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Filestatusuploaddet generated by hbm2java
 */
@Entity
@Table(name="FILESTATUSUPLOADDET"
    ,schema="FCDBADMIN_RK"
)
public class Filestatusuploaddet  implements java.io.Serializable {


     private FilestatusuploaddetId id;
     private Mstfilestatusupload mstfilestatusupload;
     private String apprefno;
     private String appstatus;
     private String remarks;

    public Filestatusuploaddet() {
    }

	
    public Filestatusuploaddet(FilestatusuploaddetId id) {
        this.id = id;
    }
    public Filestatusuploaddet(FilestatusuploaddetId id, Mstfilestatusupload mstfilestatusupload, String apprefno, String appstatus, String remarks) {
       this.id = id;
       this.mstfilestatusupload = mstfilestatusupload;
       this.apprefno = apprefno;
       this.appstatus = appstatus;
       this.remarks = remarks;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="recrefno", column=@Column(name="RECREFNO", nullable=false, length=35) ), 
        @AttributeOverride(name="recstatus", column=@Column(name="RECSTATUS", nullable=false, length=10) ) } )
    public FilestatusuploaddetId getId() {
        return this.id;
    }
    
    public void setId(FilestatusuploaddetId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FILEREFNO")
    public Mstfilestatusupload getMstfilestatusupload() {
        return this.mstfilestatusupload;
    }
    
    public void setMstfilestatusupload(Mstfilestatusupload mstfilestatusupload) {
        this.mstfilestatusupload = mstfilestatusupload;
    }

    
    @Column(name="APPREFNO", length=35)
    public String getApprefno() {
        return this.apprefno;
    }
    
    public void setApprefno(String apprefno) {
        this.apprefno = apprefno;
    }

    
    @Column(name="APPSTATUS", length=4)
    public String getAppstatus() {
        return this.appstatus;
    }
    
    public void setAppstatus(String appstatus) {
        this.appstatus = appstatus;
    }

    
    @Column(name="REMARKS", length=100)
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }




}


