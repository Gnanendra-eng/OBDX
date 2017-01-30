package com.jmr.obdx.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/***
 * @author JMR
 */

@Entity
@Table(name="USER_SESSION",schema="JMR_OBDX")
public class UserSession  implements java.io.Serializable {


     private long id;
     private String idsession;
     private Date creationdate;
     private Date lastaccessdate;
     private String idapp;
     private String iddevice;
     private String idlang;
     private String remoteaddress;
     private String webserverid;
     private String appserverid;
     private Boolean validflag;
     private String hostprifix;
     private String usertype;
     private String token;
	 private String perscss;
     private String idcust;
     private Integer timeout;
     private Short seqnbr;
     private String usergroupbasetype;
     private String usergrouptype;
     private String proxyid;
     private String sessionkey;
     private String identity;
     private String username;
     private String baseusertype;
     private String refpathui;
     private String flginternaltype;
     private String iduserbehalf;
     private String iddevicebehalf;
     private String usertypebehalf;
     private String identitybehalf;
     private String idchanneluserbehalf;
     private String refpathuibehalf;
     private String jsessionid;
     private String isavcrequired;
     private String isfcprequired;
     private String refIdEntity;
     private String istxnfcprequired;
     private String timezone;
     private String idrequest;
     private String token1;
     private String token2;
     private String token3;
     private String idwizard;
     private String primCustEntity;
     private String tgtappsessionid;
     private String tgtappjsessionid;
     private Integer activetimeout;
     private String idgroup;
     private String isfcurequired;
     private String flagforcechangeuid;
     private String isloggingenabled;
     private String istncrequired;
     private String dashboardid;
     private Long iduser;


    public UserSession() {
    }

	
    public UserSession(long id) {
        this.id = id;
    }
    public UserSession(long id, String idsession, Date creationdate, Date lastaccessdate, String idapp, String iddevice, 
    		String idlang, String remoteaddress, String webserverid, String appserverid, Boolean validflag, String hostprifix, 
    		String usertype, String token, String perscss, String idcust, Integer timeout, Short seqnbr, String usergroupbasetype, 
    		String usergrouptype, String proxyid, String sessionkey, String identity, String username, String baseusertype, String refpathui, String flginternaltype,
    		String iduserbehalf, String iddevicebehalf, String usertypebehalf, String identitybehalf, String idchanneluserbehalf, String refpathuibehalf, String jsessionid, String isavcrequired, String isfcprequired, String refIdEntity, String istxnfcprequired, String timezone, String idrequest, String token1, String token2, String token3, String idwizard, String primCustEntity, String tgtappsessionid, String tgtappjsessionid, Integer activetimeout, String idgroup, String isfcurequired, String flagforcechangeuid, String isloggingenabled, String istncrequired, String dashboardid) {
       this.id = id;
       this.idsession = idsession;
       this.creationdate = creationdate;
       this.lastaccessdate = lastaccessdate;
       this.idapp = idapp;
       this.iddevice = iddevice;
       this.idlang = idlang;
       this.remoteaddress = remoteaddress;
       this.webserverid = webserverid;
       this.appserverid = appserverid;
       this.validflag = validflag;
       this.hostprifix = hostprifix;
       this.usertype = usertype;
       this.token = token;
       this.perscss = perscss;
       this.idcust = idcust;
       this.timeout = timeout;
       this.seqnbr = seqnbr;
       this.usergroupbasetype = usergroupbasetype;
       this.usergrouptype = usergrouptype;
       this.proxyid = proxyid;
       this.sessionkey = sessionkey;
       this.identity = identity;
       this.username = username;
       this.baseusertype = baseusertype;
       this.refpathui = refpathui;
       this.flginternaltype = flginternaltype;
       this.iduserbehalf = iduserbehalf;
       this.iddevicebehalf = iddevicebehalf;
       this.usertypebehalf = usertypebehalf;
       this.identitybehalf = identitybehalf;
       this.idchanneluserbehalf = idchanneluserbehalf;
       this.refpathuibehalf = refpathuibehalf;
       this.jsessionid = jsessionid;
       this.isavcrequired = isavcrequired;
       this.isfcprequired = isfcprequired;
       this.refIdEntity = refIdEntity;
       this.istxnfcprequired = istxnfcprequired;
       this.timezone = timezone;
       this.idrequest = idrequest;
       this.token1 = token1;
       this.token2 = token2;
       this.token3 = token3;
       this.idwizard = idwizard;
       this.primCustEntity = primCustEntity;
       this.tgtappsessionid = tgtappsessionid;
       this.tgtappjsessionid = tgtappjsessionid;
       this.activetimeout = activetimeout;
       this.idgroup = idgroup;
       this.isfcurequired = isfcurequired;
       this.flagforcechangeuid = flagforcechangeuid;
       this.isloggingenabled = isloggingenabled;
       this.istncrequired = istncrequired;
       this.dashboardid = dashboardid;
    }
   
    
	public UserSession(String idsession, Date creationdate, Date lastaccessdate,Long iduser,
			String remoteaddress,String jsessionid,String hostprifix,String username,String timezone,String idlang,String usertype,Integer timeout,Integer activetimeout,Boolean validflag) {
		this.idsession = idsession;
		this.creationdate = creationdate;
		this.lastaccessdate = lastaccessdate;
		this.iduser=iduser;
		this.remoteaddress=remoteaddress;
		this.jsessionid=jsessionid;
		this.hostprifix=hostprifix;
		this.username=username;
		this.timezone=timezone;
		this.idlang=idlang;
		this.usertype=usertype;
		this.timeout=timeout;
		this.activetimeout=activetimeout;
		this.validflag=validflag;
	}

