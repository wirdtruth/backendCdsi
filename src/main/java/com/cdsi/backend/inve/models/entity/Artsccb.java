package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "ARTSCCB")
public class Artsccb implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected ArtsccbPK artsccbPK;
    @Column(name = "DESC_CABA")
    private String descCaba;
    @Column(name = "NO_RESPONSABLE")
    private String noResponsable;
    @Column(name = "NO_BANCO")
    private String noBanco;
    @Column(name = "CTA_BANCARIA")
    private String ctaBancaria;

    @Column(name = "CTA_N")
    private String ctaN;
    @Column(name = "CTA_D")
    private String ctaD;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FONDO_FIJO_N")
    private BigDecimal fondoFijoN;

    @Column(name = "ACTIVO")
    private String activo;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "COD_DIARIO")
    private String codDiario;
    @Column(name = "IND_SOBREGIRO")
    private String indSobregiro;
    @Column(name = "IND_TRANSITORIO")
    private String indTransitorio;
    @Column(name = "CENTRO")
    private String centro;
    @Column(name = "FEC_ULT_CIERRE")
    @Temporal(TemporalType.DATE)
    private Date fecUltCierre;
    @Column(name = "IND_GRF")
    private String indGrf;
    @Column(name = "IND_FAC_UNI")
    private String indFacUni;
    @Column(name = "IND_PORC_DESC")
    private String indPorcDesc;
    /*
    @JoinColumns({
        @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_CABA", referencedColumnName = "TIPO_CABA", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Artstcb artstcb;
    */

}

