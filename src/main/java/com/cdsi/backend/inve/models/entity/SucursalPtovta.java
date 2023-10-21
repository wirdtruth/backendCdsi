package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SUCURSAL_PTOVTA")
public class SucursalPtovta implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected SucursalPtovtaPK sucursalPtovtaPK;
    
    @Column(name = "COD_PTO_VTA")
    private String codPtoVta;
    @Column(name = "NOMBRE_SUCU_PTOVTA")
    private String nombreSucuPtovta;
    @Column(name = "CODI_DEPA")
    private String codiDepa;
    @Column(name = "CODI_PROV")
    private String codiProv;
    @Column(name = "CODI_DIST")
    private String codiDist;
    @Column(name = "URBANIZA")
    private String urbaniza;
    @Column(name = "TELEF1")
    private String telef1;
    @Column(name = "TELEF2")
    private String telef2;
    @Column(name = "CORREOELECTRO")
    private String correoelectro;
    @Column(name = "ESTADO_SUC")
    private String estadoSuc;
    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "TIP_DOC")
    private String tipDoc;
    @Column(name = "COD_EST_SUNAT")
    private String codEstSunat;
    @Column(name = "NOM_COMERCIAL")
    private String nomComercial;
    @Column(name = "PAG_WEB")
    private String pagWeb;
    @Column(name = "PAIS")
    private String pais;
}
