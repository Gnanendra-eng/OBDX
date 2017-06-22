package com.mcx.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.jmr.obdx.dto.StatusInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="soapenv:Envelope") 
public class SoapenvEnvelope {
	
	@XmlAttribute(name="xmlns:soapenv")
	private String soapUrl;
	
	@XmlAttribute()
    	private String xmlns;
    
	
     
     @XmlElement(name ="soapenv:Body")
     private SoapBody soapBody;

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

	

	public SoapBody getSoapBody() {
		return soapBody;
	}

	public void setSoapBody(SoapBody soapBody) {
		this.soapBody = soapBody;
	}


	public SoapenvEnvelope(String soapUrl, String xmlns , SoapBody soapBody) {
		this.soapUrl = soapUrl;
		this.xmlns = xmlns;
		this.soapBody = soapBody;
	}

	public SoapenvEnvelope() {
		// TODO Auto-generated constructor stub
	}
     
	
}
