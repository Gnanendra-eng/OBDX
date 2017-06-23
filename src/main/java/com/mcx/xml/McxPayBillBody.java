package com.mcx.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)

public class McxPayBillBody {
	
	
	@XmlElement(name="Transaction-Details-IO")
	private TransactionDetailsIo transactionDetailsIo;

	public TransactionDetailsIo getTransactionDetailsIo() {
		return transactionDetailsIo;
	}

	public void setTransactionDetailsIo(TransactionDetailsIo transactionDetailsIo) {
		this.transactionDetailsIo = transactionDetailsIo;
	}

	public McxPayBillBody(TransactionDetailsIo transactionDetailsIo) {
		this.transactionDetailsIo = transactionDetailsIo;
	}

	public McxPayBillBody() {
		// TODO Auto-generated constructor stub
	}
	
	

}
