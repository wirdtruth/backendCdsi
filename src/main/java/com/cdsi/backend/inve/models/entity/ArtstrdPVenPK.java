package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ArtstrdPVenPK implements Serializable {

	@Column(name = "NO_CIA")
	private String noCia;
	@Column(name = "TIPO_DOC")
	private String tipoDoc;
	@Column(name = "NO_FACTU")
	private String noFactu;
	@Column(name = "NO_LINEA")
	private String noLinea;
	
	public ArtstrdPVenPK() {
	}
	
	public ArtstrdPVenPK(String noCia, String tipoDoc, String noFactu, String noLinea) {
		this.noCia = noCia;
		this.tipoDoc = tipoDoc;
		this.noFactu = noFactu;
		this.noLinea = noLinea;
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

	public String getNoLinea() {
		return noLinea;
	}

	public void setNoLinea(String noLinea) {
		this.noLinea = noLinea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((noCia == null) ? 0 : noCia.hashCode());
		result = prime * result + ((noFactu == null) ? 0 : noFactu.hashCode());
		result = prime * result + ((noLinea == null) ? 0 : noLinea.hashCode());
		result = prime * result + ((tipoDoc == null) ? 0 : tipoDoc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArtstrdPVenPK other = (ArtstrdPVenPK) obj;
		if (noCia == null) {
			if (other.noCia != null)
				return false;
		} else if (!noCia.equals(other.noCia))
			return false;
		if (noFactu == null) {
			if (other.noFactu != null)
				return false;
		} else if (!noFactu.equals(other.noFactu))
			return false;
		if (noLinea == null) {
			if (other.noLinea != null)
				return false;
		} else if (!noLinea.equals(other.noLinea))
			return false;
		if (tipoDoc == null) {
			if (other.tipoDoc != null)
				return false;
		} else if (!tipoDoc.equals(other.tipoDoc))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artstrd_PVenPK [noCia=" + noCia + ", tipoDoc=" + tipoDoc + ", noFactu=" + noFactu + ", noLinea="
				+ noLinea + "]";
	}
}
