package com.jmr.obdx.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Biller;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.repositories.BillerRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.service.dto.BillerDto;
import com.jmr.obdx.service.dto.BillerInfo;
import com.jmr.obdx.util.Utility;

@Service
public class BillerSevice {

	private static Logger logger = Logger.getLogger(BillerSevice.class);
	private BillerInfo billerInfo;

	@Autowired
	private BillerRepo billerRepo;
	
	@Autowired
	private LoginRepo loginRepo;

	public BillerInfo getBillerDetails(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		billerInfo = new BillerInfo();
		List<BillerDto> billerDtos = new ArrayList<>(0);
		Login login = loginRepo.findByUsername(authentication.getName());
	    List<Biller> billers = (List<Biller>) billerRepo.findByUserBillerInfo(new Login(login.getId()));
		billers.stream().forEach(biller -> {
			billerDtos.add(new BillerDto(biller.getIdbiller(), biller.getBillername(), biller.getBillerprofile()));
		});
		billerInfo.setBillerDtos(billerDtos);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return billerInfo;
	}

}
