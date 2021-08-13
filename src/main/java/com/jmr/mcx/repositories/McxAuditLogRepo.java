package com.jmr.mcx.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxAuditLog;
import com.jmr.mcx.domain.McxTransactionM;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Repository
public interface McxAuditLogRepo extends CrudRepository<McxAuditLog, Integer> {

}
