package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Btfilerecmap generated by hbm2java
 */
@Entity
@Table(name="BTFILERECMAP"
    ,schema="FCDBADMIN_RK"
    , uniqueConstraints = @UniqueConstraint(columnNames="EXTERNALREFNO") 
)
public class Btfilerecmap  implements java.io.Serializable {


     private BtfilerecmapId id;
     private String btfcatrefno;
     private String bulkgrpno;
     private String batchnumber;
     private String userrefno;
     private String idcustomer;
     private String refidentity;
     private String draccountno;
     private String drcodbranch;
     private String drcurrency;
     private String btbenename;
     private String beneid;
     private String beneacctno;
     private String benecodbranch;
     private String beneacctcurr;
     private BigDecimal btamount;
     private String btcurrency;
     private Date valuedate;
     private String btnarrative;
     private String btnarrative2;
     private Blob btnodedata;
     private Blob msg;
     private BigDecimal codstatus;
     private String rejectreason;
     private BigDecimal cancelstatus;
     private String hostrejreason;
     private String idtxn;
     private String txnidentifier;
     private String isInstrument;
     private String externalrefno;
     private String chequeno;
     private String chequefileno;
     private Integer chequeseqno;
     private String advicelinkno;
     private Date datsend;
     private Date postingdate;
     private String emailId;
     private String mobile;
     private BigDecimal serviceversion;

