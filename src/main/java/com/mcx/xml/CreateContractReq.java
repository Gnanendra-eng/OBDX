package com.mcx.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CREATECONTRACT_FSFS_REQ") 
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateContractReq {
	
	@XmlElement(name ="FCUBS_HEADER")
	private McxHeader mcxHeader;
	
	@XmlAttribute()
	private String xmlns;

	@XmlElement(name ="FCUBS_BODY")
	private McxBody  mcxBody;

	public McxHeader getMcxHeader() {
		return mcxHeader;
	}

	public void setMcxHeader(McxHeader mcxHeader) {
		this.mcxHeader = mcxHeader;
	}

	public String getXmlns() {
		return xmlns;
	}

	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	public McxBody getMcxBody() {
		return mcxBody;
	}

	public void setMcxBody(McxBody mcxBody) {
		this.mcxBody = mcxBody;
	}

	public CreateContractReq(McxHeader mcxHeader, String xmlns, McxBody mcxBody) {
		super();
		this.mcxHeader = mcxHeader;
		this.xmlns = xmlns;
		this.mcxBody = mcxBody;
	}

	public CreateContractReq() {
		// TODO Auto-generated constructor stub
	}



}