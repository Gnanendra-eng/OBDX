package com.jmr.obdx.domain;

import java.sql.Blob;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/***
 * \
 * 
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name = "MCX_LOGIN", schema = "JMR_OBDX", uniqueConstraints = @UniqueConstraint(columnNames = "USER_NAME"))
public class McxLogin implements java.io.Serializable {

	private long id;
	private McxUser mcxUser;
	private McxAuthorityM mcxAuthorityM;
	private String userName;
	private String password;
	private String isActive;
	private String accountNonExpired;
	private String credentialsNonExpired;
	private String accountNonLocked;
	private Date resetPasswordDate;
	private String resetTxnPasswordDateTime;
	private String isDeleted;
	private String isFirstTimeLogin;
	private String isSetTransactionPassword;
	private String referenceNumber;
	private String isTransactionActive;
	private Blob registrationMailContent;
	private Date resetPasswordDateTime;
	private String transactionPassword;
	private Date registrationDateTime;

	public McxLogin() {
	}

	public McxLogin(long id) {
		this.id = id;
	}

	public McxLogin(long id, McxUser mcxUser, McxAuthorityM mcxAuthorityM, String userName, String password,
			String isActive, String accountNonExpired, String credentialsNonExpired, String accountNonLocked) {
		this.id = id;
		this.mcxUser = mcxUser;
		this.mcxAuthorityM = mcxAuthorityM;
		this.userName = userName;
		this.password = password;
		this.isActive = isActive;
		this.accountNonExpired = accountNonExpired;
		this.credentialsNonExpired = credentialsNonExpired;
		this.accountNonLocked = accountNonLocked;
	}

	public McxLogin(long id, McxUser mcxUser, McxAuthorityM mcxAuthorityM, String userName, String password,
			String isActive, String accountNonExpired, String credentialsNonExpired, String accountNonLocked,
			Date resetPasswordDate, String resetTxnPasswordDateTime, String isDeleted, String isFirstTimeLogin,
			String isSetTransactionPassword, String referenceNumber, String isTransactionActive,
			Blob registrationMailContent, Date resetPasswordDateTime, String transactionPassword,
			Date registrationDateTime) {
		this.id = id;
		this.mcxUser = mcxUser;
		this.mcxAuthorityM = mcxAuthorityM;
		this.userName = userName;
		this.password = password;
		this.isActive = isActive;
		this.accountNonExpired = accountNonExpired;
		this.credentialsNonExpired = credentialsNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.resetPasswordDate = resetPasswordDate;
		this.resetTxnPasswordDateTime = resetTxnPasswordDateTime;
		this.isDeleted = isDeleted;
		this.isFirstTimeLogin = isFirstTimeLogin;
		this.isSetTransactionPassword = isSetTransactionPassword;
		this.referenceNumber = referenceNumber;
		this.isTransactionActive = isTransactionActive;
		this.registrationMailContent = registrationMailContent;
		this.resetPasswordDateTime = resetPasswordDateTime;
		this.transactionPassword = transactionPassword;
		this.registrationDateTime = registrationDateTime;
	}

	public McxLogin(String userName, String password, String isActive, String accountNonExpired,
			String credentialsNonExpired, String accountNonLocked, McxAuthorityM mcxAuthorityM) {
		this.userName = userName;
		this.password = password;
		this.isActive = isActive;
		this.accountNonExpired = accountNonExpired;
		this.credentialsNonExpired = credentialsNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.mcxAuthorityM = mcxAuthorityM;

	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REF_USER_ID", nullable = false)
	public McxUser getMcxUser() {
		return this.mcxUser;
	}

	public void setMcxUser(McxUser mcxUser) {
		this.mcxUser = mcxUser;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "REF_AUTHORITY_ID", nullable = false)
	public McxAuthorityM getMcxAuthorityM() {
		return this.mcxAuthorityM;
	}

	public void setMcxAuthorityM(McxAuthorityM mcxAuthorityM) {
		this.mcxAuthorityM = mcxAuthorityM;
	}

	@Column(name = "USER_NAME", unique = true, nullable = false, length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "PASSWORD", nullable = false, length = 500)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "IS_ACTIVE", nullable = false, length = 5)
	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@Column(name = "ACCOUNT_NON_EXPIRED", nullable = false, length = 5)
	public String getAccountNonExpired() {
		return this.accountNonExpired;
	}

	public void setAccountNonExpired(String accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	@Column(name = "CREDENTIALS_NON_EXPIRED", nullable = false, length = 5)
	public String getCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}

	public void setCredentialsNonExpired(String credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	@Column(name = "ACCOUNT_NON_LOCKED", nullable = false, length = 5)
	public String getAccountNonLocked() {
		return this.accountNonLocked;
	}

	public void setAccountNonLocked(String accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RESET_PASSWORD_DATE", length = 7)
	public Date getResetPasswordDate() {
		return this.resetPasswordDate;
	}

	public void setResetPasswordDate(Date resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}

	@Column(name = "RESET_TXN_PASSWORD_DATE_TIME", length = 10)
	public String getResetTxnPasswordDateTime() {
		return this.resetTxnPasswordDateTime;
	}

	public void setResetTxnPasswordDateTime(String resetTxnPasswordDateTime) {
		this.resetTxnPasswordDateTime = resetTxnPasswordDateTime;
	}

	@Column(name = "IS_DELETED", length = 5)
	public String getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "IS_FIRST_TIME_LOGIN", length = 5)
	public String getIsFirstTimeLogin() {
		return this.isFirstTimeLogin;
	}

	public void setIsFirstTimeLogin(String isFirstTimeLogin) {
		this.isFirstTimeLogin = isFirstTimeLogin;
	}

	@Column(name = "IS_SET_TRANSACTION_PASSWORD", length = 5)
	public String getIsSetTransactionPassword() {
		return this.isSetTransactionPassword;
	}

	public void setIsSetTransactionPassword(String isSetTransactionPassword) {
		this.isSetTransactionPassword = isSetTransactionPassword;
	}

	@Column(name = "REFERENCE_NUMBER", length = 10)
	public String getReferenceNumber() {
		return this.referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	@Column(name = "IS_TRANSACTION_ACTIVE", length = 5)
	public String getIsTransactionActive() {
		return this.isTransactionActive;
	}

	public void setIsTransactionActive(String isTransactionActive) {
		this.isTransactionActive = isTransactionActive;
	}

	@Column(name = "REGISTRATION_MAIL_CONTENT")
	public Blob getRegistrationMailContent() {
		return this.registrationMailContent;
	}

	public void setRegistrationMailContent(Blob registrationMailContent) {
		this.registrationMailContent = registrationMailContent;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RESET_PASSWORD_DATE_TIME", length = 7)
	public Date getResetPasswordDateTime() {
		return this.resetPasswordDateTime;
	}

	public void setResetPasswordDateTime(Date resetPasswordDateTime) {
		this.resetPasswordDateTime = resetPasswordDateTime;
	}

	@Column(name = "TRANSACTION_PASSWORD", length = 500)
	public String getTransactionPassword() {
		return this.transactionPassword;
	}

	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "REGISTRATION_DATE_TIME", length = 7)
	public Date getRegistrationDateTime() {
		return this.registrationDateTime;
	}

	public void setRegistrationDateTime(Date registrationDateTime) {
		this.registrationDateTime = registrationDateTime;
	}


}
