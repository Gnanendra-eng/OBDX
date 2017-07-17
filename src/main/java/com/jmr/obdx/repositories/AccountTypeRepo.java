package com.jmr.obdx.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jmr.obdx.domain.McxAccountTypeM;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
public interface AccountTypeRepo extends CrudRepository<McxAccountTypeM, Integer> {
	
	 public McxAccountTypeM findByDescription( String accountDescription);

}
