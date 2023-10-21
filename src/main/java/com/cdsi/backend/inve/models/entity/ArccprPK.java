package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author user
 */
@Embeddable
public class ArccprPK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "NO_CIA")
    private String noCia;
    @Basic(optional = false)
    @Column(name = "CODI_DEPA")
    private String codiDepa;
    @Basic(optional = false)
    @Column(name = "CODI_PROV")
    private String codiProv;

    public ArccprPK() {
    }

    public ArccprPK(String noCia, String codiDepa, String codiProv) {
        this.noCia = noCia;
        this.codiDepa = codiDepa;
        this.codiProv = codiProv;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getCodiDepa() {
        return codiDepa;
    }

    public void setCodiDepa(String codiDepa) {
        this.codiDepa = codiDepa;
    }

    public String getCodiProv() {
        return codiProv;
    }

    public void setCodiProv(String codiProv) {
        this.codiProv = codiProv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (codiDepa != null ? codiDepa.hashCode() : 0);
        hash += (codiProv != null ? codiProv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArccprPK)) {
            return false;
        }
        ArccprPK other = (ArccprPK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.codiDepa == null && other.codiDepa != null) || (this.codiDepa != null && !this.codiDepa.equals(other.codiDepa))) {
            return false;
        }
        if ((this.codiProv == null && other.codiProv != null) || (this.codiProv != null && !this.codiProv.equals(other.codiProv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.cxc.ArccprPK[ noCia=" + noCia + ", codiDepa=" + codiDepa + ", codiProv=" + codiProv + " ]";
    }
    
}

