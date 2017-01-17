package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Txntdacctmast generated by hbm2java
 */
@Entity
@Table(name="TXNTDACCTMAST"
    ,schema="FCDBADMIN_RK"
)
public class Txntdacctmast  implements java.io.Serializable {


     private String idfcatref;
     private String iduserreference;
     private String codproduct;
     private String acctdesc;
     private String idcorporate;
     private Character jointacctinidcator;
     private String idcorporate1;
     private String idcorporate2;
     private String idlocation;
     private String codbranch;
     private String tdaccountno;
     private String idsrcaccount;
     private String codsrcbranch;
     private BigDecimal txnamount;
     private String codtxncurr;
     private Date datmaturity;
     private String codintinstr;
     private String codintaccount;
     private String codintbranch;
     private String codmattype;
     private String matintrolloveraccno;
     private String matintrolloverbranch;
     private String matintrolloveramount;
     private String codstatus;
     private Date datsend;
     private String txtreason;
     private String txthostref;
     private BigDecimal numstatebit;
     private Date datlastupdated;
     private Date dathostaction;
     private Date datvalue;
     private Date dtime;
     private BigDecimal slno;
     private Short rollovercount;
     private String rejectreason;
     private String redemtype;
     private BigDecimal redemamt;
     private String redemaccount;
     private String redembranch;
     private String redemcurr;

    public Txntdacctmast() {
    }

	
    public Txntdacctmast(String idfcatref) {
        this.idfcatref = idfcatref;
    }
    public Txntdacctmast(String idfcatref, String iduserreference, String codproduct, String acctdesc, String idcorporate, Character jointacctinidcator, String idcorporate1, String idcorporate2, String idlocation, String codbranch, String tdaccountno, String idsrcaccount, String codsrcbranch, BigDecimal txnamount, String codtxncurr, Date datmaturity, String codintinstr, String codintaccount, String codintbranch, String codmattype, String matintrolloveraccno, String matintrolloverbranch, String matintrolloveramount, String codstatus, Date datsend, String txtreason, String txthostref, BigDecimal numstatebit, Date datlastupdated, Date dathostaction, Date datvalue, Date dtime, BigDecimal slno, Short rollovercount, String rejectreason, String redemtype, BigDecimal redemamt, String redemaccount, String redembranch, String redemcurr) {
       this.idfcatref = idfcatref;
       this.iduserreference = iduserreference;
       this.codproduct = codproduct;
       this.acctdesc = acctdesc;
       this.idcorporate = idcorporate;
       this.jointacctinidcator = jointacctinidcator;
       this.idcorporate1 = idcorporate1;
       this.idcorporate2 = idcorporate2;
       this.idlocation = idlocation;
       this.codbranch = codbranch;
       this.tdaccountno = tdaccountno;
       this.idsrcaccount = idsrcaccount;
       this.codsrcbranch = codsrcbranch;
       this.txnamount = txnamount;
       this.codtxncurr = codtxncurr;
       this.datmaturity = datmaturity;
       this.codintinstr = codintinstr;
       this.codintaccount = codintaccount;
       this.codintbranch = codintbranch;
       this.codmattype = codmattype;
       this.matintrolloveraccno = matintrolloveraccno;
       this.matintrolloverbranch = matintrolloverbranch;
       this.matintrolloveramount = matintrolloveramount;
       this.codstatus = codstatus;
       this.datsend = datsend;
       this.txtreason = txtreason;
       this.txthostref = txthostref;
       this.numstatebit = numstatebit;
       this.datlastupdated = datlastupdated;
       this.dathostaction = dathostaction;
       this.datvalue = datvalue;
       this.dtime = dtime;
       this.slno = slno;
       this.rollovercount = rollovercount;
       this.rejectreason = rejectreason;
       this.redemtype = redemtype;
       this.redemamt = redemamt;
       this.redemaccount = redemaccount;
       this.redembranch = redembranch;
       this.redemcurr = redemcurr;
    }
   
     @Id 

    
    @Column(name="IDFCATREF", unique=true, nullable=false, length=20)
    public String getIdfcatref() {
        return this.idfcatref;
    }
    
    public void setIdfcatref(String idfcatref) {
        this.idfcatref = idfcatref;
    }

    
    @Column(name="IDUSERREFERENCE", length=20)
    public String getIduserreference() {
        return this.iduserreference;
    }
    
