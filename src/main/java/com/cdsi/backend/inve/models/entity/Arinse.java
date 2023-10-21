package com.cdsi.backend.inve.models.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ARINSE")
public class Arinse implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected ArinsePK arinsePK;
    
    @Column(name = "SECUENCIA")
    private Long secuencia;

    public Arinse() {
    }

    public Arinse(ArinsePK arinsePK) {
        this.arinsePK = arinsePK;
    }

    public Arinse(String noCia, String bodega, String tipoDoc) {
        this.arinsePK = new ArinsePK(noCia, bodega, tipoDoc);
    }

    public ArinsePK getArinsePK() {
        return arinsePK;
    }

    public void setArinsePK(ArinsePK arinsePK) {
        this.arinsePK = arinsePK;
    }

    public Long getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Long secuencia) {
        this.secuencia = secuencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arinsePK != null ? arinsePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arinse)) {
            return false;
        }
        Arinse other = (Arinse) object;
        if ((this.arinsePK == null && other.arinsePK != null) || (this.arinsePK != null && !this.arinsePK.equals(other.arinsePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.inve.Arinse[ arinsePK=" + arinsePK + " ]";
    }
    
}
