package com.jmr.obdx.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jmr.obdx.domain.AccountTypeM;

public interface AccountTypeRepo extends CrudRepository<AccountTypeM, Integer> {
	
	 public AccountTypeM findByDescription( String accountDescription);

}
