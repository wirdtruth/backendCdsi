package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "ARPFFL")
public class Arpffl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArpfflPK arpfflPK;
    
    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    
    @Column(name = "IND_PARENTESCO")
    private String indParentesco;

    @Column(name = "NO_LINEA")
    private Short noLinea;
    
    @Column(name = "TIPO_BS")
    private String tipoBs;

    public Arpffl() {
    }

    public Arpffl(ArpfflPK arpfflPK) {
        this.arpfflPK = arpfflPK;
    }

    public Arpffl(ArpfflPK arpfflPK, BigDecimal cantidad) {
        this.arpfflPK = arpfflPK;
        this.cantidad = cantidad;
    }

    public Arpffl(String noCia, String bodega, String noGuia, String noArti) {
        this.arpfflPK = new ArpfflPK(noCia, bodega, noGuia, noArti);
    }
    
    public ArpfflPK getArpfflPK() {
		return arpfflPK;
	}

	public void setArpfflPK(ArpfflPK arpfflPK) {
		this.arpfflPK = arpfflPK;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public String getIndParentesco() {
		return indParentesco;
	}

	public void setIndParentesco(String indParentesco) {
		this.indParentesco = indParentesco;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public Short getNoLinea() {
		return noLinea;
	}

	public void setNoLinea(Short noLinea) {
		this.noLinea = noLinea;
	}

	public String getTipoBs() {
		return tipoBs;
	}

	public void setTipoBs(String tipoBs) {
		this.tipoBs = tipoBs;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (arpfflPK != null ? arpfflPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arpffl)) {
            return false;
        }
        Arpffl other = (Arpffl) object;
        if ((this.arpfflPK == null && other.arpfflPK != null) || (this.arpfflPK != null && !this.arpfflPK.equals(other.arpfflPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Arpffl[ arpfflPK=" + arpfflPK + " ]";
    }
}
