package com.jmr.mcx.restcontroller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jmr.mcx.service.ChannelService;
import com.jmr.mcx.service.ChannelTestService;
import com.jmr.mcx.service.dto.DomesticTransferDto;
import com.jmr.mcx.service.dto.TransactionResultDto;
@RestController
@RequestMapping(value = "/fundtransfer")
public class DomesticFundTransferTestController {
	@Autowired
	private ChannelTestService channelTestService;
	@RequestMapping(value = "/domestictransfer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TransactionResultDto> domesticFundTransfer(
			@RequestBody @Valid DomesticTransferDto domesticTransferDto, Authentication authentication,
			Locale locale, BindingResult bindingResult){
		TransactionResultDto responceObj = new TransactionResultDto();
		//Step 1:Get service Id
	//	channelTestService.getServiceId();
		//Step 2:Do validation
		//Step 3:Call service
		return new ResponseEntity<TransactionResultDto>(responceObj, HttpStatus.OK);
	}

}
