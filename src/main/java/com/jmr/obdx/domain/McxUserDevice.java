package com.jmr.obdx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name="MCX_USER_DEVICE"
    ,schema="JMR_OBDX"
)
public class McxUserDevice  implements java.io.Serializable {


     private long id;
     private McxDeviceM mcxDeviceM;
     private long refUserId;

    public McxUserDevice() {
    }

    public McxUserDevice(long id, McxDeviceM mcxDeviceM, long refUserId) {
       this.id = id;
       this.mcxDeviceM = mcxDeviceM;
       this.refUserId = refUserId;
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
    @JoinColumn(name="REF_DEVICE_ID", nullable=false)
    public McxDeviceM getMcxDeviceM() {
        return this.mcxDeviceM;
    }
    
    public void setMcxDeviceM(McxDeviceM mcxDeviceM) {
        this.mcxDeviceM = mcxDeviceM;
    }

    
    @Column(name="REF_USER_ID", nullable=false, precision=10, scale=0)
    public long getRefUserId() {
        return this.refUserId;
    }
    
    public void setRefUserId(long refUserId) {
        this.refUserId = refUserId;
    }




}


