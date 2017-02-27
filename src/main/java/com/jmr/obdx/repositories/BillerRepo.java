package com.jmr.obdx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.Biller;
import com.jmr.obdx.domain.Login;

@Repository
public interface BillerRepo extends CrudRepository<Biller, Integer> {
	
	@Query("from Biller where login=:login")
	public List<Biller> findByUserBillerInfo(@Param("login") Login login);

}
