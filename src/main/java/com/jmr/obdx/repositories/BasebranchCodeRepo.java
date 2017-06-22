package com.jmr.obdx.repositories;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.BasebranchCodeM;

@Repository
@Transactional
public interface BasebranchCodeRepo extends CrudRepository<BasebranchCodeM, Integer>{

	@Query("from BasebranchCodeM")
	public BasebranchCodeM baseBranchDetailsM();
	

	
}
