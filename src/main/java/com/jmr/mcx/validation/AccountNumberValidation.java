package com.jmr.mcx.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.jmr.mcx.domain.Accountdetails;
import com.jmr.mcx.domain.McxAccountTypeM;
import com.jmr.mcx.repositories.AccountdetailsRepo;
import com.jmr.mcx.repositories.McxAccountTypeRepo;
import com.jmr.mcx.service.dto.DomesticTransferDto;
import com.jmr.mcx.service.dto.ErrorDetailDto;

@Service
public class AccountNumberValidation {
	@Autowired
	AccountdetailsRepo accountdetailsRepo;
	@Autowired
	McxAccountTypeRepo mcxAccountTypeRepo;
	public ErrorDetailDto validate(DomesticTransferDto domesticTransferDto, Authentication authentication){
		ErrorDetailDto errorDetailDto = getAccountNumber(domesticTransferDto.getCustomer_id(),
				domesticTransferDto.getFrom_account_number(), domesticTransferDto.getRef_account_type_id(),
				domesticTransferDto.getAmount());
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
			else if (accountdetails == null){
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
}
