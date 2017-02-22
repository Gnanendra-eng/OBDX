package com.jmr.obdx.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MSTBILLER", schema = "JMR_OBDX")
public class BillerM implements java.io.Serializable {

	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "idbiller")
	private String idbiller;
	@Column(name = "acctno")
	private String acctno;
	@Column(name = "registrationdate")
	private Date registrationdate;
	@Column(name = "billername")
	private String billername;
	@Column(name = "billerprofile")
	private String billerprofile;

	@Column(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdbiller() {
		return idbiller;
	}

	public void setIdbiller(String idbiller) {
		this.idbiller = idbiller;
	}

	public String getAcctno() {
		return acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}

	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
	}

	public String getBillername() {
		return billername;
	}

	public void setBillername(String billername) {
		this.billername = billername;
	}

	public String getBillerprofile() {
		return billerprofile;
	}

	public void setBillerprofile(String billerprofile) {
		this.billerprofile = billerprofile;
	}

	public BillerM(String id, String idbiller, String acctno, Date registrationdate, String billername,
			String billerprofile) {

		this.id = id;
		this.idbiller = idbiller;
		this.acctno = acctno;
		this.registrationdate = registrationdate;
		this.billername = billername;
		this.billerprofile = billerprofile;
	}

	public BillerM() {

	}

}
