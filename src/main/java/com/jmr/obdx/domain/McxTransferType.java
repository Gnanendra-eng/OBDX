package com.jmr.obdx.domain;

import java.math.BigDecimal;
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
@Table(name="MCX_TRANSFER_TYPE"
    ,schema="JMR_OBDX"
)
public class McxTransferType  implements java.io.Serializable {


     private long id;
     private String description;
     private String isActive;
     private String transferType;
     private Set<McxBeneficiary> mcxBeneficiaries = new HashSet<McxBeneficiary>(0);

    public McxTransferType() {
    }
	
    public McxTransferType(long id) {
        this.id = id;
    }

    
    public McxTransferType(long id, String description, String isActive, String transferType, Set<McxBeneficiary> mcxBeneficiaries) {
       this.id = id;
       this.description = description;
       this.isActive = isActive;
       this.transferType = transferType;
       this.mcxBeneficiaries = mcxBeneficiaries;
    }
   
     public McxTransferType(String transferType) {
		this.transferType = transferType;
	}

	@Id 
    @Column(name="ID", unique=true, nullable=false, precision=22, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    @Column(name="DESCRIPTION", length=500)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="IS_ACTIVE", length=5)
    public String getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Column(name="TRANSFER_TYPE", length=5)
    public String getTransferType() {
        return this.transferType;
    }
    
    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="mcxTransferType")
    public Set<McxBeneficiary> getMcxBeneficiaries() {
        return this.mcxBeneficiaries;
    }
    
    public void setMcxBeneficiaries(Set<McxBeneficiary> mcxBeneficiaries) {
        this.mcxBeneficiaries = mcxBeneficiaries;
    }
}


