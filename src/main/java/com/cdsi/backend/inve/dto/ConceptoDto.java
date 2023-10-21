package com.cdsi.backend.inve.dto;

public class ConceptoDto {
   private String concepto;
   private String descripcion;
   private String indConDeta;
   private String codSunat;
   
	public ConceptoDto() {}
	
	public ConceptoDto(String concepto, String descripcion, String indConDeta, String codSunat) {
		this.concepto = concepto;
		this.descripcion = descripcion;
		this.indConDeta = indConDeta;
		this.codSunat = codSunat;
	}
	
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getIndConDeta() {
		return indConDeta;
	}
	public void setIndConDeta(String indConDeta) {
		this.indConDeta = indConDeta;
	}
	public String getCodSunat() {
		return codSunat;
	}
	public void setCodSunat(String codSunat) {
		this.codSunat = codSunat;
	} 
   
}
