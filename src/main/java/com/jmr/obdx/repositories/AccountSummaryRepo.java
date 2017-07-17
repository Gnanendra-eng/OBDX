package com.jmr.obdx.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.Accountsummary;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Repository
public class AccountSummaryRepo {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Accountsummary> getAccountSummary(String customerId) throws Exception {
		return (List<Accountsummary>)sessionFactory.openSession().createCriteria(Accountsummary.class).
				add(Restrictions.eq("IDCUSTOMER", customerId)).list();
	}

}
