package com.mcx.xml;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ContractDetailsFull {
	
	
	
	@XmlElement(name="PROD")
	private String prod;

	@XmlElement(name ="USERREFNO")
	private String userRefNO;

	@XmlElement(name ="DRVALDT")
	private String drvaldt;

	@XmlElement(name ="CRBRN")
	private String crben;

	@XmlElement(name ="CRACC")
	private String crAcc;

	@XmlElement(name ="CRCCY")
	private String crCcy;

	@XmlElement(name ="CRAMT")
	private String crAmt;

	@XmlElement(name ="CRVALDT")
	private String crvaldt;

	

	@XmlElement(name ="DBTBRN")
	private String dbtbrn;

	@XmlElement(name ="DBTACC")
	private String  dbtAcc;

	@XmlElement(name ="DRCCY")
	private String drCcy;

	@XmlElement(name ="DR_AMOUNT")
	private String drAmount;

	@XmlElement(name ="SOURCEREFNO")
	private String sourcerefNo;

	@XmlElement(name ="SOURCECD")
	private String sourceCD;
	
	@XmlElement(name ="ACCOUNTING_DATE")
	private String accountingDate;

	@XmlElement(name ="PRODDESC")
	private String prodDesc;

	@XmlElement(name ="OVEROVERDRFT")
	private String overoverdrft;
	
	@XmlElement(name ="MAKER")
	private String maker;

	@XmlElement(name ="MAKDTTIME")
	private String makdtTime;

	@XmlElement(name ="AUTHSTAT")
	private String authstat;

	@XmlElement(name ="BOOKDT")
	private String bookDt;

	@XmlElement(name ="PRDCD")
	private String prdCd;



	@XmlElement(name ="MODCD")
	private String modCd;
	
	@XmlElement(name ="CONCCY")
	private String conCcy;

	@XmlElement(name ="SOURCE")
	private String source;

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	public String getUserRefNO() {
		return userRefNO;
	}

	public void setUserRefNO(String userRefNO) {
		this.userRefNO = userRefNO;
	}

	public String getDrvaldt() {
		return drvaldt;
	}

	public void setDrvaldt(String drvaldt) {
		this.drvaldt = drvaldt;
	}

	public String getCrben() {
		return crben;
	}

	public void setCrben(String crben) {
		this.crben = crben;
	}

	public String getCrAcc() {
		return crAcc;
	}

	public void setCrAcc(String crAcc) {
		this.crAcc = crAcc;
	}

	public String getCrCcy() {
		return crCcy;
	}

	public void setCrCcy(String crCcy) {
		this.crCcy = crCcy;
	}

	public String getCrAmt() {
		return crAmt;
	}

	public void setCrAmt(String crAmt) {
		this.crAmt = crAmt;
	}

	public String getCrvaldt() {
		return crvaldt;
	}

	public void setCrvaldt(String crvaldt) {
		this.crvaldt = crvaldt;
	}

	public String getDbtbrn() {
		return dbtbrn;
	}

	public void setDbtbrn(String dbtbrn) {
		this.dbtbrn = dbtbrn;
	}

	public String getDbtAcc() {
		return dbtAcc;
	}

	public void setDbtAcc(String dbtAcc) {
		this.dbtAcc = dbtAcc;
	}

	public String getDrCcy() {
		return drCcy;
	}

	public void setDrCcy(String drCcy) {
		this.drCcy = drCcy;
	}

	public String getDrAmount() {
		return drAmount;
	}

	public void setDrAmount(String drAmount) {
		this.drAmount = drAmount;
	}

	public String getSourcerefNo() {
		return sourcerefNo;
	}

	public void setSourcerefNo(String sourcerefNo) {
		this.sourcerefNo = sourcerefNo;
	}

	public String getSourceCD() {
		return sourceCD;
	}

	public void setSourceCD(String sourceCD) {
		this.sourceCD = sourceCD;
	}

	public String getAccountingDate() {
		return accountingDate;
	}

	public void setAccountingDate(String accountingDate) {
		this.accountingDate = accountingDate;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public String getOveroverdrft() {
		return overoverdrft;
	}

	public void setOveroverdrft(String overoverdrft) {
		this.overoverdrft = overoverdrft;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getMakdtTime() {
		return makdtTime;
	}

	public void setMakdtTime(String makdtTime) {
		this.makdtTime = makdtTime;
	}

	public String getAuthstat() {
		return authstat;
	}

	public void setAuthstat(String authstat) {
		this.authstat = authstat;
	}

	public String getBookDt() {
		return bookDt;
	}

	public void setBookDt(String bookDt) {
		this.bookDt = bookDt;
	}

	public String getPrdCd() {
		return prdCd;
	}

	public void setPrdCd(String prdCd) {
		this.prdCd = prdCd;
	}

	

	public String getModCd() {
		return modCd;
	}

	public void setModCd(String modCd) {
		this.modCd = modCd;
	}

	public String getConCcy() {
		return conCcy;
	}

	public void setConCcy(String conCcy) {
		this.conCcy = conCcy;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public ContractDetailsFull(String prod, String userRefNO, String drvaldt, String crben, String crAcc, String crCcy,
			String crAmt, String crvaldt, String dbtbrn, String dbtAcc, String drCcy, String drAmount, String sourcerefNo,
			String sourceCD, String accountingDate, String prodDesc, String overoverdrft, String maker,
			String makdtTime, String authstat, String bookDt, String prdCd,  String modCd, String conCcy,
			String source) {
		this.prod = prod;
		this.userRefNO = userRefNO;
		this.drvaldt = drvaldt;
		this.crben = crben;
		this.crAcc = crAcc;
		this.crCcy = crCcy;
		this.crAmt = crAmt;
		this.crvaldt = crvaldt;
		this.dbtbrn = dbtbrn;
		this.dbtAcc = dbtAcc;
		this.drCcy = drCcy;
		this.drAmount = drAmount;
		this.sourcerefNo = sourcerefNo;
		this.sourceCD = sourceCD;
		this.accountingDate = accountingDate;
		this.prodDesc = prodDesc;
		this.overoverdrft = overoverdrft;
		this.maker = maker;
		this.makdtTime = makdtTime;
		this.authstat = authstat;
		this.bookDt = bookDt;
		this.prdCd = prdCd;
		this.modCd = modCd;
		this.conCcy = conCcy;
		this.source = source;
	}

	public ContractDetailsFull() {
		// TODO Auto-generated constructor stub
	}

	

	
}



