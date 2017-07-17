package com.jmr.obdx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * \
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

    public McxBillerOperator() {
    }

    public McxBillerOperator(long id, String operator, String profile) {
       this.id = id;
       this.operator = operator;
       this.profile = profile;
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




}



