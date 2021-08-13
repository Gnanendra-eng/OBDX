package com.jmr.mcx.validation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;


import com.jmr.mcx.domain.Accountdetails;
import com.jmr.mcx.domain.McxAccountTypeM;
import com.jmr.mcx.domain.McxBeneficiary;
import com.jmr.mcx.domain.McxCustomerMapping;
import com.jmr.mcx.domain.McxLogin;
import com.jmr.mcx.domain.McxTransferType;
import com.jmr.mcx.domain.McxUser;
import com.jmr.mcx.repositories.AccountdetailsRepo;
import com.jmr.mcx.repositories.BeneficiaryRepo;
import com.jmr.mcx.repositories.McxAccountTypeRepo;
import com.jmr.mcx.repositories.McxCustomerMappingRepo;
import com.jmr.mcx.repositories.McxLoginRepo;
import com.jmr.mcx.repositories.McxTransferTypeRepo;
import com.jmr.mcx.service.dto.DomesticTransferDto;
import com.jmr.mcx.service.dto.ErrorDetailDto;

@Service
public class DomesticTransferValidation {
	
	@Autowired
	McxTransferTypeRepo mcxTransferTypeRepo;
	@Autowired
	AccountdetailsRepo accountdetailsRepo;
	@Autowired
	McxCustomerMappingRepo mcxCustomerMappingRepo;
	@Autowired
	McxLoginRepo mcxLoginRepo;
	@Autowired
	BeneficiaryRepo beneficiaryRepo;
	@Autowired
	McxAccountTypeRepo mcxAccountTypeRepo;
	
	/*public ErrorDetailDto validate(DomesticTransferDto domesticTransferDto) {
		ErrorDetailDto errorDetailDto;
		errorDetailDto = getAccountNumber(
				domesticTransferDto.getCustomer_id(), domesticTransferDto.getFrom_account_number());
		return errorDetailDto;
		
	}*/
	public ErrorDetailDto validatebeneficiary(Authentication authentication, Integer ben_id) {
		ErrorDetailDto errorDetailDto = new ErrorDetailDto();
		errorDetailDto = getBeneficiaryValid(ben_id, authentication);
		return errorDetailDto;
	}
	/**
	 * 
	 * @param domesticTransferDto
	 * @param authentication
	 * @return
	 */
	public List<ErrorDetailDto> validate(DomesticTransferDto domesticTransferDto, Authentication authentication) {
		getCustomer(domesticTransferDto.getCustomer_id(), authentication);
		List<ErrorDetailDto> errorInfo = new ArrayList<ErrorDetailDto>();
		ErrorDetailDto errorAccountNumber = getAccountNumber(domesticTransferDto.getCustomer_id(),
				domesticTransferDto.getFrom_account_number(), domesticTransferDto.getRef_account_type_id(),
				domesticTransferDto.getAmount());
		if (errorAccountNumber.getResult().equals(Constants.VALIDATION_FAILURE)) {
			errorInfo.add(errorAccountNumber);
		}
		ErrorDetailDto errorTransferType = getTransferType(domesticTransferDto.getTransferType());
		if (errorTransferType.getResult().equals(Constants.VALIDATION_FAILURE)) {
			errorInfo.add(errorTransferType);
		}
		ErrorDetailDto errorCustomerId = getCustomer(domesticTransferDto.getCustomer_id(), authentication);
		if (errorTransferType.getResult().equals(Constants.VALIDATION_FAILURE)) {
			errorInfo.add(errorCustomerId);
		}
		ErrorDetailDto errorBeneficiary = getBeneficiaryValid(domesticTransferDto.getRef_beneficiary_id(),
				authentication);
		if (errorBeneficiary.getResult().equals(Constants.VALIDATION_FAILURE)) {
			errorInfo.add(errorBeneficiary);
		}
		
		errorInfo.forEach(detail -> {
			System.out.println("This is the error message: " + detail.getMessage());
		});
		return errorInfo;
	}
	
