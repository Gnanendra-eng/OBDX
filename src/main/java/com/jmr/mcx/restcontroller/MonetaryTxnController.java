package com.jmr.mcx.restcontroller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jmr.mcx.model.MonetaryTxn;
import com.jmr.mcx.service.MonetaryTxnService;

@RestController
@RequestMapping("/MonetaryTxn")
public class MonetaryTxnController {

	@Autowired
	MonetaryTxnService monetaryTxnService;
	
	@RequestMapping(method=RequestMethod.POST, value="/All", consumes = MediaType.APPLICATION_JSON_VALUE)
	public MonetaryTxn createMonetaryTxn(@Valid @RequestBody MonetaryTxn mTxn){
		return monetaryTxnService.save(mTxn);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/All", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MonetaryTxn> getAllTxns(){
		
		return monetaryTxnService.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/All/{account_number}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MonetaryTxn> getMonetaryTxnsById(@PathVariable(value="account_number") Integer account_number){
		
		MonetaryTxn ib = monetaryTxnService.findOne(account_number);
		
		if(ib == null){
			
			//return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(ib);
	}
	
	/*
	 * no PUT method - since monetary transactions should not be updated.
	 * 
	 * no DELETE method - since monetary transactions should not be deleted.
	 */
	
	
}
