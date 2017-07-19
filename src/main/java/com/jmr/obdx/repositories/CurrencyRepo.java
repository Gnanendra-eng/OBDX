package com.jmr.obdx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.McxCurrencyM;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Repository
@Transactional
public interface CurrencyRepo extends CrudRepository<McxCurrencyM,Integer> {
	
	
	@Query("from McxCurrencyM")
	public List<McxCurrencyM> currencym();
	
	 public McxCurrencyM findByCurrencyType(String transationType);

}
