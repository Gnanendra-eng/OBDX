package com.jmr.mcx.domain;



import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import javax.persistence.Table;

import javax.persistence.Id;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "MCX_REQUEST_VALIDATION")
@EntityListeners(AuditingEntityListener.class)
public class McxRequestValidation {
	public McxRequestValidation() {
		super();
	}
	@Id
	private int id; 
	private String request_name; 
	private String validation_required;
	private String service_required;
	private String validation_class_name;
	private String service_class_name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRequest_name() {
		return request_name;
	}
	public void setRequest_name(String request_name) {
		this.request_name = request_name;
	}
	public String getValidation_required() {
		return validation_required;
	}
	public void setValidation_required(String validation_required) {
		this.validation_required = validation_required;
	}
	public String getService_required() {
		return service_required;
	}
	public void setService_required(String service_required) {
		this.service_required = service_required;
	}
	public McxRequestValidation(int id, String request_name, String validation_required, String service_required) {
		super();
		this.id = id;
		this.request_name = request_name;
		this.validation_required = validation_required;
		this.service_required = service_required;
	}
	
	public String getValidation_class_name() {
		return validation_class_name;
	}
	public void setValidation_class_name(String validation_class_name) {
		this.validation_class_name = validation_class_name;
	}
	public McxRequestValidation(int id, String request_name, String validation_required, String service_required,
			String validation_class_name) {
		super();
		this.id = id;
		this.request_name = request_name;
		this.validation_required = validation_required;
		this.service_required = service_required;
		this.validation_class_name = validation_class_name;
	}
	public String getService_class_name() {
		return service_class_name;
	}
	public void setService_class_name(String service_class_name) {
		this.service_class_name = service_class_name;
	}
	
}
