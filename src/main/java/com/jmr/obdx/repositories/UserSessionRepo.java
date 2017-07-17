package com.jmr.obdx.repositories;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import com.jmr.obdx.domain.McxUser;
import com.jmr.obdx.domain.McxUserSession;
/***
 * \
 * @author Rishad K
 *
 */
@Transactional
public interface UserSessionRepo  extends CrudRepository<McxUserSession,Integer>{
	
	public List<McxUserSession> findByMcxUser(McxUser mcxUser);
	
}
