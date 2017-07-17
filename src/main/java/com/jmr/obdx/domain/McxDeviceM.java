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
@Table(name="MCX_DEVICE_M"
    ,schema="JMR_OBDX"
    , uniqueConstraints = @UniqueConstraint(columnNames="DEVICE_ID") 
)
public class McxDeviceM  implements java.io.Serializable {


     private long id;
     private String deviceId;
     private String name;
     private String deviceType;
     private Set<McxUserDevice> mcxUserDevices = new HashSet<McxUserDevice>(0);

    public McxDeviceM() {
    }

	
    public McxDeviceM(long id, String deviceId, String name) {
        this.id = id;
        this.deviceId = deviceId;
        this.name = name;
    }
    public McxDeviceM(long id, String deviceId, String name, String deviceType, Set<McxUserDevice> mcxUserDevices) {
       this.id = id;
       this.deviceId = deviceId;
       this.name = name;
       this.deviceType = deviceType;
       this.mcxUserDevices = mcxUserDevices;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=10, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    
    @Column(name="DEVICE_ID", unique=true, nullable=false, length=20)
    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    
    @Column(name="NAME", nullable=false, length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="DEVICE_TYPE", length=20)
    public String getDeviceType() {
        return this.deviceType;
    }
    
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxDeviceM")
    public Set<McxUserDevice> getMcxUserDevices() {
        return this.mcxUserDevices;
    }
    
    public void setMcxUserDevices(Set<McxUserDevice> mcxUserDevices) {
        this.mcxUserDevices = mcxUserDevices;
    }




}


