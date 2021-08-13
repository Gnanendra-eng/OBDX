package com.jmr.mcx.domain;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "MCX_CUSTOMER_MAPPING")
@EntityListeners(AuditingEntityListener.class)
public class McxCustomerMappingM {
	@Id
	private int id;
	private int ref_user_id;
	private String is_primary;
	private String customer_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRef_user_id() {
		return ref_user_id;
	}
	public void setRef_user_id(int ref_user_id) {
		this.ref_user_id = ref_user_id;
	}
	public String getIs_primary() {
		return is_primary;
	}
	public void setIs_primary(String is_primary) {
		this.is_primary = is_primary;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
}
