package com.jmr.mcx.restcontroller;


import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jmr.mcx.dto.StatusInfo;
import com.jmr.mcx.model.NonMonetaryTxn;
import com.jmr.mcx.service.NonMonetaryTxnService;
import com.jmr.mcx.service.dto.NonMonetaryTxnDto;
import com.jmr.mcx.util.Utility;

@RestController
@RequestMapping("/NonMonetaryTxn")
public class NonMonetaryTxnController {
	
	@Autowired
	NonMonetaryTxnService beneficiaryService;
	
	private static Logger logger = Logger.getLogger(NonMonetaryTxnController.class);
	
	//comment by KK
//	@RequestMapping(method=RequestMethod.POST, value="/Beneficiary", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public NonMonetaryTxn createBeneficiary(@Valid @RequestBody NonMonetaryTxn bfc){
//		return beneficiaryService.save(bfc);
//	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Beneficiary", consumes = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<StatusInfo> createBeneficiary(@RequestBody @Valid NonMonetaryTxnDto nonMontryDto){
		try{
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			StatusInfo responceObj = beneficiaryService.addBeneficiary(nonMontryDto);
			if(responceObj.getErrorStatus()){
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<StatusInfo>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<StatusInfo>(responceObj, HttpStatus.OK);
		} 
		catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<StatusInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@RequestMapping(method=RequestMethod.GET, value="/Beneficiary", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<NonMonetaryTxn> getAllUsers(){
		
		return beneficiaryService.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/Beneficiary/{account_number}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<NonMonetaryTxn> getBeneficiaryByAccountNbr(@PathVariable(value="account_number") Integer account_number){
		
		NonMonetaryTxn ib = beneficiaryService.findOne(account_number);
		
		if(ib == null){
			
			//return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(ib);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/Beneficiary/{id}")
	public ResponseEntity<NonMonetaryTxn> updateUser(@PathVariable(value="id") Integer id, @Valid @RequestBody NonMonetaryTxn usrDetails){
		
		NonMonetaryTxn ib = beneficiaryService.findOne(id);
		
		if(ib == null){
			
			//return ResponseEntity.notFound().build();
		}
		
		ib.setAccount_name(usrDetails.getAccount_name());
		ib.setAccount_number(usrDetails.getAccount_number());
		ib.setBranch_code(usrDetails.getBranch_code());
		ib.setId(usrDetails.getId());
		ib.setIs_active(usrDetails.getIs_active());
		ib.setNcc(usrDetails.getNcc());
		ib.setNick_name(usrDetails.getNick_name());
		ib.setPayye_name(usrDetails.getPayye_name());
		ib.setRef_transfer_type_id(usrDetails.getRef_transfer_type_id());
		ib.setRef_user_id(usrDetails.getRef_user_id());
		ib.setRegistration_date_time(usrDetails.getRegistration_date_time());
		ib.setSwift_code(usrDetails.getSwift_code());	
		
		NonMonetaryTxn updateBenf = beneficiaryService.save(ib);
		
		return ResponseEntity.ok().body(updateBenf);
	}
	
	//@RequestMapping(method=RequestMethod.DELETE, value="/Users/{id}")
		@DeleteMapping("/Beneficiary/{id}")
		public ResponseEntity<NonMonetaryTxn> deleteUsers(@PathVariable(value="id") Integer id){
			
			NonMonetaryTxn ib = beneficiaryService.findOne(id);
			
			if(ib == null){
				
				//return ResponseEntity.notFound().build();
			}
			
			beneficiaryService.delete(ib);
			
			return ResponseEntity.ok().body(ib);
			
		}

}
