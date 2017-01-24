package com.jmr.obdx.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.Fcc_vw_txnaccountactivity;
import com.jmr.obdx.util.HibernateConnectionUtil;

/***************************
 * @author PRITIRANJAN SWAIN
 * 
 ****************************/
@Repository
public class TransactionDetailsRepo {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private HibernateConnectionUtil hibernateConnectionUtil;
	
	
	public List<Fcc_vw_txnaccountactivity> getTransactionDetails(Integer idcustomer, String nbrAccount) throws Exception{
                SessionFactory sessionFactory = hibernateConnectionUtil.getSessionFactory();
				Session session = sessionFactory.openSession();
				Criteria cr = session.createCriteria(Fcc_vw_txnaccountactivity.class);
				cr.add(Restrictions.eq("CUSTOMERNO",idcustomer));
				cr.add(Restrictions.eq("NBRACCOUNT", nbrAccount ));
				List<Fcc_vw_txnaccountactivity> list=cr.list();
				return list;
		}
	}





/*

// ------------------------------------------------------------------------------
*//**
 * This method used to fetch the account details with currency and calls
 * getMerchant() method
 * 
 * @param customerid
 *            Getting the customer id from AccountDetailsService.
 * @param nbrAccount
 *           Getting the Account id from AccountDetailsService.
 *
 **//*
//------------------------------------------------------------------------------------
@Autowired  
SessionFactory sessionFactory; 

private EntityManagerFactory entityManagerFactory;


@Autowired
private HibernateConnectionUtil hibernateConnectionUtil;	
public Fcc_vw_txnaccountactivity getTransactionDetails(String customerid, long nbrAccount)
{
// Session currentSession = sessionFactory.getCurrentSession();
Fcc_vw_txnaccountactivity fcc_vw_txnaccountactivity = null;


try {
Getting the accountdetails according to the customerid and accountid 
from Fcat_vw_accountdetails class

CriteriaBuilder cb = entityManagerFactory.getCriteriaBuilder();

CriteriaQuery<T> cq = cb.createQuery(Fcc_vw_txnaccountactivity.class);

Criteria cc=entityManagerFactory.getCriteriaBuilder().create(Fcc_vw_txnaccountactivity.class);

Criteria cr = currentSession.createCriteria(Fcc_vw_txnaccountactivity.class);
cr.add(Restrictions.eq("IDCUSTOMER",customerid));
cr.add(Restrictions.eq("CUSTOMERNO", nbrAccount ));
System.out.println("kjjkllk");
List list=cr.list();
System.out.println(list);
if (!(list.size() < 0)) {
fcc_vw_txnaccountactivity = (Fcc_vw_txnaccountactivity) list.get(0);
}
} catch (Exception exception) {
exception.printStackTrace();
}
return fcc_vw_txnaccountactivity;
}
*/






/*CriteriaBuilder builder = entityManagerFactory.getCriteriaBuilder();
CriteriaQuery<Fcc_vw_txnaccountactivity> criteriaQuery = builder.createQuery(Fcc_vw_txnaccountactivity.class);
Root<Fcc_vw_txnaccountactivity> studentRoot = criteriaQuery.from(Fcc_vw_txnaccountactivity.class);
criteriaQuery.select(studentRoot);
criteriaQuery.where(builder.equal(studentRoot.get("idcustomer"),idcustomer));
criteriaQuery.where(builder.equal(studentRoot.get("nbrAccount"),nbrAccount));
Fcc_vw_txnaccountactivity fcc_vw_txnaccountactivities=entityManager.createQuery(criteriaQuery).getSingleResult();
System.out.println("dffhjhjdsf");
return fcc_vw_txnaccountactivities;*/
//Creating a session object from HibernateConnectionUtil class 