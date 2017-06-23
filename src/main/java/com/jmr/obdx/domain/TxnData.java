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


     public TxnData() {
		// TODO Auto-generated constructor stub
	}

	private long id;
     private AccountTypeM accountTypeM;
     private CurrencyM currencyM;
     private String customerid;
     private String fromaccountno;
     private String toaccountno;
     private String tobranchcod;
     private String frombranchcod;
     private String amount;
     private Date transaferdate;
     private String status;
     private String note;
     private BeneficiaryM beneficiaryM;
     private String referenceId;
     private McxTransactionM mcxTransactionM;
     private String purpose;
     private String billerId;


 	@Column(name="REF_BILLER_ID", length=20)

     public String getBillerId() {
		return billerId;
	}




	public void setBillerId(String billerId) {
		this.billerId = billerId;
	}




	@Column(name="PURPOSE", length=20)
	public String getPurpose() {
		return purpose;
	}




	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}




	public TxnData(McxTransactionM mcxTransactionM, CurrencyM currencyM, String customerid, String fromaccountno,String frombranchcod, String toccountno, String tobranchcod, String amount, Date transaferdate, String status, String note,String referenceId, String billerId) {
	    this.mcxTransactionM = mcxTransactionM;
        this.currencyM = currencyM;
        this.customerid = customerid;
        this.fromaccountno = fromaccountno;
        this.toaccountno = toccountno;
        this.tobranchcod = tobranchcod;
        this.frombranchcod = frombranchcod;
        this.amount = amount;
        this.transaferdate = transaferdate;
        this.status = status;
        this.note = note;
        this.referenceId = referenceId;
        this.billerId = billerId;
        
 
    }
    
   


	public TxnData(McxTransactionM mcxTransactionM,AccountTypeM accountTypeM, CurrencyM currencyM, String customerid, String fromaccountno,String frombranchcod, String toccountno, String tobranchcod, String amount, Date transaferdate, String status, String note,String referenceId,String purpose,BeneficiaryM beneficiaryM) {
	    this.mcxTransactionM = mcxTransactionM;
		this.accountTypeM = accountTypeM;
        this.currencyM = currencyM;
        this.customerid = customerid;
        this.fromaccountno = fromaccountno;
        this.toaccountno = toccountno;
        this.tobranchcod = tobranchcod;
        this.frombranchcod = frombranchcod;
        this.amount = amount;
        this.transaferdate = transaferdate;
        this.status = status;
        this.note = note;
        this.referenceId = referenceId;
        this.purpose = purpose;
        this.beneficiaryM = beneficiaryM;

        
 
    }
   
   

	public TxnData(McxTransactionM mcxTransactionM,AccountTypeM accountTypeM, CurrencyM currencyM, String customerid, String fromaccountno,String frombranchcod, String toccountno, String tobranchcod, String amount, Date transaferdate, String status, String note,String referenceId) {
	    this.mcxTransactionM = mcxTransactionM;
		this.accountTypeM = accountTypeM;
        this.currencyM = currencyM;
        this.customerid = customerid;
        this.fromaccountno = fromaccountno;
        this.toaccountno = toccountno;
        this.tobranchcod = tobranchcod;
        this.frombranchcod = frombranchcod;
        this.amount = amount;
        this.transaferdate = transaferdate;
        this.status = status;
        this.note = note;
        this.referenceId = referenceId;

        
 
    }
   

	public void setToaccountno(String toaccountno) {
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

    
    @Column(name="TOBRANCHCOD", length=10)
    public String getTobranchcod() {
		return tobranchcod;
	}
	public void setTobranchcod(String tobranchcod) {
		this.tobranchcod = tobranchcod;
	}



	 @Column(name="FROMBRANCHCOD", length=10)
	public String getFrombranchcod() {
		return frombranchcod;
	}
	public void setFrombranchcod(String frombranchcod) {
		this.frombranchcod = frombranchcod;
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
    public String getFromaccountno() {
		return fromaccountno;
	}


	public void setFromaccountno(String fromaccountno) {
		this.fromaccountno = fromaccountno;
	}

	@Column(name="TOACCOUNTNO", precision=22, scale=0)
	public String getToaccountno() {
		return toaccountno;
	}
	
   

    
    @Column(name="AMOUNT", precision=22, scale=0)
    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
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
