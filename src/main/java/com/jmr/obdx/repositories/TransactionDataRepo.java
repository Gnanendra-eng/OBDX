package com.jmr.obdx.repositories;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.TransactionData;

@Repository
@Transactional
public interface TransactionDataRepo extends CrudRepository<TransactionData, Integer>{
	
	@Query("from TransactionData")
	public List<TransactionData> transactionData();

	

}
