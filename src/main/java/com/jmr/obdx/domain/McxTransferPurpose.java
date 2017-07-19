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
@Table(name="MCX_TRANSFER_PURPOSE"
    ,schema="JMR_OBDX"
)
public class McxTransferPurpose  implements java.io.Serializable {


     private long id;
     private String description;
     private String purposeType;
     private Set<McxTransactionData> mcxTransactionDatas = new HashSet<McxTransactionData>(0);

    public McxTransferPurpose(String description) {
    this.description=description;
    }

	
    public McxTransferPurpose(long id) {
        this.id = id;
    }
    public McxTransferPurpose(long id, String description, String purposeType, Set<McxTransactionData> mcxTransactionDatas) {
       this.id = id;
       this.description = description;
       this.purposeType = purposeType;
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

    
    @Column(name="DESCRIPTION", length=500)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="PURPOSE_TYPE", length=5)
    public String getPurposeType() {
        return this.purposeType;
    }
    
    public void setPurposeType(String purposeType) {
        this.purposeType = purposeType;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxTransferPurpose")
    public Set<McxTransactionData> getMcxTransactionDatas() {
        return this.mcxTransactionDatas;
    }
    
    public void setMcxTransactionDatas(Set<McxTransactionData> mcxTransactionDatas) {
        this.mcxTransactionDatas = mcxTransactionDatas;
    }




}


