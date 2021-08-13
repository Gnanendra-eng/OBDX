package com.jmr.mcx.domain;

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

/***
 * \
 * 
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name = "MCX_AUTHORITY_M", schema = "JMR_OBDX")
public class McxAuthorityM implements java.io.Serializable {

	private long id;
	private McxEntityM mcxEntityM;
	private McxBaseUserTypeM mcxBaseUserTypeM;
	private String description;
	private String isEnabled;
	private Set<McxLogin> mcxLogins = new HashSet<McxLogin>(0);

	public McxAuthorityM() {
	}

	public McxAuthorityM(long id, McxEntityM mcxEntityM, McxBaseUserTypeM mcxBaseUserTypeM, String isEnabled) {
		this.id = id;
		this.mcxEntityM = mcxEntityM;
		this.mcxBaseUserTypeM = mcxBaseUserTypeM;
		this.isEnabled = isEnabled;
	}

	public McxAuthorityM(long id, McxEntityM mcxEntityM, McxBaseUserTypeM mcxBaseUserTypeM, String description,
			String isEnabled, Set<McxLogin> mcxLogins) {
		this.id = id;
		this.mcxEntityM = mcxEntityM;
		this.mcxBaseUserTypeM = mcxBaseUserTypeM;
		this.description = description;
		this.isEnabled = isEnabled;
		this.mcxLogins = mcxLogins;
	}

	public McxAuthorityM(long id, McxBaseUserTypeM mcxBaseUserTypeM) {
		this.id = id;
		this.mcxBaseUserTypeM = mcxBaseUserTypeM;
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
	@JoinColumn(name = "REF_ENTITY_ID", nullable = false)
	public McxEntityM getMcxEntityM() {
		return this.mcxEntityM;
	}

	public void setMcxEntityM(McxEntityM mcxEntityM) {
		this.mcxEntityM = mcxEntityM;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "REF_USER_TYPE_ID", nullable = false)
	public McxBaseUserTypeM getMcxBaseUserTypeM() {
		return this.mcxBaseUserTypeM;
	}

	public void setMcxBaseUserTypeM(McxBaseUserTypeM mcxBaseUserTypeM) {
		this.mcxBaseUserTypeM = mcxBaseUserTypeM;
	}

	@Column(name = "DESCRIPTION", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "IS_ENABLED", nullable = false, length = 10)
	public String getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mcxAuthorityM")
	public Set<McxLogin> getMcxLogins() {
		return this.mcxLogins;
	}

	public void setMcxLogins(Set<McxLogin> mcxLogins) {
		this.mcxLogins = mcxLogins;
	}

}
