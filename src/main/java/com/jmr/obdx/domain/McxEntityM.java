package com.jmr.obdx.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name="MCX_ENTITY_M"
    ,schema="JMR_OBDX"
    , uniqueConstraints = {@UniqueConstraint(columnNames="ENTITY"), @UniqueConstraint(columnNames="DESCRIPTION")} 
)
public class McxEntityM  implements java.io.Serializable {


     private long id;
     private String entity;
     private String description;
     private Set<McxUser> mcxUsers = new HashSet<McxUser>(0);
     private Set<McxAuthorityM> mcxAuthorityMs = new HashSet<McxAuthorityM>(0);

    public McxEntityM() {
    }

	
    public McxEntityM(long id, String entity) {
        this.id = id;
        this.entity = entity;
    }
    public McxEntityM(long id, String entity, String description, Set<McxUser> mcxUsers, Set<McxAuthorityM> mcxAuthorityMs) {
       this.id = id;
       this.entity = entity;
       this.description = description;
       this.mcxUsers = mcxUsers;
       this.mcxAuthorityMs = mcxAuthorityMs;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=10, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    
    @Column(name="ENTITY", unique=true, nullable=false, length=5)
    public String getEntity() {
        return this.entity;
    }
    
    public void setEntity(String entity) {
        this.entity = entity;
    }

    
    @Column(name="DESCRIPTION", unique=true, length=100)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxEntityM")
    public Set<McxUser> getMcxUsers() {
        return this.mcxUsers;
    }
    
    public void setMcxUsers(Set<McxUser> mcxUsers) {
        this.mcxUsers = mcxUsers;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxEntityM")
    public Set<McxAuthorityM> getMcxAuthorityMs() {
        return this.mcxAuthorityMs;
    }
    
    public void setMcxAuthorityMs(Set<McxAuthorityM> mcxAuthorityMs) {
        this.mcxAuthorityMs = mcxAuthorityMs;
    }




}



