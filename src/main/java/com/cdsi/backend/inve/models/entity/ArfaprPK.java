package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class ArfaprPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NO_CIA")
    private String noCia;
    @Basic(optional = false)
    @Column(name = "NO_ARTI")
    private String noArti;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "VIG_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigInicio;
    @Basic(optional = false)
    @Column(name = "VIG_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigFinal;

    public ArfaprPK() {
    }

    public ArfaprPK(String noCia, String noArti, String tipo, Date vigInicio, Date vigFinal) {
        this.noCia = noCia;
        this.noArti = noArti;
        this.tipo = tipo;
        this.vigInicio = vigInicio;
        this.vigFinal = vigFinal;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getNoArti() {
        return noArti;
    }

    public void setNoArti(String noArti) {
        this.noArti = noArti;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getVigInicio() {
        return vigInicio;
    }

    public void setVigInicio(Date vigInicio) {
        this.vigInicio = vigInicio;
    }

    public Date getVigFinal() {
        return vigFinal;
    }

    public void setVigFinal(Date vigFinal) {
        this.vigFinal = vigFinal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (noArti != null ? noArti.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (vigInicio != null ? vigInicio.hashCode() : 0);
        hash += (vigFinal != null ? vigFinal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArfaprPK)) {
            return false;
        }
        ArfaprPK other = (ArfaprPK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.noArti == null && other.noArti != null) || (this.noArti != null && !this.noArti.equals(other.noArti))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if ((this.vigInicio == null && other.vigInicio != null) || (this.vigInicio != null && !this.vigInicio.equals(other.vigInicio))) {
            return false;
        }
        if ((this.vigFinal == null && other.vigFinal != null) || (this.vigFinal != null && !this.vigFinal.equals(other.vigFinal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.factu.ArfaprPK[ noCia=" + noCia + ", noArti=" + noArti + ", tipo=" + tipo + ", vigInicio=" + vigInicio + ", vigFinal=" + vigFinal + " ]";
    }
    
}