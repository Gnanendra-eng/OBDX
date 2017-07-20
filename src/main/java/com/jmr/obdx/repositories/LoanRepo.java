package com.jmr.obdx.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.LoanAccount;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Repository
public class LoanRepo {
	
	@Autowired
	private SessionFactory sessionFactory;	
	
	@SuppressWarnings("unchecked")
	public List<LoanAccount> findLoanSummaryByCustomerId(String customerId) throws Exception {
		return (List<LoanAccount>)sessionFactory.openSession().
				createCriteria(LoanAccount.class).add(Restrictions.eq("idCust", customerId)).list();
	}

}
