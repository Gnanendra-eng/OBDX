package com.jmr.mcx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxBeneficiary;
/***
 * \
 * @author Pritiranjan Swain
 *
 */

@Repository
@Transactional
public interface BeneficiaryRepo extends CrudRepository<McxBeneficiary, Long> {

	@Query(" from McxBeneficiary")
	public List<McxBeneficiary> findBeneficiary();

	public McxBeneficiary findById(@Param("payeeId") long payeeId);

	@Query("from McxBeneficiary where id=:payeeId")
	public McxBeneficiary findByBeneficiaryId(@Param("payeeId") long payeeId);

	@Query("from McxBeneficiary where mcxTransferType=:id")
	public List<McxBeneficiary> findDomesticBeneficiary(@Param("id") int id);
	
	@Query("from McxBeneficiary where mcxUser=:id")
	public List<McxBeneficiary> findBeneficiaryByUserId(@Param("id") long id);
	
	@Query("from McxBeneficiary where ref_user_id=:user and ref_transfer_type_id=:type")
	public List<McxBeneficiary> findDomesticBeneficiaryByUserId(@Param("user") int id, @Param("type") long type);
	
	/*@Query("from McxBeneficiary where McxTransferType.transferType=:type")
	public List<McxBeneficiary> findDomesticBeneficiaryByName(@Param("type") String type);*/
}
