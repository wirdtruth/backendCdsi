package com.cdsi.backend.inve.dto;

import java.util.Date;

public class ComprobanteIngresoDto {
   
	private String almacen;
	private String tipoDoc;
	private String noDocu;
	private Date fecha;
	private String noCliente;
	private String tipoDocRem;
	private String serieDocRem;
	private String corrDocRem;
	private String tipoDocRec2;
	private String corrDocRec2;
	private String estado;
	
	public ComprobanteIngresoDto() {}
	
	public ComprobanteIngresoDto(String almacen, String tipoDoc, String noDocu, Date fecha, String noCliente,
			String tipoDocRem, String serieDocRem, String corrDocRem, String tipoDocRec2, String corrDocRec2,
			String estado) {
		this.almacen = almacen;
		this.tipoDoc = tipoDoc;
		this.noDocu = noDocu;
		this.fecha = fecha;
		this.noCliente = noCliente;
		this.tipoDocRem = tipoDocRem;
		this.serieDocRem = serieDocRem;
		this.corrDocRem = corrDocRem;
		this.tipoDocRec2 = tipoDocRec2;
		this.corrDocRec2 = corrDocRec2;
		this.estado = estado;
	}
	
	public String getAlmacen() {
		return almacen;
	}
	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getNoDocu() {
		return noDocu;
	}
	public void setNoDocu(String noDocu) {
		this.noDocu = noDocu;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNoCliente() {
		return noCliente;
	}
	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}
	public String getTipoDocRem() {
		return tipoDocRem;
	}
	public void setTipoDocRem(String tipoDocRem) {
		this.tipoDocRem = tipoDocRem;
	}
	public String getSerieDocRem() {
		return serieDocRem;
	}
	public void setSerieDocRem(String serieDocRem) {
		this.serieDocRem = serieDocRem;
	}
	public String getCorrDocRem() {
		return corrDocRem;
	}
	public void setCorrDocRem(String corrDocRem) {
		this.corrDocRem = corrDocRem;
	}
	public String getTipoDocRec2() {
		return tipoDocRec2;
	}
	public void setTipoDocRec2(String tipoDocRec2) {
		this.tipoDocRec2 = tipoDocRec2;
	}
	public String getCorrDocRec2() {
		return corrDocRec2;
	}
	public void setCorrDocRec2(String corrDocRec2) {
		this.corrDocRec2 = corrDocRec2;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
