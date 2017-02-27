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
@Table(name = "BILLER", schema = "JMR_OBDX")
public class Biller implements java.io.Serializable {

	private long id;
	private String idbiller;
	private String billeraccountnumber;
	private Serializable registrationdate;
	private String billername;
	private String billerprofile;
	private String billercustomerid;
	private Login login;

	@Id
	@Column(name = "ID", nullable = false, precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Biller() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Biller( String idbiller, String billeraccountnumber, Serializable registrationdate,
			String billername, String billerprofile, String billercustomerid, Login login) {
		this.idbiller = idbiller;
		this.billeraccountnumber = billeraccountnumber;
		this.registrationdate = registrationdate;
		this.billername = billername;
		this.billerprofile = billerprofile;
		this.billercustomerid = billercustomerid;
		this.login = login;
	}

	@Column(name = "IDBILLER", nullable = false, length = 55)
	public String getIdbiller() {
		return this.idbiller;
	}

	public void setIdbiller(String idbiller) {
		this.idbiller = idbiller;
	}

	@Column(name = "BILLERACCOUNTNUMBER", nullable = false, length = 100)
	public String getBilleraccountnumber() {
		return this.billeraccountnumber;
	}

	public void setBilleraccountnumber(String billeraccountnumber) {
		this.billeraccountnumber = billeraccountnumber;
	}

	@Column(name = "REGISTRATIONDATE")
	public Serializable getRegistrationdate() {
		return this.registrationdate;
	}

	public void setRegistrationdate(Serializable registrationdate) {
		this.registrationdate = registrationdate;
	}

	@Column(name = "BILLERNAME", nullable = false, length = 200)
	public String getBillername() {
		return this.billername;
	}

	public void setBillername(String billername) {
		this.billername = billername;
	}

	@Column(name = "BILLERPROFILE", nullable = false, length = 200)
	public String getBillerprofile() {
		return this.billerprofile;
	}

	public void setBillerprofile(String billerprofile) {
		this.billerprofile = billerprofile;
	}

	@Column(name = "BILLERCUSTOMERID", nullable = false, length = 50)
	public String getBillercustomerid() {
		return this.billercustomerid;
	}

	public void setBillercustomerid(String billercustomerid) {
		this.billercustomerid = billercustomerid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_REF_ID", nullable = false, insertable = false, updatable = false)
	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

}
