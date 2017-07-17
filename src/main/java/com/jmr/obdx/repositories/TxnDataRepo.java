package com.jmr.obdx.repositories;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.McxTransactionData;
/***
 * \
 * @author Pritiranjan Swain
 *
 */

@Repository
@Transactional
public interface TxnDataRepo extends CrudRepository<McxTransactionData, Integer>{
	
	@Query("from TxnData")
	public List<McxTransactionData> transactionData();
	
	public McxTransactionData findByReferenceId( String refId);

	

}
