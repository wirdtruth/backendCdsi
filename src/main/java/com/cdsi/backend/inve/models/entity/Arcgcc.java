package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARCGCC")
public class Arcgcc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLASE_CAMBIO")
    private String claseCambio;
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Arcgcc() {
    }

    public Arcgcc(String claseCambio) {
        this.claseCambio = claseCambio;
    }

    public String getClaseCambio() {
        return claseCambio;
    }

    public void setClaseCambio(String claseCambio) {
        this.claseCambio = claseCambio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (claseCambio != null ? claseCambio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arcgcc)) {
            return false;
        }
        Arcgcc other = (Arcgcc) object;
        if ((this.claseCambio == null && other.claseCambio != null) || (this.claseCambio != null && !this.claseCambio.equals(other.claseCambio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.conta.Arcgcc[ claseCambio=" + claseCambio + " ]";
    }
    
}
