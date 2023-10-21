package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SpMaesEdicPK implements Serializable {

    @Column(name = "NRO_CIA")
    private String nroCia;

    @Column(name = "CODI_CAMP")
    private String codiCamp;

    @Column(name = "NO_LISTA")
    private String noLista;

    @Column(name = "NO_ARTI")
    private String noArti;

    public SpMaesEdicPK() {
    }

    public SpMaesEdicPK(String nroCia, String codiCamp, String noLista, String noArti) {
        this.nroCia = nroCia;
        this.codiCamp = codiCamp;
        this.noLista = noLista;
        this.noArti = noArti;
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

    public String getNoLista() {
        return noLista;
    }

    public void setNoLista(String noLista) {
        this.noLista = noLista;
    }

    public String getNoArti() {
        return noArti;
    }

    public void setNoArti(String noArti) {
        this.noArti = noArti;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nroCia != null ? nroCia.hashCode() : 0);
        hash += (codiCamp != null ? codiCamp.hashCode() : 0);
        hash += (noLista != null ? noLista.hashCode() : 0);
        hash += (noArti != null ? noArti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpMaesEdicPK)) {
            return false;
        }
        SpMaesEdicPK other = (SpMaesEdicPK) object;
        if ((this.nroCia == null && other.nroCia != null) || (this.nroCia != null && !this.nroCia.equals(other.nroCia))) {
            return false;
        }
        if ((this.codiCamp == null && other.codiCamp != null) || (this.codiCamp != null && !this.codiCamp.equals(other.codiCamp))) {
            return false;
        }
        if ((this.noLista == null && other.noLista != null) || (this.noLista != null && !this.noLista.equals(other.noLista))) {
            return false;
        }
        if ((this.noArti == null && other.noArti != null) || (this.noArti != null && !this.noArti.equals(other.noArti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdsi.traerbeaneactiva.promo.SpMaesEdicPK[ nroCia=" + nroCia + ", codiCamp=" + codiCamp + ", noLista=" + noLista + ", noArti=" + noArti + " ]";
    }
}
