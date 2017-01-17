package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Events generated by hbm2java
 */
@Entity
@Table(name="EVENTS"
    ,schema="FCDBADMIN_RK"
)
public class Events  implements java.io.Serializable {


     private BigDecimal eventId;
     private String name;

    public Events() {
    }

	
    public Events(BigDecimal eventId) {
        this.eventId = eventId;
    }
    public Events(BigDecimal eventId, String name) {
       this.eventId = eventId;
       this.name = name;
    }
   
     @Id 

    
    @Column(name="EVENT_ID", unique=true, nullable=false, scale=0)
    public BigDecimal getEventId() {
        return this.eventId;
    }
    
    public void setEventId(BigDecimal eventId) {
        this.eventId = eventId;
    }

    
    @Column(name="NAME")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


