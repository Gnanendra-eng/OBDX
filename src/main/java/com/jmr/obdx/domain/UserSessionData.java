package com.jmr.obdx.domain;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/***
 * @author JMR
 */
@Entity
@Table(name = "USER_SESSION_DATA", schema = "JMR_OBDX", uniqueConstraints = @UniqueConstraint(columnNames = "IDSESSION"))
public class UserSessionData implements java.io.Serializable {

	private long id;
	private String idsession;
	private String iddata;
	private Blob data;
	private long iduser;

	public UserSessionData() {
	}

	public UserSessionData(long id, long iduser) {
		this.id = id;
		this.iduser = iduser;
	}

	public UserSessionData(long id, String idsession, String iddata, Blob data, long iduser) {
		this.id = id;
		this.idsession = idsession;
		this.iddata = iddata;
		this.data = data;
		this.iduser = iduser;
	}
	
	
	
	public UserSessionData(String idsession,long iduser) {
		this.idsession = idsession;
		this.iduser = iduser;
	}


	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "IDSESSION", unique = true, length = 50)
	public String getIdsession() {
		return this.idsession;
	}

	public void setIdsession(String idsession) {
		this.idsession = idsession;
	}

	@Column(name = "IDDATA", length = 50)
	public String getIddata() {
		return this.iddata;
	}

	public void setIddata(String iddata) {
		this.iddata = iddata;
	}

	@Column(name = "DATA")
	public Blob getData() {
		return this.data;
	}

	public void setData(Blob data) {
		this.data = data;
	}

	@Column(name = "IDUSER", nullable = false, precision = 10, scale = 0)
	public long getIduser() {
		return this.iduser;
	}

	public void setIduser(long iduser) {
		this.iduser = iduser;
	}

}
