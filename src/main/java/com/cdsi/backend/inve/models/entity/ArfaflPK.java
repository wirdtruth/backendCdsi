package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ArfaflPK implements Serializable {

    @Column(name = "NO_CIA")
    private String noCia;
    @Column(name = "TIPO_DOC")
    private String tipoDoc;
    @Column(name = "NO_FACTU")
    private String noFactu;
    @Column(name = "CONSECUTIVO")
    private Integer consecutivo;

    public ArfaflPK() {
    }

    public ArfaflPK(String noCia, String tipoDoc, String noFactu, Integer consecutivo) {
        this.noCia = noCia;
        this.tipoDoc = tipoDoc;
        this.noFactu = noFactu;
        this.consecutivo = consecutivo;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNoFactu() {
        return noFactu;
    }

    public void setNoFactu(String noFactu) {
        this.noFactu = noFactu;
    }

    public Number getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (tipoDoc != null ? tipoDoc.hashCode() : 0);
        hash += (noFactu != null ? noFactu.hashCode() : 0);
        hash += (consecutivo != null ? consecutivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(obj instanceof ArfaflPK)) {
            return false;
        }
        ArfaflPK other = (ArfaflPK) obj;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.tipoDoc == null && other.tipoDoc != null) || (this.tipoDoc != null && !this.tipoDoc.equals(other.tipoDoc))) {
            return false;
        }
        if ((this.noFactu == null && other.noFactu != null) || (this.noFactu != null && !this.noFactu.equals(other.noFactu))) {
            return false;
        }
        if ((this.consecutivo == null && other.consecutivo != null) || (this.consecutivo != null && !this.consecutivo.equals(other.consecutivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ArfaflPK{" +
                "noCia='" + noCia + '\'' +
                ", tipoDoc='" + tipoDoc + '\'' +
                ", noFactu='" + noFactu + '\'' +
                ", consecutivo=" + consecutivo +
                '}';
    }
}
