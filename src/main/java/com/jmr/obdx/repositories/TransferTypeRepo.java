package com.jmr.obdx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jmr.obdx.domain.TransferType;

public interface TransferTypeRepo extends CrudRepository<TransferType, Integer> {
	
	
	@Query("from TransferType")
	public List<TransferType> transferType();

	
	 public TransferType findByTransactionDatas(String transationType);
}
