package com.jmr.mcx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxBiller;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Repository
@Transactional
public interface BillerRepo extends CrudRepository<McxBiller, Integer> {
	
	@Query("from McxBiller where mcxLogin=:mcxLogin")
	public List<McxBiller> findByUserBillerInfo(@Param("mcxLogin") long mcxLogin);

}
