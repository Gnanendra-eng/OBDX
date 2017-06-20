package com.mcx.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ADDL {
	
	@XmlAttribute
	private String PARAM;
	
	@XmlElement
	private String NAME;
	
	@XmlElement
	private String VALUE;

	public String getPARAM() {
		return PARAM;
	}

	public void setPARAM(String pARAM) {
		PARAM = pARAM;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getVALUE() {
		return VALUE;
	}

	public void setVALUE(String vALUE) {
		VALUE = vALUE;
	}

	public ADDL(String pARAM, String nAME, String vALUE) {
		PARAM = pARAM;
		NAME = nAME;
		VALUE = vALUE;
	}

	public ADDL() {
		// TODO Auto-generated constructor stub
	}
	

}
