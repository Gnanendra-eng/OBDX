package com.jmr.obdx.domain;

import javax.persistence.Table;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/***
 * \
 * @author Pritiranjan Swain
 *
 */
@Entity
@Table(name="mcx_fcc_vw_mstbranch"
    ,schema="JMR_OBDX")
public class MstBranch  implements java.io.Serializable {

	
	 private String idEntity;
     private String bankCode;
     private String branchCode;
     private String branchAddr1;
     private String branchAddr2;
     private String branchAddr3;
     private String branchName;
     private String branchLcy;
     private String countryCode;
     private String walkinCustomer;
     private String endOfInput;
     private String chqnoMask;

    public MstBranch() {
    }

	
    public MstBranch(String branchCode) {
        this.branchCode = branchCode;
    }
    public MstBranch(String idEntity, String bankCode, String branchCode, String branchAddr1, String branchAddr2, String branchAddr3, String branchName, String branchLcy, String countryCode, String walkinCustomer, String endOfInput, String chqnoMask) {
       this.idEntity = idEntity;
       this.bankCode = bankCode;
       this.branchCode = branchCode;
       this.branchAddr1 = branchAddr1;
       this.branchAddr2 = branchAddr2;
       this.branchAddr3 = branchAddr3;
       this.branchName = branchName;
       this.branchLcy = branchLcy;
       this.countryCode = countryCode;
       this.walkinCustomer = walkinCustomer;
       this.endOfInput = endOfInput;
       this.chqnoMask = chqnoMask;
    }
    
    @Id
    @Column(name="ID_ENTITY", length=5)
    public String getIdEntity() {
        return this.idEntity;
    }
    
    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }


    @Column(name="BANK_CODE", length=80)
    public String getBankCode() {
        return this.bankCode;
    }
    
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }


    
    
    @Column(name="BRANCH_CODE", nullable=false, length=12)
    public String getBranchCode() {
        return this.branchCode;
    }
    
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }


    @Column(name="BRANCH_ADDR1", length=420)
    public String getBranchAddr1() {
        return this.branchAddr1;
    }
    
    public void setBranchAddr1(String branchAddr1) {
        this.branchAddr1 = branchAddr1;
    }


    @Column(name="BRANCH_ADDR2", length=420)
    public String getBranchAddr2() {
        return this.branchAddr2;
    }
    
    public void setBranchAddr2(String branchAddr2) {
        this.branchAddr2 = branchAddr2;
    }


    @Column(name="BRANCH_ADDR3", length=420)
    public String getBranchAddr3() {
        return this.branchAddr3;
    }
    
    public void setBranchAddr3(String branchAddr3) {
        this.branchAddr3 = branchAddr3;
    }


    @Column(name="BRANCH_NAME", length=420)
    public String getBranchName() {
        return this.branchName;
    }
    
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }


    @Column(name="BRANCH_LCY", length=12)
    public String getBranchLcy() {
        return this.branchLcy;
    }
    
    public void setBranchLcy(String branchLcy) {
        this.branchLcy = branchLcy;
    }


    @Column(name="COUNTRY_CODE", length=12)
    public String getCountryCode() {
        return this.countryCode;
    }
    
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    @Column(name="WALKIN_CUSTOMER", length=36)
    public String getWalkinCustomer() {
        return this.walkinCustomer;
    }
    
    public void setWalkinCustomer(String walkinCustomer) {
        this.walkinCustomer = walkinCustomer;
    }


    @Column(name="END_OF_INPUT", length=4)
    public String getEndOfInput() {
        return this.endOfInput;
    }
    
    public void setEndOfInput(String endOfInput) {
        this.endOfInput = endOfInput;
    }


    @Column(name="CHQNO_MASK", length=64)
    public String getChqnoMask() {
        return this.chqnoMask;
    }
    
    public void setChqnoMask(String chqnoMask) {
        this.chqnoMask = chqnoMask;
    }


   
}



