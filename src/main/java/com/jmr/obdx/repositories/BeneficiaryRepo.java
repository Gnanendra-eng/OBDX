package com.jmr.obdx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.BeneficiaryM;


@Repository
@Transactional
public interface BeneficiaryRepo extends CrudRepository<BeneficiaryM, Integer> {

}
