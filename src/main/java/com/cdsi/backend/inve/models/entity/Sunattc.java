package com.cdsi.backend.inve.models.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sunattc {
	
    private BigDecimal compra;
    private BigDecimal venta;
    private String origen;
    private String moneda;
    private String fecha;
  
    public Sunattc() {}
    
	public BigDecimal getCompra() {
		return compra;
	}

	public void setCompra(BigDecimal compra) {
		this.compra = compra;
	}

	public BigDecimal getVenta() {
		return venta;
	}

	public void setVenta(BigDecimal venta) {
		this.venta = venta;
	}

	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
  
	@Override
    public String toString() {
        return "API DE SUNAT [ sunattc=" + venta + " ]";
    }

}
