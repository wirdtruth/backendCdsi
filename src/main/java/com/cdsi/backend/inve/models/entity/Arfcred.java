package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ARFCRED")
public class Arfcred implements Serializable {
	
	@EmbeddedId
	protected ArfcredPK arfcredPk;
	@Column(name = "TIEMPO_PAGO")
	private Integer tiempoPago;
	@Column(name = "ESTADO")
	private String estado;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "MONTO_PAGADO")
	private BigDecimal montoPagado;
	@Column(name = "MONTO")
	private BigDecimal monto;
	@Column(name = "FEC_PAGO")
	private String fechaPago;


	public Arfcred() {
	}
	
	public Arfcred(ArfcredPK arfcredPk) {
		this.arfcredPk = arfcredPk;
	}
	
	public ArfcredPK getArfcredPk() {
		return arfcredPk;
	}
	public void setArfcredPk(ArfcredPK arfcredPk) {
		this.arfcredPk = arfcredPk;
	}
	public Integer getTiempoPago() {
		return tiempoPago;
	}
	public void setTiempoPago(Integer tiempoPago) {
		this.tiempoPago = tiempoPago;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getMontoPagado() {
		return montoPagado;
	}
	public void setMontoPagado(BigDecimal montoPagado) {
		this.montoPagado = montoPagado;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arfcredPk == null) ? 0 : arfcredPk.hashCode());
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
		Arfcred other = (Arfcred) obj;
		if (arfcredPk == null) {
			if (other.arfcredPk != null)
				return false;
		} else if (!arfcredPk.equals(other.arfcredPk))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Arfcred [arfcredPk=" + arfcredPk + "]";
	}
	
	

}
