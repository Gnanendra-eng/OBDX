package com.jmr.mcx.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmr.mcx.dto.StatusInfo;
import com.jmr.mcx.model.NonMonetaryTxn;
import com.jmr.mcx.repositories.NonMonetaryTxnRepository;
import com.jmr.mcx.service.dto.NonMonetaryTxnDto;
import com.jmr.mcx.util.Utility;

@Service
public class NonMonetaryTxnService {

	@Autowired
	NonMonetaryTxnRepository beneficiaryRepository;
	
	private static Logger logger = Logger.getLogger(NonMonetaryTxnService.class);
	
	private StatusInfo statusInfo;
	
	public NonMonetaryTxn save(NonMonetaryTxn bfc){
		
		return beneficiaryRepository.save(bfc);
	}
	
	public List<NonMonetaryTxn> findAll(){
		
		return beneficiaryRepository.findAll();
	}
	
	public NonMonetaryTxn findOne(Integer bfc){
		
		return beneficiaryRepository.findOne(bfc);
	}
	
	public void delete(NonMonetaryTxn bfc){
		
		beneficiaryRepository.delete(bfc);
	}
	
	public StatusInfo addBeneficiary(NonMonetaryTxnDto nonMontryDto)throws Exception{

		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		statusInfo = new StatusInfo();
		beneficiaryRepository.save(new NonMonetaryTxn(nonMontryDto.getId(),nonMontryDto.getPayye_name(),nonMontryDto.getAccount_name(),
		nonMontryDto.getBranch_code(),nonMontryDto.getNick_name(),nonMontryDto.getAccount_number(),nonMontryDto.getIs_active(),
		nonMontryDto.getRegistration_date_time(),nonMontryDto.getRef_user_id(),nonMontryDto.getSwift_code(),nonMontryDto.getNcc(),
		nonMontryDto.getRef_transfer_type_id(),nonMontryDto.getRef_transfer_via_type_id(),nonMontryDto.getPhone_numbr(),nonMontryDto.getEmail(),
		nonMontryDto.getAvail_balance(),nonMontryDto.getBank_name()));
		return statusInfo;
		}
}
