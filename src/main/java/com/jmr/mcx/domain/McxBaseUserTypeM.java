package com.jmr.mcx.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name="MCX_BASE_USER_TYPE_M"
    ,schema="JMR_OBDX"
)
public class McxBaseUserTypeM  implements java.io.Serializable {

     private long id;
     private String userType;
     private String isActive;
     private String description;
     private Set<McxUser> mcxUsers = new HashSet<McxUser>(0);
     private Set<McxAuthorityM> mcxAuthorityMs = new HashSet<McxAuthorityM>(0);

    public McxBaseUserTypeM() {
    }
	
    public McxBaseUserTypeM(long id, String userType, String isActive, String description) {
        this.id = id;
        this.userType = userType;
        this.isActive = isActive;
        this.description = description;
    }
    public McxBaseUserTypeM(long id, String userType, String isActive, String description, Set<McxUser> mcxUsers, Set<McxAuthorityM> mcxAuthorityMs) {
       this.id = id;
       this.userType = userType;
       this.isActive = isActive;
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

    @Column(name="USER_TYPE", nullable=false, length=100)
    public String getUserType() {
        return this.userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    @Column(name="IS_ACTIVE", nullable=false, length=5)
    public String getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
    
    @Column(name="DESCRIPTION", nullable=false, length=500)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="mcxBaseUserTypeM")
    public Set<McxUser> getMcxUsers() {
        return this.mcxUsers;
    }
    
    public void setMcxUsers(Set<McxUser> mcxUsers) {
        this.mcxUsers = mcxUsers;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="mcxBaseUserTypeM")
    public Set<McxAuthorityM> getMcxAuthorityMs() {
        return this.mcxAuthorityMs;
    }
    
    public void setMcxAuthorityMs(Set<McxAuthorityM> mcxAuthorityMs) {
        this.mcxAuthorityMs = mcxAuthorityMs;
    }
}


