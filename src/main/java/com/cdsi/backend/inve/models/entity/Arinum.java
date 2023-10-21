package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ARINUM")
public class Arinum implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArinumPK arinumPK;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "COD_SUNAT1")
    private String codSunat1;

    public Arinum() {
    }

    public Arinum(ArinumPK arinumPK) {
        this.arinumPK = arinumPK;
    }

    public Arinum(String noCia, String unidad) {
        this.arinumPK = new ArinumPK(noCia, unidad);
    }

    public ArinumPK getArinumPK() {
        return arinumPK;
    }

    public void setArinumPK(ArinumPK arinumPK) {
        this.arinumPK = arinumPK;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodSunat1() {
        return codSunat1;
    }

    public void setCodSunat1(String codSunat1) {
        this.codSunat1 = codSunat1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arinumPK != null ? arinumPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arinum)) {
            return false;
        }
        Arinum other = (Arinum) object;
        if ((this.arinumPK == null && other.arinumPK != null) || (this.arinumPK != null && !this.arinumPK.equals(other.arinumPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.inve.Arinum[ arinumPK=" + arinumPK + " ]";
    }
    
}
