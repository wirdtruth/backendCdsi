package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "ARCAACCAJ")
public class Arcaaccaj implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IdArcaaccaj idArcaja;
	
	@Column(name = "FECHA")
	private Date fecha;
	@Column(name = "CAJERA")
	private String cajera;
	@Column(name = "SALDO_INICIAL")
	private Double saldoInicial;
	@Column(name = "FECHA_CIERRE")
	//private LocalDateTime fechaCierre;
	private Date fechaCierre;
	@Column(name = "ESTADO")
	private String estado;
	@Column(name = "HORA")
	private String hora;
	@Column(name = "HORA_CIERRE")
	private String horaCierre;
	@Column(name = "SERIE_LIQ")
	private String serieLiq;
	@Column(name = "NUM_LIQ")
	private String numLiq;
	@Column(name = "TIPO_DOC_LIQ")
	private String TipoDocLiq;
	/*@Column(name = "INGRESO_EFECTIVO_SOL", precision = 12, scale = 3)
	private Double ingresoEfectivoSol;
	@Column(name = "EGRESO_EFECTIVO_SOL", precision = 12, scale = 3)
	private Double egresoEfectivoSol;
	@Column(name = "INGRESO_EFECTIVO_DOL", precision = 12, scale = 3)
	private Double ingresoEfectivoDol;
	@Column(name = "EGRESO_EFECTIVO_DOL", precision = 12, scale = 3)
	private Double egresoEfectivoDol;*/

}
