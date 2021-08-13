package com.jmr.mcx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.LoanAccount;

/***
 * \
 * 
 * @author Pritiranjan Swain
 *
 */

@Repository
@Transactional
public interface LoanRepo extends CrudRepository<LoanAccount, String> {

	@Query("from LoanAccount where idCust=:idCust")
	public List<LoanAccount> findLoanSummaryByCustomerId(@Param("idCust") String idCust);

	

}
