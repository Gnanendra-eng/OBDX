package com.jmr.mcx.repositories;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxTransferType;

@Repository
@Transactional
public interface McxTransferTypeRepo extends CrudRepository<McxTransferType, Integer>{
	@Query("from McxTransferType where transferType=:type")
	public McxTransferType findbyType(@Param("type") String type);
}
