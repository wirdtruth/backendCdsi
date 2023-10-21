package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ARFACR")
public class Arfacr {
  
	private static final long serialVersionUID = 1L;
	
    @EmbeddedId
    protected ArfacrPK arfacrPK;
    
    @Column(name = "DESCRIPCION")
    private String descripcion;
    /*
    @Column(name = "FEC_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCrea;
    @Column(name = "USU_CREA")
    private String usuCrea;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FEC_MODI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecModi;
    */
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "IND_DETALLE")
    private String indDetalle;
    @Column(name = "IND_DIF_CANT")
    private String indDifCant;
    @Column(name = "IND_DIF_PRECIO")
    private String indDifPrecio;
    @Column(name = "IND_DIF_DSCTO")
    private String indDifDscto;
    @Column(name = "CTA_DEBE_MN")
    private String ctaDebeMn;
    @Column(name = "CTA_HABER_MN")
    private String ctaHaberMn;
    @Column(name = "CTA_DEBE_ME")
    private String ctaDebeMe;
    @Column(name = "CTA_HABER_ME")
    private String ctaHaberMe;
    @Column(name = "COD_SUNAT")
    private String codSunat;
	
}
