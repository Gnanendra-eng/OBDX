package com.jmr.mcx.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "MCX_BENEFICIARY")
@EntityListeners(AuditingEntityListener.class)
public class McxBeneficiaryM {
	@Id
	private int id;
	private String payye_name;
	private String account_name;
	private String branch_code;
	private String nick_name;
	private String account_number;
	private String is_active;
	private Date registration_date_time;
	private int ref_user_id;
	private String swift_code;
	private String ncc;
	private int ref_transfer_type_id;
	private int ref_transfer_via_type_id;
	private String bank_addr;
	private String city;
	private String bank_name;
	private String pay_mode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPayye_name() {
		return payye_name;
	}
	public void setPayye_name(String payye_name) {
		this.payye_name = payye_name;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public Date getRegistration_date_time() {
		return registration_date_time;
	}
	public void setRegistration_date_time(Date registration_date_time) {
		this.registration_date_time = registration_date_time;
	}
	public int getRef_user_id() {
		return ref_user_id;
	}
	public void setRef_user_id(int ref_user_id) {
		this.ref_user_id = ref_user_id;
	}
	public String getSwift_code() {
		return swift_code;
	}
	public void setSwift_code(String swift_code) {
		this.swift_code = swift_code;
	}
	public String getNcc() {
		return ncc;
	}
	public void setNcc(String ncc) {
		this.ncc = ncc;
	}
	public int getRef_transfer_type_id() {
		return ref_transfer_type_id;
	}
	public void setRef_transfer_type_id(int ref_transfer_type_id) {
		this.ref_transfer_type_id = ref_transfer_type_id;
	}
	public int getRef_transfer_via_type_id() {
		return ref_transfer_via_type_id;
	}
	public void setRef_transfer_via_type_id(int ref_transfer_via_type_id) {
		this.ref_transfer_via_type_id = ref_transfer_via_type_id;
	}
	public String getBank_addr() {
		return bank_addr;
	}
	public void setBank_addr(String bank_addr) {
		this.bank_addr = bank_addr;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getPay_mode() {
		return pay_mode;
	}
	public void setPay_mode(String pay_mode) {
		this.pay_mode = pay_mode;
	}
}
