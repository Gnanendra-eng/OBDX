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
import javax.persistence.UniqueConstraint;

/**
 * Msthostinterface generated by hbm2java
 */
@Entity
@Table(name="MSTHOSTINTERFACE"
    ,schema="FCDBADMIN_RK"
    , uniqueConstraints = @UniqueConstraint(columnNames="IDINTERFACE") 
)
public class Msthostinterface  implements java.io.Serializable {


     private MsthostinterfaceId id;
     private Mstentity mstentity;
     private String requestIfaceMapper;
     private String responseIfaceMapper;
     private String interfaceImpl;
     private Character isenabled;
     private String adtnlParams;
     private Character isdebugenabled;
     private String customLogger;
     private String idinterface;
     private String refIdEntity;

    public Msthostinterface() {
    }

	
    public Msthostinterface(MsthostinterfaceId id, Mstentity mstentity) {
        this.id = id;
        this.mstentity = mstentity;
    }
    public Msthostinterface(MsthostinterfaceId id, Mstentity mstentity, String requestIfaceMapper, String responseIfaceMapper, String interfaceImpl, Character isenabled, String adtnlParams, Character isdebugenabled, String customLogger, String idinterface, String refIdEntity) {
       this.id = id;
       this.mstentity = mstentity;
       this.requestIfaceMapper = requestIfaceMapper;
       this.responseIfaceMapper = responseIfaceMapper;
       this.interfaceImpl = interfaceImpl;
       this.isenabled = isenabled;
       this.adtnlParams = adtnlParams;
       this.isdebugenabled = isdebugenabled;
       this.customLogger = customLogger;
       this.idinterface = idinterface;
       this.refIdEntity = refIdEntity;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idEntity", column=@Column(name="ID_ENTITY", nullable=false, length=5) ), 
        @AttributeOverride(name="idrequest", column=@Column(name="IDREQUEST", nullable=false, length=50) ), 
        @AttributeOverride(name="idhost", column=@Column(name="IDHOST", nullable=false, length=5) ), 
        @AttributeOverride(name="version", column=@Column(name="VERSION", nullable=false, precision=22, scale=0) ) } )
    public MsthostinterfaceId getId() {
        return this.id;
    }
    
    public void setId(MsthostinterfaceId id) {
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

    
    @Column(name="REQUEST_IFACE_MAPPER")
    public String getRequestIfaceMapper() {
        return this.requestIfaceMapper;
    }
    
    public void setRequestIfaceMapper(String requestIfaceMapper) {
        this.requestIfaceMapper = requestIfaceMapper;
    }

    
    @Column(name="RESPONSE_IFACE_MAPPER")
    public String getResponseIfaceMapper() {
        return this.responseIfaceMapper;
    }
    
    public void setResponseIfaceMapper(String responseIfaceMapper) {
        this.responseIfaceMapper = responseIfaceMapper;
    }

    
    @Column(name="INTERFACE_IMPL", length=4000)
    public String getInterfaceImpl() {
        return this.interfaceImpl;
    }
    
    public void setInterfaceImpl(String interfaceImpl) {
        this.interfaceImpl = interfaceImpl;
    }

    
    @Column(name="ISENABLED", length=1)
    public Character getIsenabled() {
        return this.isenabled;
    }
    
    public void setIsenabled(Character isenabled) {
        this.isenabled = isenabled;
    }

    
    @Column(name="ADTNL_PARAMS", length=4000)
    public String getAdtnlParams() {
        return this.adtnlParams;
    }
    
    public void setAdtnlParams(String adtnlParams) {
        this.adtnlParams = adtnlParams;
    }

    
    @Column(name="ISDEBUGENABLED", length=1)
    public Character getIsdebugenabled() {
        return this.isdebugenabled;
    }
    
    public void setIsdebugenabled(Character isdebugenabled) {
        this.isdebugenabled = isdebugenabled;
    }

    
    @Column(name="CUSTOM_LOGGER", length=400)
    public String getCustomLogger() {
        return this.customLogger;
    }
    
    public void setCustomLogger(String customLogger) {
        this.customLogger = customLogger;
    }

    
    @Column(name="IDINTERFACE", unique=true, length=20)
    public String getIdinterface() {
        return this.idinterface;
    }
    
    public void setIdinterface(String idinterface) {
        this.idinterface = idinterface;
    }

    
    @Column(name="REF_ID_ENTITY", length=300)
    public String getRefIdEntity() {
        return this.refIdEntity;
    }
    
    public void setRefIdEntity(String refIdEntity) {
        this.refIdEntity = refIdEntity;
    }




}


