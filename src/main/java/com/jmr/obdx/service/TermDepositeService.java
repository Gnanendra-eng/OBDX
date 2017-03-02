package com.jmr.obdx.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.RetailCustomer;
import com.jmr.obdx.domain.TermDepositeM;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.RetailCustomerRepo;
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
	
	@Autowired
	private RetailCustomerRepo retailCustomerRepo;

	@Autowired
	private LoginRepo loginRepo;

	@Autowired
	private AccountDetailsRepo accountDetailsRepo;

	@Autowired
	private TermDepositeRepo termDepositeRepo;

	
	public TermDepositeInfo getTermDeposite(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		Login login = loginRepo.findByUsername(authentication.getName());
		RetailCustomer retailCustomer = retailCustomerRepo.findByIduser(login.getId());
		termDepositeInfo = new TermDepositeInfo();
		totalTermDeposits=0.0;
		tempDepositeSummary=new ArrayList<>();
		List<Accountdetails> accountdetails = accountDetailsRepo.getBasicAccountDetails(retailCustomer.getIdcusomer());	
		List<String> tempAccountDetails = new ArrayList<>();
		accountdetails.stream().forEachOrdered(accountdetail -> {
			List<TermDepositeM> termDepositeMs;
			try {
				tempAccountDetails.add(accountdetail.getNBRACCOUNT());
				termDepositeMs = termDepositeRepo.getTermdeposite(retailCustomer.getIdcusomer(),
						accountdetail.getNBRACCOUNT(), accountdetail.getNBRBRANCH());
				termDepositeMs.stream().forEach(tempTermDeposit -> {
					tempDepositeSummary.add(new TermDepositeDto(tempTermDeposit.getIdaccount(),
							tempTermDeposit.getCodaccttype(), tempTermDeposit.getCodbranch(),
							tempTermDeposit.getAcctdesc(), tempTermDeposit.getDepositamt(),
							tempTermDeposit.getAccountclass(), tempTermDeposit.getJointacctindicator(),
							tempTermDeposit.getNominee1(), tempTermDeposit.getNominee2(), tempTermDeposit.getRate(),
							tempTermDeposit.getApy(), tempTermDeposit.getBookaccount(), tempTermDeposit.getBookbranch(),
							tempTermDeposit.getCcy(), tempTermDeposit.getCustomerid(),
							tempTermDeposit.getPrimarycustomerid(), tempTermDeposit.getMaturitydate(),
							tempTermDeposit.getDepositdate(), tempTermDeposit.getRollovertype(),
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

				});
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
        termDepositeInfo=new TermDepositeInfo(tempDepositeSummary,totalTermDeposits,tempAccountDetails,retailCustomer.getIdcusomer());
		 return  termDepositeInfo;
	}

}
