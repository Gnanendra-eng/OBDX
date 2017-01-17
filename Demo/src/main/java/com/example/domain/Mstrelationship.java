package com.example.domain;
// Generated Jan 12, 2017 11:08:44 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Mstrelationship generated by hbm2java
 */
@Entity
@Table(name="MSTRELATIONSHIP"
    ,schema="FCDBADMIN_RK"
)
public class Mstrelationship  implements java.io.Serializable {


     private MstrelationshipId id;
     private String relationshipdesc;
     private String idlogrelation;
     private Set<Mstrelationmatrix> mstrelationmatrixes = new HashSet<Mstrelationmatrix>(0);

    public Mstrelationship() {
    }

	
    public Mstrelationship(MstrelationshipId id) {
        this.id = id;
    }
    public Mstrelationship(MstrelationshipId id, String relationshipdesc, String idlogrelation, Set<Mstrelationmatrix> mstrelationmatrixes) {
       this.id = id;
       this.relationshipdesc = relationshipdesc;
       this.idlogrelation = idlogrelation;
       this.mstrelationmatrixes = mstrelationmatrixes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idEntity", column=@Column(name="ID_ENTITY", nullable=false, length=5) ), 
        @AttributeOverride(name="idrelationship", column=@Column(name="IDRELATIONSHIP", nullable=false, length=4) ) } )
    public MstrelationshipId getId() {
        return this.id;
    }
    
    public void setId(MstrelationshipId id) {
        this.id = id;
    }

    
    @Column(name="RELATIONSHIPDESC", length=30)
    public String getRelationshipdesc() {
        return this.relationshipdesc;
    }
    
    public void setRelationshipdesc(String relationshipdesc) {
        this.relationshipdesc = relationshipdesc;
    }

    
    @Column(name="IDLOGRELATION", length=4)
    public String getIdlogrelation() {
        return this.idlogrelation;
    }
    
    public void setIdlogrelation(String idlogrelation) {
        this.idlogrelation = idlogrelation;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mstrelationship")
    public Set<Mstrelationmatrix> getMstrelationmatrixes() {
        return this.mstrelationmatrixes;
    }
    
    public void setMstrelationmatrixes(Set<Mstrelationmatrix> mstrelationmatrixes) {
        this.mstrelationmatrixes = mstrelationmatrixes;
    }




}


