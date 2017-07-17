package com.jmr.obdx.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jmr.obdx.domain.McxTransactionM;

public interface McxTransactionMRepo extends CrudRepository<McxTransactionM, Integer>{
	
	 public McxTransactionM findByProddesc( String prodDesc);
	

}
