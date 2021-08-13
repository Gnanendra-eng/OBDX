package com.jmr.mcx.service.dto;

public class ServiceDto {
	private String serviceInfo;
	private String serviceId;
	private String auditRequired;
	private String serviceRequired;
	private String screenVersion;
	private String serviceName;
	private String serviceValidation;
	private String validationRequired;
	private String serviceMethod;
	public String getServiceInfo() {
		return serviceInfo;
	}
	public void setServiceInfo(String serviceInfo) {
		this.serviceInfo = serviceInfo;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getAuditRequired() {
		return auditRequired;
	}
	public void setAuditRequired(String auditRequired) {
		this.auditRequired = auditRequired;
	}
	public String getServiceRequired() {
		return serviceRequired;
	}
	public void setServiceRequired(String serviceRequired) {
		this.serviceRequired = serviceRequired;
	}
	public String getScreenVersion() {
		return screenVersion;
	}
	public void setScreenVersion(String screenVersion) {
		this.screenVersion = screenVersion;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceValidation() {
		return serviceValidation;
	}
	public void setServiceValidation(String serviceValidation) {
		this.serviceValidation = serviceValidation;
	}
	public String getValidationRequired() {
		return validationRequired;
	}
	public void setValidationRequired(String validationRequired) {
		this.validationRequired = validationRequired;
	}
	public String getServiceMethod() {
		return serviceMethod;
	}
	public void setServiceMethod(String serviceMethod) {
		this.serviceMethod = serviceMethod;
	}
	public ServiceDto(String serviceInfo, String serviceId, String auditRequired, String serviceRequired,
			String screenVersion, String serviceName, String serviceValidation, String validationRequired,
			String serviceMethod) {
		super();
		this.serviceInfo = serviceInfo;
		this.serviceId = serviceId;
		this.auditRequired = auditRequired;
		this.serviceRequired = serviceRequired;
		this.screenVersion = screenVersion;
		this.serviceName = serviceName;
		this.serviceValidation = serviceValidation;
		this.validationRequired = validationRequired;
		this.serviceMethod = serviceMethod;
	}
	public ServiceDto() {
		super();
	}

}
