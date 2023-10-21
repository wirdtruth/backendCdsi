package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Arinmn1PK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NO_CIA")
    private String noCia;
    @Basic(optional = false)
    @Column(name = "BODEGA")
    private String bodega;
    @Basic(optional = false)
    @Column(name = "NO_ARTI")
    private String noArti;
    @Basic(optional = false)
    @Column(name = "TIPO_DOC")
    private String tipoDoc;
    @Basic(optional = false)
    @Column(name = "NO_DOCU")
    private String noDocu;

    public Arinmn1PK() {
    }

    public Arinmn1PK(String noCia, String bodega, String noArti, String tipoDoc, String noDocu) {
        this.noCia = noCia;
        this.bodega = bodega;
        this.noArti = noArti;
        this.tipoDoc = tipoDoc;
        this.noDocu = noDocu;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    public String getNoArti() {
        return noArti;
    }

    public void setNoArti(String noArti) {
        this.noArti = noArti;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNoDocu() {
        return noDocu;
    }

    public void setNoDocu(String noDocu) {
        this.noDocu = noDocu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (bodega != null ? bodega.hashCode() : 0);
        hash += (noArti != null ? noArti.hashCode() : 0);
        hash += (tipoDoc != null ? tipoDoc.hashCode() : 0);
        hash += (noDocu != null ? noDocu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arinmn1PK)) {
            return false;
        }
        Arinmn1PK other = (Arinmn1PK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.bodega == null && other.bodega != null) || (this.bodega != null && !this.bodega.equals(other.bodega))) {
            return false;
        }
        if ((this.noArti == null && other.noArti != null) || (this.noArti != null && !this.noArti.equals(other.noArti))) {
            return false;
        }
        if ((this.tipoDoc == null && other.tipoDoc != null) || (this.tipoDoc != null && !this.tipoDoc.equals(other.tipoDoc))) {
            return false;
        }
        if ((this.noDocu == null && other.noDocu != null) || (this.noDocu != null && !this.noDocu.equals(other.noDocu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.inve.Arinmn1PK[ noCia=" + noCia + ", bodega=" + bodega + ", noArti=" + noArti + ", tipoDoc=" + tipoDoc + ", noDocu=" + noDocu + " ]";
    }
    
}
