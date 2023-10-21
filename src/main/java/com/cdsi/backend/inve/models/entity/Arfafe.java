package com.cdsi.backend.inve.models.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ARFAFE")
public class Arfafe implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArfafePK arfafePK;

    private String GRUPO;
    private String NO_CLIENTE;
    private String CENTRO;
    private String BODEGA;
    private String FECHA;
    private String TIPO_CLIENTE;
    private String NBR_CLIENTE;
    private String DIRECCION;
    private String PLAZO;
    private String NO_VENDEDOR;
    private String TIPO_PRECIO;
    private String MONEDA;
    private BigDecimal TIPO_CAMBIO;
    private BigDecimal PORC_DESC;
    private String NO_ORDEN;
    private String NO_ORDEN_DESC;
    private BigDecimal TOT_LIN;
    private BigDecimal DESCUENTO;
    private BigDecimal SUB_TOTAL;
    private BigDecimal IMPUESTO;
    private BigDecimal IMP_ISC;
    private BigDecimal TOTAL;
    private BigDecimal IMPUESTO_DEV;
    private BigDecimal TOTAL_DEV;
    private String OBSERV;
    private String ESTADO;
    private String COD_FPAGO;
    private String IND_ANU_DEV;
    private String DOC_DEVOL;
    private String NO_DEVOL;
    private Date FECHA_SYS;
    private BigDecimal IGV;
    private String TIPO_DOC_ALMA;
    private String NO_REFE_ALMA;
    private String TIPO_REFE_FACTU;
    private String NO_REFE_FACTU;
    private String NO_GUIA;
    private String TIPO;
    private BigInteger NO_CONTA;
    private BigDecimal COMISION;
    private BigDecimal SALDO_COMISION;
    private String COD_OPER;
    private BigInteger NO_CUOTAS;
    private BigDecimal GASTO_ND;
    private BigDecimal GASTO_NC;
    private BigDecimal GASTO_FINAN;
    private BigDecimal TEA;
    private BigDecimal GASTOS;
    private BigDecimal NOTAS_DEB;
    private BigDecimal NOTAS_CRE;
    private BigDecimal IMPUESTO_FINAN;
    private BigDecimal GASTO_DE_FLETES;
    private BigDecimal GASTO_DE_SEGUROS;
    private String IND_PER_GRA_CAP;
    private BigInteger FRE_PAGO_DIAS;
    private String TIPO_NOTA;
    private String DIVISION;
    private String NO_PROYECTO;
    private String CIERRE_COM;
    private String CIERRE_PAG;
    private String CODIGO;
    private String TI_DESPACHO;
    private String ZONA;
    private String TIPO_FACT;
    private String UBI_DIR;
    private Date FECHA_ENTREGA;
    private String MOTIVO_TRASLADO;
    private String CUSER;
    private String CODI_ZONA;
    private String RUC;
    private String NO_LIQ;
    private String IND_DOC;
    private String CODI_PROFE;
    private String NO_CLIENTE_TERCE;
    private String ALM_DESTINO;
    private String MOTIVO_NC;
    private String COD_T_PED;
    private String CONCEPTO;
    private BigDecimal SALDO_NETO;
    private String NO_LIQ_OFI;
    private String NRO_LECTURA;
    private String TIPO_ACTIVO;
    private String NO_LIQ_SUC;
    private String COD_CLAS_PED;
    private String TIPO_FPAGO;
    private BigDecimal P_DSCTO_GLOBAL;
    private String ANO_DOC;
    private BigDecimal VALOR_VENTA;
    private BigDecimal M_DSCTO_GLOBAL;
    private String FECHA_VENCE;
    private String CODI_DEPA;
    private String CODI_PROV;
    private String CODI_DIST;
    private String NO_DOCU;
    private String NOMBRE_DIGI;
    private String DIRECCION_DIGI;
    private String COD_TIENDA;
    private String COD_DIR_ENTREGA;
    private String NO_SOLIC;
    private String TIPO_DOC_CLI;
    private String NUM_DOC_CLI;
    private String MOTIVO_ANULA;
    private String IMPRIME;
    private String ALMACEN_REF;
    private String TIPO_OBSE;
    private String COD_OBSE;
    private String IND_VTA_ANTICIPADA;
    private String COD_SERVICIO;
    private String MOD_VENTA;
    private BigDecimal TOTAL_BRUTO;
    private BigDecimal FLETE;
    private BigDecimal T_DESCUENTO;
    private String TIPO_NCRED;
    private String IND_IGV;
    private String ALIAS;
    private String IND_PVENT;
    private String COD_CAJA;
    private String CAJERA;
    private String TIPO_DOC_EMP;
    private String NUM_DOC_EMP;
    private String SERIE_LIQ;
    private String NUM_LIQ;
    private String TIPO_DOC_LIQ;
    private String IND_NOTA_CRED;
    private String IND_EXPORTACION;
    private String CENTRO_COSTO;
    private String IND_FERIAS;
    private String IND_PROVINCIA;
    private Date FEC_CREA;
    private String USU_CREA;
    private String USU_MODI;
    private Date FEC_MODI;
    private String CONSUMO;
    private BigDecimal REDONDEO;
    private String CONVENIO;
    private BigDecimal SUB_TOTAL1;
    private String NO_CUPON;
    private BigInteger NO_CUPON_CORREL;
    private String CODI_COLE;
    private String CODI_LOCAL;
    private String IND_FACT_TEXTO;
    private String IMP_FACT_DESC;
    private String TIPO_DOC_REF1;
    private String NO_SOLIC1;
    private String IND_GUIA_TEXTO;
    private String FLAG;
    private String EXCL_AUX;
    private String COD_BCARD;
    private BigDecimal IMPUESTO_FLETE;
    private BigDecimal IMPUESTO_GASTOS_ADM;
    private BigDecimal GASTOS_ADMINISTRATIVOS;
    private String ON_LINE;
    private BigDecimal PESO;
    private BigInteger PIEZAS;
    private String DEPARTAMENTO_DEST;
    private String PROVINCIA_DEST;
    private String DISTRITO_DEST;
    private String TELEFONO_DEST;
    private String MARCA1;
    private String NO_VENDEDOR1;
    private String ESTADO1;
    private String NRO_CONVENIO;
    private String MARCA2;
    private String BODEGAPRO;
    private Date VIG_PREC_INICIO;
    private Date VIG_PREC_FIN;
    private String CONT_NETO;
    private String NO_CLIENTE1;
    private String MARCA3;
    private String IND_FMULTIPLE;
    private String IND_NC_FICTA;
    private String TIPO_REFE_FACTU1;
    private String NO_REFE_FACTU1;
    private String CODI_CAMP;
    private String NO_GUIA_PROM;
    private String NO_GUIA_VENTA;
    private String IND_PROMARG;
    private BigDecimal OPER_EXONERADAS;
    private BigDecimal OPER_GRATUITAS;
    private BigDecimal OPER_GRAVADAS;
    private BigDecimal OPER_INAFECTAS;
    private String NO_GUIA_CONSIG;
    private String MOT_ANU;
    private String MOT_CONTING;
    private String TIPO_OPERACION;
    private String SUSTENTO;
    private String ESTADO_SUNAT;
    private String EST_RES_CON;
    private String COD_HASH;
    private String MENSAJE_ERROR_TCI;
    private String COD_BARRA_SUNAT;
    private String COD_DETRAC;
    private BigDecimal PORC_DETRAC;
    private BigDecimal VALOR_REF_DETRAC;
    private String NUM_CUENTA_DETRAC;
    private BigDecimal DETRACCION;

    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumns({
            @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
            @JoinColumn(name = "TIPO_DOC", referencedColumnName = "TIPO_DOC", insertable = false, updatable = false),
            @JoinColumn(name = "NO_FACTU", referencedColumnName = "NO_FACTU", insertable = false, updatable = false)})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Arfafl> arfaflList;

}
