package com.jmr.obdx.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name="MCX_USER_SESSION"
    ,schema="JMR_OBDX"
    , uniqueConstraints = @UniqueConstraint(columnNames="USERNAME") 
)
public class McxUserSession  implements java.io.Serializable {


     private long id;
     private McxUser mcxUser;
     private String sessionId;
     private Date creationDate;
     private Date lastAccessDate;
     private String language;
     private String remoteAddress;
     private Integer timeout;
     private String hostPrifix;
     private Integer activeTimeout;
     private String timezone;
     private String username;
     private String isValidFlag;
     private String deviceName;

    public McxUserSession() {
    }

	
    public McxUserSession(long id) {
        this.id = id;
    }
    public McxUserSession(long id, McxUser mcxUser, String sessionId, Date creationDate, Date lastAccessDate, String language, String remoteAddress, Integer timeout, String hostPrifix, Integer activeTimeout, String timezone, String username, String isValidFlag, String deviceName) {
       this.id = id;
       this.mcxUser = mcxUser;
       this.sessionId = sessionId;
       this.creationDate = creationDate;
       this.lastAccessDate = lastAccessDate;
       this.language = language;
       this.remoteAddress = remoteAddress;
       this.timeout = timeout;
       this.hostPrifix = hostPrifix;
       this.activeTimeout = activeTimeout;
       this.timezone = timezone;
       this.username = username;
       this.isValidFlag = isValidFlag;
       this.deviceName = deviceName;
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
    @JoinColumn(name="REF_USER_ID")
    public McxUser getMcxUser() {
        return this.mcxUser;
    }
    
    public void setMcxUser(McxUser mcxUser) {
        this.mcxUser = mcxUser;
    }

    
    @Column(name="SESSION_ID", length=100)
    public String getSessionId() {
        return this.sessionId;
    }
    
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CREATION_DATE", length=7)
    public Date getCreationDate() {
        return this.creationDate;
    }
    
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="LAST_ACCESS_DATE", length=7)
    public Date getLastAccessDate() {
        return this.lastAccessDate;
    }
    
    public void setLastAccessDate(Date lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
    }

    
    @Column(name="LANGUAGE", length=50)
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    
    @Column(name="REMOTE_ADDRESS", length=50)
    public String getRemoteAddress() {
        return this.remoteAddress;
    }
    
    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    
    @Column(name="TIMEOUT", precision=5, scale=0)
    public Integer getTimeout() {
        return this.timeout;
    }
    
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    
    @Column(name="HOST_PRIFIX", length=50)
    public String getHostPrifix() {
        return this.hostPrifix;
    }
    
    public void setHostPrifix(String hostPrifix) {
        this.hostPrifix = hostPrifix;
    }

    
    @Column(name="ACTIVE_TIMEOUT", precision=5, scale=0)
    public Integer getActiveTimeout() {
        return this.activeTimeout;
    }
    
    public void setActiveTimeout(Integer activeTimeout) {
        this.activeTimeout = activeTimeout;
    }

    
    @Column(name="TIMEZONE", length=100)
    public String getTimezone() {
        return this.timezone;
    }
    
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    
    @Column(name="USERNAME", unique=true, length=100)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="IS_VALID_FLAG", length=5)
    public String getIsValidFlag() {
        return this.isValidFlag;
    }
    
    public void setIsValidFlag(String isValidFlag) {
        this.isValidFlag = isValidFlag;
    }

    
    @Column(name="DEVICE_NAME", length=10)
    public String getDeviceName() {
        return this.deviceName;
    }
    
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }




}


