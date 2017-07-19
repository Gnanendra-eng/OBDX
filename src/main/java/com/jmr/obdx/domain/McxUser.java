package com.jmr.obdx.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name="MCX_USER"
    ,schema="JMR_OBDX"
)
public class McxUser  implements java.io.Serializable {


     private long id;
     private McxEntityM mcxEntityM;
     private McxBaseUserTypeM mcxBaseUserTypeM;
     private String firstName;
     private String lastName;
     private String address;
     private String city;
     private String state;
     private String country;
     private String mobileNumber;
     private String zipCode;
     private String faxNumber;
     private String emailId;
     private String salutation;
     private Date   dateOfBirth;
     private String phoneNumber;
     private Set<McxAuditLog> mcxAuditLogs = new HashSet<McxAuditLog>(0);
     private Set<McxCustomerMapping> mcxCustomerMappings = new HashSet<McxCustomerMapping>(0);
     private Set<McxLogin> mcxLogins = new HashSet<McxLogin>(0);
     private Set<McxBeneficiary> mcxBeneficiaries = new HashSet<McxBeneficiary>(0);
     private Set<McxUserSession> mcxUserSessions = new HashSet<McxUserSession>(0);

    public McxUser() {
    }

    public McxUser(long id) {
    	this.id =id;
    }

    
    public McxUser(long id, String firstName, String mobileNumber, String emailId) {
        this.id = id;
        this.firstName = firstName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }
    public McxUser(long id, McxEntityM mcxEntityM, McxBaseUserTypeM mcxBaseUserTypeM, String firstName, String lastName, String address, String city, String state, String country, String mobileNumber, String zipCode, String faxNumber, String emailId, String salutation, Date dateOfBirth, String phoneNumber, Set<McxAuditLog> mcxAuditLogs, Set<McxCustomerMapping> mcxCustomerMappings, Set<McxLogin> mcxLogins, Set<McxBeneficiary> mcxBeneficiaries, Set<McxUserSession> mcxUserSessions) {
       this.id = id;
       this.mcxEntityM = mcxEntityM;
       this.mcxBaseUserTypeM = mcxBaseUserTypeM;
       this.firstName = firstName;
       this.lastName = lastName;
       this.address = address;
       this.city = city;
       this.state = state;
       this.country = country;
       this.mobileNumber = mobileNumber;
       this.zipCode = zipCode;
       this.faxNumber = faxNumber;
       this.emailId = emailId;
       this.salutation = salutation;
       this.dateOfBirth = dateOfBirth;
       this.phoneNumber = phoneNumber;
       this.mcxAuditLogs = mcxAuditLogs;
       this.mcxCustomerMappings = mcxCustomerMappings;
       this.mcxLogins = mcxLogins;
       this.mcxBeneficiaries = mcxBeneficiaries;
       this.mcxUserSessions = mcxUserSessions;
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
    @JoinColumn(name="REF_ENTITY_ID")
    public McxEntityM getMcxEntityM() {
        return this.mcxEntityM;
    }
    
    public void setMcxEntityM(McxEntityM mcxEntityM) {
        this.mcxEntityM = mcxEntityM;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REF_BASE_USER_ID")
    public McxBaseUserTypeM getMcxBaseUserTypeM() {
        return this.mcxBaseUserTypeM;
    }
    
    public void setMcxBaseUserTypeM(McxBaseUserTypeM mcxBaseUserTypeM) {
        this.mcxBaseUserTypeM = mcxBaseUserTypeM;
    }

    
    @Column(name="FIRST_NAME", nullable=false, length=100)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="LAST_NAME", length=100)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="ADDRESS", length=500)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="CITY", length=100)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="STATE", length=100)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    
    @Column(name="COUNTRY", length=100)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    
    @Column(name="MOBILE_NUMBER", nullable=false, length=25)
    public String getMobileNumber() {
        return this.mobileNumber;
    }
    
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    
    @Column(name="ZIP_CODE", length=50)
    public String getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    
    @Column(name="FAX_NUMBER", length=100)
    public String getFaxNumber() {
        return this.faxNumber;
    }
    
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    
    @Column(name="EMAIL_ID", nullable=false, length=100)
    public String getEmailId() {
        return this.emailId;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    
    @Column(name="SALUTATION", length=5)
    public String getSalutation() {
        return this.salutation;
    }
    
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_OF_BIRTH", length=7)
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    @Column(name="PHONE_NUMBER", length=25)
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxUser")
    public Set<McxAuditLog> getMcxAuditLogs() {
        return this.mcxAuditLogs;
    }
    
    public void setMcxAuditLogs(Set<McxAuditLog> mcxAuditLogs) {
        this.mcxAuditLogs = mcxAuditLogs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxUser")
    public Set<McxCustomerMapping> getMcxCustomerMappings() {
        return this.mcxCustomerMappings;
    }
    
    public void setMcxCustomerMappings(Set<McxCustomerMapping> mcxCustomerMappings) {
        this.mcxCustomerMappings = mcxCustomerMappings;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxUser")
    public Set<McxLogin> getMcxLogins() {
        return this.mcxLogins;
    }
    
    public void setMcxLogins(Set<McxLogin> mcxLogins) {
        this.mcxLogins = mcxLogins;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxUser")
    public Set<McxBeneficiary> getMcxBeneficiaries() {
        return this.mcxBeneficiaries;
    }
    
    public void setMcxBeneficiaries(Set<McxBeneficiary> mcxBeneficiaries) {
        this.mcxBeneficiaries = mcxBeneficiaries;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxUser")
    public Set<McxUserSession> getMcxUserSessions() {
        return this.mcxUserSessions;
    }
    
    public void setMcxUserSessions(Set<McxUserSession> mcxUserSessions) {
        this.mcxUserSessions = mcxUserSessions;
    }




}


