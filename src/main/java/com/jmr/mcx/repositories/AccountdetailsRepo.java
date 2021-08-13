package com.jmr.mcx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.Accountdetails;



@Repository
public interface AccountdetailsRepo extends JpaRepository<Accountdetails, Integer>{
	@Query("from Accountdetails where idcustomer=:customerId and nbraccount=:accountNumber")
	public Accountdetails getAccountDetail(@Param("customerId") String customerId, @Param("accountNumber") String accountNumber);
	@Query("from Accountdetails where idcustomer=:customerId and ACCTTYPE=:accType and ACCTSTATUS=:status")
	public List<Accountdetails> findAccountByCustomerId(@Param("customerId") String customerId, @Param("accType") String accType, @Param("status") String status);
}
