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


@Entity
@Table(name="MCX_TXN_DATA"
    ,schema="JMR_OBDX"
)
public class TxnData  implements java.io.Serializable {


     private long id;
     private AccountTypeM accountTypeM;
     private CurrencyM currencyM;
     private String customerid;
     private long fromaccountno;
     private long toaccountno;
     private Integer branchcod;
     private long amount;
     private Date transaferdate;
     private String status;
     private String note;
     private BeneficiaryM beneficiaryM;
     private String referenceId;
     private McxTransactionM mcxTransactionM;



     


    public TxnData(AccountTypeM accountTypeM2, CurrencyM currencyM2, String string, long l, long m, Integer integer, Integer integer2, Date date, String string2, String string3, String referenceid2) {
    }

	
   
    public TxnData(McxTransactionM mcxTransactionM,AccountTypeM accountTypeM, CurrencyM currencyM, String customerid, long fromaccountno, long toccountno, Integer branchcod, long amount, Date transaferdate, String status, String note, String referenceId,BeneficiaryM beneficiaryM) {
    this.mcxTransactionM = mcxTransactionM;
       this.accountTypeM = accountTypeM;
       this.currencyM = currencyM;
       this.customerid = customerid;
       this.fromaccountno = fromaccountno;
       this.toaccountno = toccountno;
       this.branchcod = branchcod;
       this.amount = amount;
       this.transaferdate = transaferdate;
       this.status = status;
       this.note = note;
       this.referenceId = referenceId;
       this.beneficiaryM = beneficiaryM;

    }
    
   


	public TxnData(McxTransactionM mcxTransactionM,AccountTypeM accountTypeM, CurrencyM currencyM, String customerid, long fromaccountno, long toccountno, Integer branchcod, long amount, Date transaferdate, String status, String note,String referenceId) {
	    this.mcxTransactionM = mcxTransactionM;
		this.accountTypeM = accountTypeM;
        this.currencyM = currencyM;
        this.customerid = customerid;
        this.fromaccountno = fromaccountno;
        this.toaccountno = toccountno;
        this.branchcod = branchcod;
        this.amount = amount;
        this.transaferdate = transaferdate;
        this.status = status;
        this.note = note;
        this.referenceId = referenceId;

        
 
    }
   
   


	public void setToaccountno(long toaccountno) {
		this.toaccountno = toaccountno;
	}


	@Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=22, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ACCOUNT_TYPE_ID")
    public AccountTypeM getAccountTypeM() {
        return this.accountTypeM;
    }
    
    public void setAccountTypeM(AccountTypeM accountTypeM) {
        this.accountTypeM = accountTypeM;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CURRENCY_CODE_ID")
    public CurrencyM getCurrencyM() {
        return this.currencyM;
    }
    
    public void setCurrencyM(CurrencyM currencyM) {
        this.currencyM = currencyM;
    }

    
    @Column(name="CUSTOMERID", precision=22, scale=0)
    public String getCustomerid() {
        return this.customerid;
    }
    
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    @Column(name="REFERENCE_ID", precision=100, scale=0)
    public String getReferenceId() {
		return referenceId;
	}



	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

  
    @Column(name="FROMACCOUNTNO", precision=22, scale=0)
    public long getFromaccountno() {
		return fromaccountno;
	}


	public void setFromaccountno(long fromaccountno) {
		this.fromaccountno = fromaccountno;
	}

	@Column(name="TOACCOUNTNO", precision=22, scale=0)
	public long getToaccountno() {
		return toaccountno;
	}
	
    @Column(name="BRANCHCOD", length=10)
    public Integer getBranchcod() {
        return this.branchcod;
    }
    
    public void setBranchcod(Integer branchcod) {
        this.branchcod = branchcod;
    }

    
    @Column(name="AMOUNT", precision=22, scale=0)
    public long getAmount() {
        return this.amount;
    }
    
    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="TRANSAFERDATE", length=7)
    public Date getTransaferdate() {
        return this.transaferdate;
    }
    
    public void setTransaferdate(Date transaferdate) {
        this.transaferdate = transaferdate;
    }

    
  

    @Column(name="STATUS", length=10)
    public String getStatus() {
        return this.status;
    }
    
    public String getNote() {
		return note;
	}

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BENEFICIARY_ID")
    public BeneficiaryM getBeneficiaryM() {
        return this.beneficiaryM;
    }
    
    public void setBeneficiaryM(BeneficiaryM beneficiaryM) {
        this.beneficiaryM = beneficiaryM;
    }
    
    @Column(name="NOTE", length=50)
	public void setNote(String note) {
		this.note = note;
	}
	public void setStatus(String status) {
        this.status = status;
    }

	


    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TXN_ID")
    public McxTransactionM getMcxTransactionM() {
        return this.mcxTransactionM;
    }
    
    public void setMcxTransactionM(McxTransactionM mcxTransactionM) {
        this.mcxTransactionM = mcxTransactionM;
    }
}
