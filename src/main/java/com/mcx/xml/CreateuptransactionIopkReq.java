package com.mcx.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CREATEUPTRANSACTION_IOPK_REQ") 
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateuptransactionIopkReq {

	@XmlElement(name ="FCUBS_HEADER")
	private McxHeader mcxHeader;
	
	

	@XmlElement(name ="FCUBS_BODY")
	private McxPayBillBody  mcxBody;



	public McxHeader getMcxHeader() {
		return mcxHeader;
	}



	public void setMcxHeader(McxHeader mcxHeader) {
		this.mcxHeader = mcxHeader;
	}



	public McxPayBillBody getMcxBody() {
		return mcxBody;
	}



	public void setMcxBody(McxPayBillBody mcxBody) {
		this.mcxBody = mcxBody;
	}



	public CreateuptransactionIopkReq(McxHeader mcxHeader, McxPayBillBody mcxBody) {
		this.mcxHeader = mcxHeader;
		this.mcxBody = mcxBody;
	}



	public CreateuptransactionIopkReq() {
		// TODO Auto-generated constructor stub
	}





}