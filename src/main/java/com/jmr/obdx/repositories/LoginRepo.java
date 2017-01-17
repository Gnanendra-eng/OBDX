package com.jmr.obdx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.Login;

@Repository
public interface LoginRepo extends CrudRepository<Login, Integer> {

	/*
	 * @Query("from Login where email=:email") public Login
	 * findByUsername(@Param("email") String email);
	 */

	@Query("from Login")
	public List<Login> findAllUsers();

}
