package com.jmr.obdx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.McxUser;

/***
 * \
 * @author Rishad K
 *
 */
@Repository
@Transactional
public interface McxUserMRepo extends CrudRepository<McxUser, Integer>{
	
	 public McxUser findById( long userID);

	
}
