package com.jmr.mcx.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jmr.mcx.domain.McxCustomerMapping;
import com.jmr.mcx.domain.McxUser;


/***
 * 
 * created by Murugesh on 17/07/2017
 *
 */
public interface McxCustomerMappingRepo extends CrudRepository<McxCustomerMapping, Integer> {
		public McxCustomerMapping findByMcxUser(McxUser mcxUser);
}
