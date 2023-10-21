package com.cdsi.backend.inve.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ARINME1")
public class Arinme1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Arinme1PK arinme1PK;
    
    @Column(name = "GRUPO")
    private String grupo;
    /*
    @Column(name = "NO_PROVE")
    private String noProve;
    */
    @Column(name = "NO_ORDEN")
    private String noOrden;
    @Column(name = "NO_GUIA")
    private String noGuia;
    @Column(name = "TIPO_DOC_REM")
    private String tipoDocRem;
    /*
    @Column(name = "ANO_DOC")
    private String anoDoc;
    */
    @Column(name = "SERIE_DOC_REM")
    private String serieDocRem;
    @Column(name = "CORR_DOC_REM")
    private String corrDocRem;
    @Column(name = "NO_REFE")
    private String noRefe;
    @Column(name = "TIPO_DOC_REC")
    private String tipoDocRec;
    @Column(name = "SERIE_DOC_REC")
    private String serieDocRec;
    
    @Column(name = "CORR_DOC_REC")
    private String corrDocRec;
    
    @Column(name = "TIPO_DOC_REC_2")
    private String tipoDocRec2;
    @Column(name = "SERIE_DOC_REC_2")
    private String serieDocRec2;
    @Column(name = "CORR_DOC_REC_2")
    private String corrDocRec2;
    
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FORMA_PAGO")
    private String formaPago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    /*@Column(name = "MOV_TOT")
    private BigDecimal movTot;
    @Column(name = "TOT_ART_IV")
    private BigDecimal totArtIv;
    @Column(name = "IMP_VENTAS")
    private BigDecimal impVentas;
    @Column(name = "IMP_ISC")
    private BigDecimal impIsc;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "DESCUENTO_SINGRABAR")
    private BigDecimal descuentoSingrabar;
    */
    @Column(name = "TIPO_CAMBIO")
    private BigDecimal tipoCambio;
    @Column(name = "ANO_PROCE")
    private Short anoProce;
    @Column(name = "MES_PROCE")
    private Short mesProce;
    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "IND_CONTROL")
    private String indControl;
    @Column(name = "STATUS_CONTROL")
    private String statusControl;
    /*
    @Column(name = "VEHICULO")
    private String vehiculo;
    @Column(name = "VENTA")
    private String venta;
    @Column(name = "COD_TRANSP")
    private String codTransp;
    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;
    @Column(name = "DIRECC_TRANSP")
    private String direccTransp;
    @Column(name = "RUC_TRANSP")
    private String rucTransp;
    @Column(name = "CHOFER")
    private String chofer;
    @Column(name = "PLACA")
    private String placa;
    @Column(name = "OPERACION")
    private Long operacion;
    @Column(name = "TIPO_DOC_REFE")
    private String tipoDocRefe;
    @Column(name = "CARGA_AUTOMATICA")
    private String cargaAutomatica;
    */
    @Column(name = "USUARIO")
    private String usuario;
    /*
    @Column(name = "FECHA_SIST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSist;
    
    @Column(name = "ORIGEN")
    private String origen;
    */
    @Column(name = "ALMA_ORIGEN")
    private String almaOrigen;
    @Column(name = "ALMA_DESTINO")
    private String almaDestino;
    /*
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "NO_CONTA")
    private Long noConta;
    @Column(name = "F_INI_TRAS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fIniTras;
    @Column(name = "ACT_OBRA")
    private String actObra;
    @Column(name = "AUT_REQ")
    private String autReq;
    @Column(name = "DESTINATARIO")
    private String destinatario;
    @Column(name = "PUNTO_PARTIDA")
    private String puntoPartida;
    @Column(name = "PUNTO_LLEGADA")
    private String puntoLlegada;
    @Column(name = "BREVETE")
    private String brevete;
    @Column(name = "RUC_DESTINATARIO")
    private String rucDestinatario;
    @Column(name = "DIRECCION_ORIGEN")
    private String direccionOrigen;
    @Column(name = "DIRECCION_DESTINO")
    private String direccionDestino;
    @Column(name = "DESCRIP_OTROS")
    private String descripOtros;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "PARTIDA_DISTRITO")
    private String partidaDistrito;
    @Column(name = "PARTIDA_PROVINCIA")
    private String partidaProvincia;
    @Column(name = "PARTIDA_DEPARTAMENTO")
    private String partidaDepartamento;
    @Column(name = "LLEGADA_DISTRITO")
    private String llegadaDistrito;
    @Column(name = "LLEGADA_PROVINCIA")
    private String llegadaProvincia;
    @Column(name = "LLEGADA_DEPARTAMENTO")
    private String llegadaDepartamento;
    @Column(name = "PROYECTO")
    private String proyecto;
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Column(name = "NUMERO_DOCUMENTO")
    private String numeroDocumento;
    @Column(name = "TIPO_COMP_PAGO")
    private String tipoCompPago;
    @Column(name = "SERIE_COMP_PAGO")
    private String serieCompPago;
    @Column(name = "NUMERO_COMP_PAGO")
    private String numeroCompPago;
    @Column(name = "COSTO_MINIMO_TRANSPORTE")
    private BigDecimal costoMinimoTransporte;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "CERTIFICADO_INSCRIPCION")
    private String certificadoInscripcion;
    */
    @Column(name = "MOTIVO_TRASLADO")
    private String motivoTraslado;
    /*@Column(name = "PESO_TOTAL")
    private BigDecimal pesoTotal;
    @Column(name = "RAZON_SOCIAL_DESTINATARIO")
    private String razonSocialDestinatario;
    */
    @Column(name = "NO_PED_MANT")
    private String noPedMant;
    /*
    @Column(name = "NO_GUIA_BROCAS")
    private String noGuiaBrocas;
    @Column(name = "IND_GUIA_BROCAS")
    private String indGuiaBrocas;
    @Column(name = "NO_ALMACEN_UNIDAD")
    private String noAlmacenUnidad;
    @Column(name = "NO_GUIA_UNIDAD")
    private String noGuiaUnidad;
    @Column(name = "IND_GUIA_UNIDAD")
    private String indGuiaUnidad;
    @Column(name = "NO_CANJE")
    private String noCanje;
    @Column(name = "IND_CANJE")
    private String indCanje;
    @Column(name = "NOMBRE_EMPLE")
    private String nombreEmple;
    @Column(name = "NO_GUIA_MANT")
    private String noGuiaMant;
    */
    @Column(name = "NO_CLIENTE")
    private String noCliente;
    @Column(name = "DIRECCION_COMERCIAL")
    private String direccionComercial;
    /*@Column(name = "CODI_COLE")
    private String codiCole;
    @Column(name = "CODI_ZONA")
    private String codiZona;
    */
    @Column(name = "NO_VENDEDOR")
    private String noVendedor;
    /*
    @Column(name = "F_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fEntrega;
    @Column(name = "NO_GUIA_PROM")
    private String noGuiaProm;
    @Column(name = "NO_DOCU_REFE")
    private String noDocuRefe;
    @Column(name = "NO_LIQ")
    private String noLiq;
    @Column(name = "NO_LIQ_OFI")
    private String noLiqOfi;
    @Column(name = "IND_GEN_COM")
    private String indGenCom;
    @Column(name = "NRO_LECT_PROV")
    private String nroLectProv;
    @Column(name = "NO_LIQ_SUC")
    private String noLiqSuc;
    @Column(name = "IND_REVERSION")
    private String indReversion;
    */
    @Column(name = "TIPO_COSTO")
    private String tipoCosto;
    @Column(name = "IND_GUIADO")
    private String indGuiado;
    /*@Column(name = "TIPO_DOC_REF")
    private String tipoDocRef;
    @Column(name = "NO_SOLIC")
    private String noSolic;*/
    @Column(name = "COD_FPAGO")
    private String codFpago;
   /* @Column(name = "NOMB_TIENDA")
    private String nombTienda;*/
    @Column(name = "TIPO_ARTI")
    private String tipoArti;
    @Column(name = "CLASE_TRANSC")
    private String claseTransc;
    @Column(name = "NOMBRE_DIGI")
    private String nombreDigi;
    /*@Column(name = "DIRECCION_DIGI")
    private String direccionDigi;*/
    @Column(name = "IND_FACTURA")
    private String indFactura;
    @Column(name = "IND_BOLETA")
    private String indBoleta;
    /*
    @Column(name = "TIPO_TRANS_REV")
    private String tipoTransRev;
    @Column(name = "NO_DOCU_REV")
    private String noDocuRev;
    @Column(name = "F_ANULACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fAnulacion;
    */
    @Column(name = "COD_TIENDA")
    private String codTienda;
    @Column(name = "COD_DIR_ENTREGA")
    private String codDirEntrega;
    @Column(name = "COD_DIR_SALIDA")
    private String codDirSalida;
    @Column(name = "NO_GUIA_REFE")
    private String noGuiaRefe;
    @Column(name = "IMPRIME")
    private String imprime;
    @Column(name = "CENTRO")
    private String centro;
    /*
    @Column(name = "TIPO_DOC_REV")
    private String tipoDocRev;
    @Column(name = "NO_FACTU_REV")
    private String noFactuRev;
    @Column(name = "ALMA_TRANS_REV")
    private String almaTransRev;
    @Column(name = "IND_SELECCION")
    private String indSeleccion;
    @Column(name = "NO_DOCU_COMP")
    private String noDocuComp;
    @Column(name = "NO_DESP")
    private String noDesp;
    @Column(name = "NO_COMPTRAS")
    private String noComptras;
    @Column(name = "ALM_ORIG_COMP")
    private String almOrigComp;
    @Column(name = "NO_PERSONAL")
    private String noPersonal;
    @Column(name = "TIPO_DOC_AUTO")
    private String tipoDocAuto;
    @Column(name = "SERIE_DOC_AUTO")
    private String serieDocAuto;
    @Column(name = "CORR_DOC_AUTO")
    private String corrDocAuto;
    @Column(name = "IND_COMPLEMENTO")
    private String indComplemento;
    @Column(name = "ALIAS")
    private String alias;
    */
    @Column(name = "IND_PVENT")
    private String indPvent;
    @Column(name = "COD_CAJA")
    private String codCaja;
    /*
    @Column(name = "CENTRO_ORDEN")
    private String centroOrden;
    @Column(name = "TIPO_TRAN_COMP")
    private String tipoTranComp;
    @Column(name = "BODEGA_REFE")
    private String bodegaRefe;
    */
    @Column(name = "IND_PROVINCIA")
    private String indProvincia;
    /*
    @Column(name = "MONEDA_OLD")
    private String monedaOld;
    @Column(name = "CORR_DOC_REC_YO")
    private String corrDocRecYo;
    @Column(name = "TIPO_DOC_REC_YO")
    private String tipoDocRecYo;
    @Column(name = "COD_PRE_ORDEN")
    private String codPreOrden;
    @Column(name = "FECHA_FACTU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFactu;
    @Column(name = "NRO_CANJE")
    private String nroCanje;
    @Column(name = "CODI_LOCAL")
    private String codiLocal;
    @Column(name = "REPRESENTANTE")
    private String representante;
    @Column(name = "DNI_REPRE")
    private String dniRepre;
    @Column(name = "FEC_CANJE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCanje;
    @Column(name = "MODALIDAD")
    private String modalidad;
    @Column(name = "CODI_CAMP")
    private String codiCamp;
    @Column(name = "FLAG")
    private String flag;
    */
    @Column(name = "CONVENIO")
    private String convenio;
    @Column(name = "CONSUMO")
    private String consumo;
    @Column(name = "DEMASIA")
    private String demasia;
    @Column(name = "GRABA_COD_BARRA")
    private String grabaCodBarra;
    /*@Column(name = "USU_DESP")
    private String usuDesp;*/
    @Column(name = "IND_COD_BARRA")
    private String indCodBarra;
    /*
    @Column(name = "NO_GUIA_DESP")
    private String noGuiaDesp;
    @Column(name = "FECHA_DESP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesp;
    @Column(name = "IND_FACT_TEXTO")
    private String indFactTexto;
    @Column(name = "IND_GUIA_TEXTO")
    private String indGuiaTexto;
    @Column(name = "GUIA_TEXTO")
    private String guiaTexto;
    @Column(name = "COD_BCARD")
    private String codBcard;
    @Column(name = "OBSERVACIONES2")
    private String observaciones2;
    @Column(name = "FEC_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCrea;
    @Column(name = "USU_CREA")
    private String usuCrea;
    @Column(name = "FEC_MODI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecModi;
    @Column(name = "USU_MODI")
    private String usuModi;
    @Column(name = "ON_LINE")
    private String onLine;
    @Column(name = "NO_VENDEDOR1")
    private String noVendedor1;
    @Column(name = "MARCA1")
    private String marca1;
    @Column(name = "IND_FERIAS")
    private String indFerias;
    @Column(name = "NRO_CONVENIO")
    private String nroConvenio;
    @Column(name = "MARCA2")
    private String marca2;
    @Column(name = "MARCA3")
    private String marca3;
    @Column(name = "NO_DOCU_ANT")
    private String noDocuAnt;
    @Column(name = "NO_CLIENTE1")
    private String noCliente1;
    @Column(name = "TIPO_DOC_ANT")
    private String tipoDocAnt;
    @Column(name = "BODEGA_ANT")
    private String bodegaAnt;
    @Column(name = "CODI_PROFE")
    private String codiProfe;
    @Column(name = "IND_FICTA")
    private String indFicta;
    @Column(name = "GENERO_NC")
    private String generoNc;
    
    @Column(name = "IND_PROFORMA")
    private String indProforma;
    
    @Column(name = "GR_SERIE")
    private String grSerie;
    @Column(name = "GR_CORRE")
    private String grCorre;
    
    @Column(name = "CANT_LINEAS")
    private BigInteger cantLineas;
    */
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumns({
            @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
            @JoinColumn(name = "BODEGA", referencedColumnName = "BODEGA", insertable = false, updatable = false),
            @JoinColumn(name = "TIPO_DOC", referencedColumnName = "TIPO_DOC", insertable = false, updatable = false),
            @JoinColumn(name = "NO_DOCU", referencedColumnName = "NO_DOCU", insertable = false, updatable = false)
    })
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Arinml1> arinml1List;

}
