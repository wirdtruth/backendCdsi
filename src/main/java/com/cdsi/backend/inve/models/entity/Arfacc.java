package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ARFACC")
public class Arfacc implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected ArfaccPK arfaccPK;
    
    @Column(name = "CONS_INICIO")
    private Long consInicio;
    @Column(name = "CONS_DESDE")
    private Long consDesde;
    @Column(name = "CONS_HASTA")
    private Long consHasta;
    @Column(name = "IND_CONTROL_AUTO")
    private String indControlAuto;
    @Column(name = "ACTIVO")
    private String activo;
    

    public Arfacc() {
    }

    public Arfacc(ArfaccPK arfaccPK) {
        this.arfaccPK = arfaccPK;
    }

    public Arfacc(String noCia, String centro, String tipoDoc, String serie) {
        this.arfaccPK = new ArfaccPK(noCia, centro, tipoDoc, serie);
    }

    public ArfaccPK getArfaccPK() {
        return arfaccPK;
    }

    public void setArfaccPK(ArfaccPK arfaccPK) {
        this.arfaccPK = arfaccPK;
    }

    public Long getConsInicio() {
        return consInicio;
    }

    public void setConsInicio(Long consInicio) {
        this.consInicio = consInicio;
    }

    public Long getConsDesde() {
        return consDesde;
    }

    public void setConsDesde(Long consDesde) {
        this.consDesde = consDesde;
    }

    public Long getConsHasta() {
        return consHasta;
    }

    public void setConsHasta(Long consHasta) {
        this.consHasta = consHasta;
    }

    public String getIndControlAuto() {
        return indControlAuto;
    }

    public void setIndControlAuto(String indControlAuto) {
        this.indControlAuto = indControlAuto;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arfaccPK != null ? arfaccPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arfacc)) {
            return false;
        }
        Arfacc other = (Arfacc) object;
        if ((this.arfaccPK == null && other.arfaccPK != null) || (this.arfaccPK != null && !this.arfaccPK.equals(other.arfaccPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Arfacc[ arfaccPK=" + arfaccPK + " ]";
    }

}
