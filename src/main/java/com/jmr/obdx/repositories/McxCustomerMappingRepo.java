package com.jmr.obdx.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jmr.obdx.domain.McxAuditLog;
import com.jmr.obdx.domain.McxCustomerMapping;
import com.jmr.obdx.domain.McxUser;


/***
 * 
 * created by Murugesh on 17/07/2017
 *
 */
public interface McxCustomerMappingRepo extends CrudRepository<McxCustomerMapping, Integer> {
		public McxCustomerMapping findByMcxUser(McxUser mcxUser);
}
