package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Mstconnect generated by hbm2java
 */
@Entity
@Table(name="MSTCONNECT"
    ,schema="FCDBADMIN_RK"
)
public class Mstconnect  implements java.io.Serializable {


     private String daemonname;
     private String description;
     private Character prestart;
     private String requesturi;
     private String propertiesstr;

    public Mstconnect() {
    }

	
    public Mstconnect(String daemonname) {
        this.daemonname = daemonname;
    }
    public Mstconnect(String daemonname, String description, Character prestart, String requesturi, String propertiesstr) {
       this.daemonname = daemonname;
       this.description = description;
       this.prestart = prestart;
       this.requesturi = requesturi;
       this.propertiesstr = propertiesstr;
    }
   
     @Id 

    
    @Column(name="DAEMONNAME", unique=true, nullable=false, length=30)
    public String getDaemonname() {
        return this.daemonname;
    }
    
    public void setDaemonname(String daemonname) {
        this.daemonname = daemonname;
    }

    
    @Column(name="DESCRIPTION")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="PRESTART", length=1)
    public Character getPrestart() {
        return this.prestart;
    }
    
    public void setPrestart(Character prestart) {
        this.prestart = prestart;
    }

    
    @Column(name="REQUESTURI")
    public String getRequesturi() {
        return this.requesturi;
    }
    
    public void setRequesturi(String requesturi) {
        this.requesturi = requesturi;
    }

    
    @Column(name="PROPERTIESSTR", length=2000)
    public String getPropertiesstr() {
        return this.propertiesstr;
    }
    
    public void setPropertiesstr(String propertiesstr) {
        this.propertiesstr = propertiesstr;
    }




}


