package com.jmr.mcx.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jmr.mcx.domain.McxBeneficiary;
import com.jmr.mcx.domain.McxBeneficiaryM;
import com.jmr.mcx.domain.McxConfigTbl;
import com.jmr.mcx.domain.McxCustomerMapping;
import com.jmr.mcx.domain.McxCustomerMappingM;
import com.jmr.mcx.domain.McxLoginM;
import com.jmr.mcx.domain.McxLogin;
import com.jmr.mcx.domain.McxTransactionM;
import com.jmr.mcx.domain.McxTransferType;
import com.jmr.mcx.domain.McxTransferViaType;
import com.jmr.mcx.domain.McxUser;
import com.jmr.mcx.domain.MstBranch;
import com.jmr.mcx.dto.ErrorMsg;
import com.jmr.mcx.dto.StatusInfo;
import com.jmr.mcx.repositories.AccountDetailsRep;
import com.jmr.mcx.repositories.AccountdetailsRepo;
import com.jmr.mcx.repositories.BeneficiaryMRepo;
import com.jmr.mcx.repositories.BeneficiaryRepo;
import com.jmr.mcx.repositories.McxConfigRepo;
import com.jmr.mcx.repositories.McxCustomerMappingMRepo;
import com.jmr.mcx.repositories.McxCustomerMappingRepo;
import com.jmr.mcx.repositories.McxLoginMRepo;
import com.jmr.mcx.repositories.McxLoginRepo;
import com.jmr.mcx.repositories.McxTransactionMRepo;
import com.jmr.mcx.repositories.McxTransferTypeRepo;
import com.jmr.mcx.repositories.McxUserMRepo;
import com.jmr.mcx.repositories.MstBranchRepo;
import com.jmr.mcx.service.dto.AllConfigDet;
import com.jmr.mcx.service.dto.AllPayee;
import com.jmr.mcx.service.dto.BeneficiaryDto;
import com.jmr.mcx.service.dto.ConfigDtls;
import com.jmr.mcx.service.dto.DomesticBeneficiaryReqDto;
import com.jmr.mcx.service.dto.PayeeInfo;
import com.jmr.mcx.service.dto.ViewBeneficiaryDto;
import com.jmr.mcx.util.Utility;

/***
 * modified Login to McxLogin and BenficiaryM to McxBenficiaryM by Murugesh on
 * 17/07/2017
 */
@Service
public class BeneficiaryService {

	private static Logger logger = Logger.getLogger(BeneficiaryService.class);

	private StatusInfo statusInfo;

	private List<AllPayee> allPayee;

	private List<AllConfigDet> allCongigDtls;

	private PayeeInfo payeeInfo;

	private ConfigDtls configDtls;

	@Autowired
	private McxLoginRepo loginRepo;

	@Autowired
	private AccountDetailsRep accountDetailsRepo;

	@Autowired
	private BeneficiaryRepo beneficiaryRepo;
	@Autowired
	private BeneficiaryMRepo beneficiaryMRepo;

	@Autowired
	private McxConfigRepo mcxConfigRepo;

	@Autowired
	private MstBranchRepo mstBranchRepo;

	private Utility utilities;

	@Autowired
	private McxTransactionMRepo mcxTransactionMRepo;

	@Autowired
	private McxUserMRepo mcxUserMRepo;
	@Autowired
	McxLoginMRepo mcxLoginMRepo;
	@Autowired
	McxCustomerMappingRepo mcxCustomerMappingRepo;
	@Autowired
	McxCustomerMappingMRepo mcxCustomerMappingMRepo;
	@Autowired
	McxTransferTypeRepo mcxTransferTypeRepo;
	@Autowired
	AccountdetailsRepo accountdetails;
	/***
	 * Adding a new Payee.
	 * 
	 * @param beneficiaryDto-Hold
	 *            the user input Payee details
	 * @param authentication-
	 *            Hold the currently logined user info
	 * @param locale
	 *            -A Locale object represents a specific geographical,
	 *            political, or cultural region
	 * @param bindingResult-General
	 *            interface that represents binding results.
	 * @return StatusInfo
	 */

