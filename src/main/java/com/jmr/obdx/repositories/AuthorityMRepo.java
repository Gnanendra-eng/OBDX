package com.jmr.obdx.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.AuthorityM;

@Repository
public interface AuthorityMRepo  extends CrudRepository<AuthorityM, Integer> {
	
	public AuthorityM findByTypeuser(String typeUser);
	
}
