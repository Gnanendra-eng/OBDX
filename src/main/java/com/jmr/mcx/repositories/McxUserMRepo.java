package com.jmr.mcx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxUser;

/***
 * \
 * @author Rishad K
 *
 */
@Repository
@Transactional
public interface McxUserMRepo extends CrudRepository<McxUser, Integer>{
	
	 public McxUser findById(long mcxuser);
	 

	
}
