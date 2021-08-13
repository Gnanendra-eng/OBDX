package com.jmr.mcx.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Table(name = "MCX_CONFIG_TBL", schema = "JMR_OBDX")
@Entity
@IdClass(McxConfigTblId.class)
public class McxConfigTbl implements java.io.Serializable {
	@Id
	@Column(name = "CATEGORY_ID", nullable = false, length = 100)
	private String categoryId;
	@Id
	@Column(name = "PROPNAME", nullable = false, length = 100)
	private String propName;

	@Column(name = "PROPVALUE", nullable = false, length = 100)
	private String propValue;

	@Column(name = "COMMENTS", nullable = false, length = 2000)
	private String comments;

	@Column(name = "DESCRIPTION", nullable = false, length = 2000)
	private String description;

	@Column(name = "CREATED_BY", nullable = false, length = 2000)
	private String createdBy;

	@Column(name = "CREATION_DATE", nullable = false, length = 200)
	private Date createdDate;

	@Column(name = "LAST_UPDATED_BY", nullable = false, length = 10)
	private Date lastUpdatedBy;

	@Column(name = "LAST_UPDATED_DATE", nullable = false, length = 10)
	private Date lastUpdatedDate;

	@Column(name = "OBJECT_STATUS", nullable = false, length = 10)
	private String status;

	@Column(name = "CATEGORY_DESCRIPTION", nullable = false, length = 10)
	private String catDescrp;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Date lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCatDescrp() {
		return catDescrp;
	}

	public void setCatDescrp(String catDescrp) {
		this.catDescrp = catDescrp;
	}

	public String getPropName() {
		return propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public String getPropValue() {
		return propValue;
	}

	public void setPropValue(String propValue) {
		this.propValue = propValue;
	}

}
