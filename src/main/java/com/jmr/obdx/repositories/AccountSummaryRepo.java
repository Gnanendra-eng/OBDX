package com.jmr.obdx.repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.Accountsummary;


@Repository
public class AccountSummaryRepo {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Accountsummary> getAccountSummary(String customerId) throws Exception {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Accountsummary.class);
		criteria.add(Restrictions.eq("IDCUSTOMER", customerId));
		return (List<Accountsummary>) criteria.list();
	}

}
