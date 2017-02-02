package com.jmr.obdx.domain;
// Generated Jan 20, 2017 4:40:05 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

<<<<<<< HEAD
/***
 * @author JMR
=======
/**
 * Login generated by hbm2java
>>>>>>> refs/heads/TransicationDetails
 */
@Entity
@Table(name="LOGIN"
    ,schema="JMR_OBDX"
    , uniqueConstraints = @UniqueConstraint(columnNames="USERNAME") 
)
public class Login  implements java.io.Serializable {

<<<<<<< HEAD
	private long id;
	private AuthorityM authorityM;
	private String username;
	private String password;
	private String isactive;
	private String accountnonexpired;
	private String credentialsnonexpired;
	private String accountnonlocked;

	public Login(long id) {
		this.id=id;
	}
=======
>>>>>>> refs/heads/TransicationDetails

<<<<<<< HEAD
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
=======
     private long id;
     private AuthorityM authorityM;
     private String username;
     private String password;
     private String isactive;
     private String accountnonexpired;
     private String credentialsnonexpired;
     private String accountnonlocked;
     private Long loginCount;

    public Login() {
    }
>>>>>>> refs/heads/TransicationDetails

<<<<<<< HEAD
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
=======
	
    public Login(long id, AuthorityM authorityM, String username, String password, String isactive, String accountnonexpired, String credentialsnonexpired, String accountnonlocked) {
        this.id = id;
        this.authorityM = authorityM;
        this.username = username;
        this.password = password;
        this.isactive = isactive;
        this.accountnonexpired = accountnonexpired;
        this.credentialsnonexpired = credentialsnonexpired;
        this.accountnonlocked = accountnonlocked;
    }
    public Login(long id, AuthorityM authorityM, String username, String password, String isactive, String accountnonexpired, String credentialsnonexpired, String accountnonlocked, Long loginCount) {
       this.id = id;
       this.authorityM = authorityM;
       this.username = username;
       this.password = password;
       this.isactive = isactive;
       this.accountnonexpired = accountnonexpired;
       this.credentialsnonexpired = credentialsnonexpired;
       this.accountnonlocked = accountnonlocked;
       this.loginCount = loginCount;
    }
   
     @Id 
>>>>>>> refs/heads/TransicationDetails

    
    @Column(name="ID", unique=true, nullable=false, precision=10, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

<<<<<<< HEAD
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "AUTHORITY_REF_ID", nullable = false)
	public AuthorityM getAuthorityM() {
		return this.authorityM;
	}
=======
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="AUTHORITY_REF_ID", nullable=false)
    public AuthorityM getAuthorityM() {
        return this.authorityM;
    }
    
    public void setAuthorityM(AuthorityM authorityM) {
        this.authorityM = authorityM;
    }
>>>>>>> refs/heads/TransicationDetails

    
    @Column(name="USERNAME", unique=true, nullable=false, length=100)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="PASSWORD", nullable=false, length=500)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="ISACTIVE", nullable=false, length=10)
    public String getIsactive() {
        return this.isactive;
    }
    
    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    
    @Column(name="ACCOUNTNONEXPIRED", nullable=false, length=10)
    public String getAccountnonexpired() {
        return this.accountnonexpired;
    }
    
    public void setAccountnonexpired(String accountnonexpired) {
        this.accountnonexpired = accountnonexpired;
    }

    
    @Column(name="CREDENTIALSNONEXPIRED", nullable=false, length=10)
    public String getCredentialsnonexpired() {
        return this.credentialsnonexpired;
    }
    
    public void setCredentialsnonexpired(String credentialsnonexpired) {
        this.credentialsnonexpired = credentialsnonexpired;
    }

<<<<<<< HEAD
	@Column(name = "ISACTIVE", nullable = false, length = 10)
	public String getIsactive() {
		return this.isactive;
	}
=======
    
    @Column(name="ACCOUNTNONLOCKED", nullable=false, length=10)
    public String getAccountnonlocked() {
        return this.accountnonlocked;
    }
    
    public void setAccountnonlocked(String accountnonlocked) {
        this.accountnonlocked = accountnonlocked;
    }
>>>>>>> refs/heads/TransicationDetails

<<<<<<< HEAD
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
=======
    
    @Column(name="LOGIN_COUNT", precision=10, scale=0)
    public Long getLoginCount() {
        return this.loginCount;
    }
    
    public void setLoginCount(Long loginCount) {
        this.loginCount = loginCount;
    }
>>>>>>> refs/heads/TransicationDetails

<<<<<<< HEAD
	@Column(name = "ACCOUNTNONEXPIRED", nullable = false, length = 10)
	public String getAccountnonexpired() {
		return this.accountnonexpired;
	}
=======
>>>>>>> refs/heads/TransicationDetails

<<<<<<< HEAD
	public void setAccountnonexpired(String accountnonexpired) {
		this.accountnonexpired = accountnonexpired;
	}
=======
>>>>>>> refs/heads/TransicationDetails

<<<<<<< HEAD
	@Column(name = "CREDENTIALSNONEXPIRED", nullable = false, length = 10)
	public String getCredentialsnonexpired() {
		return this.credentialsnonexpired;
	}
=======
>>>>>>> refs/heads/TransicationDetails

<<<<<<< HEAD
	public void setCredentialsnonexpired(String credentialsnonexpired) {
		this.credentialsnonexpired = credentialsnonexpired;
	}
=======
}
>>>>>>> refs/heads/TransicationDetails

<<<<<<< HEAD
	@Column(name = "ACCOUNTNONLOCKED", nullable = false, length = 10)
	public String getAccountnonlocked() {
		return this.accountnonlocked;
	}
=======
>>>>>>> refs/heads/TransicationDetails

<<<<<<< HEAD
	public void setAccountnonlocked(String accountnonlocked) {
		this.accountnonlocked = accountnonlocked;
	}

}
=======
>>>>>>> refs/heads/TransicationDetails
