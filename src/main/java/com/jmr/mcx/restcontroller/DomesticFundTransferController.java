package com.jmr.mcx.restcontroller;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
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

import com.jmr.mcx.domain.McxCustomerMappingM;
import com.jmr.mcx.service.AccountService;
import com.jmr.mcx.service.BeneficiaryService;
import com.jmr.mcx.service.ChannelService;
import com.jmr.mcx.service.ServiceConfiguration;
import com.jmr.mcx.service.dto.AccountDetailsDto;
import com.jmr.mcx.service.dto.DomesticTransferDto;
import com.jmr.mcx.service.dto.ErrorDetailDto;
import com.jmr.mcx.service.dto.PayeeInfo;
import com.jmr.mcx.service.dto.ServiceDto;
import com.jmr.mcx.service.dto.TransactionResultDto;
import com.jmr.mcx.service.dto.ViewBeneficiaryDto;
import com.jmr.mcx.util.Utility;
import com.jmr.mcx.validation.Constants;
@RestController
@RequestMapping(value = "/fundtransfer")
public class DomesticFundTransferController {
	
	private final Logger logger = LoggerFactory.getLogger(DomesticFundTransferController.class);
	
	private static final String DOMESTIC_SERVICE_INFO = "DOMESTIC_SERVICE_INFO";
	private static final String INTERNAL_SERVICE_INFO = "INTERNAL_SERVICE_INFO";
	private static final String DOMESTIC_INIT = "DOMESTIC_BEN_INFO";
	private static final String DOMESTIC_TRANSFER_TYPE = "DOM";
	private static final String DOMESTIC_SELECT_BEN_INFO = "DOMESTIC_SELECT_BEN_INFO";
	private static final String DOMESTIC_TRANSFER_INFO = "DOMESTIC_TRANSFER_INFO";
	@Autowired
	private ChannelService channelService;
	@Autowired
    BeanFactory beanFactory;
	@Autowired
	private ServiceConfiguration l_serviceconfig;
	@Autowired
	private BeneficiaryService beneficiaryService;
	@Autowired 
	private AccountService accountService;
	
