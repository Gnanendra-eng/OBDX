package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * IsTxnactivitydetails generated by hbm2java
 */
@Entity
@Table(name="IS_TXNACTIVITYDETAILS"
    ,schema="FCDBADMIN_RK"
)
public class IsTxnactivitydetails  implements java.io.Serializable {


     private IsTxnactivitydetailsId id;
     private Mstentity mstentity;
     private String idcust;
     private BigDecimal openingbalance;
     private Date txndate;
     private String txntype;
     private String txnmode;
     private BigDecimal txnccyamt;
     private String txnccy;
     private BigDecimal unitprice;
     private String unitsaffected;
     private BigDecimal runningtotal;
     private String issuedbalance;
     private String loiapplicable;
     private BigDecimal txnload;
     private BigDecimal vatamt;
     private String paymentmode;
     private String subpaymentmode;
     private String chequeno;
     private Date chequedate;
     private Date clearingdate;
     private String draweebankid;
     private String transbranchcode;
     private String transacctype;
     private String transaccno;
     private String transacccurr;
     private Character paytype;
     private String tprefno;
     private String tpadd1;
     private String tpadd2;
     private String tpadd3;
     private String tpcountry;
     private String tpzip;
     private String tpstate;
     private String tpusstate;
     private String tpbicode;
     private String transrefno;
     private String accholdername;
     private Long numseq;

