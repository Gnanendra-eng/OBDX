package com.jmr.obdx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.BranchDetailsM;

@Repository
@Transactional

public interface BranchDetailsRepo extends CrudRepository<BranchDetailsM, Integer>  {
	
	
	@Query("from BranchDetailsM")
	public List<BranchDetailsM> branchDetailsM();

}
