package com.jmr.obdx.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.LoanAccount;
import com.jmr.obdx.domain.McxCustomerMapping;
import com.jmr.obdx.domain.McxLogin;
import com.jmr.obdx.domain.McxUser;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.LoanRepo;
import com.jmr.obdx.repositories.McxLoginRepo;
import com.jmr.obdx.repositories.McxCustomerMappingRepo;
import com.jmr.obdx.repositories.McxUserMRepo;
import com.jmr.obdx.service.dto.BasicLoanDetailsDto;
import com.jmr.obdx.service.dto.BasicLoanDetailsInfo;
import com.jmr.obdx.util.Utility;


@Service
public class LoanService {
	
	private static Logger logger = Logger.getLogger(LoanService.class);
	
	private BasicLoanDetailsInfo basicLoanDetailsDto;
	private static Double TOTAL_LOAN_BORROWING;
	private static Double CURRENT_OUTSTANDING;
	private List<BasicLoanDetailsDto> activedBasicLoanDetailsDtos;
	private List<BasicLoanDetailsDto> closedBasicLoanDetailsDtos;
	private String currencyType;

	@Autowired
	private LoanRepo loanRepo;
	
	@Autowired
	private McxLoginRepo loginRepo;
	
	@Autowired
	private McxUserMRepo mcxUserMRepo;
	
	@Autowired
	private McxCustomerMappingRepo mcxCustomerMappingRepo;
	
	@Autowired
	private AccountDetailsRepo accountDetailsRepo;

	
	public BasicLoanDetailsInfo getBasicLoanDetails(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		basicLoanDetailsDto=new BasicLoanDetailsInfo();
		McxLogin mcxlogin = loginRepo.findByUserName(authentication.getName());
		McxCustomerMapping mcxCustomerMapping =  mcxCustomerMappingRepo.findByMcxUser(new McxUser(mcxlogin.getMcxUser().getId()));
		List<LoanAccount> loanAccounts=loanRepo.findLoanSummaryByCustomerId((mcxCustomerMapping.getCustomerId()));
		List<Accountdetails> accountdetails = accountDetailsRepo.findAllAccountByCustomerId(mcxCustomerMapping.getCustomerId());
		List<String> tempAccountDetails = new ArrayList<>();
		accountdetails.stream().forEach(accountdetail -> {
			tempAccountDetails.add(accountdetail.getNBRACCOUNT());
		});
		CURRENT_OUTSTANDING=0.0;
		TOTAL_LOAN_BORROWING=0.0;
		activedBasicLoanDetailsDtos=new ArrayList<>(0);
		closedBasicLoanDetailsDtos=new ArrayList<>(0);
		loanAccounts.stream().forEach(loanAccount->{
			if(loanAccount.getAcctstatus().equals(Utility.ACTIVE)){
				CURRENT_OUTSTANDING+=loanAccount.getOutstandingbal().doubleValue();
				TOTAL_LOAN_BORROWING+=loanAccount.getAmountfinanced().doubleValue();
				activedBasicLoanDetailsDtos.add(new BasicLoanDetailsDto(loanAccount.getUserrefno(),
			    		loanAccount.getProductdesc(), loanAccount.getCodcurrency(),loanAccount.getOutstandingbal().doubleValue(),
			    		loanAccount.getCodbranch(),loanAccount.getIdcust(),
			    		loanAccount.getPrimaryapplicantname(),loanAccount.getTenormonths(),
			    		loanAccount.getInstallments(),getSimpleDateFormat().format(loanAccount.getMaturitydate()),
			    		loanAccount.getAcctstatus(),loanAccount.getAmountDisbursed(),getSimpleDateFormat().format(loanAccount.getBookdate())));
			}
			else{
				closedBasicLoanDetailsDtos.add(new BasicLoanDetailsDto(loanAccount.getUserrefno(),
			    		loanAccount.getProductdesc(), loanAccount.getCodcurrency(),loanAccount.getOutstandingbal().doubleValue(),
			    		loanAccount.getCodbranch(),loanAccount.getIdcust(),
			    		loanAccount.getPrimaryapplicantname(),loanAccount.getTenormonths(),
			    		loanAccount.getInstallments(),getSimpleDateFormat().format(loanAccount.getMaturitydate()),
			    		loanAccount.getAcctstatus(),loanAccount.getAmountDisbursed(),getSimpleDateFormat().format(loanAccount.getBookdate())));
			}
			currencyType=loanAccount.getCodcurrency();
		});
		basicLoanDetailsDto=new BasicLoanDetailsInfo(TOTAL_LOAN_BORROWING, CURRENT_OUTSTANDING, activedBasicLoanDetailsDtos, closedBasicLoanDetailsDtos,mcxCustomerMapping.getCustomerId(),tempAccountDetails,currencyType);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return basicLoanDetailsDto;
	}

	
	
	private  SimpleDateFormat getSimpleDateFormat(){
	return new SimpleDateFormat("dd MMMM yyyy"); 
	}

}
