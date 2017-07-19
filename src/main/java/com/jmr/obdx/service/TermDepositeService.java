package com.jmr.obdx.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.McxCustomerMapping;
import com.jmr.obdx.domain.McxLogin;
import com.jmr.obdx.domain.McxUser;
import com.jmr.obdx.domain.TermDepositeM;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.McxCustomerMappingRepo;
import com.jmr.obdx.repositories.McxLoginRepo;
import com.jmr.obdx.repositories.TermDepositeRepo;
import com.jmr.obdx.service.dto.TermDepositeDto;
import com.jmr.obdx.service.dto.TermDepositeInfo;
import com.jmr.obdx.util.Utility;

@Service
public class TermDepositeService {

	private static Logger logger = Logger.getLogger(TermDepositeService.class);
	private TermDepositeInfo termDepositeInfo;
	private Double totalTermDeposits;
	private List<TermDepositeDto> tempDepositeSummary;
	private String currencyType;

	@Autowired
	private McxCustomerMappingRepo mcxCustomerMappingRepo;

	@Autowired
	private McxLoginRepo mcxLoginRepo;

	@Autowired
	private AccountDetailsRepo accountDetailsRepo;

	@Autowired
	private TermDepositeRepo termDepositeRepo;

	
	public TermDepositeInfo getTermDeposite(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		McxLogin mcxLogin = mcxLoginRepo.findByUserName(authentication.getName());
		McxCustomerMapping mcxCustomerMapping =  mcxCustomerMappingRepo.findByMcxUser(new McxUser(mcxLogin.getMcxUser().getId()));
		termDepositeInfo = new TermDepositeInfo();
		totalTermDeposits=0.0;
		tempDepositeSummary=new ArrayList<>();
		List<Accountdetails> accountdetails = accountDetailsRepo.findAllAccountByCustomerId(mcxCustomerMapping.getCustomerId());	
		List<String> tempAccountDetails = new ArrayList<>();
		accountdetails.stream().forEachOrdered(accountdetail -> {
			
				tempAccountDetails.add(accountdetail.getNBRACCOUNT());
		});
				
				List<TermDepositeM> termDepositeMs = termDepositeRepo.findTermDepositeByCustomerId(mcxCustomerMapping.getCustomerId());
				termDepositeMs.stream().forEach(tempTermDeposit -> {
					
					if(tempTermDeposit.getCodaccttype().equals(Utility.CONTRACTANDTERMDEPOSIT)){
						tempDepositeSummary.add(new TermDepositeDto(tempTermDeposit.getIdaccount(),
								tempTermDeposit.getCodaccttype(), tempTermDeposit.getCodbranch(),
								tempTermDeposit.getAcctdesc(), tempTermDeposit.getDepositamt(),
								tempTermDeposit.getAccountclass(), tempTermDeposit.getJointacctindicator(),
								tempTermDeposit.getNominee1(), tempTermDeposit.getNominee2(), tempTermDeposit.getRate(),
								tempTermDeposit.getApy(), tempTermDeposit.getBookaccount(), tempTermDeposit.getBookbranch(),
								tempTermDeposit.getCcy(), tempTermDeposit.getCustomerid(),
								tempTermDeposit.getPrimarycustomerid(), tempTermDeposit.getMaturitydate(),
								getSimpleDateFormat().format(tempTermDeposit.getDepositdate()), tempTermDeposit.getRollovertype(),
								tempTermDeposit.getRolloveramt(), tempTermDeposit.getAcyaccruedcric(),
								tempTermDeposit.getIntcap(), tempTermDeposit.getAltacctno(), tempTermDeposit.getProddesc(),
								tempTermDeposit.getAutorollover(), tempTermDeposit.getCloseonmaturity(),
								tempTermDeposit.getNumavlbalance(), tempTermDeposit.getModeofoperation(),
								tempTermDeposit.getTdstatus(), tempTermDeposit.getHoldamount(),
								tempTermDeposit.getCustomername(), tempTermDeposit.getAllow_topup(),
								tempTermDeposit.getBlk_open_days(), tempTermDeposit.getBlk_open_months(),
								tempTermDeposit.getBlk_mat_days(), tempTermDeposit.getBlk_mat_months(),
								tempTermDeposit.getPartial_liquidation(), tempTermDeposit.getValuedate()));
						
						        totalTermDeposits += Double.parseDouble(tempTermDeposit.getNumavlbalance());
					}
				       currencyType=tempTermDeposit.getCcy();
					
				});
			
		
        termDepositeInfo=new TermDepositeInfo(tempDepositeSummary,totalTermDeposits,tempAccountDetails,mcxCustomerMapping.getCustomerId(),currencyType);
		 return  termDepositeInfo;
	}

	
	private  SimpleDateFormat getSimpleDateFormat(){
		return new SimpleDateFormat("dd MMMM yyyy"); 
	}
}
