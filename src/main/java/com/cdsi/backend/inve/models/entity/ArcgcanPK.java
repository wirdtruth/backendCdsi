package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ArcgcanPK implements Serializable {

    @Column(name = "NO_CIA")
    private String noCia;

    @Column(name = "TIPO_ANALITICO")
    private String tipoAnalitico;

    @Column(name = "COD_ANALITICO")
    private String codAnalitico;

    public ArcgcanPK() {
    }

    public ArcgcanPK(String noCia, String tipoAnalitico, String codAnalitico) {
        this.noCia = noCia;
        this.tipoAnalitico = tipoAnalitico;
        this.codAnalitico = codAnalitico;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getTipoAnalitico() {
        return tipoAnalitico;
    }

    public void setTipoAnalitico(String tipoAnalitico) {
        this.tipoAnalitico = tipoAnalitico;
    }

    public String getCodAnalitico() {
        return codAnalitico;
    }

    public void setCodAnalitico(String codAnalitico) {
        this.codAnalitico = codAnalitico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (tipoAnalitico != null ? tipoAnalitico.hashCode() : 0);
        hash += (codAnalitico != null ? codAnalitico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArcgcanPK)) {
            return false;
        }
        ArcgcanPK other = (ArcgcanPK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.tipoAnalitico == null && other.tipoAnalitico != null) || (this.tipoAnalitico != null && !this.tipoAnalitico.equals(other.tipoAnalitico))) {
            return false;
        }
        if ((this.codAnalitico == null && other.codAnalitico != null) || (this.codAnalitico != null && !this.codAnalitico.equals(other.codAnalitico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conta.ArcgcanPK[ noCia=" + noCia + ", tipoAnalitico=" + tipoAnalitico + ", codAnalitico=" + codAnalitico + " ]";
    }

}
