package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ArfcredPK implements Serializable {

	@Column(name = "NO_CIA")
    private String noCia;
    @Column(name = "NO_ORDEN")
    private String noOrden;
    @Column(name = "NO_CLIENTE")
    private String noCliente;
    @Column( name = "NO_CREDITO")
    private String noCredito;
    
    public ArfcredPK() {
	}
    
	public ArfcredPK(String noCia, String noOrden, String noCliente, String noCredito) {
		this.noCia = noCia;
		this.noOrden = noOrden;
		this.noCliente = noCliente;
		this.noCredito = noCredito;
	}
	
	public String getNoCia() {
		return noCia;
	}
	public void setNoCia(String noCia) {
		this.noCia = noCia;
	}
	public String getNoOrden() {
		return noOrden;
	}
	public void setNoOrden(String noOrden) {
		this.noOrden = noOrden;
	}
	public String getNoCliente() {
		return noCliente;
	}
	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}
	public String getNoCredito() {
		return noCredito;
	}
	public void setNoCredito(String noCredito) {
		this.noCredito = noCredito;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((noCia == null) ? 0 : noCia.hashCode());
		result = prime * result + ((noCliente == null) ? 0 : noCliente.hashCode());
		result = prime * result + ((noCredito == null) ? 0 : noCredito.hashCode());
		result = prime * result + ((noOrden == null) ? 0 : noOrden.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ArfcredPK)) return false;
		ArfcredPK other = (ArfcredPK) obj;
		if (noCia == null) {
			if (other.noCia != null)
				return false;
		} else if (!noCia.equals(other.noCia))
			return false;
		if (noCliente == null) {
			if (other.noCliente != null)
				return false;
		} else if (!noCliente.equals(other.noCliente))
			return false;
		if (noCredito == null) {
			if (other.noCredito != null)
				return false;
		} else if (!noCredito.equals(other.noCredito))
			return false;
		if (noOrden == null) {
			if (other.noOrden != null)
				return false;
		} else if (!noOrden.equals(other.noOrden))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArfcredPK [noCia=" + noCia + ", noOrden=" + noOrden + ", noCliente=" + noCliente + ", noCredito="
				+ noCredito + "]";
	}
	
}
