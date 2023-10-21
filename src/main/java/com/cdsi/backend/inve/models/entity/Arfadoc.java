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
@Table(name = "ARFADOC")
public class Arfadoc implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArfadocPK arfadocPK;
    
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "TIPO_MOV")
    private String tipoMov;
    @Column(name = "COD_SUNAT")
    private String codSunat;

}
