package com.jmr.mcx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxLoginM;

@Repository
@Transactional
public interface McxLoginMRepo extends CrudRepository<McxLoginM, Integer> {

	@Query("from McxLoginM where user_name=:userName")
	public McxLoginM findByUserName(@Param("userName") String userName);
	
}
