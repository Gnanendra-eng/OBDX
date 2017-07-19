package com.jmr.obdx.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.Accountsummary;
import com.jmr.obdx.domain.McxCustomerMapping;
import com.jmr.obdx.domain.McxLogin;
import com.jmr.obdx.domain.McxUser;
import com.jmr.obdx.domain.MstBranch;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.AccountSummaryRepo;
import com.jmr.obdx.repositories.McxLoginRepo;
import com.jmr.obdx.repositories.McxUserMRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.McxCustomerMappingRepo;
import com.jmr.obdx.repositories.MstBranchRepo;
import com.jmr.obdx.service.dto.AccountBranch;
import com.jmr.obdx.service.dto.AccountDetailsDto;
import com.jmr.obdx.service.dto.AccountSummaryDto;
import com.jmr.obdx.service.dto.AccountSummaryInfo;
import com.jmr.obdx.service.dto.BasicAccountDetailsDto;
import com.jmr.obdx.service.dto.LoanSummayInfo;
import com.jmr.obdx.util.Utility;
/***
 * modified Login to McxLogin and RetailCustomer to McxUser by Murugesh on 17/07/2017
 */
@Service
public class AccountService {

	private static Logger logger = Logger.getLogger(AccountService.class);
	private BasicAccountDetailsDto basicAccountDetailsDto;
	private AccountSummaryInfo accountSummaryInfo;
	private LoanSummayInfo loanSummayInfo;
	private AccountDetailsDto accountDetailsDto;
	private Double sumOfSavingsAndCurrent;
	private Double sumOfLoans;
	private Double sumOfContractAndTermdepostit;
	private List<AccountSummaryDto> savingsAndCurrent;
	private List<AccountSummaryDto> loans;
	private List<AccountSummaryDto> contractAndTermdeposit;
	private List<AccountSummaryDto> loanPending;
	private Double sumOfTotalLoans;
	private String currencyType;
	
	@Autowired
	private McxCustomerMappingRepo mcxCustomerMappingRepo;

	@Autowired
	private McxLoginRepo loginRepo;

	@Autowired
	private AccountDetailsRepo accountDetailsRepo;

	@Autowired
	private AccountSummaryRepo accountsummaryrepo;
	
	@Autowired
	private MstBranchRepo mstBranchRepo;
	
	@Autowired
	private McxUserMRepo mcxUserMRepo;


	/***
	 * Returns all account number hold by login user
	 * @param authentication-Hold Login user info.
	 * @return  all account number hold login user
	 */
	
	public BasicAccountDetailsDto getBasicAccountDetails(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		basicAccountDetailsDto = new BasicAccountDetailsDto();
		


		
	
		McxLogin mcxLogin = loginRepo.findByUserName(authentication.getName());
		
		/***
		 * Created McxCustomerMapping reference to get customerid and removed RetailCustomer to get customerid by murugesh on 17/07/2017
		 */
		McxCustomerMapping mcxCustomerMapping = mcxCustomerMappingRepo.findByMcxUser(new McxUser(mcxLogin.getMcxUser().getId()));
		List<Accountdetails> accountdetails = accountDetailsRepo.findAllAccountByCustomerId(mcxCustomerMapping.getCustomerId());
		List<String> tempAccountDetails = new ArrayList<>();
		accountdetails.stream().forEach(accountdetail -> {
			tempAccountDetails.add(accountdetail.getNBRACCOUNT());
			
		});
		basicAccountDetailsDto.setNbrAccounts(tempAccountDetails);
		basicAccountDetailsDto.setCustomerId(mcxCustomerMapping.getCustomerId());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return basicAccountDetailsDto;
	}

	
	/***
	 * Return the information for a particular account
	 * 
	 * @param customerId -Hold login customerId what had mapped with login user
	 * @param nbrAccount -Hold a account info.
	 * @return - Details about a particular account
	 */
	
