package com.jmr.mcx.repositories;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.LoanAccount;
import org.hibernate.SessionFactory;

@Repository
public class McxLoanAcctDtlsRepo {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public LoanAccount findByAccNo(String accNo) throws Exception {

		return (LoanAccount) sessionFactory.openSession().createCriteria(LoanAccount.class)
				.add(Restrictions.eq("idaccount", accNo)).uniqueResult();

	}

}
