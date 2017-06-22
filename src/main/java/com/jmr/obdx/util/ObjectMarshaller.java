package com.jmr.obdx.util;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jmr.obdx.dto.StatusInfo;
import com.mcx.xml.SoapenvEnvelope;


@Component
@XmlAccessorType(XmlAccessType.FIELD)
public class ObjectMarshaller   {
	
	 
	private StatusInfo statusInfo;
	
	java.io.StringWriter requestObj = new StringWriter();

	
	private static Logger logger = Logger.getLogger(ObjectMarshaller.class);

  
	public StringWriter marshallerToXml (SoapenvEnvelope soapenvEnvelope)throws Exception{ 
		JAXBContext contextObj = JAXBContext.newInstance(SoapenvEnvelope.class);
		Marshaller marshallerObj = contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshallerObj.marshal(soapenvEnvelope, requestObj);
		return requestObj;
	  }
       
	  
	  
}