    public Btfilerecmap() {
    }

	
    public Btfilerecmap(BtfilerecmapId id) {
        this.id = id;
    }
    public Btfilerecmap(BtfilerecmapId id, String btfcatrefno, String bulkgrpno, String batchnumber, String userrefno, String idcustomer, String refidentity, String draccountno, String drcodbranch, String drcurrency, String btbenename, String beneid, String beneacctno, String benecodbranch, String beneacctcurr, BigDecimal btamount, String btcurrency, Date valuedate, String btnarrative, String btnarrative2, Blob btnodedata, Blob msg, BigDecimal codstatus, String rejectreason, BigDecimal cancelstatus, String hostrejreason, String idtxn, String txnidentifier, String isInstrument, String externalrefno, String chequeno, String chequefileno, Integer chequeseqno, String advicelinkno, Date datsend, Date postingdate, String emailId, String mobile, BigDecimal serviceversion) {
       this.id = id;
       this.btfcatrefno = btfcatrefno;
       this.bulkgrpno = bulkgrpno;
       this.batchnumber = batchnumber;
       this.userrefno = userrefno;
       this.idcustomer = idcustomer;
       this.refidentity = refidentity;
       this.draccountno = draccountno;
       this.drcodbranch = drcodbranch;
       this.drcurrency = drcurrency;
       this.btbenename = btbenename;
       this.beneid = beneid;
       this.beneacctno = beneacctno;
       this.benecodbranch = benecodbranch;
       this.beneacctcurr = beneacctcurr;
       this.btamount = btamount;
       this.btcurrency = btcurrency;
       this.valuedate = valuedate;
       this.btnarrative = btnarrative;
       this.btnarrative2 = btnarrative2;
       this.btnodedata = btnodedata;
       this.msg = msg;
       this.codstatus = codstatus;
       this.rejectreason = rejectreason;
       this.cancelstatus = cancelstatus;
       this.hostrejreason = hostrejreason;
       this.idtxn = idtxn;
       this.txnidentifier = txnidentifier;
       this.isInstrument = isInstrument;
       this.externalrefno = externalrefno;
       this.chequeno = chequeno;
       this.chequefileno = chequefileno;
       this.chequeseqno = chequeseqno;
       this.advicelinkno = advicelinkno;
       this.datsend = datsend;
       this.postingdate = postingdate;
       this.emailId = emailId;
       this.mobile = mobile;
       this.serviceversion = serviceversion;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="btrecrefno", column=@Column(name="BTRECREFNO", nullable=false, length=35) ), 
        @AttributeOverride(name="btfilerefno", column=@Column(name="BTFILEREFNO", nullable=false, length=35) ) } )
    public BtfilerecmapId getId() {
        return this.id;
    }
    
    public void setId(BtfilerecmapId id) {
        this.id = id;
    }

    
    @Column(name="BTFCATREFNO", length=15)
    public String getBtfcatrefno() {
        return this.btfcatrefno;
    }
    
    public void setBtfcatrefno(String btfcatrefno) {
        this.btfcatrefno = btfcatrefno;
    }

    
    @Column(name="BULKGRPNO", length=15)
    public String getBulkgrpno() {
        return this.bulkgrpno;
    }
    
    public void setBulkgrpno(String bulkgrpno) {
        this.bulkgrpno = bulkgrpno;
    }

    
    @Column(name="BATCHNUMBER", length=35)
    public String getBatchnumber() {
        return this.batchnumber;
    }
    
    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber;
    }

    
    @Column(name="USERREFNO", length=35)
    public String getUserrefno() {
        return this.userrefno;
    }
    
    public void setUserrefno(String userrefno) {
        this.userrefno = userrefno;
    }

    
    @Column(name="IDCUSTOMER", length=20)
    public String getIdcustomer() {
        return this.idcustomer;
    }
    
    public void setIdcustomer(String idcustomer) {
        this.idcustomer = idcustomer;
    }

    
    @Column(name="REFIDENTITY", length=5)
    public String getRefidentity() {
        return this.refidentity;
    }
    
    public void setRefidentity(String refidentity) {
        this.refidentity = refidentity;
    }

    
    @Column(name="DRACCOUNTNO", length=50)
    public String getDraccountno() {
        return this.draccountno;
    }
    
    public void setDraccountno(String draccountno) {
        this.draccountno = draccountno;
    }

    
    @Column(name="DRCODBRANCH", length=10)
    public String getDrcodbranch() {
        return this.drcodbranch;
    }
    
    public void setDrcodbranch(String drcodbranch) {
        this.drcodbranch = drcodbranch;
    }

    
    @Column(name="DRCURRENCY", length=3)
    public String getDrcurrency() {
        return this.drcurrency;
    }
    
    public void setDrcurrency(String drcurrency) {
        this.drcurrency = drcurrency;
    }

    
    @Column(name="BTBENENAME", length=500)
    public String getBtbenename() {
        return this.btbenename;
    }
    
    public void setBtbenename(String btbenename) {
        this.btbenename = btbenename;
    }

    
    @Column(name="BENEID")
    public String getBeneid() {
        return this.beneid;
    }
    
    public void setBeneid(String beneid) {
        this.beneid = beneid;
    }

    
    @Column(name="BENEACCTNO", length=50)
    public String getBeneacctno() {
        return this.beneacctno;
    }
    
    public void setBeneacctno(String beneacctno) {
        this.beneacctno = beneacctno;
    }

    
    @Column(name="BENECODBRANCH", length=10)
    public String getBenecodbranch() {
        return this.benecodbranch;
    }
    
    public void setBenecodbranch(String benecodbranch) {
        this.benecodbranch = benecodbranch;
    }

    
    @Column(name="BENEACCTCURR", length=3)
    public String getBeneacctcurr() {
        return this.beneacctcurr;
    }
    
    public void setBeneacctcurr(String beneacctcurr) {
        this.beneacctcurr = beneacctcurr;
    }

    
    @Column(name="BTAMOUNT", precision=22, scale=3)
    public BigDecimal getBtamount() {
        return this.btamount;
    }
    
    public void setBtamount(BigDecimal btamount) {
        this.btamount = btamount;
    }

    
    @Column(name="BTCURRENCY", length=3)
    public String getBtcurrency() {
        return this.btcurrency;
    }
    
    public void setBtcurrency(String btcurrency) {
        this.btcurrency = btcurrency;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="VALUEDATE", length=7)
    public Date getValuedate() {
        return this.valuedate;
    }
    
    public void setValuedate(Date valuedate) {
        this.valuedate = valuedate;
    }

    
    @Column(name="BTNARRATIVE", length=100)
    public String getBtnarrative() {
        return this.btnarrative;
    }
    
    public void setBtnarrative(String btnarrative) {
        this.btnarrative = btnarrative;
    }

    
    @Column(name="BTNARRATIVE2", length=100)
    public String getBtnarrative2() {
        return this.btnarrative2;
    }
    
    public void setBtnarrative2(String btnarrative2) {
        this.btnarrative2 = btnarrative2;
    }

    
    @Column(name="BTNODEDATA")
    public Blob getBtnodedata() {
        return this.btnodedata;
    }
    
    public void setBtnodedata(Blob btnodedata) {
        this.btnodedata = btnodedata;
    }

    
    @Column(name="MSG")
    public Blob getMsg() {
        return this.msg;
    }
    
    public void setMsg(Blob msg) {
        this.msg = msg;
    }

    
    @Column(name="CODSTATUS", precision=22, scale=0)
    public BigDecimal getCodstatus() {
        return this.codstatus;
    }
    
    public void setCodstatus(BigDecimal codstatus) {
        this.codstatus = codstatus;
    }

    
    @Column(name="REJECTREASON", length=2000)
    public String getRejectreason() {
        return this.rejectreason;
    }
    
    public void setRejectreason(String rejectreason) {
        this.rejectreason = rejectreason;
    }

    
    @Column(name="CANCELSTATUS", precision=22, scale=0)
    public BigDecimal getCancelstatus() {
        return this.cancelstatus;
    }
    
    public void setCancelstatus(BigDecimal cancelstatus) {
        this.cancelstatus = cancelstatus;
    }

    
    @Column(name="HOSTREJREASON", length=1000)
    public String getHostrejreason() {
        return this.hostrejreason;
    }
    
    public void setHostrejreason(String hostrejreason) {
        this.hostrejreason = hostrejreason;
    }

    
    @Column(name="IDTXN", length=3)
    public String getIdtxn() {
        return this.idtxn;
    }
    
    public void setIdtxn(String idtxn) {
        this.idtxn = idtxn;
    }

    
    @Column(name="TXNIDENTIFIER", length=3)
    public String getTxnidentifier() {
        return this.txnidentifier;
    }
    
    public void setTxnidentifier(String txnidentifier) {
        this.txnidentifier = txnidentifier;
    }

    
    @Column(name="IS_INSTRUMENT", length=1)
    public String getIsInstrument() {
        return this.isInstrument;
    }
    
    public void setIsInstrument(String isInstrument) {
        this.isInstrument = isInstrument;
    }

    
    @Column(name="EXTERNALREFNO", unique=true, length=16)
    public String getExternalrefno() {
        return this.externalrefno;
    }
    
    public void setExternalrefno(String externalrefno) {
        this.externalrefno = externalrefno;
    }

    
    @Column(name="CHEQUENO", length=50)
    public String getChequeno() {
        return this.chequeno;
    }
    
    public void setChequeno(String chequeno) {
        this.chequeno = chequeno;
    }

    
    @Column(name="CHEQUEFILENO", length=35)
    public String getChequefileno() {
        return this.chequefileno;
    }
    
    public void setChequefileno(String chequefileno) {
        this.chequefileno = chequefileno;
    }

    
    @Column(name="CHEQUESEQNO", precision=6, scale=0)
    public Integer getChequeseqno() {
        return this.chequeseqno;
    }
    
    public void setChequeseqno(Integer chequeseqno) {
        this.chequeseqno = chequeseqno;
    }

    
    @Column(name="ADVICELINKNO", length=50)
    public String getAdvicelinkno() {
        return this.advicelinkno;
    }
    
    public void setAdvicelinkno(String advicelinkno) {
        this.advicelinkno = advicelinkno;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATSEND", length=7)
    public Date getDatsend() {
        return this.datsend;
    }
    
    public void setDatsend(Date datsend) {
        this.datsend = datsend;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="POSTINGDATE", length=7)
    public Date getPostingdate() {
        return this.postingdate;
    }
    
    public void setPostingdate(Date postingdate) {
        this.postingdate = postingdate;
    }

    
    @Column(name="EMAIL_ID", length=4000)
    public String getEmailId() {
        return this.emailId;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    
    @Column(name="MOBILE", length=50)
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
    @Column(name="SERVICEVERSION", precision=22, scale=0)
    public BigDecimal getServiceversion() {
        return this.serviceversion;
    }
    
    public void setServiceversion(BigDecimal serviceversion) {
        this.serviceversion = serviceversion;
    }




}


