package com.cdsi.backend.inve.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ARCCMC")
public class Arccmc implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdArccmc objIdArc;
	
	@Size(min = 1, max=200)
	private String nombre;
	
	@Size(min = 0, max=200)
	private String direccion;
	
	private String ruc;
	
	@Column(name ="NU_DOCUMENTO")
	private String dni;

	@Column(name ="TELEFONO1")
	private String telefono;
	
	@Column(name ="TELEFONO2")
	private String celular;
	
	@Size(min = 1, max=1)
	private String extranjero;
	
	@Column(name="TIPO_PERSONA")
	@Size(min = 1, max=1)
	private String tipo;
	
	@Size(min = 1, max=1)
	private String activo;
	
	private String web;
	
	@Column(name="TIPO_DOCUMENTO")
	@Size(min = 1, max=10)
	private String documento;
	
	private String email;
	
	private String clase; //020
	
	@Column(name="COD_PAIS")
	private String pais; //001
	
	@Column(name="COD_VEN_COB")
	private String codVenCob; //001
	
	@Column(name="TIPO_FPAGO")
	private String tipoFpago; //20
	
	@Column(name="COD_FPAGO")
	private String codFpago; //01
	// NUEVO
	@Column(name="TIPO_CLIENTE")
	private String tipoCliente; //B  
	
	@Column(name="GRUPO")
	private String grupo; //01
	
	@Column(name="GRACIA")
	private String gracia; //8
	
	@Column(name="MONEDA")
	private String moneda; //sol
	
	@Column(name="LIMITE_CREDI_N")
	private Integer limCredN; //0
	
	@Column(name="LIMITE_CREDI_D")
	private Integer limCredD; //0
	
	@Column(name="EXCENTO_IMP")
	private String excenImp; //N
	
	@Column(name="STATUS")
	private String status; //1
	
	@Column(name="CHEQUE_DIFERIDO")
	private String cheqDife; //N
	
	@Column(name="USUARIO")
	private String usuario; //LLE
	
	@Column(name="IND_VAL")
	private String indVal; //L
	
	@Column(name="COD_CLASIF")
	private String codClasif; //B
	
	@Column(name="COD_CATEG")
	private String codCateg; //A
	
	@Column(name="IND_AGEN_RET")
	private String indAgeRet; //N
	
	@Column(name="IND_BUEN_CON")
	private String indBuenCon; //N
	
	@Column(name="IND_SIST_DEFR")
	private String indSisDef; //N
	
	@Column(name="COD_CALI")
	private String codCali; //1
	
	@Column(name="COD_PROPIO")
	private String codPropio; //N
	
	@Column(name="IND_RENOVACION")
	private String indRenova; //N
	
	@Column(name="IND_PROVE")
	private String indProve; //N
	
	@Column(name="TIPO_ENTI")
	private String tipoEnti; //C
	
	@Column(name="COD_SUC")
	private String codSuc; //001
	
	@JsonIgnoreProperties({"arccmc"})
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "arccmc", cascade = CascadeType.ALL)
	private List<ArcctdaEntity> arcctdaEntity;
	
}
