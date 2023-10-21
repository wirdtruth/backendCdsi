package com.cdsi.backend.inve.dto;

public class DocumentoDto {
	
   private String tipo;
   private String numero;
   private String fecha;
   private String codigo;
   private String nombre;
   
   public DocumentoDto() {}
   
	public DocumentoDto(String tipo, String numero, String fecha, String codigo, String nombre) {
		this.tipo = tipo;
		this.numero = numero;
		this.fecha = fecha;
		this.codigo = codigo;
		this.nombre = nombre;
    }
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
   
   
}
