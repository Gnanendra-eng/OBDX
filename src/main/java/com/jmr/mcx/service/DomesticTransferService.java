package com.jmr.mcx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmr.mcx.domain.McxAccountTypeM;
import com.jmr.mcx.domain.McxCurrencyM;
import com.jmr.mcx.domain.McxTransactionData;
import com.jmr.mcx.domain.McxTransferPurpose;
import com.jmr.mcx.repositories.McxTransactionDataRepo;
import com.jmr.mcx.service.dto.DomesticTransferDto;
import com.jmr.mcx.service.dto.DomesticTransferInfo;
@Service
public class DomesticTransferService {
	@Autowired
	private McxTransactionDataRepo mcxTransactionDataRepo;
	public DomesticTransferInfo domesticFundsTransfer(DomesticTransferDto domesticTransferDto){
		DomesticTransferInfo domesticTransferInfo = new DomesticTransferInfo();
		
	/*	//Do the business logic
		McxTransactionData mcxTransactionData = new McxTransactionData(
				new McxTransferPurpose(domesticTransferDto.getRef_transfer_purpose_id()),
				new McxCurrencyM(domesticTransferDto.getRef_currency_id()),
				new McxAccountTypeM(domesticTransferDto.getRef_account_type_id()), domesticTransferDto.getCustomer_id(),
				domesticTransferDto.getTo_account_number(), domesticTransferDto.getFrom_account_number(),
				domesticTransferDto.getTo_branch_code(), domesticTransferDto.getFrom_branch_code(),
				domesticTransferDto.getAmount(), domesticTransferDto.getTransfer_date(), domesticTransferDto.getNote(),
				domesticTransferDto.getReference_id());
				
		mcxTransactionDataRepo.save(mcxTransactionData);*/
		return domesticTransferInfo;
		
	}

}
