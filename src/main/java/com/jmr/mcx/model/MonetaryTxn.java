package com.jmr.mcx.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "MCX_MONETARY_TXN")
@EntityListeners(AuditingEntityListener.class)
public class MonetaryTxn {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long txn_id;       		
	private String txn_code;     		
	private String txn_amt_ccd;  		
	private long txn_amt;      		
	private String txn_purpose;  		
	private String txn_comments; 		
	private Date txn_date;     		
	private String txn_status;   		
	private long source_acc;   		
	private long destination_acc; 	
	private String payee_name;      	
	private long source_acc_bal;  	
	private String maker_id;
	
	
	
	public MonetaryTxn() {
		super();
	}
	
	
	
	public MonetaryTxn(long txn_id, String txn_code, String txn_amt_ccd, long txn_amt, String txn_purpose,
			String txn_comments, Date txn_date, String txn_status, long source_acc, long destination_acc,
			String payee_name, long source_acc_bal, String maker_id) {
		super();
		this.txn_id = txn_id;
		this.txn_code = txn_code;
		this.txn_amt_ccd = txn_amt_ccd;
		this.txn_amt = txn_amt;
		this.txn_purpose = txn_purpose;
		this.txn_comments = txn_comments;
		this.txn_date = txn_date;
		this.txn_status = txn_status;
		this.source_acc = source_acc;
		this.destination_acc = destination_acc;
		this.payee_name = payee_name;
		this.source_acc_bal = source_acc_bal;
		this.maker_id = maker_id;
	}



	public long getTxn_id() {
		return txn_id;
	}
	public void setTxn_id(long txn_id) {
		this.txn_id = txn_id;
	}
	public String getTxn_code() {
		return txn_code;
	}
	public void setTxn_code(String txn_code) {
		this.txn_code = txn_code;
	}
	public String getTxn_amt_ccd() {
		return txn_amt_ccd;
	}
	public void setTxn_amt_ccd(String txn_amt_ccd) {
		this.txn_amt_ccd = txn_amt_ccd;
	}
	public long getTxn_amt() {
		return txn_amt;
	}
	public void setTxn_amt(long txn_amt) {
		this.txn_amt = txn_amt;
	}
	public String getTxn_purpose() {
		return txn_purpose;
	}
	public void setTxn_purpose(String txn_purpose) {
		this.txn_purpose = txn_purpose;
	}
	public String getTxn_comments() {
		return txn_comments;
	}
	public void setTxn_comments(String txn_comments) {
		this.txn_comments = txn_comments;
	}
	public Date getTxn_date() {
		return txn_date;
	}
	public void setTxn_date(Date txn_date) {
		this.txn_date = txn_date;
	}
	public String getTxn_status() {
		return txn_status;
	}
	public void setTxn_status(String txn_status) {
		this.txn_status = txn_status;
	}
	public long getSource_acc() {
		return source_acc;
	}
	public void setSource_acc(long source_acc) {
		this.source_acc = source_acc;
	}
	public long getDestination_acc() {
		return destination_acc;
	}
	public void setDestination_acc(long destination_acc) {
		this.destination_acc = destination_acc;
	}
	public String getPayee_name() {
		return payee_name;
	}
	public void setPayee_name(String payee_name) {
		this.payee_name = payee_name;
	}
	public long getSource_acc_bal() {
		return source_acc_bal;
	}
	public void setSource_acc_bal(long source_acc_bal) {
		this.source_acc_bal = source_acc_bal;
	}
	public String getMaker_id() {
		return maker_id;
	}
	public void setMaker_id(String maker_id) {
		this.maker_id = maker_id;
	} 			
	
	

}
