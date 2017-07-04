package com.jmr.obdx.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "mcx_fcc_vw_biller_info", schema = "JMR_OBDX")
public class McxVwBillerInfo implements java.io.Serializable  {

	private String idbiller;
	private String billercustid;
	private String billerdesc;
	private String flgsingle;
	private String recordStat;
	private String authStat;
	private String utilityProvider;

	public McxVwBillerInfo() {
	}

	public McxVwBillerInfo(String billercustid) {
		this.billercustid = billercustid;
	}

	public McxVwBillerInfo(String idbiller, String billercustid, String billerdesc, String flgsingle, String recordStat,
			String authStat, String utilityProvider) {
		this.idbiller = idbiller;
		this.billercustid = billercustid;
		this.billerdesc = billerdesc;
		this.flgsingle = flgsingle;
		this.recordStat = recordStat;
		this.authStat = authStat;
		this.utilityProvider = utilityProvider;
	}

	@Id
	@Column(name = "IDBILLER")
	public String getIdbiller() {
		return this.idbiller;
	}

	public void setIdbiller(String idbiller) {
		this.idbiller = idbiller;
	}

	@Column(name = "BILLERCUSTID")
	public String getBillercustid() {
		return this.billercustid;
	}

	public void setBillercustid(String billercustid) {
		this.billercustid = billercustid;
	}

	@Column(name = "BILLERDESC")
	public String getBillerdesc() {
		return this.billerdesc;
	}

	public void setBillerdesc(String billerdesc) {
		this.billerdesc = billerdesc;
	}

	@Column(name = "FLGSINGLE")
	public String getFlgsingle() {
		return this.flgsingle;
	}

	public void setFlgsingle(String flgsingle) {
		this.flgsingle = flgsingle;
	}

	@Column(name = "RECORD_STAT")
	public String getRecordStat() {
		return this.recordStat;
	}

	public void setRecordStat(String recordStat) {
		this.recordStat = recordStat;
	}

	@Column(name = "AUTH_STAT")
	public String getAuthStat() {
		return this.authStat;
	}

	public void setAuthStat(String authStat) {
		this.authStat = authStat;
	}

	@Column(name = "UTILITY_PROVIDER")
	public String getUtilityProvider() {
		return this.utilityProvider;
	}

	public void setUtilityProvider(String utilityProvider) {
		this.utilityProvider = utilityProvider;
	}
}