    public void setIduserreference(String iduserreference) {
        this.iduserreference = iduserreference;
    }

    
    @Column(name="CODPRODUCT", length=20)
    public String getCodproduct() {
        return this.codproduct;
    }
    
    public void setCodproduct(String codproduct) {
        this.codproduct = codproduct;
    }

    
    @Column(name="ACCTDESC")
    public String getAcctdesc() {
        return this.acctdesc;
    }
    
    public void setAcctdesc(String acctdesc) {
        this.acctdesc = acctdesc;
    }

    
    @Column(name="IDCORPORATE", length=20)
    public String getIdcorporate() {
        return this.idcorporate;
    }
    
    public void setIdcorporate(String idcorporate) {
        this.idcorporate = idcorporate;
    }

    
    @Column(name="JOINTACCTINIDCATOR", length=1)
    public Character getJointacctinidcator() {
        return this.jointacctinidcator;
    }
    
    public void setJointacctinidcator(Character jointacctinidcator) {
        this.jointacctinidcator = jointacctinidcator;
    }

    
    @Column(name="IDCORPORATE1", length=20)
    public String getIdcorporate1() {
        return this.idcorporate1;
    }
    
    public void setIdcorporate1(String idcorporate1) {
        this.idcorporate1 = idcorporate1;
    }

    
    @Column(name="IDCORPORATE2", length=20)
    public String getIdcorporate2() {
        return this.idcorporate2;
    }
    
    public void setIdcorporate2(String idcorporate2) {
        this.idcorporate2 = idcorporate2;
    }

    
    @Column(name="IDLOCATION", length=20)
    public String getIdlocation() {
        return this.idlocation;
    }
    
    public void setIdlocation(String idlocation) {
        this.idlocation = idlocation;
    }

    
    @Column(name="CODBRANCH", length=5)
    public String getCodbranch() {
        return this.codbranch;
    }
    
    public void setCodbranch(String codbranch) {
        this.codbranch = codbranch;
    }

    
    @Column(name="TDACCOUNTNO", length=20)
    public String getTdaccountno() {
        return this.tdaccountno;
    }
    
    public void setTdaccountno(String tdaccountno) {
        this.tdaccountno = tdaccountno;
    }

    
    @Column(name="IDSRCACCOUNT", length=20)
    public String getIdsrcaccount() {
        return this.idsrcaccount;
    }
    
    public void setIdsrcaccount(String idsrcaccount) {
        this.idsrcaccount = idsrcaccount;
    }

    
    @Column(name="CODSRCBRANCH", length=5)
    public String getCodsrcbranch() {
        return this.codsrcbranch;
    }
    
    public void setCodsrcbranch(String codsrcbranch) {
        this.codsrcbranch = codsrcbranch;
    }

    
    @Column(name="TXNAMOUNT", scale=4)
    public BigDecimal getTxnamount() {
        return this.txnamount;
    }
    
    public void setTxnamount(BigDecimal txnamount) {
        this.txnamount = txnamount;
    }

    
    @Column(name="CODTXNCURR", length=3)
    public String getCodtxncurr() {
        return this.codtxncurr;
    }
    
