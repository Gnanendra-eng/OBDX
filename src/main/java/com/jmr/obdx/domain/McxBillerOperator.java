package com.jmr.obdx.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MCX_BILLER_OPERATOR", schema = "JMR_OBDX")
public class McxBillerOperator implements java.io.Serializable {

	private long id;
	private String operator;
	private String porifle;
	private Set<Biller> mcxBillers = new HashSet<Biller>(0);

	public McxBillerOperator() {
	}

	public McxBillerOperator(long id) {
		this.id = id;
	}

	public McxBillerOperator(long id, String operator, String porifle, Set<Biller> mcxBillers) {
		this.id = id;
		this.operator = operator;
		this.porifle = porifle;
		this.mcxBillers = mcxBillers;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "OPERATOR", length = 100)
	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Column(name = "PORIFLE", length = 500)
	public String getPorifle() {
		return this.porifle;
	}

	public void setPorifle(String porifle) {
		this.porifle = porifle;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mcxBillerOperator")
	public Set<Biller> getMcxBillers() {
		return this.mcxBillers;
	}

	public void setMcxBillers(Set<Biller> mcxBillers) {
		this.mcxBillers = mcxBillers;
	}

}
