package com.jmr.obdx.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.BillerM;
import com.jmr.obdx.repositories.BillerRepo;
import com.jmr.obdx.service.dto.BillerDto;
import com.jmr.obdx.service.dto.BillerInfo;
import com.jmr.obdx.util.Utility;

@Service
public class BillerSevice {

	private static Logger logger = Logger.getLogger(BillerSevice.class);
	
	private BillerInfo billerInfo;
		
	@Autowired
	private BillerRepo billerRepo;

	public BillerInfo getBillerDetails() throws Exception {
		  logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		  billerInfo=new BillerInfo();
		  List<BillerDto> billerDtos=new ArrayList<>(0);
		  List<BillerM> billers = (List<BillerM>) billerRepo.findAllBiller();
		  	billers.stream().forEach(biller ->{
		  		billerDtos.add(new BillerDto(biller.getIdbiller(), biller.getBillername(), biller.getBillerprofile()));
		  	});
	  	  billerInfo.setBillerDtos(billerDtos);
		  return billerInfo;
   }
	
}
