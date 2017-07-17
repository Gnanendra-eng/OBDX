package com.jmr.obdx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.CurrencyM;

@Repository
@Transactional
public interface CurrencyRepo extends CrudRepository<CurrencyM,Integer> {
	
	
	@Query("from CurrencyM")
	public List<CurrencyM> currencym();
	
	 public CurrencyM findByCurrencyType(String transationType);

}
