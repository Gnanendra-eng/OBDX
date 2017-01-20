package com.jmr.obdx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.jmr.obdx.domain.Login;

/***
 * @author JMR
 */
@Repository
@Transactional
public interface LoginRepo extends CrudRepository<Login, Integer> {

	@Query("from Login where username=:userName")
	public Login findByUsername(@Param("userName") String userName);
	
}
