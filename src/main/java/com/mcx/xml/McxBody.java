package com.mcx.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class McxBody {
	
	@XmlElement(name="Contract-Details-Full")
	private ContractDetailsFull contractDetailsFull = null;

	public ContractDetailsFull getContractDetailsFull() {
		return contractDetailsFull;
	}

	public void setContractDetailsFull(ContractDetailsFull contractDetailsFull) {
		this.contractDetailsFull = contractDetailsFull;
	}

	public McxBody(ContractDetailsFull contractDetailsFull) {
		this.contractDetailsFull = contractDetailsFull;
	}

	public McxBody() {
		// TODO Auto-generated constructor stub
	}

	
	

}
