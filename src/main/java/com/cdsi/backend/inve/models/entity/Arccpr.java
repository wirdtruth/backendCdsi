package com.cdsi.backend.inve.models.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ARCCPR")
public class Arccpr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArccprPK arccprPK;
    @Column(name = "DESC_PROV")
    private String descProv;    

    public Arccpr() {
    }

    public Arccpr(ArccprPK arccprPK) {
        this.arccprPK = arccprPK;
    }

    public Arccpr(String noCia, String codiDepa, String codiProv) {
        this.arccprPK = new ArccprPK(noCia, codiDepa, codiProv);
    }

    public ArccprPK getArccprPK() {
        return arccprPK;
    }

    public void setArccprPK(ArccprPK arccprPK) {
        this.arccprPK = arccprPK;
    }

    public String getDescProv() {
        return descProv;
    }

    public void setDescProv(String descProv) {
        this.descProv = descProv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arccprPK != null ? arccprPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arccpr)) {
            return false;
        }
        Arccpr other = (Arccpr) object;
        if ((this.arccprPK == null && other.arccprPK != null) || (this.arccprPK != null && !this.arccprPK.equals(other.arccprPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.cxc.Arccpr[ arccprPK=" + arccprPK + " ]";
    }
    
}

