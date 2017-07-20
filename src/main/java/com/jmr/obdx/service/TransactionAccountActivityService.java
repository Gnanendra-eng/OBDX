package com.jmr.obdx.service;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.VwTxnaccountactivity;
import com.jmr.obdx.repositories.VwTxnaccountactivityRepo;
import com.jmr.obdx.service.dto.TransactionAccountActivityDto;
import com.jmr.obdx.service.dto.TransactionAccountActivityInfo;
import com.jmr.obdx.util.Utility;

@Service
public class TransactionAccountActivityService {
	
	private static Logger logger = Logger.getLogger(TransactionAccountActivityService.class);
	private Set<TransactionAccountActivityDto> transactionAccountActivityDtos; 
	private TransactionAccountActivityInfo transactionAccountActivityInfo;
	
	@Autowired
	private VwTxnaccountactivityRepo txnaccountactivityRepo;
		
	public TransactionAccountActivityInfo getTransactionAccountActivityInfo(String customerId, String nbrAccount) throws Exception{
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		transactionAccountActivityDtos = new HashSet<TransactionAccountActivityDto>(0);
		transactionAccountActivityInfo=new TransactionAccountActivityInfo();
		List<VwTxnaccountactivity> vwTxnaccountactivities=txnaccountactivityRepo.findByUserTransactionAccountActivityInfo(customerId, nbrAccount);
		vwTxnaccountactivities.stream().forEach(vwTxnaccountactivity->{
			transactionAccountActivityDtos.add(new TransactionAccountActivityDto(vwTxnaccountactivity.getCoddrcr(),getSimpleDateFormat().format(vwTxnaccountactivity.getTxnDate()),
					vwTxnaccountactivity.getDescription(), vwTxnaccountactivity.getTxtReferenceNo(), vwTxnaccountactivity.getTxnAmount().doubleValue(),new Double(10000),vwTxnaccountactivity.getCodTxnCurr()));
		});	
		transactionAccountActivityInfo.setTransactionAccountActivityDtos(transactionAccountActivityDtos);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return transactionAccountActivityInfo;
	}
	
	
	public TransactionAccountActivityInfo getLastFiveTransactionAccountActivityInfo(String customerId, String nbrAccount) throws Exception{
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		transactionAccountActivityDtos = new HashSet<TransactionAccountActivityDto>(0);
		transactionAccountActivityInfo=new TransactionAccountActivityInfo();
		List<VwTxnaccountactivity> vwTxnaccountactivities=txnaccountactivityRepo.findByUserLastFiveTransactionAccountActivityInfo(customerId, nbrAccount);
		vwTxnaccountactivities.stream().forEach(vwTxnaccountactivity->{
			transactionAccountActivityDtos.add(new TransactionAccountActivityDto(vwTxnaccountactivity.getCoddrcr(),getSimpleDateFormat().format(vwTxnaccountactivity.getTxnDate()),
					vwTxnaccountactivity.getDescription(), vwTxnaccountactivity.getTxtReferenceNo(), vwTxnaccountactivity.getTxnAmount().doubleValue(),new Double(10000),vwTxnaccountactivity.getCodTxnCurr()));
		});	
		transactionAccountActivityInfo.setTransactionAccountActivityDtos(transactionAccountActivityDtos);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return transactionAccountActivityInfo;
	}
	
	private  SimpleDateFormat getSimpleDateFormat(){
		return new SimpleDateFormat("dd MMMM yyyy"); 
	}
}
