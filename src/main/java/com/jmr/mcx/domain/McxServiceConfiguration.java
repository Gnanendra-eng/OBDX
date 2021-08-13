package com.jmr.mcx.domain;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "MCX_SERVICE_CONFIGURATION")
@EntityListeners(AuditingEntityListener.class)
public class McxServiceConfiguration {
	@Id
	private int id;
	private String serviceinfo;
	private String serviceid;
	private String audit_req;
	private String service_req;
	private String screen_vs;
	private String service_name;
	private String service_validation;
	private String validation_req;
	private String service_method;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServiceinfo() {
		return serviceinfo;
	}
	public void setServiceinfo(String serviceinfo) {
		this.serviceinfo = serviceinfo;
	}
	public String getServiceid() {
		return serviceid;
	}
	public void setServiceid(String serviceid) {
		this.serviceid = serviceid;
	}
	public String getAudit_req() {
		return audit_req;
	}
	public void setAudit_req(String audit_req) {
		this.audit_req = audit_req;
	}
	public String getService_req() {
		return service_req;
	}
	public void setService_req(String service_req) {
		this.service_req = service_req;
	}
	public String getScreen_vs() {
		return screen_vs;
	}
	public void setScreen_vs(String screen_vs) {
		this.screen_vs = screen_vs;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getService_validation() {
		return service_validation;
	}
	public void setService_validation(String service_validation) {
		this.service_validation = service_validation;
	}
	public String getValidation_req() {
		return validation_req;
	}
	public void setValidation_req(String validation_req) {
		this.validation_req = validation_req;
	}
	public String getService_method() {
		return service_method;
	}
	public void setService_method(String service_method) {
		this.service_method = service_method;
	}
}