    public void setCodtxncurr(String codtxncurr) {
        this.codtxncurr = codtxncurr;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATMATURITY", length=7)
    public Date getDatmaturity() {
        return this.datmaturity;
    }
    
    public void setDatmaturity(Date datmaturity) {
        this.datmaturity = datmaturity;
    }

    
    @Column(name="CODINTINSTR", length=25)
    public String getCodintinstr() {
        return this.codintinstr;
    }
    
    public void setCodintinstr(String codintinstr) {
        this.codintinstr = codintinstr;
    }

    
    @Column(name="CODINTACCOUNT", length=25)
    public String getCodintaccount() {
        return this.codintaccount;
    }
    
    public void setCodintaccount(String codintaccount) {
        this.codintaccount = codintaccount;
    }

    
    @Column(name="CODINTBRANCH", length=25)
    public String getCodintbranch() {
        return this.codintbranch;
    }
    
    public void setCodintbranch(String codintbranch) {
        this.codintbranch = codintbranch;
    }

    
    @Column(name="CODMATTYPE", length=3)
    public String getCodmattype() {
        return this.codmattype;
    }
    
    public void setCodmattype(String codmattype) {
        this.codmattype = codmattype;
    }

    
    @Column(name="MATINTROLLOVERACCNO", length=25)
    public String getMatintrolloveraccno() {
        return this.matintrolloveraccno;
    }
    
    public void setMatintrolloveraccno(String matintrolloveraccno) {
        this.matintrolloveraccno = matintrolloveraccno;
    }

    
    @Column(name="MATINTROLLOVERBRANCH", length=25)
    public String getMatintrolloverbranch() {
        return this.matintrolloverbranch;
    }
    
    public void setMatintrolloverbranch(String matintrolloverbranch) {
        this.matintrolloverbranch = matintrolloverbranch;
    }

    
    @Column(name="MATINTROLLOVERAMOUNT", length=25)
    public String getMatintrolloveramount() {
        return this.matintrolloveramount;
    }
    
    public void setMatintrolloveramount(String matintrolloveramount) {
        this.matintrolloveramount = matintrolloveramount;
    }

    
    @Column(name="CODSTATUS", length=3)
    public String getCodstatus() {
        return this.codstatus;
    }
    
    public void setCodstatus(String codstatus) {
        this.codstatus = codstatus;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATSEND", length=7)
    public Date getDatsend() {
        return this.datsend;
    }
    
    public void setDatsend(Date datsend) {
        this.datsend = datsend;
    }

    
    @Column(name="TXTREASON")
    public String getTxtreason() {
        return this.txtreason;
    }
    
    public void setTxtreason(String txtreason) {
        this.txtreason = txtreason;
    }

    
    @Column(name="TXTHOSTREF", length=20)
    public String getTxthostref() {
        return this.txthostref;
    }
    
    public void setTxthostref(String txthostref) {
        this.txthostref = txthostref;
    }

    
    @Column(name="NUMSTATEBIT", precision=22, scale=0)
    public BigDecimal getNumstatebit() {
        return this.numstatebit;
    }
    
    public void setNumstatebit(BigDecimal numstatebit) {
        this.numstatebit = numstatebit;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATLASTUPDATED", length=7)
    public Date getDatlastupdated() {
        return this.datlastupdated;
    }
    
    public void setDatlastupdated(Date datlastupdated) {
        this.datlastupdated = datlastupdated;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATHOSTACTION", length=7)
    public Date getDathostaction() {
        return this.dathostaction;
    }
    
    public void setDathostaction(Date dathostaction) {
        this.dathostaction = dathostaction;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATVALUE", length=7)
    public Date getDatvalue() {
        return this.datvalue;
    }
    
    public void setDatvalue(Date datvalue) {
        this.datvalue = datvalue;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DTIME", length=7)
    public Date getDtime() {
        return this.dtime;
    }
    
    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    
    @Column(name="SLNO", precision=38, scale=0)
    public BigDecimal getSlno() {
        return this.slno;
    }
    
    public void setSlno(BigDecimal slno) {
        this.slno = slno;
    }

    
    @Column(name="ROLLOVERCOUNT", precision=4, scale=0)
    public Short getRollovercount() {
        return this.rollovercount;
    }
    
    public void setRollovercount(Short rollovercount) {
        this.rollovercount = rollovercount;
    }

    
    @Column(name="REJECTREASON")
    public String getRejectreason() {
        return this.rejectreason;
    }
    
    public void setRejectreason(String rejectreason) {
        this.rejectreason = rejectreason;
    }

    
    @Column(name="REDEMTYPE", length=3)
    public String getRedemtype() {
        return this.redemtype;
    }
    
    public void setRedemtype(String redemtype) {
        this.redemtype = redemtype;
    }

    
    @Column(name="REDEMAMT", precision=22, scale=0)
    public BigDecimal getRedemamt() {
        return this.redemamt;
    }
    
    public void setRedemamt(BigDecimal redemamt) {
        this.redemamt = redemamt;
    }

    
    @Column(name="REDEMACCOUNT", length=20)
    public String getRedemaccount() {
        return this.redemaccount;
    }
    
    public void setRedemaccount(String redemaccount) {
        this.redemaccount = redemaccount;
    }

    
    @Column(name="REDEMBRANCH", length=5)
    public String getRedembranch() {
        return this.redembranch;
    }
    
    public void setRedembranch(String redembranch) {
        this.redembranch = redembranch;
    }

    
    @Column(name="REDEMCURR", length=3)
    public String getRedemcurr() {
        return this.redemcurr;
    }
    
    public void setRedemcurr(String redemcurr) {
        this.redemcurr = redemcurr;
    }




}


