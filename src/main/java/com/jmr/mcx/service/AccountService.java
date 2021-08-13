package com.jmr.mcx.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.jmr.mcx.domain.AccountSummary;
import com.jmr.mcx.domain.Accountdetails;
import com.jmr.mcx.domain.McxBeneficiaryM;
import com.jmr.mcx.domain.McxCustomerMapping;
import com.jmr.mcx.domain.McxCustomerMappingM;
import com.jmr.mcx.domain.McxLogin;
import com.jmr.mcx.domain.McxUser;
import com.jmr.mcx.domain.MstBranch;
import com.jmr.mcx.repositories.AccountDetailsRep;
import com.jmr.mcx.repositories.AccountSummaryRepo;
import com.jmr.mcx.repositories.AccountdetailsRepo;
import com.jmr.mcx.repositories.BeneficiaryMRepo;
import com.jmr.mcx.repositories.LoginRepo;
import com.jmr.mcx.repositories.McxCustomerMappingMRepo;
import com.jmr.mcx.repositories.McxCustomerMappingRepo;
import com.jmr.mcx.repositories.McxLoginRepo;
import com.jmr.mcx.repositories.MstBranchRepo;
import com.jmr.mcx.service.dto.AccountBranch;
import com.jmr.mcx.service.dto.AccountDetailsDto;
import com.jmr.mcx.service.dto.AccountSummaryDto;
import com.jmr.mcx.service.dto.AccountSummaryInfo;
import com.jmr.mcx.service.dto.BasicAccountDetailsDto;
import com.jmr.mcx.service.dto.LoanSummayInfo;
import com.jmr.mcx.util.Utility;
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
	private BeneficiaryMRepo beneficiaryMRepo;
	@Autowired
	private McxCustomerMappingRepo mcxCustomerMappingRepo;

	@Autowired
	private McxLoginRepo loginRepo;
	@Autowired
	private AccountdetailsRepo accountdetailsRep;
	@Autowired
	private AccountDetailsRep accountDetailsRepo;

	@Autowired
	private AccountSummaryRepo accountsummaryrepo;
	
	@Autowired
	McxCustomerMappingMRepo mcxCustomerMappingMRepo;
	
	@Autowired
	private MstBranchRepo mstBranchRepo;


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
			tempAccountDetails.add(accountdetail.getNbrAccount());
			
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
		accountDetailsDto = new AccountDetailsDto(accountdetail.getIdCustomer(), accountdetail.getNbrBranch(),
				accountdetail.getNbrAccount(), accountdetail.getAcctType(), accountdetail.getAcctStatus(),
				accountdetail.getCcyDesc(),new Double(accountdetail.getBalance()).doubleValue(), accountdetail.getOpeningBalance(),
				accountdetail.getAvailableBalance(), accountdetail.getIsChqBook(), accountdetail.getIsOverDraft(),
				accountdetail.getIssi(), accountdetail.getNumUncollected(), accountdetail.getMinBalance(),
				accountdetail.getDailyWithDrawalLimit(), accountdetail.getCustomerShortName(),
				accountdetail.getCustomerName(), dateFormat.format(accountdetail.getOpeningDate()),
				accountdetail.getIbanAcNo(), accountdetail.getRelation(), accountdetail.getDescAcctType(),
				accountdetail.getAmountOnHold(), accountdetail.getOdLimit(), accountdetail.getDialyLimit(),
				accountdetail.getEligibleAdv(), accountdetail.getOdlmStartDate(), accountdetail.getOdlmEndDate(),
				accountdetail.getOrigAvailableBal());
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
		McxCustomerMapping mcxCustomerMapping = mcxCustomerMappingRepo.findByMcxUser(new McxUser(mcxLogin.getMcxUser().getId()));
		List<AccountSummary> accountsummarys = accountsummaryrepo.findAccountSummaryByCustomerId(mcxCustomerMapping.getCustomerId());
		List<Accountdetails> accountdetails = accountDetailsRepo.findAllAccountByCustomerId(mcxCustomerMapping.getCustomerId());
		savingsAndCurrent = new ArrayList<>();
		loans = new ArrayList<>();
		contractAndTermdeposit = new ArrayList<>();
		sumOfSavingsAndCurrent = 0.0;
		sumOfLoans = 0.0;
		sumOfContractAndTermdepostit = 0.0;
		accountsummarys.stream().forEach(accountsummary -> {
			if (accountsummary.getCodAcctType().equals(Utility.SAVINGSANDCURRENT)) {
				sumOfSavingsAndCurrent += Double.parseDouble(accountsummary.getAvailAmt());
				savingsAndCurrent.add(getAccountSummaryType(accountsummary));
			}
			if (accountsummary.getCodAcctType().equals(Utility.CONTRACTANDTERMDEPOSIT)) {
				sumOfContractAndTermdepostit += Double.parseDouble(accountsummary.getNumAvailBal());
				loans.add(getAccountSummaryType(accountsummary));
				}
			if (accountsummary.getCodAcctType().equals(Utility.LOANSANDCURRENT)) {
				sumOfLoans += Double.parseDouble(accountsummary.getNumAvailBal());
				contractAndTermdeposit.add(getAccountSummaryType(accountsummary));
				}
			currencyType=accountsummary.getCodAcctCurr();
		});
		List<String> tempAccountDetails = new ArrayList<>();
		accountdetails.stream().forEach(accountdetail -> {
			tempAccountDetails.add(accountdetail.getNbrAccount());
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
		McxCustomerMapping mcxCustomerMapping = mcxCustomerMappingRepo.findByMcxUser(new McxUser(mcxLogin.getId()));
		List<AccountSummary> accountsummarys = accountsummaryrepo.findAccountSummaryByCustomerId(mcxCustomerMapping.getCustomerId());
		accountsummarys.stream().forEach(loansummary -> {

			   if( loansummary.getCodAcctCurr().equals(Utility.LOANSANDCURRENT)){
				sumOfTotalLoans += Double.parseDouble(loansummary.getNumBalance());
			   if( loansummary.getCodAcctType().equals(Utility.LOANSANDCURRENT))
				sumOfTotalLoans += Double.parseDouble(loansummary.getNumAvailBal());
				loanPending.add(getAccountSummaryType(loansummary));
			   }
		});
		loanSummayInfo = new LoanSummayInfo(sumOfLoans,loanPending);
		logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return loanSummayInfo;
	}
		
	protected AccountSummaryDto getAccountSummaryType(AccountSummary accountsummary) {
		return new AccountSummaryDto(accountsummary.getIdAccount(), accountsummary.getIdCustomer(),
				accountsummary.getCodBranch(), accountsummary.getCodAcctType(), accountsummary.getTxtAcctStatus(),
				accountsummary.getCodAcctCurr(), accountsummary.getNumBalance(), accountsummary.getNumOpenBalance(),
				accountsummary.getDatLastUpdated(), accountsummary.getNumAvailBal(), accountsummary.getNumUncollected(),
				accountsummary.getNumAvailCredit(), accountsummary.getNumMontOvCr(), accountsummary.getNumMontOvDr(),
				accountsummary.getAcctDesc(), accountsummary.getAdd1(), accountsummary.getAdd2(),
				accountsummary.getAdd3(), accountsummary.getNom1(), accountsummary.getNom2(), accountsummary.getAdd4(),
				accountsummary.getPrdName(), accountsummary.getPrdType(), accountsummary.getAcctOpenDt(),
				accountsummary.getOdLimit(), accountsummary.getOdStartDt(), accountsummary.getOdEndDt(),
				accountsummary.getShadowLimit(), accountsummary.getAccrDrAmt(), accountsummary.getAccrCrAmt(),
				accountsummary.getJointAcctIndicatior(), accountsummary.getChqBook(),
				accountsummary.getOverDraftFecility(), accountsummary.getNumStateBit(), accountsummary.getChkName1(),
				accountsummary.getChkName2(), accountsummary.getAutoreOrderChkReq(),
				accountsummary.getAutoreOrderChkLvl(), accountsummary.getDirtStatus(), accountsummary.getNextCapDt(),
				accountsummary.getCapFreq(), accountsummary.getAuthSignAtory(), accountsummary.getAuthSignLimit(),
				accountsummary.getSalesPerson(), accountsummary.getIntroducer(), accountsummary.getIbanNumber(),
				accountsummary.getAcctLockFlag(), accountsummary.getDebitAcctLockFlag(),
				accountsummary.getCreditAcctLockFlag(), accountsummary.getCrLine(), accountsummary.getAvailAmt(),
				accountsummary.getCrIntRate(), accountsummary.getAlwDod(), accountsummary.getUnAlwDod(),
				accountsummary.getAcFrozen(), accountsummary.getdTime(), accountsummary.getSlNo(),
				accountsummary.getPrdCode(), accountsummary.getIlmApplicable(), accountsummary.getIdEntity(),
				accountsummary.getMaturityDate(), accountsummary.getNextDueDate(), accountsummary.getUdf1(),
				accountsummary.getUdf2(), accountsummary.getUdf3(), accountsummary.getUdf4(), accountsummary.getUdf5(),
				accountsummary.getUdf6(), accountsummary.getUdf7(), accountsummary.getUdf8(), accountsummary.getUdf9(),
				accountsummary.getUdf10());

	}
	/*
	*//***
	 * Returns the branch details for a particular account
	 * @param nbrAccount - Hold the user input account number 
	 * @return  Returns the branch details for a particular account
	 *//*
	
	
	public AccountBranch getAccountBranch(String nbrAccount) throws Exception {
		Accountdetails accountdetail = accountDetailsRepo.findAccountBranchByAccountId(nbrAccount);
		
		MstBranch  mstBranch=  mstBranchRepo.findByBranchCode(accountdetail.getNbrBranch());
		AccountBranch accountBranch = new AccountBranch(accountdetail.getNbrAccount(), accountdetail.getNbrBranch(), mstBranch.getBranchName(),accountdetail.getCustomerName());
	    return accountBranch;
	}
	*/

//Added by Sreeja
	public List<AccountDetailsDto> getAccountDetailsByBeneficiaryId(Authentication authentication, Locale locale, Integer ben_id) {
		List<Accountdetails> accountdetails = new ArrayList<Accountdetails>();
		List<AccountDetailsDto> accountDetailsList = new ArrayList<AccountDetailsDto>();
		//int ben_id = 122;
		try {
			McxBeneficiaryM mcxBeneficiaryM = beneficiaryMRepo.findOne(ben_id);
			McxCustomerMappingM mcxCustomerMappingM = mcxCustomerMappingMRepo.findByUserId(mcxBeneficiaryM.getRef_user_id());
			String accType = "C";
			String status = "E";
			accountdetails = accountdetailsRep.findAccountByCustomerId(mcxCustomerMappingM.getCustomer_id(), accType, status);
			if (accountdetails != null) {
					accountdetails.stream().forEach(details -> {
						AccountDetailsDto accountDetailDetail = new AccountDetailsDto();
						accountDetailDetail.setIdCustomer(details.getIdCustomer());
						accountDetailDetail.setNbrAccount(details.getNbrAccount());
						accountDetailDetail.setBalance(Double.valueOf((double)details.getBalance()));
						accountDetailsList.add(accountDetailDetail);
				});
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return accountDetailsList;
	}
	
}

