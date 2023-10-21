package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LICENCIA")
public class Licencia implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
    protected LicenciaPK licenciaPK;
    /*@Column(name = "CODIGO")
    private String codigo;*/
    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;
    @Column(name = "FEC_INSCRIP")
    @Temporal(TemporalType.DATE)
    private Date fecInscrip;
    @Column(name = "TIPO")
    private Character tipo;
    @Column(name = "CONTRATO")
    private Character contrato;
    @Column(name = "CANT_DIAS")
    private Long cantDias;
    @Column(name = "FEC_FINALIZA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecFinaliza;
    @Column(name = "LLAVE")
    private String llave;
    @Column(name = "ALIAS")
    private String alias;
    @Column(name = "NRO_LICENCIA")
    private String nroLicencia;
    @Column(name = "OBSERVACION")
    private String observacion;
    /*@Column(name = "USUARIO")
    private String usuario;*/
    @Column(name = "USU_AC")
    private int usuAc;

}
