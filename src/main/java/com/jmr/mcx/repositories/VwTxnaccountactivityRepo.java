package com.jmr.mcx.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.VwTxnaccountactivity;

@Repository
public class VwTxnaccountactivityRepo {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	public List<VwTxnaccountactivity> findByUserTransactionAccountActivityInfo(String customerId,String nbrAccount) throws Exception {
		return (List<VwTxnaccountactivity>)sessionFactory.openSession().createCriteria(VwTxnaccountactivity.class).
				add(Restrictions.eq("customerNo", customerId)).add(Restrictions.eq("nbrAccount", nbrAccount)).addOrder(Order.desc("txnDate")).list();

	}
	

	@SuppressWarnings("unchecked")
	public List<VwTxnaccountactivity> findByUserLastFiveTransactionAccountActivityInfo(String customerId,String nbrAccount) throws Exception{
		return (List<VwTxnaccountactivity>)sessionFactory.openSession().createCriteria(VwTxnaccountactivity.class).add(Restrictions.eq("customerNo", customerId)).
				add(Restrictions.eq("nbrAccount", nbrAccount)).addOrder(Order.desc("txnDate")).setMaxResults(5).list();
	}
	
	
	
}
