package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * XpdlGlobaldata generated by hbm2java
 */
@Entity
@Table(name="XPDL_GLOBALDATA"
    ,schema="FCDBADMIN_RK"
)
public class XpdlGlobaldata  implements java.io.Serializable {


     private XpdlGlobaldataId id;
     private byte[] filedata;
     private Date lastupddatetime;
     private Character loadflag;

    public XpdlGlobaldata() {
    }

	
    public XpdlGlobaldata(XpdlGlobaldataId id) {
        this.id = id;
    }
    public XpdlGlobaldata(XpdlGlobaldataId id, byte[] filedata, Date lastupddatetime, Character loadflag) {
       this.id = id;
       this.filedata = filedata;
       this.lastupddatetime = lastupddatetime;
       this.loadflag = loadflag;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="typefile", column=@Column(name="TYPEFILE", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="namfile", column=@Column(name="NAMFILE", nullable=false) ), 
        @AttributeOverride(name="idver", column=@Column(name="IDVER", nullable=false, precision=4, scale=0) ) } )
    public XpdlGlobaldataId getId() {
        return this.id;
    }
    
    public void setId(XpdlGlobaldataId id) {
        this.id = id;
    }

    
    @Column(name="FILEDATA")
    public byte[] getFiledata() {
        return this.filedata;
    }
    
    public void setFiledata(byte[] filedata) {
        this.filedata = filedata;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="LASTUPDDATETIME", length=7)
    public Date getLastupddatetime() {
        return this.lastupddatetime;
    }
    
    public void setLastupddatetime(Date lastupddatetime) {
        this.lastupddatetime = lastupddatetime;
    }

    
    @Column(name="LOADFLAG", length=1)
    public Character getLoadflag() {
        return this.loadflag;
    }
    
    public void setLoadflag(Character loadflag) {
        this.loadflag = loadflag;
    }




}