    @Id 
    @Column(name="ID", unique=true, nullable=false, precision=10, scale=0)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    
    @Column(name="IDSESSION", length=50)
    public String getIdsession() {
        return this.idsession;
    }
    
    public void setIdsession(String idsession) {
        this.idsession = idsession;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATIONDATE", length=7)
    public Date getCreationdate() {
        return this.creationdate;
    }
    
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LASTACCESSDATE", length=7)
    public Date getLastaccessdate() {
        return this.lastaccessdate;
    }
    
    public void setLastaccessdate(Date lastaccessdate) {
        this.lastaccessdate = lastaccessdate;
    }

    
    @Column(name="IDAPP", length=10)
    public String getIdapp() {
        return this.idapp;
    }
    
    public void setIdapp(String idapp) {
        this.idapp = idapp;
    }

    
    @Column(name="IDDEVICE", length=10)
    public String getIddevice() {
        return this.iddevice;
    }
    
    public void setIddevice(String iddevice) {
        this.iddevice = iddevice;
    }

    
    @Column(name="IDLANG", length=10)
    public String getIdlang() {
        return this.idlang;
    }
    
    public void setIdlang(String idlang) {
        this.idlang = idlang;
    }

    
    @Column(name="REMOTEADDRESS", length=50)
    public String getRemoteaddress() {
        return this.remoteaddress;
    }
    
    public void setRemoteaddress(String remoteaddress) {
        this.remoteaddress = remoteaddress;
    }

    
    @Column(name="WEBSERVERID", length=10)
    public String getWebserverid() {
        return this.webserverid;
    }
    
    public void setWebserverid(String webserverid) {
        this.webserverid = webserverid;
    }

    
    @Column(name="APPSERVERID", length=10)
    public String getAppserverid() {
        return this.appserverid;
    }
    
    public void setAppserverid(String appserverid) {
        this.appserverid = appserverid;
    }

    
    @Column(name="VALIDFLAG", precision=1, scale=0)
    public Boolean getValidflag() {
        return this.validflag;
    }
    
    public void setValidflag(Boolean validflag) {
        this.validflag = validflag;
    }

    
    @Column(name="HOSTPRIFIX", length=100)
    public String getHostprifix() {
        return this.hostprifix;
    }
    
    public void setHostprifix(String hostprifix) {
        this.hostprifix = hostprifix;
    }

    
    @Column(name="USERTYPE", length=10)
    public String getUsertype() {
        return this.usertype;
    }
    
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    
    @Column(name="TOKEN", length=2500)
    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }

    
    @Column(name="PERSCSS", length=20)
    public String getPerscss() {
        return this.perscss;
    }
    
    public void setPerscss(String perscss) {
        this.perscss = perscss;
    }

    
    @Column(name="IDCUST", length=620)
    public String getIdcust() {
        return this.idcust;
    }
    
    public void setIdcust(String idcust) {
        this.idcust = idcust;
    }

    
    @Column(name="TIMEOUT", precision=8, scale=0)
    public Integer getTimeout() {
        return this.timeout;
    }
    
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    
    @Column(name="SEQNBR", precision=4, scale=0)
    public Short getSeqnbr() {
        return this.seqnbr;
    }
    
