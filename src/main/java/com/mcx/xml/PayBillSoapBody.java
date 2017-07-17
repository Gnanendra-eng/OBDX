package com.mcx.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="soapenv:Body")
@XmlAccessorType(XmlAccessType.FIELD)
public class PayBillSoapBody {
	
	@XmlElement(name="CREATEUPTRANSACTION_IOPK_REQ")
	private CreateuptransactionIopkReq createuptransactionIopkReq;

	public CreateuptransactionIopkReq getCreateuptransactionIopkReq() {
		return createuptransactionIopkReq;
	}

	public void setCreateuptransactionIopkReq(CreateuptransactionIopkReq createuptransactionIopkReq) {
		this.createuptransactionIopkReq = createuptransactionIopkReq;
	}

	public PayBillSoapBody(CreateuptransactionIopkReq createuptransactionIopkReq) {
		this.createuptransactionIopkReq = createuptransactionIopkReq;
	}

	public PayBillSoapBody() {
		// TODO Auto-generated constructor stub
	}
	
	

}
