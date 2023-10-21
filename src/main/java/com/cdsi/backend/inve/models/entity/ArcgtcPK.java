package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ArcgtcPK implements Serializable {
    @Column(name = "CLASE_CAMBIO")
    private String claseCambio;

    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public ArcgtcPK() {
    }

    public ArcgtcPK(String claseCambio, Date fecha) {
        this.claseCambio = claseCambio;
        this.fecha = fecha;
    }

    public String getClaseCambio() {
        return claseCambio;
    }

    public void setClaseCambio(String claseCambio) {
        this.claseCambio = claseCambio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (claseCambio != null ? claseCambio.hashCode() : 0);
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArcgtcPK)) {
            return false;
        }
        ArcgtcPK other = (ArcgtcPK) object;
        if ((this.claseCambio == null && other.claseCambio != null) || (this.claseCambio != null && !this.claseCambio.equals(other.claseCambio))) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conta.ArcgtcPK[ claseCambio=" + claseCambio + ", fecha=" + fecha + " ]";
    }

}