	/**
	 * This method checks whether the Transfer type selected is 'DOM'
	 * @param transferType
	 * @return
	 */
	private ErrorDetailDto getTransferType(String transferType) {
		ErrorDetailDto errorDetailDto = new ErrorDetailDto();
		try {
			String type = "DOM";
			McxTransferType transferTypes = mcxTransferTypeRepo.findbyType(type);
			if (transferTypes.getTransferType().equals(transferType)) {
				errorDetailDto.setResult(Constants.VALIDATION_SUCCESS);
				errorDetailDto.setMessage("Transfer type is valid");
				errorDetailDto.setType(Constants.TRANSACTION_SUCCESS);
			} else {
				errorDetailDto.setResult(Constants.VALIDATION_FAILURE);
				errorDetailDto.setMessage("Transfer type is invalid");
				errorDetailDto.setType(Constants.TRANSACTION_SUCCESS);
			}
		} catch (Exception e) {
			errorDetailDto.setResult(Constants.VALIDATION_FAILURE);
			errorDetailDto.setMessage("Transaction failure due to some SQL exception in Transfer type");
			errorDetailDto.setType(Constants.TRANSACTION_ERROR);
		}
		return errorDetailDto;
	}
	/**
	 * 
	 * @param customerId
	 * @param accountNumber
	 * @param accountType
	 * @param amount
	 * @return
	 */
	private ErrorDetailDto getAccountNumber(String customerId, String accountNumber, Integer accountType,
			String amount) {
		ErrorDetailDto validationDetailDto = new ErrorDetailDto();
		try {
			Accountdetails accountdetails = accountdetailsRepo.getAccountDetail(customerId, accountNumber);
			McxAccountTypeM mcxAccountType = mcxAccountTypeRepo.getOne((long)accountType);
			if (accountdetails != null) {
				validationDetailDto.setResult(Constants.VALIDATION_SUCCESS);
				validationDetailDto.setMessage("Account number is valid");
				validationDetailDto.setType(Constants.TRANSACTION_SUCCESS);
			}
			// here the account type selected is same as the account type for
			// the from_account_number account type
			if ((accountdetails != null) && (accountdetails.getAcctType() == mcxAccountType.getAccountType())) {
				validationDetailDto.setResult(Constants.VALIDATION_SUCCESS);
				validationDetailDto.setMessage("Account type is valid");
				validationDetailDto.setType(Constants.TRANSACTION_SUCCESS);
			}
			if ((accountdetails != null) && (accountdetails.getAcctType() != mcxAccountType.getAccountType())) {
				validationDetailDto.setResult(Constants.VALIDATION_FAILURE);
				validationDetailDto.setMessage("Account type is invalid");
				validationDetailDto.setType(Constants.TRANSACTION_SUCCESS);
			}
			// here the balance amount should be greater than the amount
			// selected to transfer
			if ((accountdetails != null) && (accountdetails.getBalance() > Long.valueOf(amount))) {
				validationDetailDto.setResult(Constants.VALIDATION_SUCCESS);
				validationDetailDto.setMessage("Amount is valid");
				validationDetailDto.setType(Constants.TRANSACTION_SUCCESS);
			}
			if ((accountdetails != null) && (accountdetails.getBalance() <= Long.valueOf(amount))) {
				validationDetailDto.setResult(Constants.VALIDATION_FAILURE);
				validationDetailDto.setMessage("Amount is invalid");
				validationDetailDto.setType(Constants.TRANSACTION_SUCCESS);
			} else if (accountdetails == null){
				validationDetailDto.setResult(Constants.VALIDATION_FAILURE);
				validationDetailDto.setMessage("Account number is invalid");
				validationDetailDto.setType(Constants.TRANSACTION_SUCCESS);
			}
		} catch (Exception e) {
			validationDetailDto.setResult(Constants.VALIDATION_FAILURE);
			validationDetailDto.setMessage("Transaction failure due to some SQL exception in account number");
			validationDetailDto.setType(Constants.TRANSACTION_ERROR);
		}
		return validationDetailDto;
	}
	private ErrorDetailDto validate(Authentication authentication) {
		ErrorDetailDto validationDetailDto = new ErrorDetailDto();
		System.out.println("This is for testing");
		
		return validationDetailDto;
	}
	/**
	 * 
	 * @param customerId
	 * @param accountNumber
	 * @param accountType
	 * @param amount
	 * @return
	 */
	public ErrorDetailDto validateDomesticTransfer(Authentication authentication, DomesticTransferDto domesticTransferDto) {
		ErrorDetailDto validationDetailDto = new ErrorDetailDto();
		validationDetailDto = getCustomer(domesticTransferDto.getCustomer_id(), authentication);
		
		return validationDetailDto;
	}
	/**
	 * Check whether the customer id is valid or not OR it belongs to the login user
	 * @param customerId
	 * @param authentication
	 * @return
	 */
	private ErrorDetailDto getCustomer(String customerId, Authentication authentication) {
		ErrorDetailDto errorDetailDto = new ErrorDetailDto();
		try {
			McxLogin mcxLogin = mcxLoginRepo.findByUserName(authentication.getName());
			McxCustomerMapping mcxCustomerMapping = mcxCustomerMappingRepo
					.findByMcxUser(new McxUser(mcxLogin.getMcxUser().getId()));
			if ((mcxCustomerMapping != null) && (mcxCustomerMapping.getCustomerId().equals(customerId))) {
				errorDetailDto.setResult(Constants.VALIDATION_SUCCESS);
				errorDetailDto.setMessage("Customer id is valid");
				errorDetailDto.setType(Constants.TRANSACTION_SUCCESS);
			}
			if ((mcxCustomerMapping != null) && (!mcxCustomerMapping.getCustomerId().equals(customerId))) {
				errorDetailDto.setResult(Constants.VALIDATION_FAILURE);
				errorDetailDto.setMessage("Customer id is invalid");
				errorDetailDto.setType(Constants.TRANSACTION_SUCCESS);
			}
		} catch (Exception e) {
			errorDetailDto.setResult(Constants.VALIDATION_FAILURE);
			errorDetailDto.setMessage("Transaction failure due to some SQL exception in customer id");
			errorDetailDto.setType(Constants.TRANSACTION_ERROR);
		}
		return errorDetailDto;
	}

