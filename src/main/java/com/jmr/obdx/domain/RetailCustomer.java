package com.jmr.obdx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/***
 * @author JMR
 */
@Entity
@Table(name = "RETAIL_CUSTOMER", schema = "JMR_OBDX")
public class RetailCustomer implements java.io.Serializable {

	private long iduser;
	private Login login;
	private long id;
	private String isprimery;
	private String typecustomer;
	private String refIdEntity;
	private String customername;
    private String idcusomer;


	public RetailCustomer() {
	}

	public RetailCustomer(Login login, long id) {
		this.login = login;
		this.id = id;
	}

	public RetailCustomer(Login login, long id, String isprimery, String typecustomer, String refIdEntity,
			String customername) {
		this.login = login;
		this.id = id;
		this.isprimery = isprimery;
		this.typecustomer = typecustomer;
		this.refIdEntity = refIdEntity;
		this.customername = customername;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "login"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "IDUSER", unique = true, nullable = false, precision = 10, scale = 0)
	public long getIduser() {
		return this.iduser;
	}

	public void setIduser(long iduser) {
		this.iduser = iduser;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Column(name = "ID", nullable = false, precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "ISPRIMERY", length = 1)
	public String getIsprimery() {
		return this.isprimery;
	}

	public void setIsprimery(String isprimery) {
		this.isprimery = isprimery;
	}

	@Column(name = "TYPECUSTOMER", length = 3)
	public String getTypecustomer() {
		return this.typecustomer;
	}

	public void setTypecustomer(String typecustomer) {
		this.typecustomer = typecustomer;
	}

	@Column(name = "REF_ID_ENTITY", length = 4)
	public String getRefIdEntity() {
		return this.refIdEntity;
	}

	public void setRefIdEntity(String refIdEntity) {
		this.refIdEntity = refIdEntity;
	}

	@Column(name = "CUSTOMERNAME", length = 800)
	public String getCustomername() {
		return this.customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	
	@Column(name="IDCUSOMER", length=50)
    public String getIdcusomer() {
        return this.idcusomer;
    }
    
    public void setIdcusomer(String idcusomer) {
        this.idcusomer = idcusomer;
    }

}
