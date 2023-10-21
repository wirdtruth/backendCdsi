package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Arfamc implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NO_CIA")
	private String cia;
	
	@Column(name="RAZON_SOCIAL")
	private String nombre;
	
	@Column(name="NOMBRE_ANO")
	private String nombreAno;
	
	@Column(name="NO_CLIENTE_ONLINE")
	private String ruc;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="BANCO")
	private String banco;
		
	@Column(name="CUENTA_SOL")
	private String cuentaSol;
	
	@Column(name = "CUENTA_DOL")
	private String cuentaDol;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@Column(name = "PORCEN_RETENCION")
	private String retencion;
	
	@Column(name = "PORCEN_PERCEPTION")
	private String percepcion;
	
	@Column(name = "NUM_CUENTA_DETRAC")
	private String cuentaDetrac;
	
}
