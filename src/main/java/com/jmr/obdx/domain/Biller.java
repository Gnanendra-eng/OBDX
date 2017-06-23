package com.jmr.obdx.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MCX_BILLER", schema = "JMR_OBDX")
public class Biller implements java.io.Serializable {


	private long id;
	private String billerId;
	private String billerReferenceNumber;
	private Serializable registrationDate;
	private String name;
	private Login login;
	private McxBillerOperator mcxBillerOperator;

	@Id
	@Column(name = "ID", nullable = false, precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	
	public Biller( String billerId, String billerReferenceNumber, Serializable registrationDate, String name,
			Login login, McxBillerOperator mcxBillerOperator) {
		this.billerId = billerId;
		this.billerReferenceNumber = billerReferenceNumber;
		this.registrationDate = registrationDate;
		this.name = name;
		this.login = login;
		this.mcxBillerOperator = mcxBillerOperator;
	}

	
	
	public void setId(long id) {
		this.id = id;
	}

	public Biller() {
		// TODO Auto-generated constructor stub
	}

	public Biller(String billerId, String billerReferenceNumber, Serializable registrationDate, String name,
			 Login login) {
		this.billerId = billerId;
		this.billerReferenceNumber = billerReferenceNumber;
		this.registrationDate = registrationDate;
		this.name = name;
		this.login = login;
	}

	@Column(name = "BILLERID", nullable = false, length = 55)
	public String getBillerId() {
		return this.billerId;
	}

	public void setBillerId(String idbiller) {
		this.billerId = idbiller;
	}

	@Column(name = "REFERENCENUMBER", nullable = false, length = 100)
	public String getBillerReferenceNumber() {
		return this.billerReferenceNumber;
	}

	public void setBillerReferenceNumber(String billerReferenceNumber) {
		this.billerReferenceNumber = billerReferenceNumber;
	}

	@Column(name = "REGISTRATIONDATE")
	public Serializable getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(Serializable registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Column(name = "NAME", nullable = false, length = 200)
	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;
	}

	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_REF_ID", nullable = false, insertable = false, updatable = false)
	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BILLER_OPEARTOR_ID")
	public McxBillerOperator getMcxBillerOperator() {
		return this.mcxBillerOperator;
	}

	public void setMcxBillerOperator(McxBillerOperator mcxBillerOperator) {
		this.mcxBillerOperator = mcxBillerOperator;
	}

}
