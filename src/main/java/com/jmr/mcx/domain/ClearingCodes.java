package com.jmr.mcx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FCAT_VW_CLEARINGCODES", schema = "JMR_OBDX")
public class ClearingCodes implements java.io.Serializable {

	public ClearingCodes() {
		super();
	}
	@Column(name = "SRCINFO", nullable = true, length = 20)
	private String srcInfo;
	@Column(name = "BENBANKCODE", nullable = true, length = 105)
	private String benBankCode;
	@Column(name = "BENBANKNAME", nullable = true, length = 105)
	private String benBankName;
	@Id
	@Column(name = "BENBRNCODE", nullable = true, length = 3)
	private String benBranchCode;
	@Column(name = "BENBNKADD1", nullable = true, length = 105)
	private String benBankAddress1;
	@Column(name = "BENBNKADD2", nullable = true, length = 35)
	private String benBankAddress2;
	@Column(name = "BENBNKADD3", nullable = true, length = 105)
	private String benBankAddress3;
	@Column(name = "BENBNKADD4", nullable = true, length = 35)
	private String benBankAddress4;
	@Column(name = "BENBICODE", nullable = true, length = 20)
	private String benbiCode;
	@Column(name = "BENCODTYPE", nullable = true, length = 105)
	private String bencodType;
	@Column(name = "BIC2", nullable = true, length = 10)
	private String bic2;
	@Column(name = "BENCITY", nullable = true, length = 105)
	private String benCity;
	@Column(name = "BRANCH", nullable = true, length = 10)
	private String branch;
	@Column(name = "NATID", nullable = true, length = 107)
	private String natId;
	
	
	public String getSrcInfo() {
		return srcInfo;
	}

	public void setSrcInfo(String srcInfo) {
		this.srcInfo = srcInfo;
	}
	
	public String getBenBankCode() {
		return benBankCode;
	}

	public void setBenBankCode(String benBankCode) {
		this.benBankCode = benBankCode;
	}

	
	public String getBenBankName() {
		return benBankName;
	}

	public void setBenBankName(String benBankName) {
		this.benBankName = benBankName;
	}

	
	public String getBenBranchCode() {
		return benBranchCode;
	}

	public void setBenBranchCode(String benBranchCode) {
		this.benBranchCode = benBranchCode;
	}

	
	public String getBenBankAddress1() {
		return benBankAddress1;
	}

	public void setBenBankAddress1(String benBankAddress1) {
		this.benBankAddress1 = benBankAddress1;
	}

	
	public String getBenBankAddress2() {
		return benBankAddress2;
	}

	public void setBenbankAddress2(String benbankAddress2) {
		this.benBankAddress2 = benbankAddress2;
	}

	
	public String getBenBankAddress3() {
		return benBankAddress3;
	}

	public void setBenBankAddress3(String benBankAddress3) {
		this.benBankAddress3 = benBankAddress3;
	}

	
	public String getBenBankAddress4() {
		return benBankAddress4;
	}

	public void setBenBankAddress4(String benBankAddress4) {
		this.benBankAddress4 = benBankAddress4;
	}

	
	public String getBenbiCode() {
		return benbiCode;
	}

	public void setBenbiCode(String benbiCode) {
		this.benbiCode = benbiCode;
	}

	
	public String getBencodType() {
		return bencodType;
	}

	public void setBencodType(String bencodType) {
		this.bencodType = bencodType;
	}

	
	public String getBic2() {
		return bic2;
	}

	public void setBic2(String bic2) {
		this.bic2 = bic2;
	}

	
	public String getBenCity() {
		return benCity;
	}

	public void setBenCity(String benCity) {
		this.benCity = benCity;
	}

	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	public String getNatId() {
		return natId;
	}

	public void setNatId(String natId) {
		this.natId = natId;
	}

	public ClearingCodes(String srcInfo, String benBankCode, String benBankName, String benBranchCode,
			String benBankAddress1, String benBankAddress2, String benBankAddress3, String benBankAddress4,
			String benbiCode, String bencodType, String bic2, String benCity, String branch, String natId) {
		super();
		this.srcInfo = srcInfo;
		this.benBankCode = benBankCode;
		this.benBankName = benBankName;
		this.benBranchCode = benBranchCode;
		this.benBankAddress1 = benBankAddress1;
		this.benBankAddress2 = benBankAddress2;
		this.benBankAddress3 = benBankAddress3;
		this.benBankAddress4 = benBankAddress4;
		this.benbiCode = benbiCode;
		this.bencodType = bencodType;
		this.bic2 = bic2;
		this.benCity = benCity;
		this.branch = branch;
		this.natId = natId;
	}
}
