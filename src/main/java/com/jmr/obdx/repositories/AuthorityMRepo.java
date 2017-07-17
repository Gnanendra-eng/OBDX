package com.jmr.obdx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.McxAuthorityM;
/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Repository
@Transactional
public interface AuthorityMRepo  extends CrudRepository<McxAuthorityM, Integer> {
	
	public McxAuthorityM findByMcxBaseUserTypeM(String typeUser);
	
}
