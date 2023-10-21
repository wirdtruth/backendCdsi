package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;
@NamedStoredProcedureQueries(
        {
                @NamedStoredProcedureQuery(
                        name="transaccion.listar",
                        procedureName="PKG_TRANSACCION.USP_LISTAR",
                        resultClasses= Transaccion.class,
                        parameters={
                                @StoredProcedureParameter(mode=ParameterMode.REF_CURSOR,name="P_CURSOR", type=void.class ),
                                @StoredProcedureParameter(mode=ParameterMode.IN,  name="P_CIA", type=String.class),
                                @StoredProcedureParameter(mode=ParameterMode.IN,  name="P_USER", type=String.class)
                        }
                )
        }
)
@Entity
@Table(name = "TRANSACCIONES")
public class Transaccion implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "COD_T_PED")
    private String codTPed;

    @Column(name = "DESCRI")
    private String descri;

    @Column(name = "COD_CLAS_PED")
    private String codClasPed;

    public Transaccion() { }

    public Transaccion(String codTPed, String descri, String codClasPed) {
        this.codTPed = codTPed;
        this.descri = descri;
        this.codClasPed = codClasPed;
    }

    public String getCodTPed() {
        return codTPed;
    }

    public void setCodTPed(String codTPed) {
        this.codTPed = codTPed;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getCodClasPed() {
        return codClasPed;
    }

    public void setCodClasPed(String codClasPed) {
        this.codClasPed = codClasPed;
    }
}
