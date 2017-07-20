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
@Table(name="MCX_TRANSFER_VIA_TYPE"
    ,schema="JMR_OBDX"
)
public class McxTransferViaType  implements java.io.Serializable {


     private long id;
     private String description;
     private String isActive;
     private String transferViaType;
     private Set<McxBeneficiary> mcxBeneficiaries = new HashSet<McxBeneficiary>(0);

    public McxTransferViaType() {
    }

    public McxTransferViaType(long id) {
        this.id = id;
    }
    
    public McxTransferViaType(long id, String description, String isActive, String transferViaType, Set<McxBeneficiary> mcxBeneficiaries) {
       this.id = id;
       this.description = description;
       this.isActive = isActive;
       this.transferViaType = transferViaType;
       this.mcxBeneficiaries = mcxBeneficiaries;
    }
   
     public McxTransferViaType(String transferViaType) {
		this.transferViaType = transferViaType;
	}

	@Id 
    @Column(name="ID", unique=true, nullable=false, precision=10, scale=0)
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

    @Column(name="TRANSFER_VIA_TYPE", length=5)
    public String getTransferViaType() {
        return this.transferViaType;
    }
    
    public void setTransferViaType(String transferViaType) {
        this.transferViaType = transferViaType;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="mcxTransferViaType")
    public Set<McxBeneficiary> getMcxBeneficiaries() {
        return this.mcxBeneficiaries;
    }
    
    public void setMcxBeneficiaries(Set<McxBeneficiary> mcxBeneficiaries) {
        this.mcxBeneficiaries = mcxBeneficiaries;
    }
}



