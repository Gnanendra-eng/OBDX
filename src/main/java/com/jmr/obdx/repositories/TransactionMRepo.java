package com.jmr.obdx.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jmr.obdx.domain.McxTransactionM;


/***
 * \
 * @author Pritiranjan Swain
 *
 */
public interface TransactionMRepo extends CrudRepository<McxTransactionM, Integer> {

}
