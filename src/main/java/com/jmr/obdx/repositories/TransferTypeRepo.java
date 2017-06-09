package com.jmr.obdx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.TransferType;

@Repository
@Transactional
public interface TransferTypeRepo extends CrudRepository<TransferType, Integer> {
	
	
	@Query("from TransferType")
	public List<TransferType> transferType();

	
}
