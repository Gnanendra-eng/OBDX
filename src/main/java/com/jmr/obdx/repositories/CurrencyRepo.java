package com.jmr.obdx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jmr.obdx.domain.CurrencyM;

public interface CurrencyRepo extends CrudRepository<CurrencyM,Integer> {
	
	
	@Query("from CurrencyM")
	public List<CurrencyM> currencym();

}
