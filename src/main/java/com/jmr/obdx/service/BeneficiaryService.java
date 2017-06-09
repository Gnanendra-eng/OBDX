package com.jmr.obdx.service;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.service.dto.BeneficiaryDto;

@Service
public class BeneficiaryService {
	private static final Logger logger = LoggerFactory.getLogger(BeneficiaryService.class);
	
	public StatusInfo addBeneficiary(BeneficiaryDto beneficiaryDto,Authentication authentication,Locale locale,BindingResult bindingResult){
		
		
		return null;
	

	
	
	}

	
	
	

}
