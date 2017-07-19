package com.jmr.obdx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.jmr.obdx.domain.McxLogin;

/***
 * \
 * @author Rishad K
 *
 */
@Repository
@Transactional
public interface LoginRepo extends CrudRepository<McxLogin, Integer> {

	@Query("from McxLogin where userName=:userName")
	public McxLogin findByUsername(@Param("userName") String userName);
	
}
