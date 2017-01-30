package com.jmr.obdx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * @author JMR
 */
@Entity
@Table(name = "DEVICE_M", schema = "JMR_OBDX")
public class DeviceM implements java.io.Serializable {

	private long id;
	private String iddevice;
	private String namedevice;
	private String contenttype;
	private String idchannel;

	public DeviceM() {
	}

	public DeviceM(long id) {
		this.id = id;
	}

	public DeviceM(long id, String iddevice, String namedevice, String contenttype, String idchannel) {
		this.id = id;
		this.iddevice = iddevice;
		this.namedevice = namedevice;
		this.contenttype = contenttype;
		this.idchannel = idchannel;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "IDDEVICE", length = 10)
	public String getIddevice() {
		return this.iddevice;
	}

	public void setIddevice(String iddevice) {
		this.iddevice = iddevice;
	}

	@Column(name = "NAMEDEVICE", length = 50)
	public String getNamedevice() {
		return this.namedevice;
	}

	public void setNamedevice(String namedevice) {
		this.namedevice = namedevice;
	}

	@Column(name = "CONTENTTYPE", length = 50)
	public String getContenttype() {
		return this.contenttype;
	}

	public void setContenttype(String contenttype) {
		this.contenttype = contenttype;
	}

	@Column(name = "IDCHANNEL", length = 10)
	public String getIdchannel() {
		return this.idchannel;
	}

	public void setIdchannel(String idchannel) {
		this.idchannel = idchannel;
	}

}
