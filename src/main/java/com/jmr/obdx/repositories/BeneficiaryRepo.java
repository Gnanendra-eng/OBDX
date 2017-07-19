package com.jmr.obdx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.McxBeneficiary;
/***
 * \
 * @author Pritiranjan Swain
 *
 */

@Repository
@Transactional
public interface BeneficiaryRepo extends CrudRepository<McxBeneficiary, Integer> {

	
	@Query(" from McxBeneficiary")
	public List<McxBeneficiary> findBeneficiary();
	
	@Query("from McxBeneficiary where id=:payeeId")
	public McxBeneficiary findByBeneficiaryId (@Param("payeeId") long payeeId);
}