    public void setSeqnbr(Short seqnbr) {
        this.seqnbr = seqnbr;
    }

    
    @Column(name="USERGROUPBASETYPE", length=5)
    public String getUsergroupbasetype() {
        return this.usergroupbasetype;
    }
    
    public void setUsergroupbasetype(String usergroupbasetype) {
        this.usergroupbasetype = usergroupbasetype;
    }

    
    @Column(name="USERGROUPTYPE", length=5)
    public String getUsergrouptype() {
        return this.usergrouptype;
    }
    
    public void setUsergrouptype(String usergrouptype) {
        this.usergrouptype = usergrouptype;
    }

    
    @Column(name="PROXYID", length=20)
    public String getProxyid() {
        return this.proxyid;
    }
    
    public void setProxyid(String proxyid) {
        this.proxyid = proxyid;
    }

    
    @Column(name="SESSIONKEY", length=4000)
    public String getSessionkey() {
        return this.sessionkey;
    }
    
    public void setSessionkey(String sessionkey) {
        this.sessionkey = sessionkey;
    }

    
    @Column(name="IDENTITY", length=5)
    public String getIdentity() {
        return this.identity;
    }
    
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    


    
    @Column(name="BASEUSERTYPE", length=5)
    public String getBaseusertype() {
        return this.baseusertype;
    }
    
    public void setBaseusertype(String baseusertype) {
        this.baseusertype = baseusertype;
    }

    
    @Column(name="REFPATHUI", length=225)
    public String getRefpathui() {
        return this.refpathui;
    }
    
    public void setRefpathui(String refpathui) {
        this.refpathui = refpathui;
    }

    
    @Column(name="FLGINTERNALTYPE", length=5)
    public String getFlginternaltype() {
        return this.flginternaltype;
    }
    
    public void setFlginternaltype(String flginternaltype) {
        this.flginternaltype = flginternaltype;
    }

    
    @Column(name="IDUSERBEHALF", length=20)
    public String getIduserbehalf() {
        return this.iduserbehalf;
    }
    
    public void setIduserbehalf(String iduserbehalf) {
        this.iduserbehalf = iduserbehalf;
    }

    
    @Column(name="IDDEVICEBEHALF", length=5)
    public String getIddevicebehalf() {
        return this.iddevicebehalf;
    }
    
    public void setIddevicebehalf(String iddevicebehalf) {
        this.iddevicebehalf = iddevicebehalf;
    }

    
    @Column(name="USERTYPEBEHALF", length=10)
    public String getUsertypebehalf() {
        return this.usertypebehalf;
    }
    
    public void setUsertypebehalf(String usertypebehalf) {
        this.usertypebehalf = usertypebehalf;
    }

    
    @Column(name="IDENTITYBEHALF", length=10)
    public String getIdentitybehalf() {
        return this.identitybehalf;
    }
    
    public void setIdentitybehalf(String identitybehalf) {
        this.identitybehalf = identitybehalf;
    }

    
    @Column(name="IDCHANNELUSERBEHALF", length=10)
    public String getIdchanneluserbehalf() {
        return this.idchanneluserbehalf;
    }
    
    public void setIdchanneluserbehalf(String idchanneluserbehalf) {
        this.idchanneluserbehalf = idchanneluserbehalf;
    }

    
    @Column(name="REFPATHUIBEHALF", length=225)
    public String getRefpathuibehalf() {
        return this.refpathuibehalf;
    }
    
