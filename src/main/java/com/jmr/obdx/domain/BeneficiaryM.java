package com.jmr.obdx.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BeneficiaryM generated by hbm2java
 */
@Entity
@Table(name="BENEFICIARY_M"
    ,schema="JMR_OBDX"
)
public class BeneficiaryM  implements java.io.Serializable {


     private long id;
     private String branchDetailsM;
     private Login login;
     private String payyename;
     private String accountname;
     private String nickname;
     private String accountnumber;
     private String isactive;
     private McxTransactionM mcxTransactionM;
     private Date registrationdate;
     private Long swiftCode;
     private Long ncc;
     private String transfervai;
     private Set<TxnData> txnData = new HashSet<TxnData>(0);


    public BeneficiaryM() {
    }

	
    public BeneficiaryM(long id) {
        this.id = id;
    }
    
    
    public BeneficiaryM( String branchDetailsM, Login login, String payyename, String accountname, String nickname, String accountnumber, String isactive, Date registrationdate, String transfervai,McxTransactionM mcxTransactionM) {
 	   this.branchDetailsM = branchDetailsM;
        this.login = login;
        this.payyename = payyename;
        this.accountname = accountname;
        this.nickname = nickname;
        this.accountnumber = accountnumber;
        this.isactive = isactive;
        this.registrationdate = registrationdate;
        this.transfervai = transfervai;
        this.mcxTransactionM = mcxTransactionM;

     }
    public BeneficiaryM( String branchDetailsM, Login login, String payyename, String accountname, String nickname, String accountnumber, String isactive, Date registrationdate, Long swiftCode, Long ncc, String transfervai,Set<TxnData> fundTransfers, McxTransactionM mcxTransactionM) {
       this.branchDetailsM = branchDetailsM;
       this.login = login;
       this.payyename = payyename;
       this.accountname = accountname;
       this.nickname = nickname;
       this.accountnumber = accountnumber;
       this.isactive = isactive;
       this.registrationdate = registrationdate;
       this.swiftCode = swiftCode;
       this.ncc = ncc;
       this.transfervai = transfervai;
       this.txnData = fundTransfers;
       this.mcxTransactionM = mcxTransactionM;


    }
   


	public BeneficiaryM(String accountname,String accountnumber, String branchDetailsM, String nickname, String payyename,
			String transfervai) {
	       this.accountname = accountname;
	       this.accountnumber = accountnumber;
	       this.branchDetailsM = branchDetailsM;
	       this.nickname = nickname;
	       this.payyename = payyename;
	       this.transfervai = transfervai;




	       
	}


	


	

	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="beneficiary_m_seq")
	@SequenceGenerator(name ="beneficiary_m_seq",sequenceName="beneficiary_m_seq", allocationSize=1)
	@Id 
    @Column(name="ID", unique=true, nullable=false, precision=10, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

/*@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BRANCH")*/
    
    @Column(name="BRANCH", length=100)
 
    public String getBranchDetailsM() {
        return this.branchDetailsM;
    }
    
    public void setBranchDetailsM(String branchDetailsM) {
        this.branchDetailsM = branchDetailsM;
    }



    
    @Column(name="PAYYENAME", length=100)
    public String getPayyename() {
        return this.payyename;
    }
    
    public void setPayyename(String payyename) {
        this.payyename = payyename;
    }

    
    @Column(name="ACCOUNTNAME", precision=100, scale=0)
    public String getAccountname() {
        return this.accountname;
    }
    
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    
    @Column(name="NICKNAME", length=100)
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    
    @Column(name="ACCOUNTNUMBER", precision=100, scale=0)
    public String getAccountnumber() {
        return this.accountnumber;
    }
    
    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    
    @Column(name="ISACTIVE", length=100)
    public String getIsactive() {
        return this.isactive;
    }
    
    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }
    
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REF_USER_ID")
    public Login getLogin() {
        return this.login;
    }
    
    public void setLogin(Login login) {
        this.login = login;
    }

    
  
    @Column(name="TRANSFER_VIA", length=100)
    public String getTransfervai() {
		return transfervai;
	}
	public void setTransfervai(String transfervai) {
		this.transfervai = transfervai;
	}


	@Temporal(TemporalType.DATE)
    @Column(name="REGISTRATIONDATE", length=7)
    public Date getRegistrationdate() {
        return this.registrationdate;
    }
    
    public void setRegistrationdate(Date registrationdate) {
        this.registrationdate = registrationdate;
    }

    
    @Column(name="SWIFT_CODE", precision=100, scale=0)
    public Long getSwiftCode() {
        return this.swiftCode;
    }
    
    public void setSwiftCode(Long swiftCode) {
        this.swiftCode = swiftCode;
    }

    
    @Column(name="NCC", precision=100, scale=0)
    public Long getNcc() {
        return this.ncc;
    }
    
    public void setNcc(Long ncc) {
        this.ncc = ncc;
    }


    @OneToMany(fetch=FetchType.LAZY, mappedBy="beneficiaryM")
    public Set<TxnData> getFundTransfers() {
        return this.txnData;
    }
    
    public void setFundTransfers(Set<TxnData> fundTransfers) {
        this.txnData = fundTransfers;
    }


    
  
    
  
    @ManyToOne(fetch=FetchType.LAZY ,cascade = CascadeType.MERGE)
    @JoinColumn(name="TRANSFER_TYPE" )
    public McxTransactionM getMcxTransactionM() {
        return this.mcxTransactionM;
    }
    
    public void setMcxTransactionM(McxTransactionM mcxTransactionM) {
        this.mcxTransactionM = mcxTransactionM;
    }

}


