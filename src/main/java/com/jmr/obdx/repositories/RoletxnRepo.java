package com.jmr.obdx.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmr.obdx.domain.Roletxn;

@Repository
public interface RoletxnRepo extends CrudRepository<Roletxn, Integer> {

	@Query("from Roletxn where idrole=:idRole")
	public List<Roletxn> findByUserRoleTxnInfo(@Param("idRole") Integer idRole);
}
