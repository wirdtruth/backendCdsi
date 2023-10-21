package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "ARCGTC")
public class Arcgtc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArcgtcPK arcgtcPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TIPO_CAMBIO")
    private BigDecimal tipoCambio;

    public Arcgtc() {
    }

    public Arcgtc(ArcgtcPK arcgtcPK) {
        this.arcgtcPK = arcgtcPK;
    }

    public Arcgtc(String claseCambio, Date fecha) {
        this.arcgtcPK = new ArcgtcPK(claseCambio, fecha);
    }

    public ArcgtcPK getArcgtcPK() {
        return arcgtcPK;
    }

    public void setArcgtcPK(ArcgtcPK arcgtcPK) {
        this.arcgtcPK = arcgtcPK;
    }

    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arcgtcPK != null ? arcgtcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arcgtc)) {
            return false;
        }
        Arcgtc other = (Arcgtc) object;
        if ((this.arcgtcPK == null && other.arcgtcPK != null) || (this.arcgtcPK != null && !this.arcgtcPK.equals(other.arcgtcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conta.Arcgtc[ arcgtcPK=" + arcgtcPK + " ]";
    }
}
