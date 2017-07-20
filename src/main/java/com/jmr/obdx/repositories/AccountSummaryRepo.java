package com.jmr.obdx.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.AccountSummary;

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
	public List<AccountSummary> findAccountSummaryByCustomerId(String customerId) throws Exception {
		return (List<AccountSummary>)sessionFactory.openSession().createCriteria(AccountSummary.class).
				add(Restrictions.eq("idCustomer", customerId)).list();
	}

}
