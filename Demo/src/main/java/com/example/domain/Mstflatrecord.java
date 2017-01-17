package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Mstflatrecord generated by hbm2java
 */
@Entity
@Table(name="MSTFLATRECORD"
    ,schema="FCDBADMIN_RK"
)
public class Mstflatrecord  implements java.io.Serializable {


     private MstflatrecordId id;
     private Application application;
     private String description;
     private String sepstring;
     private String encoding;
     private Set<Mstflatfield> mstflatfields = new HashSet<Mstflatfield>(0);
     private Set<Mstflatgroup> mstflatgroups = new HashSet<Mstflatgroup>(0);

    public Mstflatrecord() {
    }

	
    public Mstflatrecord(MstflatrecordId id, Application application) {
        this.id = id;
        this.application = application;
    }
    public Mstflatrecord(MstflatrecordId id, Application application, String description, String sepstring, String encoding, Set<Mstflatfield> mstflatfields, Set<Mstflatgroup> mstflatgroups) {
       this.id = id;
       this.application = application;
       this.description = description;
       this.sepstring = sepstring;
       this.encoding = encoding;
       this.mstflatfields = mstflatfields;
       this.mstflatgroups = mstflatgroups;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idapp", column=@Column(name="IDAPP", nullable=false, length=2) ), 
        @AttributeOverride(name="idrecord", column=@Column(name="IDRECORD", nullable=false, length=10) ) } )
    public MstflatrecordId getId() {
        return this.id;
    }
    
    public void setId(MstflatrecordId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDAPP", nullable=false, insertable=false, updatable=false)
    public Application getApplication() {
        return this.application;
    }
    
    public void setApplication(Application application) {
        this.application = application;
    }

    
    @Column(name="DESCRIPTION", length=30)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="SEPSTRING", length=10)
    public String getSepstring() {
        return this.sepstring;
    }
    
    public void setSepstring(String sepstring) {
        this.sepstring = sepstring;
    }

    
    @Column(name="ENCODING", length=20)
    public String getEncoding() {
        return this.encoding;
    }
    
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mstflatrecord")
    public Set<Mstflatfield> getMstflatfields() {
        return this.mstflatfields;
    }
    
    public void setMstflatfields(Set<Mstflatfield> mstflatfields) {
        this.mstflatfields = mstflatfields;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mstflatrecord")
    public Set<Mstflatgroup> getMstflatgroups() {
        return this.mstflatgroups;
    }
    
    public void setMstflatgroups(Set<Mstflatgroup> mstflatgroups) {
        this.mstflatgroups = mstflatgroups;
    }




}


