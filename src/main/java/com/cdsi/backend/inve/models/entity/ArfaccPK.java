package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ArfaccPK implements Serializable {

    @Column(name = "NO_CIA")
    private String noCia;

    @Column(name = "CENTRO")
    private String centro;

    @Column(name = "TIPO_DOC")
    private String tipoDoc;

    @Column(name = "SERIE")
    private String serie;

    public ArfaccPK() {
    }

    public ArfaccPK(String noCia, String centro, String tipoDoc, String serie) {
        this.noCia = noCia;
        this.centro = centro;
        this.tipoDoc = tipoDoc;
        this.serie = serie;
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

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (centro != null ? centro.hashCode() : 0);
        hash += (tipoDoc != null ? tipoDoc.hashCode() : 0);
        hash += (serie != null ? serie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArfaccPK)) {
            return false;
        }
        ArfaccPK other = (ArfaccPK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.centro == null && other.centro != null) || (this.centro != null && !this.centro.equals(other.centro))) {
            return false;
        }
        if ((this.tipoDoc == null && other.tipoDoc != null) || (this.tipoDoc != null && !this.tipoDoc.equals(other.tipoDoc))) {
            return false;
        }
        if ((this.serie == null && other.serie != null) || (this.serie != null && !this.serie.equals(other.serie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ArfaccPK[ noCia=" + noCia + ", centro=" + centro + ", tipoDoc=" + tipoDoc + ", serie=" + serie + " ]";
    }
}
