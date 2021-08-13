package com.jmr.mcx.service;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jmr.mcx.domain.McxReqfieldValidation;
import com.jmr.mcx.domain.McxRequestValidation;
import com.jmr.mcx.repositories.McxReqFieldValidationRepo;
import com.jmr.mcx.repositories.McxRequestValidationRepo;
import com.jmr.mcx.service.dto.DomesticTransferDto;
import com.jmr.mcx.service.dto.ErrorDetailDto;
import com.jmr.mcx.service.dto.TransactionResultDto;
import com.jmr.mcx.validation.Constants;


@Service
public class ChannelService {
	@Autowired
	McxRequestValidationRepo mcxRequestValidationRepo;
	@Autowired
    BeanFactory beanFactory;
	@Autowired
	McxReqFieldValidationRepo mcxReqFieldValidationRepo;
	/**
	 * This method calls the services for field validation and calls the transaction service
	 * @param authentication
	 * @param domesticTransferDto
	 * @param locale
	 * @param bindingResult
	 * @return
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public TransactionResultDto validateRequestUrl(Authentication authentication, DomesticTransferDto domesticTransferDto, Locale locale, BindingResult bindingResult)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		TransactionResultDto transactionResultDto = new TransactionResultDto();
		transactionResultDto.setDomesticTransferDto(domesticTransferDto);
		McxRequestValidation mcxRequestValidation = mcxRequestValidationRepo.getRequest(domesticTransferDto.getRequestUrl());
		// Check for validation required
		if (mcxRequestValidation.getValidation_required().equals(Constants.REQUIRED)) {
				//Get the field validation services
				List<McxReqfieldValidation> fieldList = mcxReqFieldValidationRepo.getRequestFields(domesticTransferDto.getRequestUrl());
				fieldList.forEach(fields -> {
					try{
						ErrorDetailDto errorDetailDto;
						String className = fields.getValidation_class_name();
						Class<?> classType = Class.forName(className);
						Object bean = beanFactory.getBean(classType);
						Class<?>[] parameterTypes = { DomesticTransferDto.class, Authentication.class };
						Method me = classType.getMethod("validate", parameterTypes);
						DomesticTransferDto p = (DomesticTransferDto) domesticTransferDto;
						Authentication authen = (Authentication) authentication;
						errorDetailDto = (ErrorDetailDto) me.invoke(bean, p, authen);
						transactionResultDto.setErrorDetailDto(errorDetailDto);
						//exit whenever the the field validation failure 
						if ((transactionResultDto.getErrorDetailDto() != null) && (transactionResultDto.getErrorDetailDto()
								.getResult().equals(Constants.VALIDATION_FAILURE))) {
							return;
						}
					}
					catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					catch (Exception e) {
						// TODO: handle exception
					}
				});
				//If the field validation all gets success then proceed with group validation
			if ((transactionResultDto.getErrorDetailDto() != null)
					&& (transactionResultDto.getErrorDetailDto().getResult().equals(Constants.VALIDATION_SUCCESS))) {
					try {
						// Get the validation class	
						//ErrorDetailDto errorDetailDto;
						List<ErrorDetailDto> errorInfo = new ArrayList<ErrorDetailDto>();
						String className = mcxRequestValidation.getValidation_class_name();
						Class<?> classType = Class.forName(className);
						Object bean = beanFactory.getBean(classType);
						Class<?>[] parameterTypes = { DomesticTransferDto.class, Authentication.class };
						Method me = classType.getMethod("validate", parameterTypes);
						DomesticTransferDto p = (DomesticTransferDto) domesticTransferDto;
						Authentication authen = (Authentication) authentication;
						//errorDetailDto = (ErrorDetailDto) me.invoke(bean, p, authen);
						errorInfo =  (List<ErrorDetailDto>) me.invoke(bean, p, authen);
						//transactionResultDto.setErrorDetailDto(errorDetailDto);
						if (!errorInfo.isEmpty()) {
							transactionResultDto.setErrorInfo(errorInfo);
						}
					/*	if ((errorDetailDto.getResult().equals(Constants.VALIDATION_SUCCESS))
								&& (errorDetailDto.getType().equals(Constants.TRANSACTION_SUCCESS)))*/
						if (transactionResultDto.getErrorInfo() == null) {
							if (mcxRequestValidation.getService_required().equals(Constants.REQUIRED)) {
								String serviceClass = mcxRequestValidation.getService_class_name();
								Class<?> classTypeservice = Class.forName(serviceClass);
								Object beanService = beanFactory.getBean(classTypeservice);
								Class<?>[] parameters = { DomesticTransferDto.class };
								Method m = classTypeservice.getMethod("domesticFundsTransfer", parameters);
								DomesticTransferDto param = (DomesticTransferDto) domesticTransferDto;
								m.invoke(beanService, param);
								return transactionResultDto;
							}
							if (mcxRequestValidation.getService_required().equals(Constants.NOT_REQUIRED)) {
								return transactionResultDto;
							}
						}
		
					} catch (NoSuchMethodException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}		
		}
		return transactionResultDto;
	}
}
