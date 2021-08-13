package com.jmr.mcx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.ClearingCodes;

@Repository
@Transactional
public interface ClearingCodesRepo extends CrudRepository<ClearingCodes, Integer> {

	@Query("from ClearingCodes")
	public List<ClearingCodes> findConfig();
	@Query("from ClearingCodes where SRCINFO=:srcinfo and BENBANKCODE=:bankcode ")
	public ClearingCodes findBankAddress (@Param("srcinfo") String srcinfo, @Param("bankcode") String brcode);
}
