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
 * Mstalertprofilechannel generated by hbm2java
 */
@Entity
@Table(name="MSTALERTPROFILECHANNEL"
    ,schema="FCDBADMIN_RK"
)
public class Mstalertprofilechannel  implements java.io.Serializable {


     private MstalertprofilechannelId id;
     private Mstalertnotifier mstalertnotifier;
     private String channelValue;
     private Character flgActive;

    public Mstalertprofilechannel() {
    }

	
    public Mstalertprofilechannel(MstalertprofilechannelId id, Mstalertnotifier mstalertnotifier) {
        this.id = id;
        this.mstalertnotifier = mstalertnotifier;
    }
    public Mstalertprofilechannel(MstalertprofilechannelId id, Mstalertnotifier mstalertnotifier, String channelValue, Character flgActive) {
       this.id = id;
       this.mstalertnotifier = mstalertnotifier;
       this.channelValue = channelValue;
       this.flgActive = flgActive;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="iduser", column=@Column(name="IDUSER", nullable=false, length=20) ), 
        @AttributeOverride(name="idchannel", column=@Column(name="IDCHANNEL", nullable=false, length=50) ) } )
    public MstalertprofilechannelId getId() {
        return this.id;
    }
    
    public void setId(MstalertprofilechannelId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDCHANNEL", nullable=false, insertable=false, updatable=false)
    public Mstalertnotifier getMstalertnotifier() {
        return this.mstalertnotifier;
    }
    
    public void setMstalertnotifier(Mstalertnotifier mstalertnotifier) {
        this.mstalertnotifier = mstalertnotifier;
    }

    
    @Column(name="CHANNEL_VALUE", length=100)
    public String getChannelValue() {
        return this.channelValue;
    }
    
    public void setChannelValue(String channelValue) {
        this.channelValue = channelValue;
    }

    
    @Column(name="FLG_ACTIVE", length=1)
    public Character getFlgActive() {
        return this.flgActive;
    }
    
    public void setFlgActive(Character flgActive) {
        this.flgActive = flgActive;
    }




}


