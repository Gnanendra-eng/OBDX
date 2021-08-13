package com.jmr.mcx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxReqfieldValidation;
@Repository
public interface McxReqFieldValidationRepo  extends JpaRepository<McxReqfieldValidation, Integer>{
	@Query("from McxReqfieldValidation where request_name=:request_name")
	public List<McxReqfieldValidation> getRequestFields(@Param("request_name") String request_name);
}
