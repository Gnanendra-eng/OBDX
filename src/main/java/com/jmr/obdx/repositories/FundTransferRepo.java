package com.jmr.obdx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.FundTransfer;


@Repository
@Transactional
public interface FundTransferRepo extends CrudRepository<FundTransfer, Integer> {

}
