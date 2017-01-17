package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ModuleMaint generated by hbm2java
 */
@Entity
@Table(name="MODULE_MAINT"
    ,schema="FCDBADMIN_RK"
)
public class ModuleMaint  implements java.io.Serializable {


     private String moduleId;
     private String moduleName;
     private String isenable;
     private String idEntity;
     private Set<ModpropMaint> modpropMaints = new HashSet<ModpropMaint>(0);

    public ModuleMaint() {
    }

	
    public ModuleMaint(String moduleId) {
        this.moduleId = moduleId;
    }
    public ModuleMaint(String moduleId, String moduleName, String isenable, String idEntity, Set<ModpropMaint> modpropMaints) {
       this.moduleId = moduleId;
       this.moduleName = moduleName;
       this.isenable = isenable;
       this.idEntity = idEntity;
       this.modpropMaints = modpropMaints;
    }
   
     @Id 

    
    @Column(name="MODULE_ID", unique=true, nullable=false, length=5)
    public String getModuleId() {
        return this.moduleId;
    }
    
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    
    @Column(name="MODULE_NAME", length=200)
    public String getModuleName() {
        return this.moduleName;
    }
    
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    
    @Column(name="ISENABLE", length=1)
    public String getIsenable() {
        return this.isenable;
    }
    
    public void setIsenable(String isenable) {
        this.isenable = isenable;
    }

    
    @Column(name="ID_ENTITY", length=200)
    public String getIdEntity() {
        return this.idEntity;
    }
    
    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="moduleMaint")
    public Set<ModpropMaint> getModpropMaints() {
        return this.modpropMaints;
    }
    
    public void setModpropMaints(Set<ModpropMaint> modpropMaints) {
        this.modpropMaints = modpropMaints;
    }




}


