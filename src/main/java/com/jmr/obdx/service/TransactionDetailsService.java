package com.jmr.obdx.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Fcc_vw_txnaccountactivity;
import com.jmr.obdx.dto.FccTrancationInfo;
import com.jmr.obdx.dto.Fcc_vw_txnaccountactivityDto;
import com.jmr.obdx.repositories.TransactionDetailsRepo;
import com.jmr.obdx.util.Utility;

/***************************
 * @author PRITIRANJAN SWAIN
 * 
 ****************************/

@Service
public class TransactionDetailsService {

		private static final Logger logger = LoggerFactory.getLogger(TransactionDetailsService.class);
		
		@Autowired
		private Fcc_vw_txnaccountactivity fcc_vw_txnaccountactivity;
		
		@Autowired
		private TransactionDetailsRepo transactionDetailsRepo;
		
		private FccTrancationInfo fccTrancationInfoResponce;
		
		
		List<String> listOfTrans=new ArrayList<>();
		
		/***
		 * 
		 * @param customerid
		 * @param nbrAccount
		 * @return
		 * @throws Exception
		 */
		
		public FccTrancationInfo getTransactionDetails(Integer customerid ,String nbrAccount) throws Exception{
			fccTrancationInfoResponce=new FccTrancationInfo();
			
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			HashSet<Fcc_vw_txnaccountactivityDto> fcc_vw_txnaccountactivityDtos = new HashSet<>(0);
			List<Fcc_vw_txnaccountactivity> fcc_vw_txnaccountactivities=transactionDetailsRepo.getTransactionDetails(customerid, nbrAccount);
			fcc_vw_txnaccountactivities.stream().forEach(fccTrancationInfo->{
				fcc_vw_txnaccountactivityDtos.add(new Fcc_vw_txnaccountactivityDto(fccTrancationInfo.getNBRACCOUNT(), fccTrancationInfo.getBRANCHCODE(), fccTrancationInfo.getCUSTOMERNO()));
			});
			fccTrancationInfoResponce.setFcc_vw_txnaccountactivityDtos(fcc_vw_txnaccountactivityDtos);
			return fccTrancationInfoResponce;
		}
		
		
		
		
	}


// ------------------------------------------------------------------------------
/**
 * This method used to fetch the account details with currency and calls
 * getMerchant() method
 * 
 * @param customerid
 *            Getting the customer id from AccountDetailsControllers.
 *            
 * @param nbrAccount
 *           Getting the Account id from AccountDetailsControllers.
 *@throws Exception
 *            If a fatal error occurs.
 **/
//----------------------------------------------------------------------------------
/*

System.out.println(fccTrancationInfo.getBRANCHCODE());
fccTrancationInfoResponce.getFcc_vw_txnaccountactivityDtos().add(new Fcc_vw_txnaccountactivityDto(fccTrancationInfo.getNBRACCOUNT(),
		fccTrancationInfo.getCODDRCR(),fccTrancationInfo.getCODTXNCURR(),fccTrancationInfo.getCODTXNTYPE(),fccTrancationInfo.getDATVALUEDATE(),
		fccTrancationInfo.getDESCRIPTION(),fccTrancationInfo.getNAMBRANCH()));*/
