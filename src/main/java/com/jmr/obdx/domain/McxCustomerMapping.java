package com.jmr.obdx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name="MCX_CUSTOMER_MAPPING"
    ,schema="JMR_OBDX"
)
public class McxCustomerMapping  implements java.io.Serializable {


     private long id;
     private McxUser mcxUser;
     private String isPrimary;
     private String customerId;

    public McxCustomerMapping() {
    }

	
    public McxCustomerMapping(long id, McxUser mcxUser, String customerId) {
        this.id = id;
        this.mcxUser = mcxUser;
        this.customerId = customerId;
    }
    public McxCustomerMapping(long id, McxUser mcxUser, String isPrimary, String customerId) {
       this.id = id;
       this.mcxUser = mcxUser;
       this.isPrimary = isPrimary;
       this.customerId = customerId;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=10, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REF_USER_ID", nullable=false)
    public McxUser getMcxUser() {
        return this.mcxUser;
    }
    
    public void setMcxUser(McxUser mcxUser) {
        this.mcxUser = mcxUser;
    }

    
    @Column(name="IS_PRIMARY", length=5)
    public String getIsPrimary() {
        return this.isPrimary;
    }
    
    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }

    
    @Column(name="CUSTOMER_ID", nullable=false, length=100)
    public String getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }




}


