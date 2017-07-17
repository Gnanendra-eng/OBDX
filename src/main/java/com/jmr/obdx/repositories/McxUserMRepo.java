package com.jmr.obdx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.McxTransactionM;
import com.jmr.obdx.domain.McxUserM;

@Repository
@Transactional
public interface McxUserMRepo extends CrudRepository<McxUserM, Integer>{
	
	 public McxUserM findById( long userID);

	
}
