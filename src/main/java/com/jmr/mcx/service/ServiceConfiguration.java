package com.jmr.mcx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmr.mcx.domain.McxServiceConfiguration;
import com.jmr.mcx.repositories.McxServiceConfigurationRepo;
import com.jmr.mcx.service.dto.ServiceDto;

@Service
public class ServiceConfiguration {
	@Autowired
	McxServiceConfigurationRepo mcxServiceConfigurationRepo;
	public ServiceDto getServiceDetails(String internalServiceInfo) {
		McxServiceConfiguration mcxServiceConfiguration = mcxServiceConfigurationRepo.findbyServiceinfo(internalServiceInfo);
		/*ServiceDto serviceDto = new ServiceDto(mcxServiceConfiguration.getServiceinfo(), mcxServiceConfiguration.getServiceid(), mcxServiceConfiguration.getAudit_req(),
				mcxServiceConfiguration.getService_req(), mcxServiceConfiguration.getScreen_vs(), mcxServiceConfiguration.getService_name(),
				mcxServiceConfiguration.getService_validation(), mcxServiceConfiguration.getValidation_req(), mcxServiceConfiguration.getService_method());*/
		ServiceDto serviceDto = new ServiceDto();
		if (mcxServiceConfiguration != null) {
			if (mcxServiceConfiguration.getServiceinfo() != null) {
				serviceDto.setServiceInfo(mcxServiceConfiguration.getServiceinfo());
			}
			if (mcxServiceConfiguration.getServiceid() != null) {
				serviceDto.setServiceId(mcxServiceConfiguration.getServiceid());
			}
			if (mcxServiceConfiguration.getAudit_req() != null) {
				serviceDto.setAuditRequired(mcxServiceConfiguration.getAudit_req());
			}
			if (mcxServiceConfiguration.getService_req() != null) {
				serviceDto.setServiceRequired(mcxServiceConfiguration.getService_req());
			}
			if (mcxServiceConfiguration.getScreen_vs() != null) {
				serviceDto.setScreenVersion(mcxServiceConfiguration.getScreen_vs());
			}
			if (mcxServiceConfiguration.getService_name() != null) {
				serviceDto.setServiceName(mcxServiceConfiguration.getService_name());
			}
			if (mcxServiceConfiguration.getService_validation() != null) {
				serviceDto.setServiceValidation(mcxServiceConfiguration.getService_validation());
			}
			if (mcxServiceConfiguration.getValidation_req() != null) {
				serviceDto.setValidationRequired(mcxServiceConfiguration.getValidation_req());
			}
			if (mcxServiceConfiguration.getService_method() != null) {
				serviceDto.setServiceMethod(mcxServiceConfiguration.getService_method());
			}
		}
		return serviceDto;
	}

}
