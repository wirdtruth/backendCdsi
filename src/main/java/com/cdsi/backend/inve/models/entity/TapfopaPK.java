package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author user
 */
@Embeddable
public class TapfopaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NO_CIA")
    private String noCia;
    @Basic(optional = false)
    @Column(name = "COD_FPAGO")
    private String codFpago;

    public TapfopaPK() {
    }

    public TapfopaPK(String noCia, String codFpago) {
        this.noCia = noCia;
        this.codFpago = codFpago;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
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
        hash += (codFpago != null ? codFpago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TapfopaPK)) {
            return false;
        }
        TapfopaPK other = (TapfopaPK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.codFpago == null && other.codFpago != null) || (this.codFpago != null && !this.codFpago.equals(other.codFpago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.compras.TapfopaPK[ noCia=" + noCia + ", codFpago=" + codFpago + " ]";
    }
    
}

