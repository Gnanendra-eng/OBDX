package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Usersessionsumdtls generated by hbm2java
 */
@Entity
@Table(name="USERSESSIONSUMDTLS"
    ,schema="FCDBADMIN_RK"
)
public class Usersessionsumdtls  implements java.io.Serializable {


     private UsersessionsumdtlsId id;
     private Usersessionsummary usersessionsummary;
     private String linedesc;
     private String linevalue;

    public Usersessionsumdtls() {
    }

	
    public Usersessionsumdtls(UsersessionsumdtlsId id, Usersessionsummary usersessionsummary) {
        this.id = id;
        this.usersessionsummary = usersessionsummary;
    }
    public Usersessionsumdtls(UsersessionsumdtlsId id, Usersessionsummary usersessionsummary, String linedesc, String linevalue) {
       this.id = id;
       this.usersessionsummary = usersessionsummary;
       this.linedesc = linedesc;
       this.linevalue = linevalue;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idsession", column=@Column(name="IDSESSION", nullable=false, length=50) ), 
        @AttributeOverride(name="seqnbr", column=@Column(name="SEQNBR", nullable=false, precision=4, scale=0) ), 
        @AttributeOverride(name="linenumber", column=@Column(name="LINENUMBER", nullable=false, precision=3, scale=0) ) } )
    public UsersessionsumdtlsId getId() {
        return this.id;
    }
    
    public void setId(UsersessionsumdtlsId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="IDSESSION", referencedColumnName="IDSESSION", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="SEQNBR", referencedColumnName="SEQNBR", nullable=false, insertable=false, updatable=false) } )
    public Usersessionsummary getUsersessionsummary() {
        return this.usersessionsummary;
    }
    
    public void setUsersessionsummary(Usersessionsummary usersessionsummary) {
        this.usersessionsummary = usersessionsummary;
    }

    
    @Column(name="LINEDESC")
    public String getLinedesc() {
        return this.linedesc;
    }
    
    public void setLinedesc(String linedesc) {
        this.linedesc = linedesc;
    }

    
    @Column(name="LINEVALUE")
    public String getLinevalue() {
        return this.linevalue;
    }
    
    public void setLinevalue(String linevalue) {
        this.linevalue = linevalue;
    }




}


