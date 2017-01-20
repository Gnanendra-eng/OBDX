package com.jmr.obdx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.AuthorityM;

/***
 * @author JMR
 */
@Repository
@Transactional
public interface AuthorityMRepo  extends CrudRepository<AuthorityM, Integer> {
	
	public AuthorityM findByTypeuser(String typeUser);
	
}
