package com.jmr.mcx.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jmr.mcx.domain.McxTransactionM;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
public interface McxTransactionMRepo extends CrudRepository<McxTransactionM, Integer>{
	
	 public McxTransactionM findByProductDescription( String productDescription);
	 
	

}
