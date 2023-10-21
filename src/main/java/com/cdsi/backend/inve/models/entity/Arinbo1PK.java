package com.cdsi.backend.inve.models.entity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Arinbo1PK implements Serializable {

	@Basic(optional = false)
	@Column(name = "NO_CIA")
	private String noCia;
	@Basic(optional = false)
	@Column(name = "CODIGO")
	private String codigo;

	public Arinbo1PK() {
	}

	public Arinbo1PK(String noCia, String codigo) {
		this.noCia = noCia;
		this.codigo = codigo;
	}

	public String getNoCia() {
		return noCia;
	}

	public void setNoCia(String noCia) {
		this.noCia = noCia;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (noCia != null ? noCia.hashCode() : 0);
		hash += (codigo != null ? codigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Arinbo1PK)) {
			return false;
		}
		Arinbo1PK other = (Arinbo1PK) object;
		if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
			return false;
		}
		if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.mycompany.migrarpv.inve.Arinbo1PK[ noCia=" + noCia + ", codigo=" + codigo + " ]";
	}

}