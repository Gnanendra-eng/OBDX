package com.jmr.obdx.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.McxVwBillerInfo;


/***
 * \
 * @author Rishad K
 *
 */
@Repository
public class McxVwBillerInfoRepo {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<McxVwBillerInfo> getBiller() throws Exception {
		return (List<McxVwBillerInfo>)sessionFactory.openSession().createCriteria(McxVwBillerInfo.class).list();
	}

}
