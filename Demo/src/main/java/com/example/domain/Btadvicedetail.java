package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.sql.Blob;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Btadvicedetail generated by hbm2java
 */
@Entity
@Table(name="BTADVICEDETAIL"
    ,schema="FCDBADMIN_RK"
)
public class Btadvicedetail  implements java.io.Serializable {


     private BtadvicedetailId id;
     private Blob advicenode;
     private String filerefno;
     private String advicedata1;
     private String advicedata2;
     private String advicedata3;
     private String advicedata4;
     private String advicedata5;
     private String advicedata6;
     private String advicedata7;
     private String advicedata8;

    public Btadvicedetail() {
    }

	
    public Btadvicedetail(BtadvicedetailId id) {
        this.id = id;
    }
    public Btadvicedetail(BtadvicedetailId id, Blob advicenode, String filerefno, String advicedata1, String advicedata2, String advicedata3, String advicedata4, String advicedata5, String advicedata6, String advicedata7, String advicedata8) {
       this.id = id;
       this.advicenode = advicenode;
       this.filerefno = filerefno;
       this.advicedata1 = advicedata1;
       this.advicedata2 = advicedata2;
       this.advicedata3 = advicedata3;
       this.advicedata4 = advicedata4;
       this.advicedata5 = advicedata5;
       this.advicedata6 = advicedata6;
       this.advicedata7 = advicedata7;
       this.advicedata8 = advicedata8;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="seqno", column=@Column(name="SEQNO", nullable=false, precision=38, scale=0) ), 
        @AttributeOverride(name="recrefno", column=@Column(name="RECREFNO", nullable=false, length=35) ) } )
    public BtadvicedetailId getId() {
        return this.id;
    }
    
    public void setId(BtadvicedetailId id) {
        this.id = id;
    }

    
    @Column(name="ADVICENODE")
    public Blob getAdvicenode() {
        return this.advicenode;
    }
    
    public void setAdvicenode(Blob advicenode) {
        this.advicenode = advicenode;
    }

    
    @Column(name="FILEREFNO", length=35)
    public String getFilerefno() {
        return this.filerefno;
    }
    
    public void setFilerefno(String filerefno) {
        this.filerefno = filerefno;
    }

    
    @Column(name="ADVICEDATA1", length=30)
    public String getAdvicedata1() {
        return this.advicedata1;
    }
    
    public void setAdvicedata1(String advicedata1) {
        this.advicedata1 = advicedata1;
    }

    
    @Column(name="ADVICEDATA2", length=30)
    public String getAdvicedata2() {
        return this.advicedata2;
    }
    
    public void setAdvicedata2(String advicedata2) {
        this.advicedata2 = advicedata2;
    }

    
    @Column(name="ADVICEDATA3", length=30)
    public String getAdvicedata3() {
        return this.advicedata3;
    }
    
    public void setAdvicedata3(String advicedata3) {
        this.advicedata3 = advicedata3;
    }

    
    @Column(name="ADVICEDATA4", length=30)
    public String getAdvicedata4() {
        return this.advicedata4;
    }
    
    public void setAdvicedata4(String advicedata4) {
        this.advicedata4 = advicedata4;
    }

    
    @Column(name="ADVICEDATA5", length=30)
    public String getAdvicedata5() {
        return this.advicedata5;
    }
    
    public void setAdvicedata5(String advicedata5) {
        this.advicedata5 = advicedata5;
    }

    
    @Column(name="ADVICEDATA6", length=30)
    public String getAdvicedata6() {
        return this.advicedata6;
    }
    
    public void setAdvicedata6(String advicedata6) {
        this.advicedata6 = advicedata6;
    }

    
    @Column(name="ADVICEDATA7", length=30)
    public String getAdvicedata7() {
        return this.advicedata7;
    }
    
    public void setAdvicedata7(String advicedata7) {
        this.advicedata7 = advicedata7;
    }

    
    @Column(name="ADVICEDATA8", length=30)
    public String getAdvicedata8() {
        return this.advicedata8;
    }
    
    public void setAdvicedata8(String advicedata8) {
        this.advicedata8 = advicedata8;
    }




}


