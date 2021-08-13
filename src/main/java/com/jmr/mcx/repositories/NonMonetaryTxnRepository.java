package com.jmr.mcx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmr.mcx.model.NonMonetaryTxn;

public interface NonMonetaryTxnRepository extends JpaRepository<NonMonetaryTxn, Integer>{

}
