package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * SwNatlDir generated by hbm2java
 */
@Entity
@Table(name="SW_NATL_DIR"
    ,schema="FCDBADMIN_RK"
)
public class SwNatlDir  implements java.io.Serializable {


     private SwNatlDirId id;
     private String namDirectory;
     private String isenabled;

    public SwNatlDir() {
    }

	
    public SwNatlDir(SwNatlDirId id) {
        this.id = id;
    }
    public SwNatlDir(SwNatlDirId id, String namDirectory, String isenabled) {
       this.id = id;
       this.namDirectory = namDirectory;
       this.isenabled = isenabled;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="codDirectory", column=@Column(name="COD_DIRECTORY", nullable=false, length=10) ), 
        @AttributeOverride(name="flgnatl", column=@Column(name="FLGNATL", nullable=false, length=1) ) } )
    public SwNatlDirId getId() {
        return this.id;
    }
    
    public void setId(SwNatlDirId id) {
        this.id = id;
    }

    
    @Column(name="NAM_DIRECTORY")
    public String getNamDirectory() {
        return this.namDirectory;
    }
    
    public void setNamDirectory(String namDirectory) {
        this.namDirectory = namDirectory;
    }

    
    @Column(name="ISENABLED", length=1)
    public String getIsenabled() {
        return this.isenabled;
    }
    
    public void setIsenabled(String isenabled) {
        this.isenabled = isenabled;
    }




}


