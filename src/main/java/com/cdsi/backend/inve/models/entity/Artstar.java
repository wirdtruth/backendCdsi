package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ARTSTAR")
public class Artstar implements Serializable {
	
	@EmbeddedId
	private ArtstarPK artstarPk;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "ESTADO")
	private String estado;
	
	public Artstar() {
	}
	
	public Artstar(ArtstarPK artstarPk) {
		this.artstarPk = artstarPk;
	}

	public ArtstarPK getArtstarPk() {
		return artstarPk;
	}

	public void setArtstarPk(ArtstarPK artstarPk) {
		this.artstarPk = artstarPk;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artstarPk == null) ? 0 : artstarPk.hashCode());
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
		Artstar other = (Artstar) obj;
		if (artstarPk == null) {
			if (other.artstarPk != null)
				return false;
		} else if (!artstarPk.equals(other.artstarPk))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artstar [artstarPk=" + artstarPk + "]";
	}
	
}