    public IsTxnactivitydetails() {
    }

	
    public IsTxnactivitydetails(IsTxnactivitydetailsId id, Mstentity mstentity) {
        this.id = id;
        this.mstentity = mstentity;
    }
    public IsTxnactivitydetails(IsTxnactivitydetailsId id, Mstentity mstentity, String idcust, BigDecimal openingbalance, Date txndate, String txntype, String txnmode, BigDecimal txnccyamt, String txnccy, BigDecimal unitprice, String unitsaffected, BigDecimal runningtotal, String issuedbalance, String loiapplicable, BigDecimal txnload, BigDecimal vatamt, String paymentmode, String subpaymentmode, String chequeno, Date chequedate, Date clearingdate, String draweebankid, String transbranchcode, String transacctype, String transaccno, String transacccurr, Character paytype, String tprefno, String tpadd1, String tpadd2, String tpadd3, String tpcountry, String tpzip, String tpstate, String tpusstate, String tpbicode, String transrefno, String accholdername, Long numseq) {
       this.id = id;
       this.mstentity = mstentity;
       this.idcust = idcust;
       this.openingbalance = openingbalance;
       this.txndate = txndate;
       this.txntype = txntype;
       this.txnmode = txnmode;
       this.txnccyamt = txnccyamt;
       this.txnccy = txnccy;
       this.unitprice = unitprice;
       this.unitsaffected = unitsaffected;
       this.runningtotal = runningtotal;
       this.issuedbalance = issuedbalance;
       this.loiapplicable = loiapplicable;
       this.txnload = txnload;
       this.vatamt = vatamt;
       this.paymentmode = paymentmode;
       this.subpaymentmode = subpaymentmode;
       this.chequeno = chequeno;
       this.chequedate = chequedate;
       this.clearingdate = clearingdate;
       this.draweebankid = draweebankid;
       this.transbranchcode = transbranchcode;
       this.transacctype = transacctype;
       this.transaccno = transaccno;
       this.transacccurr = transacccurr;
       this.paytype = paytype;
       this.tprefno = tprefno;
       this.tpadd1 = tpadd1;
       this.tpadd2 = tpadd2;
       this.tpadd3 = tpadd3;
       this.tpcountry = tpcountry;
       this.tpzip = tpzip;
       this.tpstate = tpstate;
       this.tpusstate = tpusstate;
       this.tpbicode = tpbicode;
       this.transrefno = transrefno;
       this.accholdername = accholdername;
       this.numseq = numseq;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idEntity", column=@Column(name="ID_ENTITY", nullable=false, length=5) ), 
        @AttributeOverride(name="idunitholder", column=@Column(name="IDUNITHOLDER", nullable=false, length=16) ), 
        @AttributeOverride(name="txnnumber", column=@Column(name="TXNNUMBER", nullable=false, length=25) ), 
        @AttributeOverride(name="idfund", column=@Column(name="IDFUND", nullable=false, length=10) ), 
        @AttributeOverride(name="numserial", column=@Column(name="NUMSERIAL", nullable=false, precision=18, scale=0) ) } )
    public IsTxnactivitydetailsId getId() {
        return this.id;
    }
    
    public void setId(IsTxnactivitydetailsId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ENTITY", nullable=false, insertable=false, updatable=false)
    public Mstentity getMstentity() {
        return this.mstentity;
    }
    
    public void setMstentity(Mstentity mstentity) {
        this.mstentity = mstentity;
    }

    
    @Column(name="IDCUST")
    public String getIdcust() {
        return this.idcust;
    }
    
    public void setIdcust(String idcust) {
        this.idcust = idcust;
    }

    
    @Column(name="OPENINGBALANCE", precision=20, scale=6)
    public BigDecimal getOpeningbalance() {
        return this.openingbalance;
    }
    
    public void setOpeningbalance(BigDecimal openingbalance) {
        this.openingbalance = openingbalance;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="TXNDATE", length=7)
    public Date getTxndate() {
        return this.txndate;
    }
    
    public void setTxndate(Date txndate) {
        this.txndate = txndate;
    }

    
    @Column(name="TXNTYPE", length=10)
    public String getTxntype() {
        return this.txntype;
    }
    
    public void setTxntype(String txntype) {
        this.txntype = txntype;
    }

    
    @Column(name="TXNMODE", length=4)
    public String getTxnmode() {
        return this.txnmode;
    }
    
    public void setTxnmode(String txnmode) {
        this.txnmode = txnmode;
    }

    
    @Column(name="TXNCCYAMT", precision=20, scale=6)
    public BigDecimal getTxnccyamt() {
        return this.txnccyamt;
    }
    
    public void setTxnccyamt(BigDecimal txnccyamt) {
        this.txnccyamt = txnccyamt;
    }

    
    @Column(name="TXNCCY", length=3)
    public String getTxnccy() {
        return this.txnccy;
    }
    
    public void setTxnccy(String txnccy) {
        this.txnccy = txnccy;
    }

    
    @Column(name="UNITPRICE", precision=20, scale=6)
    public BigDecimal getUnitprice() {
        return this.unitprice;
    }
    
    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    
    @Column(name="UNITSAFFECTED", length=50)
    public String getUnitsaffected() {
        return this.unitsaffected;
    }
    
    public void setUnitsaffected(String unitsaffected) {
        this.unitsaffected = unitsaffected;
    }

    
    @Column(name="RUNNINGTOTAL", precision=20, scale=6)
    public BigDecimal getRunningtotal() {
        return this.runningtotal;
    }
    
    public void setRunningtotal(BigDecimal runningtotal) {
        this.runningtotal = runningtotal;
    }

    
    @Column(name="ISSUEDBALANCE", length=20)
    public String getIssuedbalance() {
        return this.issuedbalance;
    }
    
    public void setIssuedbalance(String issuedbalance) {
        this.issuedbalance = issuedbalance;
    }

    
    @Column(name="LOIAPPLICABLE", length=10)
    public String getLoiapplicable() {
        return this.loiapplicable;
    }
    
    public void setLoiapplicable(String loiapplicable) {
        this.loiapplicable = loiapplicable;
    }

    
    @Column(name="TXNLOAD", precision=20, scale=6)
    public BigDecimal getTxnload() {
        return this.txnload;
    }
    
    public void setTxnload(BigDecimal txnload) {
        this.txnload = txnload;
    }

    
    @Column(name="VATAMT", precision=20, scale=6)
    public BigDecimal getVatamt() {
        return this.vatamt;
    }
    
    public void setVatamt(BigDecimal vatamt) {
        this.vatamt = vatamt;
    }

    
    @Column(name="PAYMENTMODE", length=15)
    public String getPaymentmode() {
        return this.paymentmode;
    }
    
    public void setPaymentmode(String paymentmode) {
        this.paymentmode = paymentmode;
    }

    
    @Column(name="SUBPAYMENTMODE", length=15)
    public String getSubpaymentmode() {
        return this.subpaymentmode;
    }
    
    public void setSubpaymentmode(String subpaymentmode) {
        this.subpaymentmode = subpaymentmode;
    }

    
    @Column(name="CHEQUENO", length=16)
    public String getChequeno() {
        return this.chequeno;
    }
    
    public void setChequeno(String chequeno) {
        this.chequeno = chequeno;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CHEQUEDATE", length=7)
    public Date getChequedate() {
        return this.chequedate;
    }
    
    public void setChequedate(Date chequedate) {
        this.chequedate = chequedate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CLEARINGDATE", length=7)
    public Date getClearingdate() {
        return this.clearingdate;
    }
    
    public void setClearingdate(Date clearingdate) {
        this.clearingdate = clearingdate;
    }

    
    @Column(name="DRAWEEBANKID", length=25)
    public String getDraweebankid() {
        return this.draweebankid;
    }
    
    public void setDraweebankid(String draweebankid) {
        this.draweebankid = draweebankid;
    }

    
    @Column(name="TRANSBRANCHCODE", length=25)
    public String getTransbranchcode() {
        return this.transbranchcode;
    }
    
    public void setTransbranchcode(String transbranchcode) {
        this.transbranchcode = transbranchcode;
    }

    
    @Column(name="TRANSACCTYPE", length=25)
    public String getTransacctype() {
        return this.transacctype;
    }
    
    public void setTransacctype(String transacctype) {
        this.transacctype = transacctype;
    }

    
    @Column(name="TRANSACCNO", length=20)
    public String getTransaccno() {
        return this.transaccno;
    }
    
    public void setTransaccno(String transaccno) {
        this.transaccno = transaccno;
    }

    
    @Column(name="TRANSACCCURR", length=3)
    public String getTransacccurr() {
        return this.transacccurr;
    }
    
    public void setTransacccurr(String transacccurr) {
        this.transacccurr = transacccurr;
    }

    
    @Column(name="PAYTYPE", length=1)
    public Character getPaytype() {
        return this.paytype;
    }
    
    public void setPaytype(Character paytype) {
        this.paytype = paytype;
    }

    
    @Column(name="TPREFNO")
    public String getTprefno() {
        return this.tprefno;
    }
    
    public void setTprefno(String tprefno) {
        this.tprefno = tprefno;
    }

    
    @Column(name="TPADD1")
    public String getTpadd1() {
        return this.tpadd1;
    }
    
    public void setTpadd1(String tpadd1) {
        this.tpadd1 = tpadd1;
    }

    
    @Column(name="TPADD2")
    public String getTpadd2() {
        return this.tpadd2;
    }
    
    public void setTpadd2(String tpadd2) {
        this.tpadd2 = tpadd2;
    }

    
    @Column(name="TPADD3")
    public String getTpadd3() {
        return this.tpadd3;
    }
    
    public void setTpadd3(String tpadd3) {
        this.tpadd3 = tpadd3;
    }

    
    @Column(name="TPCOUNTRY", length=50)
    public String getTpcountry() {
        return this.tpcountry;
    }
    
    public void setTpcountry(String tpcountry) {
        this.tpcountry = tpcountry;
    }

    
    @Column(name="TPZIP", length=10)
    public String getTpzip() {
        return this.tpzip;
    }
    
    public void setTpzip(String tpzip) {
        this.tpzip = tpzip;
    }

    
    @Column(name="TPSTATE", length=25)
    public String getTpstate() {
        return this.tpstate;
    }
    
    public void setTpstate(String tpstate) {
        this.tpstate = tpstate;
    }

    
    @Column(name="TPUSSTATE", length=25)
    public String getTpusstate() {
        return this.tpusstate;
    }
    
    public void setTpusstate(String tpusstate) {
        this.tpusstate = tpusstate;
    }

    
    @Column(name="TPBICODE", length=50)
    public String getTpbicode() {
        return this.tpbicode;
    }
    
    public void setTpbicode(String tpbicode) {
        this.tpbicode = tpbicode;
    }

    
    @Column(name="TRANSREFNO", length=25)
    public String getTransrefno() {
        return this.transrefno;
    }
    
    public void setTransrefno(String transrefno) {
        this.transrefno = transrefno;
    }

    
    @Column(name="ACCHOLDERNAME", length=50)
    public String getAccholdername() {
        return this.accholdername;
    }
    
    public void setAccholdername(String accholdername) {
        this.accholdername = accholdername;
    }

    
    @Column(name="NUMSEQ", precision=18, scale=0)
    public Long getNumseq() {
        return this.numseq;
    }
    
    public void setNumseq(Long numseq) {
        this.numseq = numseq;
    }




}


