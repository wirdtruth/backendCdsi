package com.cdsi.backend.inve.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DatosCajaDTO {

	private String cia;
	private String centro;
	private String caja;
	private String cajera;
	//private LocalDateTime fecha;
	private Date fecha;
	private Date fechaSgte;	
	
}
