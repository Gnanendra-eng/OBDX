package com.jmr.obdx.repositories;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jmr.obdx.domain.UserSessionData;

/***
 * @author JMR
 */
@Repository
@Transactional
public interface UserSessionDataRepo extends CrudRepository<UserSessionData, Integer> {

}
