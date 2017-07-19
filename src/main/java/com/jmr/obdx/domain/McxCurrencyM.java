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
@Table(name="MCX_CURRENCY_M"
    ,schema="JMR_OBDX"
)
public class McxCurrencyM  implements java.io.Serializable {


     private long id;
     private String currencyDescription;
     private String currencyType;
     private String setAsDefaultPackage;
     private Set<McxTransactionData> mcxTransactionDatas = new HashSet<McxTransactionData>(0);

    public McxCurrencyM() {
    }
    public McxCurrencyM(String currencyDescription ) {
    	this.currencyDescription =currencyDescription;
    }

	
    public McxCurrencyM(long id, String currencyDescription, String currencyType) {
        this.id = id;
        this.currencyDescription = currencyDescription;
        this.currencyType = currencyType;
    }
    public McxCurrencyM(long id, String currencyDescription, String currencyType, String setAsDefaultPackage, Set<McxTransactionData> mcxTransactionDatas) {
       this.id = id;
       this.currencyDescription = currencyDescription;
       this.currencyType = currencyType;
       this.setAsDefaultPackage = setAsDefaultPackage;
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

    
    @Column(name="CURRENCY_DESCRIPTION", nullable=false, length=100)
    public String getCurrencyDescription() {
        return this.currencyDescription;
    }
    
    public void setCurrencyDescription(String currencyDescription) {
        this.currencyDescription = currencyDescription;
    }

    
    @Column(name="CURRENCY_TYPE", nullable=false, length=50)
    public String getCurrencyType() {
        return this.currencyType;
    }
    
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    
    @Column(name="SET_AS_DEFAULT_PACKAGE", length=10)
    public String getSetAsDefaultPackage() {
        return this.setAsDefaultPackage;
    }
    
    public void setSetAsDefaultPackage(String setAsDefaultPackage) {
        this.setAsDefaultPackage = setAsDefaultPackage;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxCurrencyM")
    public Set<McxTransactionData> getMcxTransactionDatas() {
        return this.mcxTransactionDatas;
    }
    
    public void setMcxTransactionDatas(Set<McxTransactionData> mcxTransactionDatas) {
        this.mcxTransactionDatas = mcxTransactionDatas;
    }




}


