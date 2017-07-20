package com.jmr.obdx.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.MstBranch;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Repository
public class AccountDetailsRepo {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Accountdetails> findAllAccountByCustomerId(String customerId) throws Exception {
       return (List<Accountdetails>)sessionFactory.openSession().createCriteria(Accountdetails.class).
    		   add(Restrictions.eq("idCustomer", customerId)).list();
	}
	
	public Accountdetails findAccountDetailsByAccountIdCustomerId(String customerId,String nbrAccount) throws Exception {
		return(Accountdetails)sessionFactory.openSession().createCriteria(Accountdetails.class)
				.add(Restrictions.eq("idCustomer", customerId)).add(Restrictions.eq("nbrAccount", nbrAccount)).uniqueResult();
		
	}
		public Accountdetails findAccountBranchByAccountId(String nbrAccount) throws Exception {
			return(Accountdetails)sessionFactory.openSession().createCriteria(Accountdetails.class)
					.add(Restrictions.eq("nbrAccount", nbrAccount)).uniqueResult();
			
	}
	
		
		public Accountdetails findByAccountNo(String accNo) throws Exception {
			return(Accountdetails)sessionFactory.openSession().createCriteria(Accountdetails.class)
					.add(Restrictions.eq("nbrAccount", accNo)).uniqueResult();
			
	}	
		
		
		
		
		
	
}
