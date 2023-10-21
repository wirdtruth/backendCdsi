package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ArfafpPK implements Serializable {

    @Column(name = "NO_CIA")
    private String noCia;

    @Column(name = "TIPO_FPAGO")
    private String tipoFpago;

    @Column(name = "COD_FPAGO")
    private String codFpago;

    public ArfafpPK() {
    }

    public ArfafpPK(String noCia, String tipoFpago, String codFpago) {
        this.noCia = noCia;
        this.tipoFpago = tipoFpago;
        this.codFpago = codFpago;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getTipoFpago() {
        return tipoFpago;
    }

    public void setTipoFpago(String tipoFpago) {
        this.tipoFpago = tipoFpago;
    }

    public String getCodFpago() {
        return codFpago;
    }

    public void setCodFpago(String codFpago) {
        this.codFpago = codFpago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (tipoFpago != null ? tipoFpago.hashCode() : 0);
        hash += (codFpago != null ? codFpago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArfafpPK)) {
            return false;
        }
        ArfafpPK other = (ArfafpPK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.tipoFpago == null && other.tipoFpago != null) || (this.tipoFpago != null && !this.tipoFpago.equals(other.tipoFpago))) {
            return false;
        }
        if ((this.codFpago == null && other.codFpago != null) || (this.codFpago != null && !this.codFpago.equals(other.codFpago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ArfafpPK[ noCia=" + noCia + ", tipoFpago=" + tipoFpago + ", codFpago=" + codFpago + " ]";
    }

}
