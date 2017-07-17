package com.jmr.obdx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.BeneficiaryM;


@Repository
@Transactional
public interface BeneficiaryRepo extends CrudRepository<BeneficiaryM, Integer> {

	
	@Query(" from BeneficiaryM")
	public List<BeneficiaryM> findBeneficiary();
	
	@Query("from BeneficiaryM where id=:payeeId")
	public BeneficiaryM findByBeneficiaryId (@Param("payeeId") long payeeId);
}
