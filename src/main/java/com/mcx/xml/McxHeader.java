package com.mcx.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement()
public class McxHeader {
	
	@XmlElement
	private String SOURCE = null;
	
	@XmlElement
	private String UBSCOMP = null;
	
	
	
	
	@XmlElement
	private String CORRELID = null;
	
	@XmlElement
	private String USERID = null;
	
	@XmlElement
	private String BRANCH = null;
	
	@XmlElement
	private String SERVICE = null;
	
	@XmlElement
	private String OPERATION = null;

	public String getSOURCE() {
		return SOURCE;
	}

	public void setSOURCE(String sOURCE) {
		SOURCE = sOURCE;
	}

	public String getUBSCOMP() {
		return UBSCOMP;
	}

	public void setUBSCOMP(String uBSCOMP) {
		UBSCOMP = uBSCOMP;
	}

	public String getUSERID() {
		return USERID;
	}

	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}

	public String getCORRELID() {
		return CORRELID;
	}

	public void setCORRELID(String cORRELID) {
		CORRELID = cORRELID;
	}

	public String getBRANCH() {
		return BRANCH;
	}

	public void setBRANCH(String bRANCH) {
		BRANCH = bRANCH;
	}

	public String getSERVICE() {
		return SERVICE;
	}

	public void setSERVICE(String sERVICE) {
		SERVICE = sERVICE;
	}

	public String getOPERATION() {
		return OPERATION;
	}

	public void setOPERATION(String oPERATION) {
		OPERATION = oPERATION;
	}

	public McxHeader(String sOURCE, String uBSCOMP, String  cORRELID, String uSERID, String bRANCH, String sERVICE,
			String oPERATION) {
		SOURCE = sOURCE;
		UBSCOMP = uBSCOMP;
		USERID = uSERID;
		CORRELID = cORRELID;
		BRANCH = bRANCH;
		SERVICE = sERVICE;
		OPERATION = oPERATION;
	}

	public McxHeader() {
		// TODO Auto-generated constructor stub
	}






}
