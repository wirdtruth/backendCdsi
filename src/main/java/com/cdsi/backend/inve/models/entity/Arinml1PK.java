package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Arinml1PK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Column(name = "NO_CIA")
    private String noCia;

    @Column(name = "BODEGA")
    private String bodega;

    @Column(name = "TIPO_DOC")
    private String tipoDoc;

    @Column(name = "NO_DOCU")
    private String noDocu;

    @Column(name = "NO_ARTI")
    private String noArti;

    public Arinml1PK() {
    }

    public Arinml1PK(String noCia, String bodega, String tipoDoc, String noDocu, String noArti) {
        this.noCia = noCia;
        this.bodega = bodega;
        this.tipoDoc = tipoDoc;
        this.noDocu = noDocu;
        this.noArti = noArti;
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

    public String getNoArti() {
        return noArti;
    }

    public void setNoArti(String noArti) {
        this.noArti = noArti;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (bodega != null ? bodega.hashCode() : 0);
        hash += (tipoDoc != null ? tipoDoc.hashCode() : 0);
        hash += (noDocu != null ? noDocu.hashCode() : 0);
        hash += (noArti != null ? noArti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arinml1PK)) {
            return false;
        }
        Arinml1PK other = (Arinml1PK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.bodega == null && other.bodega != null) || (this.bodega != null && !this.bodega.equals(other.bodega))) {
            return false;
        }
        if ((this.tipoDoc == null && other.tipoDoc != null) || (this.tipoDoc != null && !this.tipoDoc.equals(other.tipoDoc))) {
            return false;
        }
        if ((this.noDocu == null && other.noDocu != null) || (this.noDocu != null && !this.noDocu.equals(other.noDocu))) {
            return false;
        }
        if ((this.noArti == null && other.noArti != null) || (this.noArti != null && !this.noArti.equals(other.noArti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "INVE.Arinml1PK[ noCia=" + noCia + ", bodega=" + bodega + ", tipoDoc=" + tipoDoc + ", noDocu=" + noDocu + ", noArti=" + noArti + " ]";
    }
}
