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
@Table(name="MCX_BENEFICIARY"
    ,schema="JMR_OBDX"
)
public class McxBeneficiary  implements java.io.Serializable {


     private long id;
     private McxUser mcxUser;
     private McxTransferViaType mcxTransferViaType;
     private McxTransferType mcxTransferType;
     private String payyeName;
     private String accountName;
     private String branchCode;
     private String nickName;
     private String accountNumber;
     private String isActive;
     private Date registrationDateTime;
     private String swiftCode;
     private String ncc;
     private Set<McxTransactionData> mcxTransactionDatas = new HashSet<McxTransactionData>(0);

    public McxBeneficiary() {
    }

	
    public McxBeneficiary(long id, McxUser mcxUser, McxTransferViaType mcxTransferViaType, McxTransferType mcxTransferType, String payyeName, String accountName, String branchCode, String nickName, String accountNumber, String isActive, Date registrationDateTime) {
    	this.id = id;
    	this.mcxUser = mcxUser;
        this.mcxTransferViaType = mcxTransferViaType;
        this.mcxTransferType = mcxTransferType;
        this.payyeName = payyeName;
        this.accountName = accountName;
        this.branchCode = branchCode;
        this.nickName = nickName;
        this.accountNumber = accountNumber;
        this.isActive = isActive;
        this.registrationDateTime = registrationDateTime;
    }
    public McxBeneficiary(McxUser mcxUser, McxTransferViaType mcxTransferViaType, McxTransferType mcxTransferType, String payyeName, String accountName, String branchCode, String nickName, String accountNumber, String isActive, Date registrationDateTime, String swiftCode, String ncc, Set<McxTransactionData> mcxTransactionDatas) {
       this.mcxUser = mcxUser;
       this.mcxTransferViaType = mcxTransferViaType;
       this.mcxTransferType = mcxTransferType;
       this.payyeName = payyeName;
       this.accountName = accountName;
       this.branchCode = branchCode;
       this.nickName = nickName;
       this.accountNumber = accountNumber;
       this.isActive = isActive;
       this.registrationDateTime = registrationDateTime;
       this.swiftCode = swiftCode;
       this.ncc = ncc;
       this.mcxTransactionDatas = mcxTransactionDatas;
    }
   
    public McxBeneficiary(McxUser mcxUser, McxTransferViaType mcxTransferViaType, McxTransferType mcxTransferType, String payyeName, String accountName, String branchCode, String nickName, String accountNumber, String isActive, Date registrationDateTime, String swiftCode, String ncc) {
        this.mcxUser = mcxUser;
        this.mcxTransferViaType = mcxTransferViaType;
        this.mcxTransferType = mcxTransferType;
        this.payyeName = payyeName;
        this.accountName = accountName;
        this.branchCode = branchCode;
        this.nickName = nickName;
        this.accountNumber = accountNumber;
        this.isActive = isActive;
        this.registrationDateTime = registrationDateTime;
        this.swiftCode = swiftCode;
        this.ncc = ncc;
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
    @JoinColumn(name="REF_USER_ID", nullable=false)
    public McxUser getMcxUser() {
        return this.mcxUser;
    }
    
    public void setMcxUser(McxUser mcxUser) {
        this.mcxUser = mcxUser;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REF_TRANSFER_VIA_TYPE_ID", nullable=false)
    public McxTransferViaType getMcxTransferViaType() {
        return this.mcxTransferViaType;
    }
    
    public void setMcxTransferViaType(McxTransferViaType mcxTransferViaType) {
        this.mcxTransferViaType = mcxTransferViaType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REF_TRANSFER_TYPE_ID", nullable=false)
    public McxTransferType getMcxTransferType() {
        return this.mcxTransferType;
    }
    
    public void setMcxTransferType(McxTransferType mcxTransferType) {
        this.mcxTransferType = mcxTransferType;
    }

    
    @Column(name="PAYYE_NAME", nullable=false, length=100)
    public String getPayyeName() {
        return this.payyeName;
    }
    
    public void setPayyeName(String payyeName) {
        this.payyeName = payyeName;
    }

    
    @Column(name="ACCOUNT_NAME", nullable=false, length=100)
    public String getAccountName() {
        return this.accountName;
    }
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    
    @Column(name="BRANCH_CODE", nullable=false, length=100)
    public String getBranchCode() {
        return this.branchCode;
    }
    
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    
    @Column(name="NICK_NAME", nullable=false, length=100)
    public String getNickName() {
        return this.nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    
    @Column(name="ACCOUNT_NUMBER", nullable=false, length=100)
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    
    @Column(name="IS_ACTIVE", nullable=false, length=5)
    public String getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="REGISTRATION_DATE_TIME", nullable=false, length=7)
    public Date getRegistrationDateTime() {
        return this.registrationDateTime;
    }
    
    public void setRegistrationDateTime(Date registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }

    
    @Column(name="SWIFT_CODE", length=100)
    public String getSwiftCode() {
        return this.swiftCode;
    }
    
    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    
    @Column(name="NCC", length=100)
    public String getNcc() {
        return this.ncc;
    }
    
    public void setNcc(String ncc) {
        this.ncc = ncc;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mcxBeneficiary")
    public Set<McxTransactionData> getMcxTransactionDatas() {
        return this.mcxTransactionDatas;
    }
    
    public void setMcxTransactionDatas(Set<McxTransactionData> mcxTransactionDatas) {
        this.mcxTransactionDatas = mcxTransactionDatas;
    }




}


