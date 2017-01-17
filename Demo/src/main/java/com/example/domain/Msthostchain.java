package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Msthostchain generated by hbm2java
 */
@Entity
@Table(name="MSTHOSTCHAIN"
    ,schema="FCDBADMIN_RK"
)
public class Msthostchain  implements java.io.Serializable {


     private MsthostchainId id;
     private Byte seqno;
     private String conditionhandler;
     private String requestmapper;
     private Character responseauditreq;
     private String refResponseList;
     private String responsehandler;
     private Character isenable;
     private String errorIdmessage;
     private String successIdmessage;

    public Msthostchain() {
    }

	
    public Msthostchain(MsthostchainId id) {
        this.id = id;
    }
    public Msthostchain(MsthostchainId id, Byte seqno, String conditionhandler, String requestmapper, Character responseauditreq, String refResponseList, String responsehandler, Character isenable, String errorIdmessage, String successIdmessage) {
       this.id = id;
       this.seqno = seqno;
       this.conditionhandler = conditionhandler;
       this.requestmapper = requestmapper;
       this.responseauditreq = responseauditreq;
       this.refResponseList = refResponseList;
       this.responsehandler = responsehandler;
       this.isenable = isenable;
       this.errorIdmessage = errorIdmessage;
       this.successIdmessage = successIdmessage;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idrequest", column=@Column(name="IDREQUEST", nullable=false, length=20) ), 
        @AttributeOverride(name="refIdrequest", column=@Column(name="REF_IDREQUEST", nullable=false, length=20) ), 
        @AttributeOverride(name="idEntity", column=@Column(name="ID_ENTITY", nullable=false, length=5) ) } )
    public MsthostchainId getId() {
        return this.id;
    }
    
    public void setId(MsthostchainId id) {
        this.id = id;
    }

    
    @Column(name="SEQNO", precision=2, scale=0)
    public Byte getSeqno() {
        return this.seqno;
    }
    
    public void setSeqno(Byte seqno) {
        this.seqno = seqno;
    }

    
    @Column(name="CONDITIONHANDLER")
    public String getConditionhandler() {
        return this.conditionhandler;
    }
    
    public void setConditionhandler(String conditionhandler) {
        this.conditionhandler = conditionhandler;
    }

    
    @Column(name="REQUESTMAPPER")
    public String getRequestmapper() {
        return this.requestmapper;
    }
    
    public void setRequestmapper(String requestmapper) {
        this.requestmapper = requestmapper;
    }

    
    @Column(name="RESPONSEAUDITREQ", length=1)
    public Character getResponseauditreq() {
        return this.responseauditreq;
    }
    
    public void setResponseauditreq(Character responseauditreq) {
        this.responseauditreq = responseauditreq;
    }

    
    @Column(name="REF_RESPONSE_LIST", length=50)
    public String getRefResponseList() {
        return this.refResponseList;
    }
    
    public void setRefResponseList(String refResponseList) {
        this.refResponseList = refResponseList;
    }

    
    @Column(name="RESPONSEHANDLER")
    public String getResponsehandler() {
        return this.responsehandler;
    }
    
    public void setResponsehandler(String responsehandler) {
        this.responsehandler = responsehandler;
    }

    
    @Column(name="ISENABLE", length=1)
    public Character getIsenable() {
        return this.isenable;
    }
    
    public void setIsenable(Character isenable) {
        this.isenable = isenable;
    }

    
    @Column(name="ERROR_IDMESSAGE", length=20)
    public String getErrorIdmessage() {
        return this.errorIdmessage;
    }
    
    public void setErrorIdmessage(String errorIdmessage) {
        this.errorIdmessage = errorIdmessage;
    }

    
    @Column(name="SUCCESS_IDMESSAGE", length=20)
    public String getSuccessIdmessage() {
        return this.successIdmessage;
    }
    
    public void setSuccessIdmessage(String successIdmessage) {
        this.successIdmessage = successIdmessage;
    }




}


