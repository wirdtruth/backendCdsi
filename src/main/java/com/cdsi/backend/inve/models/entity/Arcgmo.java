package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "ARCGMO")
public class Arcgmo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "SIMBOLO")
    private String simbolo;

    public Arcgmo() {
    }

    public Arcgmo(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moneda != null ? moneda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arcgmo)) {
            return false;
        }
        Arcgmo other = (Arcgmo) object;
        if ((this.moneda == null && other.moneda != null) || (this.moneda != null && !this.moneda.equals(other.moneda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.conta.Arcgmo[ moneda=" + moneda + " ]";
    }
    
}
