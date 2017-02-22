package com.jmr.obdx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.BillerM;

@Repository
public interface BillerRepo extends CrudRepository<BillerM, Integer> {
	
	@Query("from BillerM")
	public List<BillerM> findAllBiller();
}


	
	
