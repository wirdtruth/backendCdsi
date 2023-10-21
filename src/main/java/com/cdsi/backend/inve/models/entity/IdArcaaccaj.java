package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class IdArcaaccaj implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "NO_CIA")
	private String cia;
	
	@Column(name = "CENTRO")
	private String centro;
	
	@Column(name = "COD_CAJA")
	private String codCaja;
	
	@Column(name = "COD_APER")
	private String codAper;

}
