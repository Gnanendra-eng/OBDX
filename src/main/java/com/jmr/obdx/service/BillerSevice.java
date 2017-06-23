package com.jmr.obdx.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Biller;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.McxVwBillerInfo;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.repositories.BillerRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.service.dto.BillerDto;
import com.jmr.obdx.service.dto.BillerInfo;
import com.jmr.obdx.service.dto.RegisterBillerDto;
import com.jmr.obdx.service.dto.UserAddedBillerDto;
import com.jmr.obdx.service.dto.UserAddedBillerInfo;
import com.jmr.obdx.util.Utility;

@Service
public class BillerSevice {

	private static Logger logger = Logger.getLogger(BillerSevice.class);
	private UserAddedBillerInfo userAddedBillerInfo;
	private BillerInfo billerInfo;
	private StatusInfo statusInfo;
	@Autowired
	private BillerRepo billerRepo;
	
	
	@Autowired
	private com.jmr.obdx.repositories.McxVwBillerInfoRepo mcxVwBillerInfoRepo;
	
	@Autowired
	private LoginRepo loginRepo;


	
	public UserAddedBillerInfo getUserAddedBillerInfo(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		userAddedBillerInfo = new UserAddedBillerInfo();
		List<UserAddedBillerDto> billerDtos = new ArrayList<>(0);
		Login login = loginRepo.findByUsername(authentication.getName());
	    List<Biller> billers = (List<Biller>) billerRepo.findByUserBillerInfo(new Login(login.getId()));
		billers.stream().forEach(biller -> {
			billerDtos.add(new UserAddedBillerDto(biller.getBillerId(), biller.getname(), biller.getMcxBillerOperator().getOperator()));
		});
		userAddedBillerInfo.setBillerDtos(billerDtos);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return userAddedBillerInfo;
	}
	
	
	public BillerInfo getBillerInfo(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		billerInfo = new BillerInfo();
		HashSet<BillerDto> billerDtos = new HashSet<>(0);
		List<McxVwBillerInfo> billers=(List<McxVwBillerInfo>)mcxVwBillerInfoRepo.getBiller();
		billers.stream().forEach(biller -> {
			billerDtos.add(new BillerDto(biller.getIdbiller(), biller.getBillerdesc(), biller.getBillercustid()));
		});
		billerInfo.setBillerDtos(billerDtos);
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		return billerInfo;
	}
	
	
	public StatusInfo registerBiller(RegisterBillerDto registerBillerDto,Authentication authentication)throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		Login login = loginRepo.findByUsername(authentication.getName());
		billerRepo.save(new Biller(registerBillerDto.getBillerId(), registerBillerDto.getBillerReferenceNumber(), new Date(), registerBillerDto.getBillerName(), new Login(login.getId())));
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		return statusInfo;
	}

}