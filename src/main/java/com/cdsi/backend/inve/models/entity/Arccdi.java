package com.cdsi.backend.inve.models.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ARCCDI")
public class Arccdi implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArccdiPK arccdiPK;
    @Column(name = "DESC_DIST")
    private String descDist;
    @Column(name = "UBIGEO")
    private String ubigeo;
 
    public Arccdi() {
    }

    public Arccdi(ArccdiPK arccdiPK) {
        this.arccdiPK = arccdiPK;
    }

    public Arccdi(String noCia, String codiDepa, String codiProv, String codiDist) {
        this.arccdiPK = new ArccdiPK(noCia, codiDepa, codiProv, codiDist);
    }

    public ArccdiPK getArccdiPK() {
        return arccdiPK;
    }

    public void setArccdiPK(ArccdiPK arccdiPK) {
        this.arccdiPK = arccdiPK;
    }

    public String getDescDist() {
        return descDist;
    }

    public void setDescDist(String descDist) {
        this.descDist = descDist;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arccdiPK != null ? arccdiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arccdi)) {
            return false;
        }
        Arccdi other = (Arccdi) object;
        if ((this.arccdiPK == null && other.arccdiPK != null) || (this.arccdiPK != null && !this.arccdiPK.equals(other.arccdiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.cxc.Arccdi[ arccdiPK=" + arccdiPK + " ]";
    }
    
}

