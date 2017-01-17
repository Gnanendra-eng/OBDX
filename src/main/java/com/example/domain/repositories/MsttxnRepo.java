package com.example.domain.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.domain.Msttxn;

public interface MsttxnRepo extends CrudRepository<Msttxn, Integer> {

	@Query("from Msttxn where idtxn=:txns)")
	public Msttxn findByRoleDesc(@Param("txns") String txns);
	
}
