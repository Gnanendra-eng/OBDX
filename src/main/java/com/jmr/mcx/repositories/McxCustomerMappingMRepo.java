package com.jmr.mcx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxCustomerMappingM;

@Repository
@Transactional
public interface McxCustomerMappingMRepo extends CrudRepository<McxCustomerMappingM, Integer> {

	@Query("from McxCustomerMappingM where ref_user_id=:userId")
	public McxCustomerMappingM findByUserId(@Param("userId") int userId);
}
