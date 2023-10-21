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
@Table(name = "ARINTD")
public class Arintd implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected ArintdPK arintdPK;
    
    @Column(name = "TIPO_ARTI")
    private String tipoArti;
    @Column(name = "IND_TIPO_TRA")
    private String indTipoTra;
    @Column(name = "DESCRI")
    private String descri;
    @Column(name = "MOVIMI")
    private String movimi;
    @Column(name = "REG_MOV")
    private String regMov;
    @Column(name = "GUIA_FACTURA")
    private String guiaFactura;
    @Column(name = "DOCU_GENE")
    private String docuGene;
    @Column(name = "CTROL_SERIADO")
    private String ctrolSeriado;
    @Column(name = "CONTABILIZA")
    private String contabiliza;
    @Column(name = "AFECT_COST")
    private String afectCost;
    @Column(name = "COD_DIARIO")
    private String codDiario;
    @Column(name = "IND_KARDEX")
    private String indKardex;
    @Column(name = "IND_CONTROL")
    private String indControl;
    @Column(name = "IND_CONSU")
    private String indConsu;
    @Column(name = "IND_ACTU_STK")
    private String indActuStk;
    @Column(name = "TRASLADO_AUTO")
    private String trasladoAuto;
    @Column(name = "IND_TIPO_CONSU")
    private String indTipoConsu;
    @Column(name = "IND_ACTIVO")
    private String indActivo;
    @Column(name = "GRUPO_ORI")
    private String grupoOri;
    @Column(name = "ALMA_ORI")
    private String almaOri;
    @Column(name = "GRUPO_DES")
    private String grupoDes;
    @Column(name = "ALMA_DES")
    private String almaDes;
    @Column(name = "IND_DEVO")
    private String indDevo;
    @Column(name = "IND_PEDIDO")
    private String indPedido;
    @Column(name = "IND_NOTA_CRED")
    private String indNotaCred;
    @Column(name = "IND_FACTURA")
    private String indFactura;
    @Column(name = "IND_GUIA")
    private String indGuia;
    @Column(name = "ENTI_REFE")
    private String entiRefe;
    @Column(name = "DOCU_1_REFE")
    private String docu1Refe;
    @Column(name = "DOCU_2_REFE")
    private String docu2Refe;
    @Column(name = "TIPO_DEPEND")
    private String tipoDepend;
    @Column(name = "TIPO_TRAN_COMP")
    private String tipoTranComp;
    @Column(name = "TIPO_TRAN_REVE")
    private String tipoTranReve;
    @Column(name = "MOTIVO_TRASLADO")
    private String motivoTraslado;
    @Column(name = "IND_AJU_STOCK")
    private String indAjuStock;
    @Column(name = "ACTIVO")
    private String activo;
    @Column(name = "IND_EXPORTACION")
    private String indExportacion;
    @Column(name = "IND_VTA_ANTICIPADA")
    private String indVtaAnticipada;
    
    @Column(name = "TIPO_DEPEND1")
    private String tipoDepend1;
    @Column(name = "TIPO_TRAN_AUTO")
    private String tipoTranAuto;
    @Column(name = "SOL_PED")
    private String solPed;
    @Column(name = "ESTADO_ITEM")
    private String estadoItem;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "IND_AJU_CERO")
    private String indAjuCero;
    @Column(name = "SOLO_INVENT")
    private String soloInvent;
    @Column(name = "DEMASIA")
    private String demasia;
    @Column(name = "IND_NO_OBLIGA_CB")
    private String indNoObligaCb;
    @Column(name = "IND_FACT_TEXTO")
    private String indFactTexto;
    @Column(name = "IND_CAMPANA")
    private String indCampana;
    @Column(name = "INGRESA_COSTEO")
    private String ingresaCosteo;
    @Column(name = "IND_OPERAC_COSTEO")
    private String indOperacCosteo;
    @Column(name = "IND_GUIA_TEXTO")
    private String indGuiaTexto;

    @Column(name = "IND_GMPROD")
    private String indGmprod;
    @Column(name = "COD_TRANS_ANT")
    private String codTransAnt;
    @Column(name = "CONVENIO")
    private String convenio;
    @Column(name = "IND_COLEGIO")
    private String indColegio;
    @Column(name = "IND_FIN_PUBLIC")
    private String indFinPublic;
    @Column(name = "IND_CONTROL_IMPRENTA")
    private String indControlImprenta;
    @Column(name = "IND_CONTADO_NETO")
    private String indContadoNeto;
    @Column(name = "IND_PREC_V")
    private Character indPrecV;
    @Column(name = "SINFACBOL")
    private String sinfacbol;
    
    /*
    @JoinColumns({
        @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
        @JoinColumn(name = "CLASE_TRANSC", referencedColumnName = "CLASE_TRANSC")})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Arinctd arinctd;
    */
    
}
