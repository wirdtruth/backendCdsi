package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class ArtsttropiPK implements Serializable {
	
	@Column(name = "NO_CIA")
	private String noCia;
	@Column(name = "TIPO_M")
	private String tipoM;
	@Column(name = "TIPO_OPER_ITEM")
	private String tipoOperItem;
	@Column(name = "COD_OPER_ITEM")
	private String codOperItem;
	
	public ArtsttropiPK() {
	}

	public ArtsttropiPK(String noCia, String tipoM, String tipoOperItem, String codOperItem) {
		this.noCia = noCia;
		this.tipoM = tipoM;
		this.tipoOperItem = tipoOperItem;
		this.codOperItem = codOperItem;
	}

	public String getNoCia() {
		return noCia;
	}

	public void setNoCia(String noCia) {
		this.noCia = noCia;
	}

	public String getTipoM() {
		return tipoM;
	}

	public void setTipoM(String tipoM) {
		this.tipoM = tipoM;
	}

	public String getTipoOperItem() {
		return tipoOperItem;
	}

	public void setTipoOperItem(String tipoOperItem) {
		this.tipoOperItem = tipoOperItem;
	}

	public String getCodOperItem() {
		return codOperItem;
	}

	public void setCodOperItem(String codOperItem) {
		this.codOperItem = codOperItem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codOperItem == null) ? 0 : codOperItem.hashCode());
		result = prime * result + ((noCia == null) ? 0 : noCia.hashCode());
		result = prime * result + ((tipoM == null) ? 0 : tipoM.hashCode());
		result = prime * result + ((tipoOperItem == null) ? 0 : tipoOperItem.hashCode());
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
		ArtsttropiPK other = (ArtsttropiPK) obj;
		if (codOperItem == null) {
			if (other.codOperItem != null)
				return false;
		} else if (!codOperItem.equals(other.codOperItem))
			return false;
		if (noCia == null) {
			if (other.noCia != null)
				return false;
		} else if (!noCia.equals(other.noCia))
			return false;
		if (tipoM == null) {
			if (other.tipoM != null)
				return false;
		} else if (!tipoM.equals(other.tipoM))
			return false;
		if (tipoOperItem == null) {
			if (other.tipoOperItem != null)
				return false;
		} else if (!tipoOperItem.equals(other.tipoOperItem))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArtsttropiPK [noCia=" + noCia + ", tipoM=" + tipoM + ", tipoOperItem=" + tipoOperItem + ", codOperItem="
				+ codOperItem + "]";
	}
	

}
