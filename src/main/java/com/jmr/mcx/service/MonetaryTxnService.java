package com.jmr.mcx.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmr.mcx.model.MonetaryTxn;
import com.jmr.mcx.repositories.MonetaryTxnRepository;

@Service
public class MonetaryTxnService {
	
	@Autowired
	MonetaryTxnRepository monetaryTxnRepository;
	
	public MonetaryTxn save(MonetaryTxn txn_id){
		
		return monetaryTxnRepository.save(txn_id);
	}
	
	public List<MonetaryTxn> findAll(){
		
		return (List<MonetaryTxn>) monetaryTxnRepository.findAll();
	}
	
	public MonetaryTxn findOne(long txn_id){
		
		return monetaryTxnRepository.findOne(txn_id);
	}
	
	public void delete(MonetaryTxn txn_id){
		
		monetaryTxnRepository.delete(txn_id);
	}

}