	/**
	 * Beneficiary should be active and the beneficiary should be belongs to the
	 * login user customer id
	 * 
	 * @param beneficiaryId
	 * @return
	 */
	private ErrorDetailDto getBeneficiaryValid(int beneficiaryId, Authentication authentication) {
		ErrorDetailDto errorDetailDto = new ErrorDetailDto();
		try {
			if (isBeneficiaryActive(beneficiaryId) && isValidBeneficiary(beneficiaryId, authentication)) {
				errorDetailDto.setResult(Constants.VALIDATION_SUCCESS);
				errorDetailDto.setMessage("Beneficiary is valid");
				errorDetailDto.setType(Constants.TRANSACTION_SUCCESS);
			} else {
				errorDetailDto.setResult(Constants.VALIDATION_FAILURE);
				errorDetailDto.setMessage("Beneficiary is invalid");
				errorDetailDto.setType(Constants.TRANSACTION_SUCCESS);
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
			errorDetailDto.setResult(Constants.VALIDATION_FAILURE);
			errorDetailDto.setMessage("Transaction failure due to some SQL exception in beneficiary");
			errorDetailDto.setType(Constants.TRANSACTION_ERROR);
		}
		return errorDetailDto;
	}
	/**
	 * This method checks whether the beneficiary is active or not
	 * @param beneficiaryId
	 * @return
	 */
	private boolean isBeneficiaryActive(int beneficiaryId) {
		McxBeneficiary beneficiary = beneficiaryRepo.findOne((long) beneficiaryId);
		boolean is_active = false;
		if ((beneficiary != null) && (beneficiary.getIsActive().equals("true"))) {
			is_active = true;
		} else {
			is_active = false;
		}
		return is_active;
	}
	/**
	 * This method checks whether the selected beneficiary belongs to the login user
	 * @param beneficiaryId
	 * @param authentication
	 * @return
	 */
	private boolean isValidBeneficiary(int beneficiaryId, Authentication authentication) {
		McxLogin mcxLogin = mcxLoginRepo.findByUserName(authentication.getName());
		McxCustomerMapping mcxCustomerMapping = mcxCustomerMappingRepo
				.findByMcxUser(new McxUser(mcxLogin.getMcxUser().getId()));
		// get the user id from the login user. check the login user is same as
		// beneficiary ref_user_id
		boolean is_valid = false;
		McxBeneficiary beneficiary = beneficiaryRepo.findOne((long)beneficiaryId);
		if ((mcxCustomerMapping != null) && (beneficiary != null)
				&& (beneficiary.getMcxUser().getId()) == mcxCustomerMapping.getMcxUser().getId()) {
			is_valid = true;
		} else {
			is_valid = false;
		}
		return is_valid;
	}
}
