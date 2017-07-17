package com.mcx.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="soapenv:Body")
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapBody {
	
	@XmlElement(name="CREATECONTRACT_FSFS_REQ")
	private CreateContractReq createContractReq = null;

	public CreateContractReq getCreateContractReq() {
		return createContractReq;
	}

	public void setCreateContractReq(CreateContractReq createContractReq) {
		this.createContractReq = createContractReq;
	}

	public SoapBody(CreateContractReq createContractReq) {
		this.createContractReq = createContractReq;
	}

	public SoapBody() {
		// TODO Auto-generated constructor stub
	}

	
	
}
