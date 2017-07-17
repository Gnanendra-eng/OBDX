package com.mcx.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement  
public class CREATEPCCONTRACT_FSFS_REQ {

	@XmlAttribute 
	private String FCUBS_HEADER;
	

	@XmlElement
	private String SOURCE;
	
	@XmlElement
	private String UBSCOMP;
	
	@XmlElement
    private String MSGID;
	
	@XmlElement
	private String CORRELID;
	
	@XmlElement
	private String USERID;
	
	@XmlElement
	private String BRANCH;
	
	@XmlElement
	private String SERVICE;
	
	@XmlElement
	private String OPERATION;
	
	@XmlElement
	private String SOURCE_OPERATION;
	
	@XmlElement
	private ADDL ADDL;
	
	
	@XmlAttribute
	private String FCUBS_BODY;
	
	@XmlElement
	private PctbContractMasterFull PctbContractMasterFull;

	public String getFCUBS_HEADER() {
		return FCUBS_HEADER;
	}

	public void setFCUBS_HEADER(String fCUBS_HEADER) {
		FCUBS_HEADER = fCUBS_HEADER;
	}

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

	public String getMSGID() {
		return MSGID;
	}

	public void setMSGID(String mSGID) {
		MSGID = mSGID;
	}

	public String getCORRELID() {
		return CORRELID;
	}

	public void setCORRELID(String cORRELID) {
		CORRELID = cORRELID;
	}

	public String getUSERID() {
		return USERID;
	}

	public void setUSERID(String uSERID) {
		USERID = uSERID;
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

	public String getSOURCE_OPERATION() {
		return SOURCE_OPERATION;
	}

	public void setSOURCE_OPERATION(String sOURCE_OPERATION) {
		SOURCE_OPERATION = sOURCE_OPERATION;
	}

	public ADDL getADDL() {
		return ADDL;
	}

	public void setADDL(ADDL aDDL) {
		ADDL = aDDL;
	}

	public String getFCUBS_BODY() {
		return FCUBS_BODY;
	}

	public void setFCUBS_BODY(String fCUBS_BODY) {
		FCUBS_BODY = fCUBS_BODY;
	}

	public PctbContractMasterFull getPctbContractMasterFull() {
		return PctbContractMasterFull;
	}

	public void setPctbContractMasterFull(PctbContractMasterFull pctbContractMasterFull) {
		PctbContractMasterFull = pctbContractMasterFull;
	}

	public CREATEPCCONTRACT_FSFS_REQ(String fCUBS_HEADER, String sOURCE, String uBSCOMP, String mSGID, String cORRELID,
			String uSERID, String bRANCH, String sERVICE, String oPERATION, String sOURCE_OPERATION,
			com.mcx.xml.ADDL aDDL, String fCUBS_BODY, com.mcx.xml.PctbContractMasterFull pctbContractMasterFull) {
		FCUBS_HEADER = fCUBS_HEADER;
		SOURCE = sOURCE;
		UBSCOMP = uBSCOMP;
		MSGID = mSGID;
		CORRELID = cORRELID;
		USERID = uSERID;
		BRANCH = bRANCH;
		SERVICE = sERVICE;
		OPERATION = oPERATION;
		SOURCE_OPERATION = sOURCE_OPERATION;
		ADDL = aDDL;
		FCUBS_BODY = fCUBS_BODY;
		PctbContractMasterFull = pctbContractMasterFull;
	}

	public CREATEPCCONTRACT_FSFS_REQ() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
