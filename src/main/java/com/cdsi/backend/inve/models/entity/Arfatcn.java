package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Basic;
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
@Table(name = "ARFATCN")
public class Arfatcn implements Serializable {
	
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArfatcnPK arfatcnPK;
    
    @Column(name = "DESCRIPCION")
    private String descripcion;
    
    @Column(name = "IND_DETALLE")
    private String indDetalle;

}
