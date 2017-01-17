package com.example.domain.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.domain.Userrole;

public interface UserroleRepo extends CrudRepository<Userrole, Integer> {

    @Query("from Userrole where iduser=:iduser")
	public Userrole findByUserRoleInfo(@Param("iduser") Integer iduser);
    
}

