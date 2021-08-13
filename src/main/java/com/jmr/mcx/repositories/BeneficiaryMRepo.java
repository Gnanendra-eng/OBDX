package com.jmr.mcx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.jmr.mcx.domain.McxBeneficiaryM;

@Repository
@Transactional
public interface BeneficiaryMRepo extends CrudRepository<McxBeneficiaryM, Integer> {


}
