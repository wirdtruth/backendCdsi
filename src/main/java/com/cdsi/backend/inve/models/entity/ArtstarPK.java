package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ArtstarPK implements Serializable {
	
	@Column(name = "NO_CIA")
	private String cia;
	@Column(name = "CLASE")
	private String clase;
	
	public ArtstarPK() {
		
	}
	
	public ArtstarPK(String cia, String clase) {
		this.cia = cia;
		this.clase = clase;
	}

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cia == null) ? 0 : cia.hashCode());
		result = prime * result + ((clase == null) ? 0 : clase.hashCode());
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
		ArtstarPK other = (ArtstarPK) obj;
		if (cia == null) {
			if (other.cia != null)
				return false;
		} else if (!cia.equals(other.cia))
			return false;
		if (clase == null) {
			if (other.clase != null)
				return false;
		} else if (!clase.equals(other.clase))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArtstarPK [cia=" + cia + ", clase=" + clase + "]";
	}

}
