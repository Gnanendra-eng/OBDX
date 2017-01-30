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
    private String isenabled;
    private String flginternaltype;
    private String baseusertype;
    private String hashcustid;
    private String lookuptype;
    private String hasmultcust;
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
	
	
	  public AuthorityM(long id, String typeuser, String description, String isenabled, String flginternaltype, String baseusertype, String hashcustid, String lookuptype, String hasmultcust, Set<Login> logins) {
	       this.id = id;
	       this.typeuser = typeuser;
	       this.description = description;
	       this.isenabled = isenabled;
	       this.flginternaltype = flginternaltype;
	       this.baseusertype = baseusertype;
	       this.hashcustid = hashcustid;
	       this.lookuptype = lookuptype;
	       this.hasmultcust = hasmultcust;
	       this.logins = logins;
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

	@Column(name = "ISENABLED", length = 1)
	public String getIsenabled() {
		return this.isenabled;
	}

	public void setIsenabled(String isenabled) {
		this.isenabled = isenabled;
	}

	@Column(name = "FLGINTERNALTYPE", length = 1)
	public String getFlginternaltype() {
		return this.flginternaltype;
	}

	public void setFlginternaltype(String flginternaltype) {
		this.flginternaltype = flginternaltype;
	}

	@Column(name = "BASEUSERTYPE", length = 5)
	public String getBaseusertype() {
		return this.baseusertype;
	}

	public void setBaseusertype(String baseusertype) {
		this.baseusertype = baseusertype;
	}

	@Column(name = "HASHCUSTID", length = 1)
	public String getHashcustid() {
		return this.hashcustid;
	}

	public void setHashcustid(String hashcustid) {
		this.hashcustid = hashcustid;
	}

	@Column(name = "LOOKUPTYPE", length = 1)
	public String getLookuptype() {
		return this.lookuptype;
	}

	public void setLookuptype(String lookuptype) {
		this.lookuptype = lookuptype;
	}

	@Column(name = "HASMULTCUST", length = 1)
	public String getHasmultcust() {
		return this.hasmultcust;
	}

	public void setHasmultcust(String hasmultcust) {
		this.hasmultcust = hasmultcust;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "authorityM")
	public Set<Login> getLogins() {
		return this.logins;
	}

	public void setLogins(Set<Login> logins) {
		this.logins = logins;
	}

}
