package com.jmr.mcx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.domain.McxAccountTypeM;



@Repository
public interface McxAccountTypeRepo extends JpaRepository<McxAccountTypeM, Long>{

}
