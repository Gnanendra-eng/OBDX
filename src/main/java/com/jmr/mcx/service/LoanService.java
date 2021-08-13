package com.jmr.mcx.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmr.mcx.service.dto.BasicLoanAccDetailsResp;

import com.jmr.mcx.service.dto.LoanAccountDtls;
import com.jmr.mcx.dto.StatusInfo;
import com.jmr.mcx.util.Utility;

import com.jmr.mcx.domain.LoanAccount;
import com.jmr.mcx.repositories.LoanRepo;

@Service
public class LoanService {

	private static Logger logger = Logger.getLogger(LoanService.class);

	private StatusInfo statusInfo;
	private BasicLoanAccDetailsResp basicLoanAccResp;

	/*
	 * @Autowired private McxLoanAcctDtlsRepo mcxLoanAcctDtlsRepo;
	 */
	@Autowired
	private LoanRepo loanRepo;

	private List<LoanAccountDtls> activedBasicLoanDetails;
	private List<LoanAccountDtls> closedBasicLoanDetails;
	int installmentNo = 0;

	public BasicLoanAccDetailsResp getBasicLoanAccDetails(Authentication authentication) throws Exception {
		logger.info(Utility.ENTERED + new Object() {
		}.getClass().getEnclosingMethod().getName());
		statusInfo = new StatusInfo();
		basicLoanAccResp = new BasicLoanAccDetailsResp();
		// String McxLogin=null;

		String custId = "00000144";
		// McxLogin McxLogin =
		// loginRepo.findByUsername(authentication.getName());
		// McxCustomerMapping mcxCustomerMapping = mcxCustomerMappingXmlRepo
		// .findByMcxUser(new
		// com.jmr.mcx.domain.McxUser(McxLogin.getMcxUser().getId()));
		List<LoanAccount> loanAccounts = loanRepo.findLoanSummaryByCustomerId(custId);
		activedBasicLoanDetails = new ArrayList<>();
		closedBasicLoanDetails = new ArrayList<>();
		if (loanAccounts != null) {

			for (int i = 0; i < loanAccounts.size(); i++) {
				System.out.println(i + "\t" + loanAccounts.get(i).getAcctStatus() + "\t"
						+ loanAccounts.get(i).getAltAcNo() + "\t" + loanAccounts.get(i).getBillRefNo() + "\t"
						+ loanAccounts.get(i).getChqBook() + "\t" + loanAccounts.get(i).getCodAcctType() + "\t"
						+ loanAccounts.get(i).getCodBranch() + "\t" + loanAccounts.get(i).getCodCurrency() + "\t"
						+ loanAccounts.get(i).getCodProdCateg() + "\t" + loanAccounts.get(i).getCodProduct() + ""
						+ loanAccounts.get(i).getCustFrequencyUnit() + "\t" + loanAccounts.get(i).getIdAccount() + "\t"
						+ loanAccounts.get(i).getIdCust() + "\t" + loanAccounts.get(i).getLeasePaymentMode() + "\t"
						+ loanAccounts.get(i).getLeaseType() + "\t" + loanAccounts.get(i).getModuleCode() + "\t"
						+ loanAccounts.get(i).getPrimaryApplicantName() + "\t" + loanAccounts.get(i).getProductDesc()
						+ "\t" + loanAccounts.get(i).getSuppFrequencyUnit() + "\t" + loanAccounts.get(i).getTopupFlag()
						+ "\t" + loanAccounts.get(i).getUserDefinedStatus() + "\t" + loanAccounts.get(i).getUserRefNo()
						+ "\t" + loanAccounts.get(i).getCustGracePeriod() + "\t"
						+ loanAccounts.get(i).getSuppGracePeriod() + "\t" + loanAccounts.get(i).getAmountDisbursed()
						+ "\t" + loanAccounts.get(i).getAmountFinanced() + "\t"
						+ loanAccounts.get(i).getBankSharePercent() + "\t" + loanAccounts.get(i).getBookDate() + "\t"
						+ loanAccounts.get(i).getCustSharePercent() + "\t" + loanAccounts.get(i).getInstallments()
						+ "\t" + loanAccounts.get(i).getMaturityDate() + "\t" + loanAccounts.get(i).getNetPrincipal()
						+ "\t" + loanAccounts.get(i).getOrgStartDate() + "\t" + loanAccounts.get(i).getOutstandingBal()
						+ "\t" + loanAccounts.get(i).getStaffFinance() + "\t" + loanAccounts.get(i).getTenorMonths()
						+ "\t" + loanAccounts.get(i).getValueDate());

			}
			// for (LoanAccount accountdetail : loanAccounts)
			loanAccounts.stream().forEach(accountdetail -> {

				if (accountdetail.getAcctStatus().equals(Utility.ACTIVE)) {
					activedBasicLoanDetails.add(new LoanAccountDtls(accountdetail.getUserRefNo(),
							accountdetail.getProductDesc(), accountdetail.getCodCurrency(),
							accountdetail.getOutstandingBal().doubleValue(), accountdetail.getCodBranch(),
							accountdetail.getIdAccount(), accountdetail.getAcctStatus()));
				} else {
					closedBasicLoanDetails.add(new LoanAccountDtls(accountdetail.getUserRefNo(),
							accountdetail.getProductDesc(), accountdetail.getCodCurrency(),
							accountdetail.getOutstandingBal().doubleValue(), accountdetail.getCodBranch(),
							accountdetail.getIdAccount(), accountdetail.getAcctStatus()));
				}
			});
			basicLoanAccResp = new BasicLoanAccDetailsResp(activedBasicLoanDetails, closedBasicLoanDetails, custId);

		}

		logger.info(Utility.EXITING + new Object() {
		}.getClass().getEnclosingMethod().getName());
		return basicLoanAccResp;

	}

}
