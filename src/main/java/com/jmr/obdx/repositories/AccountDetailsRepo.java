package com.jmr.obdx.repositories;

import java.util.List;

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
		return (List<Accountdetails>)sessionFactory.openSession().createCriteria(Accountdetails.class).add(Restrictions.eq("IDCUSTOMER", customerId)).list();
	}
	
	public Accountdetails getAccountDetails(String customerId,String nbrAccount) throws Exception {
		return(Accountdetails)sessionFactory.openSession().createCriteria(Accountdetails.class).add(Restrictions.eq("IDCUSTOMER", customerId)).add(Restrictions.eq("NBRACCOUNT", nbrAccount)).uniqueResult();
	}
}
