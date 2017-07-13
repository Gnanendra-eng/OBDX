package com.jmr.obdx.domain;

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
@Table(name="MCX_ACCOUNT_TYPE_M"
    ,schema="JMR_OBDX"
)
public class McxAccountTypeM  implements java.io.Serializable {


     private long id;
     private String description;
     private String accountType;
     private String isActive;
     private Set<McxTransactionData> mcxTransactionDatas = new HashSet<McxTransactionData>(0);

    public McxAccountTypeM() {
    }

	
    public McxAccountTypeM(long id, String description, String accountType, String isActive) {
        this.id = id;
        this.description = description;
        this.accountType = accountType;
        this.isActive = isActive;
    }
    public McxAccountTypeM(long id, String description, String accountType, String isActive, Set<McxTransactionData> mcxTransactionDatas) {
       this.id = id;
       this.description = description;
       this.accountType = accountType;
       this.isActive = isActive;
       this.mcxTransactionDatas = mcxTransactionDatas;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=10, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    
    @Column(name="DESCRIPTION", nullable=false, length=500)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="ACCOUNT_TYPE", nullable=false, length=500)
    public String getAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    
    @Column(name="IS_ACTIVE", nullable=false, length=5)
    public String getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxAccountTypeM")
    public Set<McxTransactionData> getMcxTransactionDatas() {
        return this.mcxTransactionDatas;
    }
    
    public void setMcxTransactionDatas(Set<McxTransactionData> mcxTransactionDatas) {
        this.mcxTransactionDatas = mcxTransactionDatas;
    }




}
