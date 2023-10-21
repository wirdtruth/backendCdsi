package com.cdsi.backend.inve.dto;

public class DireccionLegalDto {
    private String direccion;
    private String nombre;
    private String codTienda;
    private String descripcion;
	       
    public DireccionLegalDto() {
	}

	public DireccionLegalDto(String direccion, String nombre, String codTienda, String descripcion) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.codTienda = codTienda;
		this.descripcion = descripcion;
	}
    
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodTienda() {
		return codTienda;
	}
	public void setCodTienda(String codTienda) {
		this.codTienda = codTienda;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
  
}
