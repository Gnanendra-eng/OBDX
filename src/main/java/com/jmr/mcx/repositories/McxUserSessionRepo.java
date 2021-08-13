package com.jmr.mcx.repositories;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import com.jmr.mcx.domain.McxUser;
import com.jmr.mcx.domain.McxUserSession;
/***
 * \
 * @author Rishad K
 *
 */
@Transactional
public interface McxUserSessionRepo  extends CrudRepository<McxUserSession,Integer>{
	
	
	public List<McxUserSession> findByMcxUser(McxUser id);

}
