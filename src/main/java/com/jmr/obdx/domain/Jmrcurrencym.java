package com.jmr.obdx.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Column;

@Entity
@Table(name = "JMRCURRENCYM", schema = "JMR_OBDX")
public class Jmrcurrencym implements java.io.Serializable {

	private Long id;
	private String idEntity;
	private String currencyShortName;
	private String currencyName;
	private String currencyCode;
	private String isLocal;
	private Serializable registrationdate;

	public Jmrcurrencym() {
	}

	public Jmrcurrencym(Long id, String idEntity, String currencyShortName, String currencyName, String currencyCode,
			String isLocal, Serializable registrationdate) {
		this.id = id;
		this.idEntity = idEntity;
		this.currencyShortName = currencyShortName;
		this.currencyName = currencyName;
		this.currencyCode = currencyCode;
		this.isLocal = isLocal;
		this.registrationdate = registrationdate;
	}

	@Id
	@Column(name = "ID", precision = 10, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "ID_ENTITY", length = 10)
	public String getIdEntity() {
		return this.idEntity;
	}

	public void setIdEntity(String idEntity) {
		this.idEntity = idEntity;
	}

	@Column(name = "CURRENCY_SHORT_NAME", length = 10)
	public String getCurrencyShortName() {
		return this.currencyShortName;
	}

	public void setCurrencyShortName(String currencyShortName) {
		this.currencyShortName = currencyShortName;
	}

	@Column(name = "CURRENCY_NAME", length = 250)
	public String getCurrencyName() {
		return this.currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	@Column(name = "CURRENCY_CODE", length = 10)
	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@Column(name = "IS_LOCAL", length = 2)
	public String getIsLocal() {
		return this.isLocal;
	}

	public void setIsLocal(String isLocal) {
		this.isLocal = isLocal;
	}

	@Column(name = "REGISTRATIONDATE")
	public Serializable getRegistrationdate() {
		return this.registrationdate;
	}

	public void setRegistrationdate(Serializable registrationdate) {
		this.registrationdate = registrationdate;
	}
}
