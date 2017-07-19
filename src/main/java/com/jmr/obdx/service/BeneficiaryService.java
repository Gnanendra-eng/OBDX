package com.jmr.obdx.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jmr.obdx.domain.Accountdetails;
import com.jmr.obdx.domain.McxBeneficiary;
import com.jmr.obdx.domain.McxLogin;
import com.jmr.obdx.domain.McxTransactionM;
import com.jmr.obdx.domain.McxTransferType;
import com.jmr.obdx.domain.McxTransferViaType;
import com.jmr.obdx.domain.McxUser;
import com.jmr.obdx.domain.MstBranch;
import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.repositories.AccountDetailsRepo;
import com.jmr.obdx.repositories.BeneficiaryRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.McxTransactionMRepo;
import com.jmr.obdx.repositories.MstBranchRepo;
import com.jmr.obdx.service.dto.AllPayee;
import com.jmr.obdx.service.dto.BeneficiaryDto;
import com.jmr.obdx.service.dto.PayeeInfo;
import com.jmr.obdx.util.Utility;

/***
 * modified Login to McxLogin and BenficiaryM to McxBenficiaryM by Murugesh on 17/07/2017
 */
@Service
public class BeneficiaryService {
	
	private static Logger logger = Logger.getLogger(BeneficiaryService.class);

	
	private StatusInfo statusInfo;
	
	private List<AllPayee> allPayee;
	
	private PayeeInfo payeeInfo;

	@Autowired
	private LoginRepo loginRepo;
	
	@Autowired
	private AccountDetailsRepo accountDetailsRepo;
	
	@Autowired
	private BeneficiaryRepo beneficiaryRepo;
	
	@Autowired
	private MstBranchRepo mstBranchRepo;
	
	private Utility utilities;
	
	@Autowired
	private McxTransactionMRepo mcxTransactionMRepo;
	
	
	/***
	 * Adding a new Payee.
	 * @param beneficiaryDto-Hold the user input Payee details
	 * @param authentication- Hold the currently logined user info
	 * @param locale -A Locale object represents a specific geographical, political, or cultural region
	 * @param bindingResult-General interface that represents binding results.
	 * @return StatusInfo
	 */

	
	public StatusInfo addBeneficiary(BeneficiaryDto beneficiaryDto , Authentication authentication, Locale locale,BindingResult bindingResult) throws Exception{
		statusInfo=new StatusInfo();
		if (bindingResult.hasErrors()) {
			statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error -> {statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));
			});
		    }
		/*Login login = loginRepo.findByUsername(authentication.getName());
		RetailCustomer retailCustomer = retailCustomerRepo.findByIduser(login.getId());
		List<Accountdetails> accountdetails = accountDetailsRepo.getBasicAccountDetails(retailCustomer.getIdcusomer());
		accountdetails.stream().forEach(accountdetail ->{
			if(accountdetail.getNBRACCOUNT() != internalFundTransferDto.getAccountNumber() && accountdetail.getNBRACCOUNT() == internalFundTransferDto.getBranchId()){
			}
			else{
				statusInfo.setErrorStatus(true);
	 			statusInfo.getErrorMsgs().add(new com.jmr.obdx.dto.ErrorMsg(messageSource.getMessage("field.accountno",new Object[] {}, locale),messageSource.getMessage("error.not.sufficient.amount",new Object[] {}, locale)));
	 			}
		});*/
		McxLogin login = loginRepo.findByUsername(authentication.getName());
		McxTransactionM mcxTransactionM = mcxTransactionMRepo.findByProductDescription(Utility.IAT);
		MstBranch  mstBranch=  mstBranchRepo.findByBankCode(beneficiaryDto.getBranchId());
   	    /***
   	     * Modified constructor to save McxBenficiary by Murugesh on 18/07/2017
   	     */
		beneficiaryRepo.save(new McxBeneficiary(new McxUser(login.getId()), new McxTransferViaType(beneficiaryDto.getMcxTransferViaType()),new McxTransferType(beneficiaryDto.getMcxTransferType()) ,beneficiaryDto.getPayeeName(), beneficiaryDto.getAccountName(), mstBranch.getBankCode(), beneficiaryDto.getNickName(), beneficiaryDto.getAccountNumber(), Utility.IS_ACTIVE, new Date(), beneficiaryDto.getSwiftCode(), beneficiaryDto.getNcc()));
		return statusInfo; 
	}
	
	
	/***
	 * Return all Beneficiary for the logined user
	 * @param authentication -Hold the currently logined user info
	 * @param locale A Locale object represents a specific geographical, political, or cultural region
	 * @return Return all Beneficiary for the logined user
	 */

	public PayeeInfo viewBeneficiary(Authentication authentication,Locale locale){
		
		List<McxBeneficiary> beneficiaryM = beneficiaryRepo.findBeneficiary();
		payeeInfo = new PayeeInfo();
		allPayee = new ArrayList<>();
		beneficiaryM.stream().forEach(beneficiary->{
			allPayee.add(new AllPayee(beneficiary.getId(), beneficiary.getPayyeName()));
		});
		payeeInfo.setAllPayee(allPayee);

		return payeeInfo;
	}
	
	
}
