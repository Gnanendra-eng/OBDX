package com.jmr.mcx.repositories;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxServiceConfiguration;

@Repository
@Transactional
public interface McxServiceConfigurationRepo extends CrudRepository<McxServiceConfiguration, Long>{
	@Query("from McxServiceConfiguration where serviceinfo=:serviceinfo")
	public McxServiceConfiguration findbyServiceinfo(@Param("serviceinfo") String serviceinfo);
	

}
