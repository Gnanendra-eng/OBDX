package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EntityLevelLimitsEffective generated by hbm2java
 */
@Entity
@Table(name="ENTITY_LEVEL_LIMITS_EFFECTIVE"
    ,schema="FCDBADMIN_RK"
)
public class EntityLevelLimitsEffective  implements java.io.Serializable {


     private EntityLevelLimitsEffectiveId id;
     private BigDecimal dailyTxnLimit;
     private BigDecimal txnLimit;
     private BigDecimal aggDailyLimit;
     private BigDecimal minTxnLimit;
     private Long noOfTxns;
     private Character applicability;
     private Date effectiveDate;

    public EntityLevelLimitsEffective() {
    }

	
    public EntityLevelLimitsEffective(EntityLevelLimitsEffectiveId id) {
        this.id = id;
    }
    public EntityLevelLimitsEffective(EntityLevelLimitsEffectiveId id, BigDecimal dailyTxnLimit, BigDecimal txnLimit, BigDecimal aggDailyLimit, BigDecimal minTxnLimit, Long noOfTxns, Character applicability, Date effectiveDate) {
       this.id = id;
       this.dailyTxnLimit = dailyTxnLimit;
       this.txnLimit = txnLimit;
       this.aggDailyLimit = aggDailyLimit;
       this.minTxnLimit = minTxnLimit;
       this.noOfTxns = noOfTxns;
       this.applicability = applicability;
       this.effectiveDate = effectiveDate;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idEntity", column=@Column(name="ID_ENTITY", nullable=false, length=5) ), 
        @AttributeOverride(name="typeuser", column=@Column(name="TYPEUSER", nullable=false, length=3) ), 
        @AttributeOverride(name="idchannel", column=@Column(name="IDCHANNEL", nullable=false, length=2) ), 
        @AttributeOverride(name="idtxn", column=@Column(name="IDTXN", nullable=false, length=3) ) } )
    public EntityLevelLimitsEffectiveId getId() {
        return this.id;
    }
    
    public void setId(EntityLevelLimitsEffectiveId id) {
        this.id = id;
    }

    
    @Column(name="DAILY_TXN_LIMIT", precision=10)
    public BigDecimal getDailyTxnLimit() {
        return this.dailyTxnLimit;
    }
    
    public void setDailyTxnLimit(BigDecimal dailyTxnLimit) {
        this.dailyTxnLimit = dailyTxnLimit;
    }

    
    @Column(name="TXN_LIMIT", precision=10)
    public BigDecimal getTxnLimit() {
        return this.txnLimit;
    }
    
    public void setTxnLimit(BigDecimal txnLimit) {
        this.txnLimit = txnLimit;
    }

    
    @Column(name="AGG_DAILY_LIMIT", precision=10)
    public BigDecimal getAggDailyLimit() {
        return this.aggDailyLimit;
    }
    
    public void setAggDailyLimit(BigDecimal aggDailyLimit) {
        this.aggDailyLimit = aggDailyLimit;
    }

    
    @Column(name="MIN_TXN_LIMIT", precision=10)
    public BigDecimal getMinTxnLimit() {
        return this.minTxnLimit;
    }
    
    public void setMinTxnLimit(BigDecimal minTxnLimit) {
        this.minTxnLimit = minTxnLimit;
    }

    
    @Column(name="NO_OF_TXNS", precision=10, scale=0)
    public Long getNoOfTxns() {
        return this.noOfTxns;
    }
    
    public void setNoOfTxns(Long noOfTxns) {
        this.noOfTxns = noOfTxns;
    }

    
    @Column(name="APPLICABILITY", length=1)
    public Character getApplicability() {
        return this.applicability;
    }
    
    public void setApplicability(Character applicability) {
        this.applicability = applicability;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="EFFECTIVE_DATE", length=7)
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }
    
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }




}


