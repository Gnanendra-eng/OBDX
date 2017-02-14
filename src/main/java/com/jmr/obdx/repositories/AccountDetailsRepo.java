package com.jmr.obdx.repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.Accountdetails;

@Repository
public class AccountDetailsRepo {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Accountdetails> getBasicAccountDetails(String customerId) throws Exception {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Accountdetails.class);
		criteria.add(Restrictions.eq("IDCUSTOMER", customerId));
		List<Accountdetails> list= criteria.list();
		return list;
		
	}
	
	public Accountdetails getAccountDetails(String customerId,String nbrAccount) throws Exception {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Accountdetails.class);
		criteria.add(Restrictions.eq("IDCUSTOMER", customerId));
		criteria.add(Restrictions.eq("NBRACCOUNT", nbrAccount));
		return (Accountdetails) criteria.uniqueResult();
		
		
	}
	
}
