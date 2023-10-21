package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ArfacfPK implements Serializable {

    @Column(name = "NO_CIA")
    private String noCia;

    @Column(name = "CENTRO")
    private String centro;

    public ArfacfPK() {
    }

    public ArfacfPK(String noCia, String centro) {
        this.noCia = noCia;
        this.centro = centro;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (centro != null ? centro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArfacfPK)) {
            return false;
        }
        ArfacfPK other = (ArfacfPK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.centro == null && other.centro != null) || (this.centro != null && !this.centro.equals(other.centro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ArfacfPK[ noCia=" + noCia + ", centro=" + centro + " ]";
    }

}
