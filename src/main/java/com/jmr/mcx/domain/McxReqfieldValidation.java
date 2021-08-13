package com.jmr.mcx.domain;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "MCX_REQFIELD_VALIDATION")
@EntityListeners(AuditingEntityListener.class)
public class McxReqfieldValidation {
	public McxReqfieldValidation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private int id;
	private String request_name; 
	private String field_name;
	private String validation_required;
	private String validation_class_name;
	private String method_name;
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
	public String getField_name() {
		return field_name;
	}
	public void setField_name(String field_name) {
		this.field_name = field_name;
	}
	public String getValidation_required() {
		return validation_required;
	}
	public void setValidation_required(String validation_required) {
		this.validation_required = validation_required;
	}
	public String getValidation_class_name() {
		return validation_class_name;
	}
	public void setValidation_class_name(String validation_class_name) {
		this.validation_class_name = validation_class_name;
	}
	public String getMethod_name() {
		return method_name;
	}
	public void setMethod_name(String method_name) {
		this.method_name = method_name;
	}
	
}
