package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ArpfoePK implements Serializable {

    @Column(name = "NO_CIA")
    private String noCia;

    @Column(name = "NO_ORDEN")
    private String noOrden;

    public ArpfoePK() {
    }

    public ArpfoePK(String noCia, String noOrden) {
        this.noCia = noCia;
        this.noOrden = noOrden;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getNoOrden() {
        return noOrden;
    }

    public void setNoOrden(String noOrden) {
        this.noOrden = noOrden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (noOrden != null ? noOrden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArpfoePK)) {
            return false;
        }
        ArpfoePK other = (ArpfoePK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.noOrden == null && other.noOrden != null) || (this.noOrden != null && !this.noOrden.equals(other.noOrden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ArpfoePK[ noCia=" + noCia + ", noOrden=" + noOrden + " ]";
    }

}
