package com.jmr.obdx.repositories;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jmr.obdx.domain.Fcat_vw_accountdetails;
import com.jmr.obdx.util.HibernateConnectionUtil;

/***************************
 * @author PRITIRANJAN SWAIN
 * 
 ****************************/
@Repository
public class AccountDetailsRepo {
	// ------------------------------------------------------------------------------
				/**
				 * This method used to fetch the account details with currency and calls
				 * getMerchant() method
				 * 
				 * @param customerid
				 *            Getting the customer id from AccountDetailsService.
				 * @param nbrAccount
				 *           Getting the Account id from AccountDetailsService.
				 *
				 **/
		//----------------------------------------------------------------------------------
	@Autowired
	private HibernateConnectionUtil hibernateConnectionUtil;
 

	public Fcat_vw_accountdetails getAccountDetails(String customerid, long nbrAccount)

	{
		//Creating a session object from HibernateConnectionUtil class 
		SessionFactory sessionFactory = hibernateConnectionUtil.getSessionFactory();
		System.out.println("sessionFactory:" + sessionFactory);
		Session session = sessionFactory.openSession();
		System.out.println("issession:" + session);
		Fcat_vw_accountdetails fcat_vw_accountdetails = null;
		try {
			
			/*Getting the accountdetails according to the customerid and accountid 
			 from Fcat_vw_accountdetails class
			 */
			Criteria cr = session.createCriteria(Fcat_vw_accountdetails.class);
			cr.add(Restrictions.eq("IDCUSTOMER",customerid));
			cr.add(Restrictions.eq("NBRACCOUNT", nbrAccount ));
			List list=cr.list();
		//	session.close();
            System.out.println(list);
			
			if (!(list.size() < 0)) {
				fcat_vw_accountdetails = (Fcat_vw_accountdetails) list.get(0);
				}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		session.flush();
		session.close();
         return fcat_vw_accountdetails;
	}

}
