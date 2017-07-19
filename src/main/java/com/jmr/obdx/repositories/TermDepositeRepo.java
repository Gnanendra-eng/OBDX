package com.jmr.obdx.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.TermDepositeM;


/***
 * \
 * @author Pritiranjan Swain
 *
 */

@Repository
public class TermDepositeRepo {
	

    @Autowired
    private SessionFactory sessionFactory;
       
	@SuppressWarnings("unchecked")
	public List<TermDepositeM> findTermDepositeByCustomerId(String customerId) throws Exception {
		 return(List<TermDepositeM>) sessionFactory.openSession().createCriteria(TermDepositeM.class).
				 add(Restrictions.eq("customerid", customerId)).list();
	}

}
