package com.jmr.obdx.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.TermDepositeM;


@Repository
public class TermDepositeRepo {
	

    @Autowired
    private SessionFactory sessionFactory;
       
	@SuppressWarnings("unchecked")
	public List<TermDepositeM> getTermdeposite(String customerId,String nbrAccount,String nbrBranch) throws Exception {
		 return(List<TermDepositeM>) sessionFactory.openSession().createCriteria(TermDepositeM.class).
				 add(Restrictions.eq("customerid", customerId)).add(Restrictions.eq("idaccount", nbrAccount)).add(Restrictions.eq("codbranch", nbrBranch)).list();
	}

}
