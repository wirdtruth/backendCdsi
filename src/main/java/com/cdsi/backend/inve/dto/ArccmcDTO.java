package com.cdsi.backend.inve.dto;

public class ArccmcDTO {
	
   private String noCliente;
   private String tipoDocumento;
   private String nombre;
      
	public ArccmcDTO() {
	}
	
	public ArccmcDTO(String noCliente, String tipoDocumento, String nombre) {
		this.noCliente = noCliente;
		this.tipoDocumento = tipoDocumento;
		this.nombre = nombre;
	}
	
	public String getNoCliente() {
		return noCliente;
	}
	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
      
}
