package com.jmr.mcx.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.jmr.mcx.domain.Accountdetails;
import com.jmr.mcx.domain.McxCustomerMapping;
import com.jmr.mcx.domain.McxLogin;
import com.jmr.mcx.domain.McxUser;
import com.jmr.mcx.domain.TermDepositeM;
import com.jmr.mcx.repositories.AccountDetailsRep;
import com.jmr.mcx.repositories.McxCustomerMappingRepo;
import com.jmr.mcx.repositories.McxLoginRepo;
import com.jmr.mcx.repositories.TermDepositeRepo;
import com.jmr.mcx.service.dto.TermDepositeDto;
import com.jmr.mcx.service.dto.TermDepositeInfo;
import com.jmr.mcx.util.Utility;

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
	private AccountDetailsRep accountDetailsRepo;

	@Autowired
	private TermDepositeRepo termDepositeRepo;

	/***
	 * Method used to fetch the term deposit info for login user
	 * @param authentication- Hold the currently logined user info
	 * @return All term deposit for the user
	 */
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
			
				tempAccountDetails.add(accountdetail.getNbrAccount());
		});
				
				List<TermDepositeM> termDepositeMs = termDepositeRepo.findTermDepositeByCustomerId(mcxCustomerMapping.getCustomerId());
				termDepositeMs.stream().forEach(tempTermDeposit -> {
					
					if(tempTermDeposit.getCodAcctType().equals(Utility.CONTRACTANDTERMDEPOSIT)){
						tempDepositeSummary.add(new TermDepositeDto(tempTermDeposit.getIdAccount(),
								tempTermDeposit.getCodAcctType(), tempTermDeposit.getCodBranch(),
								tempTermDeposit.getAcctDesc(), tempTermDeposit.getDepositAmt(),
								tempTermDeposit.getAccountClass(), tempTermDeposit.getJointAcctIndicator(),
								tempTermDeposit.getNominee1(), tempTermDeposit.getNominee2(), tempTermDeposit.getRate(),
								tempTermDeposit.getApy(), tempTermDeposit.getBookAccount(), tempTermDeposit.getBookBranch(),
								tempTermDeposit.getCcy(), tempTermDeposit.getCustomerId(),
								tempTermDeposit.getPrimaryCustomerId(), tempTermDeposit.getMaturityDate(),
								getSimpleDateFormat().format(tempTermDeposit.getDepositDate()), tempTermDeposit.getRolloverType(),
								tempTermDeposit.getRolloverAmt(), tempTermDeposit.getAcaccruedcric(),
								tempTermDeposit.getIntCap(), tempTermDeposit.getAltAcctNo(), tempTermDeposit.getProdDesc(),
								tempTermDeposit.getAutoRollover(), tempTermDeposit.getCloseOnMaturity(),
								tempTermDeposit.getNumAvlBalance(), tempTermDeposit.getModeOfOperation(),
								tempTermDeposit.getTdStatus(), tempTermDeposit.getHoldAmount(),
								tempTermDeposit.getCustomerName(), tempTermDeposit.getAllowTopup(),
								tempTermDeposit.getBlkOpenDays(), tempTermDeposit.getBlkOpenMonths(),
								tempTermDeposit.getBlkMatDays(), tempTermDeposit.getBlkMatMonths(),
								tempTermDeposit.getPartialLiquidation(), tempTermDeposit.getValueDate()));
						
						        totalTermDeposits += Double.parseDouble(tempTermDeposit.getNumAvlBalance());
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
