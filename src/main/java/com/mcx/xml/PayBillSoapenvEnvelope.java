package com.mcx.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="soapenv:Envelope") 
public class PayBillSoapenvEnvelope {
	
	@XmlAttribute(name="xmlns:soapenv")
	private String soapUrl;
	
	@XmlAttribute()
    private String xmlns;
    
	
     
     @XmlElement(name ="soapenv:Body")
     private PayBillSoapBody payBillSoapBody;



	public String getSoapUrl() {
		return soapUrl;
	}



	public void setSoapUrl(String soapUrl) {
		this.soapUrl = soapUrl;
	}



	public String getXmlns() {
		return xmlns;
	}



	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}



	public PayBillSoapBody getPayBillSoapBody() {
		return payBillSoapBody;
	}



	public void setPayBillSoapBody(PayBillSoapBody payBillSoapBody) {
		this.payBillSoapBody = payBillSoapBody;
	}



	public PayBillSoapenvEnvelope(String soapUrl, String xmlns, PayBillSoapBody payBillSoapBody) {
		this.soapUrl = soapUrl;
		this.xmlns = xmlns;
		this.payBillSoapBody = payBillSoapBody;
	}



	public PayBillSoapenvEnvelope() {
		// TODO Auto-generated constructor stub
	}





}