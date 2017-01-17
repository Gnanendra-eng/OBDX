package com.example.domain.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.domain.Mstchanneluser;

@Repository
public interface MstchanneluserRepo extends CrudRepository<Mstchanneluser, Integer> {
	
	@Query("from Mstchanneluser ms where IDCHANNELUSER=:userName")
	public Mstchanneluser findByUserId(@Param("userName") String userName);

}
