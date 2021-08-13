package com.jmr.mcx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxRequestValidation;




@Repository
public interface McxRequestValidationRepo extends JpaRepository<McxRequestValidation, Integer> {
	@Query("from McxRequestValidation where request_name=:request_name")
	public McxRequestValidation getRequest(@Param("request_name") String request_name);

}