	public AccountDetailsDto getAccountDetails(String customerId, String nbrAccount) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		accountDetailsDto = new AccountDetailsDto();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Accountdetails accountdetail = accountDetailsRepo.findAccountDetailsByAccountIdCustomerId(customerId, nbrAccount);
		accountDetailsDto = new AccountDetailsDto(accountdetail.getIDCUSTOMER(), accountdetail.getNBRBRANCH(),
				accountdetail.getNBRACCOUNT(), accountdetail.getACCTTYPE(), accountdetail.getACCTSTATUS(),
				accountdetail.getCCYDESC(),new Double(accountdetail.getBALANCE()).doubleValue(), accountdetail.getOPENINGBALANCE(),
				accountdetail.getAVAILABLEBALANCE(), accountdetail.getISCHQBOOK(), accountdetail.getISOVERDRAFT(),
				accountdetail.getISSI(), accountdetail.getNUMUNCOLLECTED(), accountdetail.getMINBALANCE(),
				accountdetail.getDAILYWITHDRAWALLIMIT(), accountdetail.getCUSTOMERSHORTNAME(),
				accountdetail.getCUSTOMERNAME(), dateFormat.format(accountdetail.getOPENINGDATE()),
				accountdetail.getIBAN_AC_NO(), accountdetail.getRELATION(), accountdetail.getDESCACCTTYPE(),
				accountdetail.getAMOUNTONHOLD(), accountdetail.getODLIMIT(), accountdetail.getDAILYLIMIT(),
				accountdetail.getELIGIBLEADV(), accountdetail.getODLMTSTRTDATE(), accountdetail.getODLMTENDDATE(),
				accountdetail.getORIGAVAILABLEBAL());
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return accountDetailsDto;
	}

	/***
	 * Returns account details for login user
	 * @param authentication-Hold Login user info.
	 * @return Return account details
	 */
	public AccountSummaryInfo getAccountSummary(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		McxLogin mcxLogin = loginRepo.findByUserName(authentication.getName());
		/***
		 * Created McxCustomerMapping reference to get customerid by murugesh on 17/07/2017
		 */
		System.out.println(new McxUser(mcxLogin.getMcxUser().getId()));
		McxCustomerMapping mcxCustomerMapping = mcxCustomerMappingRepo.findByMcxUser(new McxUser(mcxLogin.getMcxUser().getId()));
		List<Accountsummary> accountsummarys = accountsummaryrepo.findAccountSummaryByCustomerId(mcxCustomerMapping.getCustomerId());
		List<Accountdetails> accountdetails = accountDetailsRepo.findAllAccountByCustomerId(mcxCustomerMapping.getCustomerId());
		savingsAndCurrent = new ArrayList<>();
		loans = new ArrayList<>();
		contractAndTermdeposit = new ArrayList<>();
		sumOfSavingsAndCurrent = 0.0;
		sumOfLoans = 0.0;
		sumOfContractAndTermdepostit = 0.0;
		accountsummarys.stream().forEach(accountsummary -> {
			System.out.println(accountsummary.getCODACCTTYPE());
			if (accountsummary.getCODACCTTYPE().equals(Utility.SAVINGSANDCURRENT)) {
				sumOfSavingsAndCurrent += Double.parseDouble(accountsummary.getAVAILAMT());
				savingsAndCurrent.add(getAccountSummaryType(accountsummary));
			}
			if (accountsummary.getCODACCTTYPE().equals(Utility.LOANSANDCURRENT)) {
				sumOfLoans += Double.parseDouble(accountsummary.getNUMAVAILBAL());
				loans.add(getAccountSummaryType(accountsummary));
				}
			if (accountsummary.getCODACCTTYPE().equals(Utility.CONTRACTANDTERMDEPOSIT)) {
				sumOfContractAndTermdepostit += Double.parseDouble(accountsummary.getNUMAVAILBAL());
				contractAndTermdeposit.add(getAccountSummaryType(accountsummary));
				}
			currencyType=accountsummary.getCODACCTCURR();
		});
		List<String> tempAccountDetails = new ArrayList<>();
		accountdetails.stream().forEach(accountdetail -> {
			tempAccountDetails.add(accountdetail.getNBRACCOUNT());
		});
		accountSummaryInfo = new AccountSummaryInfo(sumOfSavingsAndCurrent, sumOfLoans, sumOfContractAndTermdepostit,
				savingsAndCurrent, loans, contractAndTermdeposit,tempAccountDetails,mcxCustomerMapping.getCustomerId(),currencyType);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return accountSummaryInfo;
	}
	
	/***
	 * Returns sum of loan account and there details
	 * @param authentication
	 * @return Returns sum of loan account and there details
	 */

	public LoanSummayInfo getLoansummary(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		sumOfTotalLoans =0.0;
		loanPending = new ArrayList<>();
		McxLogin mcxLogin = loginRepo.findByUserName(authentication.getName());
		McxCustomerMapping mcxCustomerMapping = mcxCustomerMappingRepo.findByMcxUser(new McxUser(mcxLogin.getMcxUser().getId()));
		List<Accountsummary> accountsummarys = accountsummaryrepo.findAccountSummaryByCustomerId(mcxCustomerMapping.getCustomerId());
		accountsummarys.stream().forEach(loansummary -> {
			   if( loansummary.getCODACCTTYPE().equals(Utility.LOANSANDCURRENT))
				sumOfTotalLoans += Double.parseDouble(loansummary.getNUMAVAILBAL());
				loanPending.add(getAccountSummaryType(loansummary));
		});
		loanSummayInfo = new LoanSummayInfo(sumOfLoans,loanPending);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return loanSummayInfo;
	}
		
	protected AccountSummaryDto getAccountSummaryType(Accountsummary accountsummary) {
		return new AccountSummaryDto(accountsummary.getIDACCOUNT(), accountsummary.getIDCUSTOMER(),
				accountsummary.getCODBRANCH(), accountsummary.getCODACCTTYPE(), accountsummary.getTXTACCTSTATUS(),
				accountsummary.getCODACCTCURR(), accountsummary.getNUMBALANCE(), accountsummary.getNUMOPENBALANCE(),
				accountsummary.getDATLASTUPDATED(), accountsummary.getNUMAVAILBAL(), accountsummary.getNUMUNCOLLECTED(),
				accountsummary.getNUMAVAILCREDIT(), accountsummary.getNUMMONTOVCR(), accountsummary.getNUMMONTOVDR(),
				accountsummary.getACCTDESC(), accountsummary.getADD1(), accountsummary.getADD2(),
				accountsummary.getADD3(), accountsummary.getNOM1(), accountsummary.getNOM2(), accountsummary.getADD4(),
				accountsummary.getPRDNAME(), accountsummary.getPRDTYPE(), accountsummary.getACCTOPENDT(),
				accountsummary.getODLIMIT(), accountsummary.getODSTARTDT(), accountsummary.getODENDDT(),
				accountsummary.getSHADOWLIMIT(), accountsummary.getACCRDRAMT(), accountsummary.getACCRCRAMT(),
				accountsummary.getJOINTACCTINDICATOR(), accountsummary.getCHQBOOK(),
				accountsummary.getOVERDRAFT_FACILITY(), accountsummary.getNUMSTATEBIT(), accountsummary.getCHKNAME1(),
				accountsummary.getCHKNAME2(), accountsummary.getAUTOREORDERCHKREQ(),
				accountsummary.getAUTOREORDERCHKLVL(), accountsummary.getDIRTSTATUS(), accountsummary.getNEXTCAPDT(),
				accountsummary.getCAPFREQ(), accountsummary.getAUTHSIGNATORY(), accountsummary.getAUTHSIGNLIMIT(),
				accountsummary.getSALESPERSON(), accountsummary.getINTRODUCER(), accountsummary.getIBANNUMBER(),
				accountsummary.getACCTLOCKFLAG(), accountsummary.getDEBITACCTLOCKFLAG(),
				accountsummary.getCREDITACCTLOCKFLAG(), accountsummary.getCRLINE(), accountsummary.getAVAILAMT(),
				accountsummary.getCRINTRATE(), accountsummary.getALWDOD(), accountsummary.getUNALWDOD(),
				accountsummary.getACFROZEN(), accountsummary.getDTIME(), accountsummary.getSLNO(),
				accountsummary.getPRDCODE(), accountsummary.getILM_APPLICABLE(), accountsummary.getID_ENTITY(),
				accountsummary.getMATURITY_DATE(), accountsummary.getNEXT_DUE_DATE(), accountsummary.getUDF1(),
				accountsummary.getUDF2(), accountsummary.getUDF3(), accountsummary.getUDF4(), accountsummary.getUDF5(),
				accountsummary.getUDF6(), accountsummary.getUDF7(), accountsummary.getUDF8(), accountsummary.getUDF9(),
				accountsummary.getUDF10());

	}
	
	/***
	 * Returns the branch details for a particular account
	 * @param nbrAccount - Hold the user input account number 
	 * @return  Returns the branch details for a particular account
	 */
	
	
	public AccountBranch getAccountBranch(String nbrAccount) throws Exception {
		Accountdetails accountdetail = accountDetailsRepo.findAccountBranchByAccountId(nbrAccount);
		
		MstBranch  mstBranch=  mstBranchRepo.findByBranchCode(accountdetail.getNBRBRANCH());
		AccountBranch accountBranch = new AccountBranch(accountdetail.getNBRACCOUNT(), accountdetail.getNBRBRANCH(), mstBranch.getBranchName(),accountdetail.getCUSTOMERNAME());
	    return accountBranch;
	}
	
	
}

