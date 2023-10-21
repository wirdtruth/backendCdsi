package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Arinme1PK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    @Column(name = "NO_CIA")
    private String noCia;

    @Column(name = "BODEGA")
    private String bodega;

    @Column(name = "TIPO_DOC")
    private String tipoDoc;

    @Column(name = "NO_DOCU")
    private String noDocu;

}
