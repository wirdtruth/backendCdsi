package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ARTSTTROPI")
public class Artsttropi implements Serializable {
	
	@EmbeddedId
	private ArtsttropiPK artsttropiPK;
	@Column(name = "CLASE_TRANSC")
	private String claseTransc;
	@Column(name = "ESTADO")
	private String estado;
	@Column(name = "USUARIO")
	private String usuario;
	
	public Artsttropi() {
	}
	
	public Artsttropi(ArtsttropiPK artsttropiPK) {
		this.artsttropiPK = artsttropiPK;
	}

	public ArtsttropiPK getArtsttropiPK() {
		return artsttropiPK;
	}

	public void setArtsttropiPK(ArtsttropiPK artsttropiPK) {
		this.artsttropiPK = artsttropiPK;
	}

	public String getClaseTransc() {
		return claseTransc;
	}

	public void setClaseTransc(String claseTransc) {
		this.claseTransc = claseTransc;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artsttropiPK == null) ? 0 : artsttropiPK.hashCode());
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
		Artsttropi other = (Artsttropi) obj;
		if (artsttropiPK == null) {
			if (other.artsttropiPK != null)
				return false;
		} else if (!artsttropiPK.equals(other.artsttropiPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artsttropi [artsttropiPK=" + artsttropiPK + "]";
	}
	
	

}
