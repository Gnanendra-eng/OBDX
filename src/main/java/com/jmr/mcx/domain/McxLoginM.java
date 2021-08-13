package com.jmr.mcx.domain;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="MCX_LOGIN"
    ,schema="JMR_OBDX"
)
public class McxLoginM {
	@Id
	private int id;
	private String user_name;
	private String password;
	private String is_active;
	private String account_non_expired;
	private String credentials_non_expired;
	private String account_non_locked;
	private int ref_authority_id;
	private int ref_user_id;
	private Date reset_password_date;
	private String reset_txn_password_date_time;
	private String is_deleted;
	private String is_first_time_login;
	private String is_set_transaction_password;
	private String reference_number;
	private String is_transaction_active;
	private Blob registration_mail_content;
	private Date reset_password_date_time;
	private String transaction_password; 
	private Date registration_date_time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public String getAccount_non_expired() {
		return account_non_expired;
	}
	public void setAccount_non_expired(String account_non_expired) {
		this.account_non_expired = account_non_expired;
	}
	public String getCredentials_non_expired() {
		return credentials_non_expired;
	}
	public void setCredentials_non_expired(String credentials_non_expired) {
		this.credentials_non_expired = credentials_non_expired;
	}
	public String getAccount_non_locked() {
		return account_non_locked;
	}
	public void setAccount_non_locked(String account_non_locked) {
		this.account_non_locked = account_non_locked;
	}
	
	public int getRef_authority_id() {
		return ref_authority_id;
	}
	public void setRef_authority_id(int ref_authority_id) {
		this.ref_authority_id = ref_authority_id;
	}
	public int getRef_user_id() {
		return ref_user_id;
	}
	public void setRef_user_id(int ref_user_id) {
		this.ref_user_id = ref_user_id;
	}
	public Date getReset_password_date() {
		return reset_password_date;
	}
	public void setReset_password_date(Date reset_password_date) {
		this.reset_password_date = reset_password_date;
	}
	public String getReset_txn_password_date_time() {
		return reset_txn_password_date_time;
	}
	public void setReset_txn_password_date_time(String reset_txn_password_date_time) {
		this.reset_txn_password_date_time = reset_txn_password_date_time;
	}
	public String getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(String is_deleted) {
		this.is_deleted = is_deleted;
	}
	public String getIs_first_time_login() {
		return is_first_time_login;
	}
	public void setIs_first_time_login(String is_first_time_login) {
		this.is_first_time_login = is_first_time_login;
	}
	public String getIs_set_transaction_password() {
		return is_set_transaction_password;
	}
	public void setIs_set_transaction_password(String is_set_transaction_password) {
		this.is_set_transaction_password = is_set_transaction_password;
	}
	public String getReference_number() {
		return reference_number;
	}
	public void setReference_number(String reference_number) {
		this.reference_number = reference_number;
	}
	public String getIs_transaction_active() {
		return is_transaction_active;
	}
	public void setIs_transaction_active(String is_transaction_active) {
		this.is_transaction_active = is_transaction_active;
	}
	
	public Blob getRegistration_mail_content() {
		return registration_mail_content;
	}
	public void setRegistration_mail_content(Blob registration_mail_content) {
		this.registration_mail_content = registration_mail_content;
	}
	public Date getReset_password_date_time() {
		return reset_password_date_time;
	}
	public void setReset_password_date_time(Date reset_password_date_time) {
		this.reset_password_date_time = reset_password_date_time;
	}
	public String getTransaction_password() {
		return transaction_password;
	}
	public void setTransaction_password(String transaction_password) {
		this.transaction_password = transaction_password;
	}
	public Date getRegistration_date_time() {
		return registration_date_time;
	}
	public void setRegistration_date_time(Date registration_date_time) {
		this.registration_date_time = registration_date_time;
	}
}
