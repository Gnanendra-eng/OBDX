package com.jmr.obdx.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.AuthorityM;

/***
 * @author RISHAD K
 */
@Repository
public interface AuthorityMRepo extends CrudRepository<AuthorityM, Integer> {
	AuthorityM findByAuthority(String roleName);
	
	
}