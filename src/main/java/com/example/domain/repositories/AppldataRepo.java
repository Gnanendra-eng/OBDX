package com.example.domain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.domain.Appldata;

@Repository
public interface AppldataRepo extends CrudRepository <Appldata, Integer> {
	
	@Query("select valuestring from Appldata where dataname  ='TXN_DESC'  and  iddevice  ='**' and datavalue=:txns")
	public List<String> findByUserRoleValues(@Param("txns") String txns);
	
}
