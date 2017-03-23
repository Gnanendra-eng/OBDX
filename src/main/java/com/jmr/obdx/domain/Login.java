package com.jmr.obdx.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/***
 * @author JMR
 */
@Entity
@Table(name = "LOGIN", schema = "JMR_OBDX", uniqueConstraints = @UniqueConstraint(columnNames = "USERNAME"))
public class Login implements java.io.Serializable {

	private long id;
	private AuthorityM authorityM;
	private String username;
	private String password;
	private String isactive;
	private String accountnonexpired;
	private String credentialsnonexpired;
	private String accountnonlocked;
	private RetailCustomer retailCustomer;
	private Set<Biller> billers = new HashSet<Biller>(0);
	
	
	

	public Login(long id) {
		this.id = id;
	}

	public Login() {
	}

	public Login(long id, AuthorityM authorityM, String username, String password, String isactive,
			String accountnonexpired, String credentialsnonexpired, String accountnonlocked) {
		this.id = id;
		this.authorityM = authorityM;
		this.username = username;
		this.password = password;
		this.isactive = isactive;
		this.accountnonexpired = accountnonexpired;
		this.credentialsnonexpired = credentialsnonexpired;
		this.accountnonlocked = accountnonlocked;
	}

	public Login(String username, String password, String isactive, String accountnonexpired,
			String credentialsnonexpired, String accountnonlocked, AuthorityM authorityM) {
		this.authorityM = authorityM;
		this.username = username;
		this.password = password;
		this.isactive = isactive;
		this.accountnonexpired = accountnonexpired;
		this.credentialsnonexpired = credentialsnonexpired;
		this.accountnonlocked = accountnonlocked;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "AUTHORITY_REF_ID", nullable = false)
	public AuthorityM getAuthorityM() {
		return this.authorityM;
	}

	public void setAuthorityM(AuthorityM authorityM) {
		this.authorityM = authorityM;
	}

	@Column(name = "USERNAME", unique = true, nullable = false, length = 100)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", nullable = false, length = 500)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "ISACTIVE", nullable = false, length = 10)
	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Column(name = "ACCOUNTNONEXPIRED", nullable = false, length = 10)
	public String getAccountnonexpired() {
		return this.accountnonexpired;
	}

	public void setAccountnonexpired(String accountnonexpired) {
		this.accountnonexpired = accountnonexpired;
	}

	@Column(name = "CREDENTIALSNONEXPIRED", nullable = false, length = 10)
	public String getCredentialsnonexpired() {
		return this.credentialsnonexpired;
	}

	public void setCredentialsnonexpired(String credentialsnonexpired) {
		this.credentialsnonexpired = credentialsnonexpired;
	}

	@Column(name = "ACCOUNTNONLOCKED", nullable = false, length = 10)
	public String getAccountnonlocked() {
		return this.accountnonlocked;
	}

	public void setAccountnonlocked(String accountnonlocked) {
		this.accountnonlocked = accountnonlocked;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "login")
	public RetailCustomer getRetailCustomer() {
		return this.retailCustomer;
	}

	public void setRetailCustomer(RetailCustomer retailCustomer) {
		this.retailCustomer = retailCustomer;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<Biller> getBillers() {
		return this.billers;
	}

	public void setBillers(Set<Biller> billers) {
		this.billers = billers;
	}
	

}