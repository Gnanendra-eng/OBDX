package com.jmr.mcx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxLogin;



/***
 * \
 * @author Rishad K
 *
 */
@Repository
@Transactional
public interface McxLoginRepo extends CrudRepository<McxLogin, Integer> {

	@Query("from McxLogin where userName=:userName")
	public McxLogin findByUserName(@Param("userName") String userName);
	
}
