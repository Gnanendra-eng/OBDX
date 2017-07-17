package com.jmr.obdx.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.MstBranch;



/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Repository
public interface MstBranchRepo extends CrudRepository<MstBranch, Integer>{
	
	
	@Query("from MstBranch where branchCode=:branchCode")
	public MstBranch findByBankCode(@Param("branchCode") String branchCode);
	
	
	
	
	
	
	

}
