package com.jmr.obdx.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/***
 * @author JMR
 */
@Entity
@Table(name = "AUTHORITY_M", schema = "JMR_OBDX", uniqueConstraints = @UniqueConstraint(columnNames = "TYPEUSER"))
public class AuthorityM implements java.io.Serializable {

	private long id;
	private String typeuser;
	private String description;
	private Set<Login> logins = new HashSet<Login>(0);

	public AuthorityM() {
	}

	public AuthorityM(long id, String typeuser) {
		this.id = id;
		this.typeuser = typeuser;
	}

	public AuthorityM(long id) {
		this.id = id;
	}

	public AuthorityM(long id, String typeuser, String description, Set<Login> logins) {
		this.id = id;
		this.typeuser = typeuser;
		this.description = description;
		this.logins = logins;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "TYPEUSER", unique = true, nullable = false, length = 25)
	public String getTypeuser() {
		return this.typeuser;
	}

	public void setTypeuser(String typeuser) {
		this.typeuser = typeuser;
	}

	@Column(name = "DESCRIPTION", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "authorityM")
	public Set<Login> getLogins() {
		return this.logins;
	}

	public void setLogins(Set<Login> logins) {
		this.logins = logins;
	}

}
