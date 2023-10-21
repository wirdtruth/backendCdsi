package com.cdsi.backend.inve.dto;

public class SerieDocumentoDto {
  private String centro;
  private String tipoDoc;
  private String descripcion;
  private String serie;
  private Long consDesde;

	public SerieDocumentoDto() {
    }
	
	public SerieDocumentoDto(String centro, String tipoDoc, String descripcion, String serie, Long consDesde) {	
		this.centro = centro;
		this.tipoDoc = tipoDoc;
		this.descripcion = descripcion;
		this.serie = serie;
		this.consDesde = consDesde;
	}
	public String getCentro() {
		return centro;
	}
	public void setCentro(String centro) {
		this.centro = centro;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public Long getConsDesde() {
		return consDesde;
	}
	public void setConsDesde(Long consDesde) {
		this.consDesde = consDesde;
	} 
}
