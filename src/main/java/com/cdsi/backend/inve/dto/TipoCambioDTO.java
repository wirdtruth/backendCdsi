package com.cdsi.backend.inve.dto;

import java.math.BigDecimal;

public class TipoCambioDTO {
	
	private String clase;
	private String descripcion;
	private BigDecimal monto;
	
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

}
