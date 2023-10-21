package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NamedStoredProcedureQueries(
        {
                @NamedStoredProcedureQuery(
                        name="file_plano_fe_anulacion",
                        procedureName="FACTU.ARCHIVO_PLANO_ANULACION_FE",
                        resultClasses= Arobtt.class,
                        parameters={                                
                                @StoredProcedureParameter(mode=ParameterMode.IN,  name="PCIA", type=String.class),
                                @StoredProcedureParameter(mode=ParameterMode.IN,  name="PTIPO_DOC", type=String.class),
                                @StoredProcedureParameter(mode=ParameterMode.IN,  name="PNO_FACTU", type=String.class),
                                @StoredProcedureParameter(mode=ParameterMode.IN,  name="PDESC", type=String.class),
                                @StoredProcedureParameter(mode=ParameterMode.OUT, name="R_MSJ", type=String.class )
                        }
                )
        }
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ARFADES")
public class Arfades implements Serializable {
	
   private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	protected Arfadespk arfadespk;
	
	@Column(name = "DESCRIPCION")
    private String descripcion;
	
	@Column(name = "TIPO")
    private String tipo;

}