	/**
	 * This method is to get the list of all domestic beneficiaries for the login user
	 * @param authentication
	 * @param locale
	 * @return
	 */
	@RequestMapping(value = "/domestic-init", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<TransactionResultDto> viewBeneficiary(Authentication authentication, Locale locale) {
		try {PayeeInfo payeeInfo = new PayeeInfo();
			logger.info(Utility.ENTERED + new Object() {
			}.getClass().getEnclosingMethod().getName());
			TransactionResultDto responceObj = new TransactionResultDto();
			ServiceDto l_serviceinfo = l_serviceconfig.getServiceDetails(DOMESTIC_INIT);
			if ((l_serviceinfo.getValidationRequired().equals(Constants.REQUIRED)) && (l_serviceinfo.getServiceValidation() != null)) {
				//Do validation
			}
			else if (l_serviceinfo.getValidationRequired().equals(Constants.NOT_REQUIRED)) {
				if((l_serviceinfo.getServiceRequired().equals(Constants.REQUIRED)) && (l_serviceinfo.getServiceName() != null)) {
					String l_validclass= l_serviceinfo.getServiceName();
					Class<?> l_validclassType = Class.forName(l_validclass);
					Object bean = beanFactory.getBean(l_validclassType);
					Class<?>[] parameterTypes = {Authentication.class,  Locale.class, String.class};
					Method me = l_validclassType.getMethod(l_serviceinfo.getServiceMethod(), parameterTypes);
					Authentication authen = (Authentication) authentication;
					Locale l = (Locale) locale;
					String transferType = DOMESTIC_TRANSFER_TYPE;
					payeeInfo = (PayeeInfo) me.invoke(bean, authen, l, transferType);
					responceObj.setBeneficiaryList(payeeInfo.getBenList());
				}
			}
			/*payeeInfo =  beneficiaryService.viewBeneficiary(authentication, locale, DOMESTIC_TRANSFER_TYPE);
			responceObj.setBeneficiaryList(payeeInfo.getBenList());*/
			return new ResponseEntity<TransactionResultDto>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {
			}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<TransactionResultDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	/**
	 * This method verifies the selected beneficiary
	 * @param authentication
	 * @param locale
	 * @return
	 */
	@RequestMapping(value = "/domestic-verification", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<TransactionResultDto> selectBeneficiary(Authentication authentication, Locale locale) {
		try {
			TransactionResultDto responceObj1 = new TransactionResultDto();
			ErrorDetailDto errorDetailDto1 = new ErrorDetailDto();
			ServiceDto l_serviceinfo1 = l_serviceconfig.getServiceDetails(DOMESTIC_SELECT_BEN_INFO);
			if ((l_serviceinfo1.getValidationRequired().equals(Constants.REQUIRED)) && (l_serviceinfo1.getServiceValidation() != null)) {
				String l_validclass1= l_serviceinfo1.getServiceValidation();
				Class<?> l_validclassType1 = Class.forName(l_validclass1);
				Object bean1 = beanFactory.getBean(l_validclassType1);
				Class<?>[] parameterTypes1 = {Authentication.class, Integer.class,};
				Method me1 = l_validclassType1.getMethod("validatebeneficiary", parameterTypes1);
				Authentication authen1 = (Authentication) authentication;
				errorDetailDto1 = (ErrorDetailDto) me1.invoke(bean1, authen1, 122);
			}
			if (errorDetailDto1.getResult().equals(Constants.VALIDATION_SUCCESS)) {
				if ((l_serviceinfo1.getServiceRequired().equals(Constants.REQUIRED))
						&& (l_serviceinfo1.getServiceName() != null)) {
					String l_validclass = l_serviceinfo1.getServiceName();
					Class<?> l_validclassType = Class.forName(l_validclass);
					Object bean = beanFactory.getBean(l_validclassType);
					Class<?>[] parameterTypes = { Authentication.class, Locale.class, Integer.class };
					Method me = l_validclassType.getMethod(l_serviceinfo1.getServiceMethod(), parameterTypes);
					Authentication authen = (Authentication) authentication;
					Locale l = (Locale) locale;
					// This beneficiary id should be selected from the ui.
					int ben_id = 122;
					List<AccountDetailsDto> accountDetailsList = (List<AccountDetailsDto>) me.invoke(bean, authen, l,
							ben_id);
					if (accountDetailsList != null) {
						responceObj1.setAccountDetailList(accountDetailsList);
					} else {
						// There is no enabled account
					}
				}
			}
			else {
				responceObj1.setErrorDetailDto(errorDetailDto1);
			}
			/*int ben_id = 122;
			beneficiaryService.getBeneficiaryDetail(authentication, locale, ben_id);
			String customerId = "00000144";
			List<AccountDetailsDto> accountDetailsList = accountService.getAccountDetailsByBeneficiaryId(ben_id);
			responceObj1.setAccountDetailList(accountDetailsList);*/
			return new ResponseEntity<TransactionResultDto>(responceObj1, HttpStatus.OK);
		}
		 catch (Exception exception) {
				logger.info(Utility.EXCEPTION_IN + new Object() {
				}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<TransactionResultDto>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}
	/**
	 * This method confirm the transfer detail
	 * @param authentication
	 * @param locale
	 * @return
	 */
	@RequestMapping(value = "/domestic-confirmation", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<TransactionResultDto> getTransferdetail(Authentication authentication, Locale locale) {
		try {
			
			TransactionResultDto responceObj1 = new TransactionResultDto();
			ErrorDetailDto errorDetailDto1 = new ErrorDetailDto();
			ServiceDto l_serviceinfo1 = l_serviceconfig.getServiceDetails(DOMESTIC_TRANSFER_INFO);
			if ((l_serviceinfo1.getValidationRequired().equals(Constants.REQUIRED)) && (l_serviceinfo1.getServiceValidation() != null)) {
				String l_validclass1= l_serviceinfo1.getServiceValidation();
				Class<?> l_validclassType1 = Class.forName(l_validclass1);
				Object bean1 = beanFactory.getBean(l_validclassType1);
				Class<?>[] parameterTypes1 = {Authentication.class, DomesticTransferDto.class};
				Method me1 = l_validclassType1.getMethod("validateDomesticTransfer", parameterTypes1);
				Authentication authen1 = (Authentication) authentication;
				DomesticTransferDto domesticTransferDto = new DomesticTransferDto();
				domesticTransferDto.setCustomer_id("00000144");
				DomesticTransferDto p = (DomesticTransferDto) domesticTransferDto;
				errorDetailDto1 = (ErrorDetailDto) me1.invoke(bean1, authen1, p);
			}
			if (errorDetailDto1.getResult().equals(Constants.VALIDATION_SUCCESS)) {
				
			}
			else if (errorDetailDto1.getResult().equals(Constants.VALIDATION_FAILURE)) {
				//handle the validation
			}
			return new ResponseEntity<TransactionResultDto>(responceObj1, HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<TransactionResultDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@RequestMapping(value = "/domestic", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TransactionResultDto> domesticFundTransfer(
			@RequestBody @Valid DomesticTransferDto domesticTransferDto, Authentication authentication, Locale locale,
			BindingResult bindingResult) {
		
		try {
			logger.info(Utility.ENTERED + new Object() {
			}.getClass().getEnclosingMethod().getName());
			TransactionResultDto responceObj = new TransactionResultDto();
			//We cannot initialize a service by using new
			//ServiceConfiguration l_serviceconfig =  new ServiceConfiguration();
			ServiceDto l_serviceinfo = l_serviceconfig.getServiceDetails(DOMESTIC_SERVICE_INFO);
			
			String l_validclass= l_serviceinfo.getServiceValidation();
			Class<?> l_validclassType = Class.forName(l_validclass);
			Object bean = beanFactory.getBean(l_validclassType);
			Class<?>[] parameterTypes = { DomesticTransferDto.class, Authentication.class };
			Method me = l_validclassType.getMethod("validate", parameterTypes);
			DomesticTransferDto p = (DomesticTransferDto) domesticTransferDto;
			Authentication authen = (Authentication) authentication;
			me.invoke(bean, p, authen);
			
			
			//TransactionResultDto responceObj = (l_serviceinfo.classnam.class()).validateRequestUrl(authentication,
			//		domesticTransferDto, locale, bindingResult,l_serviceinfo);
			return new ResponseEntity<TransactionResultDto>(responceObj, HttpStatus.OK);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<TransactionResultDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {
			}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<TransactionResultDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
/*	@RequestMapping(value = "/internal", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TransactionResultDto> domesticFundTransfer(
			@RequestBody @Valid InternalTransferDto internalTransferDto, Authentication authentication,
			Locale locale, BindingResult bindingResult) {
		try {
			logger.info(Utility.ENTERED + new Object() {
			}.getClass().getEnclosingMethod().getName());
			
			ServiceDto l_serviceinfo = l_serviceconfig.getServiceDetails(DOMESTIC_SERVICE_INFO);
			
			TransactionResultDto responceObj = channelService.validateRequestUrl(authentication,
					domesticTransferDto, locale, bindingResult,l_serviceinfo);
			return new ResponseEntity<TransactionResultDto>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {
			}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<TransactionResultDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/own", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TransactionResultDto> domesticFundTransfer(
			@RequestBody @Valid OwnTransferDto ownTransferDto, Authentication authentication,
			Locale locale, BindingResult bindingResult) {
		try {
			logger.info(Utility.ENTERED + new Object() {
			}.getClass().getEnclosingMethod().getName());
			TransactionResultDto responceObj = channelService.validateRequestUrl(authentication,
					ownTransferDto, locale, bindingResult);
			return new ResponseEntity<TransactionResultDto>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {
			}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<TransactionResultDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	*/
}
