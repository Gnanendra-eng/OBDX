package com.jmr.mcx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxConfigTbl;

@Repository
@Transactional
public interface McxConfigRepo extends CrudRepository<McxConfigTbl, Integer> {

	@Query("from McxConfigTbl")
	public List<McxConfigTbl> findConfig();

}
