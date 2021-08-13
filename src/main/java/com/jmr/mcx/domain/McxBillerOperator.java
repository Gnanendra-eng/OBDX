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
 * 
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name="MCX_BILLER_OPERATOR"
    ,schema="JMR_OBDX"
)
public class McxBillerOperator  implements java.io.Serializable {
	
	 private long id;
	 private String operator;
	 private String profile;
	 private Set<McxBiller> mcxBillers = new HashSet<McxBiller>(0);

    public McxBillerOperator() {
    }
    public McxBillerOperator(long id) {
    	this.id = id;
    }
	
    public McxBillerOperator(long id, String operator, String profile) {
        this.id = id;
        this.operator = operator;
        this.profile = profile;
    }
    public McxBillerOperator(long id, String operator, String profile, Set<McxBiller> mcxBillers) {
       this.id = id;
       this.operator = operator;
       this.profile = profile;
       this.mcxBillers = mcxBillers;
    }
   
    @Id 
    @Column(name="ID", unique=true, nullable=false, precision=10, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    @Column(name="OPERATOR", nullable=false, length=100)
    public String getOperator() {
        return this.operator;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    @Column(name="PROFILE", nullable=false, length=500)
    public String getProfile() {
        return this.profile;
    }
    
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="mcxBillerOperator")
    public Set<McxBiller> getMcxBillers() {
        return this.mcxBillers;
    }
    
    public void setMcxBillers(Set<McxBiller> mcxBillers) {
        this.mcxBillers = mcxBillers;
    }
}


