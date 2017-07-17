package com.jmr.obdx.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.McxAuditLog;
import com.jmr.obdx.domain.McxTransactionM;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Repository
public interface McxAuditLogRepo extends CrudRepository<McxAuditLog, Integer> {

}
