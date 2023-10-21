package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ARCCDP")
public class Arccdp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArccdpPK arccdpPK;
    @Column(name = "DESC_DEPA")
    private String descDepa;    

    public Arccdp() {
    }

    public Arccdp(ArccdpPK arccdpPK) {
        this.arccdpPK = arccdpPK;
    }

    public Arccdp(String noCia, String codiDepa) {
        this.arccdpPK = new ArccdpPK(noCia, codiDepa);
    }

    public ArccdpPK getArccdpPK() {
        return arccdpPK;
    }

    public void setArccdpPK(ArccdpPK arccdpPK) {
        this.arccdpPK = arccdpPK;
    }

    public String getDescDepa() {
        return descDepa;
    }

    public void setDescDepa(String descDepa) {
        this.descDepa = descDepa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arccdpPK != null ? arccdpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arccdp)) {
            return false;
        }
        Arccdp other = (Arccdp) object;
        if ((this.arccdpPK == null && other.arccdpPK != null) || (this.arccdpPK != null && !this.arccdpPK.equals(other.arccdpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.cxc.Arccdp[ arccdpPK=" + arccdpPK + " ]";
    }
    
}
