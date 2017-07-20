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
@Table(name="MCX_TRANSACTION_M"
    ,schema="JMR_OBDX"
    , uniqueConstraints = @UniqueConstraint(columnNames="PRODUCT_DESCRIPTION") 
)
public class McxTransactionM  implements java.io.Serializable {

	 private long id;
	 private String service;
	 private String isActive;
	 private String allowAuthorization;
	 private String allowInitiation;
	 private String allowView;
	 private String operation;
	 private String product;
	 private String productDescription;
	 private String transactionMode;
	 private String description;
     private Set<McxAuditLog> mcxAuditLogs = new HashSet<McxAuditLog>(0);

    public McxTransactionM() {
    }

    public McxTransactionM(long id) {
    	this.id = id;
    }

    public McxTransactionM(long id, String service, String isActive) {
        this.id = id;
        this.service = service;
        this.isActive = isActive;
    }
    
    public McxTransactionM(long id, String service, String isActive, String allowAuthorization, String allowInitiation, String allowView, String operation, String product, String productDescription, String transactionMode, String description, Set<McxAuditLog> mcxAuditLogs) {
       this.id = id;
       this.service = service;
       this.isActive = isActive;
       this.allowAuthorization = allowAuthorization;
       this.allowInitiation = allowInitiation;
       this.allowView = allowView;
       this.operation = operation;
       this.product = product;
       this.productDescription = productDescription;
       this.transactionMode = transactionMode;
       this.description = description;
       this.mcxAuditLogs = mcxAuditLogs;
    }
   
    @Id 
    @Column(name="ID", unique=true, nullable=false, precision=10, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    @Column(name="SERVICE", nullable=false, length=500)
    public String getService() {
        return this.service;
    }
    
    public void setService(String service) {
        this.service = service;
    }

    @Column(name="IS_ACTIVE", nullable=false, length=5)
    public String getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
    
    @Column(name="ALLOW_AUTHORIZATION", length=5)
    public String getAllowAuthorization() {
        return this.allowAuthorization;
    }
    
    public void setAllowAuthorization(String allowAuthorization) {
        this.allowAuthorization = allowAuthorization;
    }
    
    @Column(name="ALLOW_INITIATION", length=5)
    public String getAllowInitiation() {
        return this.allowInitiation;
    }
    
    public void setAllowInitiation(String allowInitiation) {
        this.allowInitiation = allowInitiation;
    }
    
    @Column(name="ALLOW_VIEW", length=5)
    public String getAllowView() {
        return this.allowView;
    }
    
    public void setAllowView(String allowView) {
        this.allowView = allowView;
    }
    
    @Column(name="OPERATION", length=100)
    public String getOperation() {
        return this.operation;
    }
    
    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Column(name="PRODUCT", length=100)
    public String getProduct() {
        return this.product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }

    
    @Column(name="PRODUCT_DESCRIPTION", unique=true, length=500)
    public String getProductDescription() {
        return this.productDescription;
    }
    
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    @Column(name="TRANSACTION_MODE", length=50)
    public String getTransactionMode() {
        return this.transactionMode;
    }
    
    public void setTransactionMode(String transactionMode) {
        this.transactionMode = transactionMode;
    }

    @Column(name="DESCRIPTION", length=500)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="mcxTransactionM")
    public Set<McxAuditLog> getMcxAuditLogs() {
        return this.mcxAuditLogs;
    }
    
    public void setMcxAuditLogs(Set<McxAuditLog> mcxAuditLogs) {
        this.mcxAuditLogs = mcxAuditLogs;
    }
}
