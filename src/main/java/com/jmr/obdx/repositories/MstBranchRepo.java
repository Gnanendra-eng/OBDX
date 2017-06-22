package com.jmr.obdx.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.MstBranch;

@Repository
public interface MstBranchRepo extends CrudRepository<MstBranch, Integer>{
	
	
	public MstBranch findByBankCode(String branchCode);
	

}
