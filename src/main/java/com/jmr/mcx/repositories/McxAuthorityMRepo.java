package com.jmr.mcx.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxAuthorityM;
/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Repository
@Transactional
public interface McxAuthorityMRepo  extends CrudRepository<McxAuthorityM, Integer> {
	
	public McxAuthorityM findByMcxBaseUserTypeM(String typeUser);
	
}
