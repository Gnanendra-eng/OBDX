package com.jmr.obdx.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name = "mcx_fcc_vw_biller_info", schema = "JMR_OBDX")
public class McxVwBillerInfo implements java.io.Serializable  {

	private String idBiller;
	private String billerCustId;
	private String billerDesc;
	private String flgSingle;
	private String recordStat;
	private String authStat;
	private String utilityProvider;

	public McxVwBillerInfo() {
	}

	public McxVwBillerInfo(String billerCustId) {
		this.billerCustId = billerCustId;
	}

	public McxVwBillerInfo(String idBiller, String billerCustId, String billerDesc, String flgSingle, String recordStat,
			String authStat, String utilityProvider) {
		this.idBiller = idBiller;
		this.billerCustId = billerCustId;
		this.billerDesc = billerDesc;
		this.flgSingle = flgSingle;
		this.recordStat = recordStat;
		this.authStat = authStat;
		this.utilityProvider = utilityProvider;
	}

	@Id
	@Column(name = "IDBILLER")
	public String getIdBiller() {
		return this.idBiller;
	}

	public void setIdBiller(String idBiller) {
		this.idBiller = idBiller;
	}

	@Column(name = "BILLERCUSTID")
	public String getBillerCustId() {
		return this.billerCustId;
	}

	public void setBillerCustId(String billerCustId) {
		this.billerCustId = billerCustId;
	}

	@Column(name = "BILLERDESC")
	public String getBillerDesc() {
		return this.billerDesc;
	}

	public void setBillerDesc(String billerDesc) {
		this.billerDesc = billerDesc;
	}

	@Column(name = "FLGSINGLE")
	public String getFlgSingle() {
		return this.flgSingle;
	}

	public void setFlgSingle(String flgSingle) {
		this.flgSingle = flgSingle;
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
