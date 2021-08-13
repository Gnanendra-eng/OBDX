package com.jmr.mcx.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jmr.mcx.model.MonetaryTxn;

public interface MonetaryTxnRepository extends CrudRepository<MonetaryTxn, Long>{
	
	

}