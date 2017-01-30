package com.jmr.obdx.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.UserSession;
/***
 * @author JMR
 */
@Repository
@Transactional
public interface UserSessionRepo  extends CrudRepository<UserSession,Integer>{
	
	public List<UserSession> findByIduser(Long userId);
	
}