    public void setRefpathuibehalf(String refpathuibehalf) {
        this.refpathuibehalf = refpathuibehalf;
    }

    
    @Column(name="JSESSIONID", length=100)
    public String getJsessionid() {
        return this.jsessionid;
    }
    
    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }

    
    @Column(name="ISAVCREQUIRED", length=5)
    public String getIsavcrequired() {
        return this.isavcrequired;
    }
    
    public void setIsavcrequired(String isavcrequired) {
        this.isavcrequired = isavcrequired;
    }

    
    @Column(name="ISFCPREQUIRED", length=5)
    public String getIsfcprequired() {
        return this.isfcprequired;
    }
    
    public void setIsfcprequired(String isfcprequired) {
        this.isfcprequired = isfcprequired;
    }

    
    @Column(name="REF_ID_ENTITY", length=10)
    public String getRefIdEntity() {
        return this.refIdEntity;
    }
    
    public void setRefIdEntity(String refIdEntity) {
        this.refIdEntity = refIdEntity;
    }

    
    @Column(name="ISTXNFCPREQUIRED", length=5)
    public String getIstxnfcprequired() {
        return this.istxnfcprequired;
    }
    
    public void setIstxnfcprequired(String istxnfcprequired) {
        this.istxnfcprequired = istxnfcprequired;
    }

    
    @Column(name="TIMEZONE", length=100)
    public String getTimezone() {
        return this.timezone;
    }
    
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    
    @Column(name="IDREQUEST", length=10)
    public String getIdrequest() {
        return this.idrequest;
    }
    
    public void setIdrequest(String idrequest) {
        this.idrequest = idrequest;
    }

    
    @Column(name="TOKEN1", length=20)
    public String getToken1() {
        return this.token1;
    }
    
    public void setToken1(String token1) {
        this.token1 = token1;
    }

    
    @Column(name="TOKEN2", length=20)
    public String getToken2() {
        return this.token2;
    }
    
    public void setToken2(String token2) {
        this.token2 = token2;
    }

    
    @Column(name="TOKEN3", length=20)
    public String getToken3() {
        return this.token3;
    }
    
    public void setToken3(String token3) {
        this.token3 = token3;
    }

    
    @Column(name="IDWIZARD", length=20)
    public String getIdwizard() {
        return this.idwizard;
    }
    
    public void setIdwizard(String idwizard) {
        this.idwizard = idwizard;
    }

    
    @Column(name="PRIM_CUST_ENTITY", length=10)
    public String getPrimCustEntity() {
        return this.primCustEntity;
    }
    
    public void setPrimCustEntity(String primCustEntity) {
        this.primCustEntity = primCustEntity;
    }

    
    @Column(name="TGTAPPSESSIONID", length=50)
    public String getTgtappsessionid() {
        return this.tgtappsessionid;
    }
    
    public void setTgtappsessionid(String tgtappsessionid) {
        this.tgtappsessionid = tgtappsessionid;
    }

    
    @Column(name="TGTAPPJSESSIONID", length=100)
    public String getTgtappjsessionid() {
        return this.tgtappjsessionid;
    }
    
    public void setTgtappjsessionid(String tgtappjsessionid) {
        this.tgtappjsessionid = tgtappjsessionid;
    }

    
    @Column(name="ACTIVETIMEOUT", precision=8, scale=0)
    public Integer getActivetimeout() {
        return this.activetimeout;
    }
    
    public void setActivetimeout(Integer activetimeout) {
        this.activetimeout = activetimeout;
    }

    
    @Column(name="IDGROUP", length=25)
    public String getIdgroup() {
        return this.idgroup;
    }
    
    public void setIdgroup(String idgroup) {
        this.idgroup = idgroup;
    }

    
    @Column(name="ISFCUREQUIRED", length=5)
    public String getIsfcurequired() {
        return this.isfcurequired;
    }
    
    public void setIsfcurequired(String isfcurequired) {
        this.isfcurequired = isfcurequired;
    }

    
    @Column(name="FLAGFORCECHANGEUID", length=5)
    public String getFlagforcechangeuid() {
        return this.flagforcechangeuid;
    }
    
    public void setFlagforcechangeuid(String flagforcechangeuid) {
        this.flagforcechangeuid = flagforcechangeuid;
    }

    
    @Column(name="ISLOGGINGENABLED", length=5)
    public String getIsloggingenabled() {
        return this.isloggingenabled;
    }
    
    public void setIsloggingenabled(String isloggingenabled) {
        this.isloggingenabled = isloggingenabled;
    }

    
    @Column(name="ISTNCREQUIRED", length=5)
    public String getIstncrequired() {
        return this.istncrequired;
    }
    
    public void setIstncrequired(String istncrequired) {
        this.istncrequired = istncrequired;
    }

    
    @Column(name="DASHBOARDID", length=5)
    public String getDashboardid() {
        return this.dashboardid;
    }
    
    public void setDashboardid(String dashboardid) {
        this.dashboardid = dashboardid;
    }
    
    
    @Column(name="IDUSER", precision=10, scale=0)
    public Long getIduser() {
        return this.iduser;
    }
    
    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }
    
    @Column(name="USERNAME", length=225)
    public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


}
