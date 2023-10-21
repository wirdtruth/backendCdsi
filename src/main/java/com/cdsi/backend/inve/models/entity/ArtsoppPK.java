package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class ArtsoppPK implements Serializable {
	
	@Column(name = "NO_CIA")
	private String noCia;
	@Column(name = "TIPO_OPER")
	private String tipoOper;
	@Column(name = "COD_OPER")
	private String codOper;
	
	public ArtsoppPK() {
	}
	
	public ArtsoppPK(String noCia, String tipoOper, String codOper) {
		this.noCia = noCia;
		this.tipoOper = tipoOper;
		this.codOper = codOper;
	}

	public String getNoCia() {
		return noCia;
	}

	public void setNoCia(String noCia) {
		this.noCia = noCia;
	}

	public String getTipoOper() {
		return tipoOper;
	}

	public void setTipoOper(String tipoOper) {
		this.tipoOper = tipoOper;
	}

	public String getCodOper() {
		return codOper;
	}

	public void setCodOper(String codOper) {
		this.codOper = codOper;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codOper == null) ? 0 : codOper.hashCode());
		result = prime * result + ((noCia == null) ? 0 : noCia.hashCode());
		result = prime * result + ((tipoOper == null) ? 0 : tipoOper.hashCode());
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
		ArtsoppPK other = (ArtsoppPK) obj;
		if (codOper == null) {
			if (other.codOper != null)
				return false;
		} else if (!codOper.equals(other.codOper))
			return false;
		if (noCia == null) {
			if (other.noCia != null)
				return false;
		} else if (!noCia.equals(other.noCia))
			return false;
		if (tipoOper == null) {
			if (other.tipoOper != null)
				return false;
		} else if (!tipoOper.equals(other.tipoOper))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArtsoppPK [noCia=" + noCia + ", tipoOper=" + tipoOper + ", codOper=" + codOper + "]";
	}

}
