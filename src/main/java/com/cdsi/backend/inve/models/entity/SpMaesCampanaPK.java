package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SpMaesCampanaPK implements Serializable {

    @Column(name = "NRO_CIA")
    private String nroCia;

    @Column(name = "CODI_CAMP")
    private String codiCamp;

    public SpMaesCampanaPK() {
    }

    public SpMaesCampanaPK(String nroCia, String codiCamp) {
        this.nroCia = nroCia;
        this.codiCamp = codiCamp;
    }

    public String getNroCia() {
        return nroCia;
    }

    public void setNroCia(String nroCia) {
        this.nroCia = nroCia;
    }

    public String getCodiCamp() {
        return codiCamp;
    }

    public void setCodiCamp(String codiCamp) {
        this.codiCamp = codiCamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nroCia != null ? nroCia.hashCode() : 0);
        hash += (codiCamp != null ? codiCamp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpMaesCampanaPK)) {
            return false;
        }
        SpMaesCampanaPK other = (SpMaesCampanaPK) object;
        if ((this.nroCia == null && other.nroCia != null) || (this.nroCia != null && !this.nroCia.equals(other.nroCia))) {
            return false;
        }
        if ((this.codiCamp == null && other.codiCamp != null) || (this.codiCamp != null && !this.codiCamp.equals(other.codiCamp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdsi.traerbeaneactiva.promo.SpMaesCampanaPK[ nroCia=" + nroCia + ", codiCamp=" + codiCamp + " ]";
    }
}
