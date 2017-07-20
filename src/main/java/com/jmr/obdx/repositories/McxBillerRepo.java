package com.jmr.obdx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.McxBiller;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Repository
@Transactional
public interface McxBillerRepo extends CrudRepository<McxBiller, Integer> {
	
	@Query("from McxBiller where login=:login")
	public List<McxBiller> findByUserBillerInfo(@Param("login") long login);

}
