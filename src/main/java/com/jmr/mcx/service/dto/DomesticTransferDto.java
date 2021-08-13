package com.jmr.mcx.service.dto;

import java.util.Date;

public class DomesticTransferDto {
	private String requestUrl;
	private int ref_transfer_purpose_id;
	private int ref_currency_id;
	private int ref_biller_id;
	private int ref_beneficiary_id;
	private String customer_id;
	private String to_account_number;
	private String from_account_number;
	private String to_branch_code;
	private String from_branch_code;
	private int ref_account_type_id;
	private String amount;
	private Date transfer_date;
	private String note;
	private String reference_id;
	private String transferType;
	public String getRequestUrl() {
		return requestUrl;
	}
	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}
	public int getRef_transfer_purpose_id() {
		return ref_transfer_purpose_id;
	}
	public void setRef_transfer_purpose_id(int ref_transfer_purpose_id) {
		this.ref_transfer_purpose_id = ref_transfer_purpose_id;
	}
	public int getRef_currency_id() {
		return ref_currency_id;
	}
	public void setRef_currency_id(int ref_currency_id) {
		this.ref_currency_id = ref_currency_id;
	}
	public int getRef_biller_id() {
		return ref_biller_id;
	}
	public void setRef_biller_id(int ref_biller_id) {
		this.ref_biller_id = ref_biller_id;
	}
	public int getRef_beneficiary_id() {
		return ref_beneficiary_id;
	}
	public void setRef_beneficiary_id(int ref_beneficiary_id) {
		this.ref_beneficiary_id = ref_beneficiary_id;
	}
	public int getRef_account_type_id() {
		return ref_account_type_id;
	}
	public void setRef_account_type_id(int ref_account_type_id) {
		this.ref_account_type_id = ref_account_type_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getTo_account_number() {
		return to_account_number;
	}
	public void setTo_account_number(String to_account_number) {
		this.to_account_number = to_account_number;
	}
	public String getFrom_account_number() {
		return from_account_number;
	}
	public void setFrom_account_number(String from_account_number) {
		this.from_account_number = from_account_number;
	}
	public String getTo_branch_code() {
		return to_branch_code;
	}
	public void setTo_branch_code(String to_branch_code) {
		this.to_branch_code = to_branch_code;
	}
	public String getFrom_branch_code() {
		return from_branch_code;
	}
	public void setFrom_branch_code(String from_branch_code) {
		this.from_branch_code = from_branch_code;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Date getTransfer_date() {
		return transfer_date;
	}
	public void setTransfer_date(Date transfer_date) {
		this.transfer_date = transfer_date;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getReference_id() {
		return reference_id;
	}
	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}
	public DomesticTransferDto(String requestUrl, int ref_transfer_purpose_id, int ref_currency_id, int ref_biller_id,
			int ref_beneficiary_id, int ref_account_type_id, String customer_id, String to_account_number,
			String from_account_number, String to_branch_code, String from_branch_code, String amount,
			Date transfer_date, String note, String reference_id) {
		super();
		this.requestUrl = requestUrl;
		this.ref_transfer_purpose_id = ref_transfer_purpose_id;
		this.ref_currency_id = ref_currency_id;
		this.ref_biller_id = ref_biller_id;
		this.ref_beneficiary_id = ref_beneficiary_id;
		this.ref_account_type_id = ref_account_type_id;
		this.customer_id = customer_id;
		this.to_account_number = to_account_number;
		this.from_account_number = from_account_number;
		this.to_branch_code = to_branch_code;
		this.from_branch_code = from_branch_code;
		this.amount = amount;
		this.transfer_date = transfer_date;
		this.note = note;
		this.reference_id = reference_id;
	}
	public DomesticTransferDto(String requestUrl, int ref_transfer_purpose_id, int ref_currency_id, int ref_biller_id,
			int ref_beneficiary_id, int ref_account_type_id, String customer_id, String to_account_number,
			String from_account_number, String to_branch_code, String from_branch_code, String amount,
			Date transfer_date, String note, String reference_id, String transferType) {
		super();
		this.requestUrl = requestUrl;
		this.ref_transfer_purpose_id = ref_transfer_purpose_id;
		this.ref_currency_id = ref_currency_id;
		this.ref_biller_id = ref_biller_id;
		this.ref_beneficiary_id = ref_beneficiary_id;
		this.ref_account_type_id = ref_account_type_id;
		this.customer_id = customer_id;
		this.to_account_number = to_account_number;
		this.from_account_number = from_account_number;
		this.to_branch_code = to_branch_code;
		this.from_branch_code = from_branch_code;
		this.amount = amount;
		this.transfer_date = transfer_date;
		this.note = note;
		this.reference_id = reference_id;
		this.transferType = transferType;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public DomesticTransferDto() {
		super();
	}

}
