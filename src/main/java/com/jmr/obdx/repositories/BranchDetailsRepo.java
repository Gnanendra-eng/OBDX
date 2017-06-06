package com.jmr.obdx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jmr.obdx.domain.BranchDetailsM;

public interface BranchDetailsRepo extends CrudRepository<BranchDetailsM, Integer>  {
	
	
	@Query("from BranchDetailsM")
	public List<BranchDetailsM> branchDetailsM();

}
