package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ArfafePK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "NO_CIA")
    private String noCia;
    @Column(name = "TIPO_DOC")
    private String tipoDoc;
    @Column(name = "NO_FACTU")
    private String noFactu;

    public ArfafePK() {
    }

    public ArfafePK(String noCia, String tipoDoc, String noFactu) {
        this.noCia = noCia;
        this.tipoDoc = tipoDoc;
        this.noFactu = noFactu;
    }

    public String getNoCia() { return noCia;}

    public void setNoCia(String noCia) {this.noCia = noCia;}

    public String getTipoDoc() {return tipoDoc;}

    public void setTipoDoc(String tipoDoc) {this.tipoDoc = tipoDoc;}

    public String getNoFactu() {return noFactu;}

    public void setNoFactu(String noFactu) {this.noFactu = noFactu;}

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (tipoDoc != null ? tipoDoc.hashCode() : 0);
        hash += (noFactu != null ? noFactu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(obj instanceof ArfafePK)) {
            return false;
        }
        ArfafePK other = (ArfafePK) obj;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.tipoDoc == null && other.tipoDoc != null) || (this.tipoDoc != null && !this.tipoDoc.equals(other.tipoDoc))) {
            return false;
        }
        if ((this.noFactu == null && other.noFactu != null) || (this.noFactu != null && !this.noFactu.equals(other.noFactu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ArfafePK{" +
                "noCia='" + noCia + '\'' +
                ", tipoDoc='" + tipoDoc + '\'' +
                ", noFactu='" + noFactu + '\'' +
                '}';
    }
}