	public StatusInfo addBeneficiary(BeneficiaryDto beneficiaryDto, Authentication authentication, Locale locale,
			BindingResult bindingResult) throws Exception {
		statusInfo = new StatusInfo();
		if (bindingResult.hasErrors()) {
			statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error -> {
				statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));
			});
		}
		/*
		 * Login login = loginRepo.findByUsername(authentication.getName());
		 * RetailCustomer retailCustomer =
		 * retailCustomerRepo.findByIduser(login.getId()); List<Accountdetails>
		 * accountdetails =
		 * accountDetailsRepo.getBasicAccountDetails(retailCustomer.getIdcusomer
		 * ()); accountdetails.stream().forEach(accountdetail ->{
		 * if(accountdetail.getNBRACCOUNT() !=
		 * internalFundTransferDto.getAccountNumber() &&
		 * accountdetail.getNBRACCOUNT() ==
		 * internalFundTransferDto.getBranchId()){ } else{
		 * statusInfo.setErrorStatus(true); statusInfo.getErrorMsgs().add(new
		 * com.jmr.mcx.dto.ErrorMsg(messageSource.getMessage("field.accountno",
		 * new Object[] {},
		 * locale),messageSource.getMessage("error.not.sufficient.amount",new
		 * Object[] {}, locale))); } });
		 */
		MstBranch mstBranch = mstBranchRepo.findByBranchCode(beneficiaryDto.getBranchId());
		McxLogin login = loginRepo.findByUserName(authentication.getName());
		McxUser mcxUser = mcxUserMRepo.findById(login.getMcxUser().getId());
		System.out.println(mcxUser.getId());
		/***
		 * Modified constructor to save McxBenficiary by Murugesh on
		 * 18/07/2017(need to send mcxTransferViaType,McxTransferType id in the
		 * beneficiaryDto from frontend ) Mcxtransfervia type and transfertype
		 * is been hardcode now, need to send from client side update by
		 * Pritiranjan Swain (27/7/2017)
		 * 
		 */
		beneficiaryRepo.save(new McxBeneficiary(new McxUser(mcxUser.getId()), new McxTransferViaType(1),
				new McxTransferType(1), beneficiaryDto.getPayeeName(), beneficiaryDto.getAccountName(),
				mstBranch.getBranchCode(), beneficiaryDto.getNickName(), beneficiaryDto.getAccountNumber(),
				Utility.IS_ACTIVE, new Date(), beneficiaryDto.getSwiftCode(), beneficiaryDto.getNcc()));
		return statusInfo;
	}

	// Anju Starts 16/11/2018
	public StatusInfo addDomesticBeneficiary(DomesticBeneficiaryReqDto domesticBeneficiaryDto,
			Authentication authentication, Locale locale, BindingResult bindingResult) throws Exception {
		statusInfo = new StatusInfo();
		if (bindingResult.hasErrors()) {
			statusInfo.setErrorStatus(true);
			bindingResult.getFieldErrors().forEach(error -> {
				statusInfo.getErrorMsgs().add(new ErrorMsg(error.getField(), error.getDefaultMessage()));
			});
		}

		MstBranch mstBranch = mstBranchRepo.findByBranchCode(domesticBeneficiaryDto.getBranchCode());
		McxLogin login = loginRepo.findByUserName(authentication.getName());
		McxUser mcxUser = mcxUserMRepo.findById(login.getMcxUser().getId());
		System.out.println(mcxUser.getId());

		beneficiaryRepo.save(new McxBeneficiary(new McxUser(mcxUser.getId()), new McxTransferViaType(1),
				new McxTransferType(1), domesticBeneficiaryDto.getPayeeName(), domesticBeneficiaryDto.getAccountName(),
				mstBranch.getBranchCode(), domesticBeneficiaryDto.getAccountNumber(), Utility.IS_ACTIVE, new Date(),
				domesticBeneficiaryDto.getpMode(), domesticBeneficiaryDto.getBankName(),
				domesticBeneficiaryDto.getCity(), domesticBeneficiaryDto.getBankAddr()));

		return statusInfo;
	}

	// Anju Ends 16/11/2018

	/***
	 * Return all Beneficiary for the logined user
	 * 
	 * @param authentication
	 *            -Hold the currently logined user info
	 * @param locale
	 *            A Locale object represents a specific geographical, political,
	 *            or cultural region
	 * @return Return all Beneficiary for the logined user
	 */

	public PayeeInfo viewBeneficiary(Authentication authentication, Locale locale, String transferType) {
		//Get login user id
		McxLoginM mcxLogin = mcxLoginMRepo.findByUserName(authentication.getName());
		McxTransferType mcxTransferType = mcxTransferTypeRepo.findbyType(transferType);
	//	List<McxBeneficiary> b = beneficiaryRepo.findDomesticBeneficiaryByName(transferType);
		List<McxBeneficiary> beneficiaryM = beneficiaryRepo.findDomesticBeneficiaryByUserId(mcxLogin.getRef_user_id(), mcxTransferType.getId());
		//List<McxBeneficiary> beneficiaryM = beneficiaryRepo.findBeneficiary();
		PayeeInfo payeeInfo = new PayeeInfo();
		//Get list of beneficiaries for the login user
		//List<McxBeneficiary> beneficiaryM = beneficiaryRepo.findBeneficiaryByUserId(mcxLogin.getMcxUser().getId());
		List<ViewBeneficiaryDto> benList = new ArrayList<ViewBeneficiaryDto>();
		//allPayee = new ArrayList<>();
		List<BeneficiaryDto> beneficiaryList = new ArrayList<BeneficiaryDto>();
		beneficiaryM.stream().forEach(beneficiary -> {
			//allPayee.add(new AllPayee(beneficiary.getId(), beneficiary.getPayyeName()));	
			benList.add(new ViewBeneficiaryDto(beneficiary.getId(), beneficiary.getPayyeName()));
		});
		//payeeInfo.setAllPayee(allPayee);
		//payeeInfo.setBeneficiaryList(beneficiaryList);
		payeeInfo.setBenList(benList);
		return payeeInfo;
	}

	// Anju Starts 20/11/2018
	public ConfigDtls fetchPaymentMode(Authentication authentication, Locale locale) {

		List<McxConfigTbl> config = mcxConfigRepo.findConfig();
		configDtls = new ConfigDtls();
		allCongigDtls = new ArrayList<>();
		config.stream().forEach(dtls -> {
			allCongigDtls.add(new AllConfigDet(dtls.getPropValue()));
		});
		configDtls.setAllConfigDtls(allCongigDtls);

		return configDtls;
	}
	public McxCustomerMappingM getBeneficiaryDetail(Authentication authentication, Locale locale, Integer ben_id) {
		McxBeneficiaryM mcxBeneficiaryM = beneficiaryMRepo.findOne(ben_id);
		McxCustomerMappingM mcxCustomerMappingM = mcxCustomerMappingMRepo.findByUserId(mcxBeneficiaryM.getRef_user_id());
		return mcxCustomerMappingM;
	
	}

}
