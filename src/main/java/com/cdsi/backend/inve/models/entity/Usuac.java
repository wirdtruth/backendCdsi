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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USUAC")
public class Usuac implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuacPK usuacPK;
    
    @Column(name = "ENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entrada;
    @Column(name = "SALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date salida;
    @Column(name = "ACTIVO")
    private String activo;
    @Column(name = "MODULO")
    private String modulo;

}
