package com.cdsi.backend.inve.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ARCCTDA")
public class ArcctdaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected ArcctdaPKEntity arcctdaPKEntity;

    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "DIRE_OFI")
    private String direOfi;
    @Column(name = "CODI_DEPA")
    private String codiDepa;
    @Column(name = "CODI_PROV")
    private String codiProv;
    @Column(name = "CODI_DIST")
    private String codiDist;

    @Column(name = "TIPO_DIR")
    private String tipoDir;
    @Column(name = "ACTIVO")
    private String activo;
    @Column(name = "TIPO_ENTI")
    private String tipoEnti;
    @Column(name = "COD_SUC")
    private String codSuc;
    @Column(name = "NO_CLIENTE1")
    private String noCliente1;
    @Column(name = "ESTAB_SUNAT")
    private String estabSunat;

    @JoinColumns({
            @JoinColumn(name = "NO_CIA",referencedColumnName = "NO_CIA", insertable = false, updatable = false),
            @JoinColumn(name = "NO_CLIENTE" , referencedColumnName = "NO_CLIENTE", insertable = false, updatable = false)})
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"arcctdaEntity","hibernateLazyInitializer","handler"})
    private Arccmc arccmc;

}
