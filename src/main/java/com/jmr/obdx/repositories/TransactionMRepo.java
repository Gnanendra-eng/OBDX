package com.jmr.obdx.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jmr.obdx.domain.McxTransactionM;

public interface TransactionMRepo extends CrudRepository<McxTransactionM, Integer> {

}
