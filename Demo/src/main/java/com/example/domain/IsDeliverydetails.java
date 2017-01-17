package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * IsDeliverydetails generated by hbm2java
 */
@Entity
@Table(name="IS_DELIVERYDETAILS"
    ,schema="FCDBADMIN_RK"
)
public class IsDeliverydetails  implements java.io.Serializable {


     private IsDeliverydetailsId id;
     private Mstentity mstentity;
     private String entity;
     private String acctnumber;
     private String acctname;
     private String deliveryaddtype;
     private String deliveryaddress1;
     private String deliveryaddress2;
     private String deliveryaddress3;
     private String deliveryaddress4;
     private String deliveryzipcode;
     private String deilverycountry;
     private String deilverybicode;
     private String certmessage;
     private String todeliveryoption;
     private String todeliverytype;
     private String toentity;
     private String toacctnumber;
     private String toacctname;
     private String todeliveryaddtype;
     private String todeliveryaddress1;
     private String todeliveryaddress2;
     private String todeliveryaddress3;
     private String todeliveryaddress4;
     private String todeliveryzipcode;
     private String todeilverycountry;
     private String todeilverybicode;
     private String tocertmessage;
     private String deliverytype;
     private Long numseq;

    public IsDeliverydetails() {
    }

	
    public IsDeliverydetails(IsDeliverydetailsId id, Mstentity mstentity) {
        this.id = id;
        this.mstentity = mstentity;
    }
    public IsDeliverydetails(IsDeliverydetailsId id, Mstentity mstentity, String entity, String acctnumber, String acctname, String deliveryaddtype, String deliveryaddress1, String deliveryaddress2, String deliveryaddress3, String deliveryaddress4, String deliveryzipcode, String deilverycountry, String deilverybicode, String certmessage, String todeliveryoption, String todeliverytype, String toentity, String toacctnumber, String toacctname, String todeliveryaddtype, String todeliveryaddress1, String todeliveryaddress2, String todeliveryaddress3, String todeliveryaddress4, String todeliveryzipcode, String todeilverycountry, String todeilverybicode, String tocertmessage, String deliverytype, Long numseq) {
       this.id = id;
       this.mstentity = mstentity;
       this.entity = entity;
       this.acctnumber = acctnumber;
       this.acctname = acctname;
       this.deliveryaddtype = deliveryaddtype;
       this.deliveryaddress1 = deliveryaddress1;
       this.deliveryaddress2 = deliveryaddress2;
       this.deliveryaddress3 = deliveryaddress3;
       this.deliveryaddress4 = deliveryaddress4;
       this.deliveryzipcode = deliveryzipcode;
       this.deilverycountry = deilverycountry;
       this.deilverybicode = deilverybicode;
       this.certmessage = certmessage;
       this.todeliveryoption = todeliveryoption;
       this.todeliverytype = todeliverytype;
       this.toentity = toentity;
       this.toacctnumber = toacctnumber;
       this.toacctname = toacctname;
       this.todeliveryaddtype = todeliveryaddtype;
       this.todeliveryaddress1 = todeliveryaddress1;
       this.todeliveryaddress2 = todeliveryaddress2;
       this.todeliveryaddress3 = todeliveryaddress3;
       this.todeliveryaddress4 = todeliveryaddress4;
       this.todeliveryzipcode = todeliveryzipcode;
       this.todeilverycountry = todeilverycountry;
       this.todeilverybicode = todeilverybicode;
       this.tocertmessage = tocertmessage;
       this.deliverytype = deliverytype;
       this.numseq = numseq;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="txnnumber", column=@Column(name="TXNNUMBER", nullable=false, length=25) ), 
        @AttributeOverride(name="idcust", column=@Column(name="IDCUST", nullable=false) ), 
        @AttributeOverride(name="iduh", column=@Column(name="IDUH", nullable=false, length=16) ), 
        @AttributeOverride(name="idfund", column=@Column(name="IDFUND", nullable=false, length=10) ), 
        @AttributeOverride(name="idEntity", column=@Column(name="ID_ENTITY", nullable=false, length=5) ) } )
    public IsDeliverydetailsId getId() {
        return this.id;
    }
    
    public void setId(IsDeliverydetailsId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ENTITY", nullable=false, insertable=false, updatable=false)
    public Mstentity getMstentity() {
        return this.mstentity;
    }
    
    public void setMstentity(Mstentity mstentity) {
        this.mstentity = mstentity;
    }

    
    @Column(name="ENTITY", length=50)
    public String getEntity() {
        return this.entity;
    }
    
    public void setEntity(String entity) {
        this.entity = entity;
    }

    
    @Column(name="ACCTNUMBER", length=20)
    public String getAcctnumber() {
        return this.acctnumber;
    }
    
    public void setAcctnumber(String acctnumber) {
        this.acctnumber = acctnumber;
    }

    
    @Column(name="ACCTNAME", length=50)
    public String getAcctname() {
        return this.acctname;
    }
    
    public void setAcctname(String acctname) {
        this.acctname = acctname;
    }

    
    @Column(name="DELIVERYADDTYPE", length=10)
    public String getDeliveryaddtype() {
        return this.deliveryaddtype;
    }
    
    public void setDeliveryaddtype(String deliveryaddtype) {
        this.deliveryaddtype = deliveryaddtype;
    }

    
    @Column(name="DELIVERYADDRESS1", length=50)
    public String getDeliveryaddress1() {
        return this.deliveryaddress1;
    }
    
    public void setDeliveryaddress1(String deliveryaddress1) {
        this.deliveryaddress1 = deliveryaddress1;
    }

    
    @Column(name="DELIVERYADDRESS2", length=50)
    public String getDeliveryaddress2() {
        return this.deliveryaddress2;
    }
    
    public void setDeliveryaddress2(String deliveryaddress2) {
        this.deliveryaddress2 = deliveryaddress2;
    }

    
    @Column(name="DELIVERYADDRESS3", length=50)
    public String getDeliveryaddress3() {
        return this.deliveryaddress3;
    }
    
    public void setDeliveryaddress3(String deliveryaddress3) {
        this.deliveryaddress3 = deliveryaddress3;
    }

    
    @Column(name="DELIVERYADDRESS4", length=50)
    public String getDeliveryaddress4() {
        return this.deliveryaddress4;
    }
    
    public void setDeliveryaddress4(String deliveryaddress4) {
        this.deliveryaddress4 = deliveryaddress4;
    }

    
    @Column(name="DELIVERYZIPCODE", length=20)
    public String getDeliveryzipcode() {
        return this.deliveryzipcode;
    }
    
    public void setDeliveryzipcode(String deliveryzipcode) {
        this.deliveryzipcode = deliveryzipcode;
    }

    
    @Column(name="DEILVERYCOUNTRY", length=20)
    public String getDeilverycountry() {
        return this.deilverycountry;
    }
    
    public void setDeilverycountry(String deilverycountry) {
        this.deilverycountry = deilverycountry;
    }

    
    @Column(name="DEILVERYBICODE", length=15)
    public String getDeilverybicode() {
        return this.deilverybicode;
    }
    
    public void setDeilverybicode(String deilverybicode) {
        this.deilverybicode = deilverybicode;
    }

    
    @Column(name="CERTMESSAGE", length=100)
    public String getCertmessage() {
        return this.certmessage;
    }
    
    public void setCertmessage(String certmessage) {
        this.certmessage = certmessage;
    }

    
    @Column(name="TODELIVERYOPTION", length=10)
    public String getTodeliveryoption() {
        return this.todeliveryoption;
    }
    
    public void setTodeliveryoption(String todeliveryoption) {
        this.todeliveryoption = todeliveryoption;
    }

    
    @Column(name="TODELIVERYTYPE", length=10)
    public String getTodeliverytype() {
        return this.todeliverytype;
    }
    
    public void setTodeliverytype(String todeliverytype) {
        this.todeliverytype = todeliverytype;
    }

    
    @Column(name="TOENTITY", length=50)
    public String getToentity() {
        return this.toentity;
    }
    
    public void setToentity(String toentity) {
        this.toentity = toentity;
    }

    
    @Column(name="TOACCTNUMBER", length=20)
    public String getToacctnumber() {
        return this.toacctnumber;
    }
    
    public void setToacctnumber(String toacctnumber) {
        this.toacctnumber = toacctnumber;
    }

    
    @Column(name="TOACCTNAME", length=50)
    public String getToacctname() {
        return this.toacctname;
    }
    
    public void setToacctname(String toacctname) {
        this.toacctname = toacctname;
    }

    
    @Column(name="TODELIVERYADDTYPE", length=10)
    public String getTodeliveryaddtype() {
        return this.todeliveryaddtype;
    }
    
    public void setTodeliveryaddtype(String todeliveryaddtype) {
        this.todeliveryaddtype = todeliveryaddtype;
    }

    
    @Column(name="TODELIVERYADDRESS1", length=50)
    public String getTodeliveryaddress1() {
        return this.todeliveryaddress1;
    }
    
    public void setTodeliveryaddress1(String todeliveryaddress1) {
        this.todeliveryaddress1 = todeliveryaddress1;
    }

    
    @Column(name="TODELIVERYADDRESS2", length=50)
    public String getTodeliveryaddress2() {
        return this.todeliveryaddress2;
    }
    
    public void setTodeliveryaddress2(String todeliveryaddress2) {
        this.todeliveryaddress2 = todeliveryaddress2;
    }

    
    @Column(name="TODELIVERYADDRESS3", length=50)
    public String getTodeliveryaddress3() {
        return this.todeliveryaddress3;
    }
    
    public void setTodeliveryaddress3(String todeliveryaddress3) {
        this.todeliveryaddress3 = todeliveryaddress3;
    }

    
    @Column(name="TODELIVERYADDRESS4", length=50)
    public String getTodeliveryaddress4() {
        return this.todeliveryaddress4;
    }
    
    public void setTodeliveryaddress4(String todeliveryaddress4) {
        this.todeliveryaddress4 = todeliveryaddress4;
    }

    
    @Column(name="TODELIVERYZIPCODE", length=20)
    public String getTodeliveryzipcode() {
        return this.todeliveryzipcode;
    }
    
    public void setTodeliveryzipcode(String todeliveryzipcode) {
        this.todeliveryzipcode = todeliveryzipcode;
    }

    
    @Column(name="TODEILVERYCOUNTRY", length=20)
    public String getTodeilverycountry() {
        return this.todeilverycountry;
    }
    
    public void setTodeilverycountry(String todeilverycountry) {
        this.todeilverycountry = todeilverycountry;
    }

    
    @Column(name="TODEILVERYBICODE", length=15)
    public String getTodeilverybicode() {
        return this.todeilverybicode;
    }
    
    public void setTodeilverybicode(String todeilverybicode) {
        this.todeilverybicode = todeilverybicode;
    }

    
    @Column(name="TOCERTMESSAGE", length=100)
    public String getTocertmessage() {
        return this.tocertmessage;
    }
    
    public void setTocertmessage(String tocertmessage) {
        this.tocertmessage = tocertmessage;
    }

    
    @Column(name="DELIVERYTYPE", length=4)
    public String getDeliverytype() {
        return this.deliverytype;
    }
    
    public void setDeliverytype(String deliverytype) {
        this.deliverytype = deliverytype;
    }

    
    @Column(name="NUMSEQ", precision=18, scale=0)
    public Long getNumseq() {
        return this.numseq;
    }
    
    public void setNumseq(Long numseq) {
        this.numseq = numseq;
    }




}


