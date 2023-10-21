package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "ARFAFL")
public class Arfafl implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected ArfaflPK arfaflPK;

    private String BODEGA;
    private String NO_ARTI;
    private Date LOTE;
    private String NO_ENTRADA;
    private BigDecimal CANTIDAD_FACT;
    private BigDecimal CANTIDAD_ORIG;
    private BigDecimal CANTIDAD_ENTR;
    private BigDecimal CANTIDAD_DEV;
    private String TIPO_PRECIO;
    private BigDecimal COSTO;
    private BigDecimal PRECIO_UNIT;
    private BigDecimal PRECIO_UNIT_ORIG;
    private BigDecimal DESCUENTO;
    private BigDecimal TOTAL;
    private String IND_PARENTESCO;
    private String COD_CLI;
    private BigDecimal CAN_CLI;
    private BigDecimal DSCTO_FPAGO;
    private BigDecimal DSCTO_CLIENTE;
    private BigDecimal DSCTO_PROMOCION;
    private BigDecimal DSCTO_OTROS;
    private BigDecimal IGV;
    private BigDecimal ISC;
    private BigDecimal D_PROMO;
    private BigDecimal D_COMER;
    private BigDecimal D_FPAGO;
    private BigDecimal VALOR_VENTA;
    private String CODIGO_NI;
    private String DESCRIPCION;
    private BigDecimal P_DSCTO1;
    private BigDecimal P_DSCTO2;
    private BigDecimal P_DSCTO3;
    private BigDecimal M_DSCTO1;
    private BigDecimal M_DSCTO2;
    private BigDecimal M_DSCTO3;
    private String CODIGO;
    private String IMPRIME;
    private BigDecimal IMP_ISC;
    private BigDecimal IMP_IGV;
    private String FACT_ANTI;
    private String IND_LIN;
    private BigDecimal RET_COMISION;
    private String TIPO_ARTI;
    private String TIPO_REFE_FACTU;
    private String NO_REFE_FACTU;
    private BigDecimal PRECIO_UNIT_REF;
    private BigDecimal P_DSCTO3_REF;
    private String NO_GUIA;
    private BigDecimal CANTIDAD_REF;
    private BigDecimal PRECIO_SIGV;
    private BigDecimal TOTAL_LIN;
    private String CONCEPTO;
    private BigDecimal TOTAL_BRUTO;
    private String CONCEPTO_CTA;
    private BigInteger NO_CONTA;
    private String NRO_LECTURA;
    private String COD_T_PED;
    private String CENTRO_COSTO;
    private BigDecimal TOTALBK;
    private String MARCA1;
    private String TIPO_DOC_ALM;
    private String NO_DOCU_ALM;
    private String IND_COD_BARRA;
    private String MARCA2;
    private String NO_ARTI1;
    private String MARCA3;
    private String TIPO_AFECTACION;
    private BigDecimal OPER_GRAVADAS;
    private BigDecimal OPER_INAFECTAS;
    private BigDecimal OPER_EXONERADAS;
    private BigDecimal OPER_GRATUITAS;
    private BigDecimal PRECIO_UNI;
    private BigInteger ICBPER;
    private String TIPO_BS;

    public Arfafl() {
    }

    public Arfafl(ArfaflPK arfaflPK) {
        this.arfaflPK = arfaflPK;
    }

    public Arfafl(String NO_CIA, String TIPO_DOC, String NO_FACTU, Integer CONSECUTIVO) {
        this.arfaflPK = new ArfaflPK(NO_CIA, TIPO_DOC, NO_FACTU, CONSECUTIVO);
    }

    public ArfaflPK getArfaflPK() {
        return arfaflPK;
    }

    public void setArfaflPK(ArfaflPK arfaflPK) {
        this.arfaflPK = arfaflPK;
    }

    public String getBODEGA() {
        return BODEGA;
    }

    public void setBODEGA(String BODEGA) {
        this.BODEGA = BODEGA;
    }

    public String getNO_ARTI() {
        return NO_ARTI;
    }

    public void setNO_ARTI(String NO_ARTI) {
        this.NO_ARTI = NO_ARTI;
    }

    public Date getLOTE() {
        return LOTE;
    }

    public void setLOTE(Date LOTE) {
        this.LOTE = LOTE;
    }

    public String getNO_ENTRADA() {
        return NO_ENTRADA;
    }

    public void setNO_ENTRADA(String NO_ENTRADA) {
        this.NO_ENTRADA = NO_ENTRADA;
    }

    public BigDecimal getCANTIDAD_FACT() {
        return CANTIDAD_FACT;
    }

    public void setCANTIDAD_FACT(BigDecimal CANTIDAD_FACT) {
        this.CANTIDAD_FACT = CANTIDAD_FACT;
    }

    public BigDecimal getCANTIDAD_ORIG() {
        return CANTIDAD_ORIG;
    }

    public void setCANTIDAD_ORIG(BigDecimal CANTIDAD_ORIG) {
        this.CANTIDAD_ORIG = CANTIDAD_ORIG;
    }

    public BigDecimal getCANTIDAD_ENTR() {
        return CANTIDAD_ENTR;
    }

    public void setCANTIDAD_ENTR(BigDecimal CANTIDAD_ENTR) {
        this.CANTIDAD_ENTR = CANTIDAD_ENTR;
    }

    public BigDecimal getCANTIDAD_DEV() {
        return CANTIDAD_DEV;
    }

    public void setCANTIDAD_DEV(BigDecimal CANTIDAD_DEV) {
        this.CANTIDAD_DEV = CANTIDAD_DEV;
    }

    public String getTIPO_PRECIO() {
        return TIPO_PRECIO;
    }

    public void setTIPO_PRECIO(String TIPO_PRECIO) {
        this.TIPO_PRECIO = TIPO_PRECIO;
    }

    public BigDecimal getCOSTO() {
        return COSTO;
    }

    public void setCOSTO(BigDecimal COSTO) {
        this.COSTO = COSTO;
    }

    public BigDecimal getPRECIO_UNIT() {
        return PRECIO_UNIT;
    }

    public void setPRECIO_UNIT(BigDecimal PRECIO_UNIT) {
        this.PRECIO_UNIT = PRECIO_UNIT;
    }

    public BigDecimal getPRECIO_UNIT_ORIG() {
        return PRECIO_UNIT_ORIG;
    }

    public void setPRECIO_UNIT_ORIG(BigDecimal PRECIO_UNIT_ORIG) {
        this.PRECIO_UNIT_ORIG = PRECIO_UNIT_ORIG;
    }

    public BigDecimal getDESCUENTO() {
        return DESCUENTO;
    }

    public void setDESCUENTO(BigDecimal DESCUENTO) {
        this.DESCUENTO = DESCUENTO;
    }

    public BigDecimal getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(BigDecimal TOTAL) {
        this.TOTAL = TOTAL;
    }

    public String getIND_PARENTESCO() {
        return IND_PARENTESCO;
    }

    public void setIND_PARENTESCO(String IND_PARENTESCO) {
        this.IND_PARENTESCO = IND_PARENTESCO;
    }

    public String getCOD_CLI() {
        return COD_CLI;
    }

    public void setCOD_CLI(String COD_CLI) {
        this.COD_CLI = COD_CLI;
    }

    public BigDecimal getCAN_CLI() {
        return CAN_CLI;
    }

    public void setCAN_CLI(BigDecimal CAN_CLI) {
        this.CAN_CLI = CAN_CLI;
    }

    public BigDecimal getDSCTO_FPAGO() {
        return DSCTO_FPAGO;
    }

    public void setDSCTO_FPAGO(BigDecimal DSCTO_FPAGO) {
        this.DSCTO_FPAGO = DSCTO_FPAGO;
    }

    public BigDecimal getDSCTO_CLIENTE() {
        return DSCTO_CLIENTE;
    }

    public void setDSCTO_CLIENTE(BigDecimal DSCTO_CLIENTE) {
        this.DSCTO_CLIENTE = DSCTO_CLIENTE;
    }

    public BigDecimal getDSCTO_PROMOCION() {
        return DSCTO_PROMOCION;
    }

    public void setDSCTO_PROMOCION(BigDecimal DSCTO_PROMOCION) {
        this.DSCTO_PROMOCION = DSCTO_PROMOCION;
    }

    public BigDecimal getDSCTO_OTROS() {
        return DSCTO_OTROS;
    }

    public void setDSCTO_OTROS(BigDecimal DSCTO_OTROS) {
        this.DSCTO_OTROS = DSCTO_OTROS;
    }

    public BigDecimal getIGV() {
        return IGV;
    }

    public void setIGV(BigDecimal IGV) {
        this.IGV = IGV;
    }

    public BigDecimal getISC() {
        return ISC;
    }

    public void setISC(BigDecimal ISC) {
        this.ISC = ISC;
    }

    public BigDecimal getD_PROMO() {
        return D_PROMO;
    }

    public void setD_PROMO(BigDecimal d_PROMO) {
        D_PROMO = d_PROMO;
    }

    public BigDecimal getD_COMER() {
        return D_COMER;
    }

    public void setD_COMER(BigDecimal d_COMER) {
        D_COMER = d_COMER;
    }

    public BigDecimal getD_FPAGO() {
        return D_FPAGO;
    }

    public void setD_FPAGO(BigDecimal d_FPAGO) {
        D_FPAGO = d_FPAGO;
    }

    public BigDecimal getVALOR_VENTA() {
        return VALOR_VENTA;
    }

    public void setVALOR_VENTA(BigDecimal VALOR_VENTA) {
        this.VALOR_VENTA = VALOR_VENTA;
    }

    public String getCODIGO_NI() {
        return CODIGO_NI;
    }

    public void setCODIGO_NI(String CODIGO_NI) {
        this.CODIGO_NI = CODIGO_NI;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public BigDecimal getP_DSCTO1() {
        return P_DSCTO1;
    }

    public void setP_DSCTO1(BigDecimal p_DSCTO1) {
        P_DSCTO1 = p_DSCTO1;
    }

    public BigDecimal getP_DSCTO2() {
        return P_DSCTO2;
    }

    public void setP_DSCTO2(BigDecimal p_DSCTO2) {
        P_DSCTO2 = p_DSCTO2;
    }

    public BigDecimal getP_DSCTO3() {
        return P_DSCTO3;
    }

    public void setP_DSCTO3(BigDecimal p_DSCTO3) {
        P_DSCTO3 = p_DSCTO3;
    }

    public BigDecimal getM_DSCTO1() {
        return M_DSCTO1;
    }

    public void setM_DSCTO1(BigDecimal m_DSCTO1) {
        M_DSCTO1 = m_DSCTO1;
    }

    public BigDecimal getM_DSCTO2() {
        return M_DSCTO2;
    }

    public void setM_DSCTO2(BigDecimal m_DSCTO2) {
        M_DSCTO2 = m_DSCTO2;
    }

    public BigDecimal getM_DSCTO3() {
        return M_DSCTO3;
    }

    public void setM_DSCTO3(BigDecimal m_DSCTO3) {
        M_DSCTO3 = m_DSCTO3;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getIMPRIME() {
        return IMPRIME;
    }

    public void setIMPRIME(String IMPRIME) {
        this.IMPRIME = IMPRIME;
    }

    public BigDecimal getIMP_ISC() {
        return IMP_ISC;
    }

    public void setIMP_ISC(BigDecimal IMP_ISC) {
        this.IMP_ISC = IMP_ISC;
    }

    public BigDecimal getIMP_IGV() {
        return IMP_IGV;
    }

    public void setIMP_IGV(BigDecimal IMP_IGV) {
        this.IMP_IGV = IMP_IGV;
    }

    public String getFACT_ANTI() {
        return FACT_ANTI;
    }

    public void setFACT_ANTI(String FACT_ANTI) {
        this.FACT_ANTI = FACT_ANTI;
    }

    public String getIND_LIN() {
        return IND_LIN;
    }

    public void setIND_LIN(String IND_LIN) {
        this.IND_LIN = IND_LIN;
    }

    public BigDecimal getRET_COMISION() {
        return RET_COMISION;
    }

    public void setRET_COMISION(BigDecimal RET_COMISION) {
        this.RET_COMISION = RET_COMISION;
    }

    public String getTIPO_ARTI() {
        return TIPO_ARTI;
    }

    public void setTIPO_ARTI(String TIPO_ARTI) {
        this.TIPO_ARTI = TIPO_ARTI;
    }

    public String getTIPO_REFE_FACTU() {
        return TIPO_REFE_FACTU;
    }

    public void setTIPO_REFE_FACTU(String TIPO_REFE_FACTU) {
        this.TIPO_REFE_FACTU = TIPO_REFE_FACTU;
    }

    public String getNO_REFE_FACTU() {
        return NO_REFE_FACTU;
    }

    public void setNO_REFE_FACTU(String NO_REFE_FACTU) {
        this.NO_REFE_FACTU = NO_REFE_FACTU;
    }

    public BigDecimal getPRECIO_UNIT_REFM() {
        return PRECIO_UNIT_REF;
    }

    public void setPRECIO_UNIT_REFM(BigDecimal PRECIO_UNIT_REF) {
        this.PRECIO_UNIT_REF = PRECIO_UNIT_REF;
    }

    public BigDecimal getP_DSCTO3_REF() {
        return P_DSCTO3_REF;
    }

    public void setP_DSCTO3_REF(BigDecimal p_DSCTO3_REF) {
        P_DSCTO3_REF = p_DSCTO3_REF;
    }

    public String getNO_GUIA() {
        return NO_GUIA;
    }

    public void setNO_GUIA(String NO_GUIA) {
        this.NO_GUIA = NO_GUIA;
    }

    public BigDecimal getCANTIDAD_REF() {
        return CANTIDAD_REF;
    }

    public void setCANTIDAD_REF(BigDecimal CANTIDAD_REF) {
        this.CANTIDAD_REF = CANTIDAD_REF;
    }

    public BigDecimal getPRECIO_SIGV() {
        return PRECIO_SIGV;
    }

    public void setPRECIO_SIGV(BigDecimal PRECIO_SIGV) {
        this.PRECIO_SIGV = PRECIO_SIGV;
    }

    public BigDecimal getTOTAL_LIN() {
        return TOTAL_LIN;
    }

    public void setTOTAL_LIN(BigDecimal TOTAL_LIN) {
        this.TOTAL_LIN = TOTAL_LIN;
    }

    public String getCONCEPTO() {
        return CONCEPTO;
    }

    public void setCONCEPTO(String CONCEPTO) {
        this.CONCEPTO = CONCEPTO;
    }

    public BigDecimal getTOTAL_BRUTO() {
        return TOTAL_BRUTO;
    }

    public void setTOTAL_BRUTO(BigDecimal TOTAL_BRUTO) {
        this.TOTAL_BRUTO = TOTAL_BRUTO;
    }

    public String getCONCEPTO_CTA() {
        return CONCEPTO_CTA;
    }

    public void setCONCEPTO_CTA(String CONCEPTO_CTA) {
        this.CONCEPTO_CTA = CONCEPTO_CTA;
    }

    public BigInteger getNO_CONTA() {
        return NO_CONTA;
    }

    public void setNO_CONTA(BigInteger NO_CONTA) {
        this.NO_CONTA = NO_CONTA;
    }

    public String getNRO_LECTURA() {
        return NRO_LECTURA;
    }

    public void setNRO_LECTURA(String NRO_LECTURA) {
        this.NRO_LECTURA = NRO_LECTURA;
    }

    public String getCOD_T_PED() {
        return COD_T_PED;
    }

    public void setCOD_T_PED(String COD_T_PED) {
        this.COD_T_PED = COD_T_PED;
    }

    public String getCENTRO_COSTO() {
        return CENTRO_COSTO;
    }

    public void setCENTRO_COSTO(String CENTRO_COSTO) {
        this.CENTRO_COSTO = CENTRO_COSTO;
    }

    public BigDecimal getTOTALBK() {
        return TOTALBK;
    }

    public void setTOTALBK(BigDecimal TOTALBK) {
        this.TOTALBK = TOTALBK;
    }

    public String getMARCA1() {
        return MARCA1;
    }

    public void setMARCA1(String MARCA1) {
        this.MARCA1 = MARCA1;
    }

    public String getTIPO_DOC_ALM() {
        return TIPO_DOC_ALM;
    }

    public void setTIPO_DOC_ALM(String TIPO_DOC_ALM) {
        this.TIPO_DOC_ALM = TIPO_DOC_ALM;
    }

    public String getNO_DOCU_ALM() {
        return NO_DOCU_ALM;
    }

    public void setNO_DOCU_ALM(String NO_DOCU_ALM) {
        this.NO_DOCU_ALM = NO_DOCU_ALM;
    }

    public String getIND_COD_BARRA() {
        return IND_COD_BARRA;
    }

    public void setIND_COD_BARRA(String IND_COD_BARRA) {
        this.IND_COD_BARRA = IND_COD_BARRA;
    }

    public String getMARCA2() {
        return MARCA2;
    }

    public void setMARCA2(String MARCA2) {
        this.MARCA2 = MARCA2;
    }

    public String getNO_ARTI1() {
        return NO_ARTI1;
    }

    public void setNO_ARTI1(String NO_ARTI1) {
        this.NO_ARTI1 = NO_ARTI1;
    }

    public String getMARCA3() {
        return MARCA3;
    }

    public void setMARCA3(String MARCA3) {
        this.MARCA3 = MARCA3;
    }

    public String getTIPO_AFECTACION() {
        return TIPO_AFECTACION;
    }

    public void setTIPO_AFECTACION(String TIPO_AFECTACION) {
        this.TIPO_AFECTACION = TIPO_AFECTACION;
    }

    public BigDecimal getOPER_GRAVADAS() {
        return OPER_GRAVADAS;
    }

    public void setOPER_GRAVADAS(BigDecimal OPER_GRAVADAS) {
        this.OPER_GRAVADAS = OPER_GRAVADAS;
    }

    public BigDecimal getOPER_INAFECTAS() {
        return OPER_INAFECTAS;
    }

    public void setOPER_INAFECTAS(BigDecimal OPER_INAFECTAS) {
        this.OPER_INAFECTAS = OPER_INAFECTAS;
    }

    public BigDecimal getOPER_EXONERADAS() {
        return OPER_EXONERADAS;
    }

    public void setOPER_EXONERADAS(BigDecimal OPER_EXONERADAS) {
        this.OPER_EXONERADAS = OPER_EXONERADAS;
    }

    public BigDecimal getOPER_GRATUITAS() {
        return OPER_GRATUITAS;
    }

    public void setOPER_GRATUITAS(BigDecimal OPER_GRATUITAS) {
        this.OPER_GRATUITAS = OPER_GRATUITAS;
    }

    public BigDecimal getPRECIO_UNI() {
        return PRECIO_UNI;
    }

    public void setPRECIO_UNI(BigDecimal PRECIO_UNI) {
        this.PRECIO_UNI = PRECIO_UNI;
    }

    public BigInteger getICBPER() {
        return ICBPER;
    }

    public void setICBPER(BigInteger ICBPER) {
        this.ICBPER = ICBPER;
    }

    public String getTIPO_BS() {
        return TIPO_BS;
    }

    public void setTIPO_BS(String TIPO_BS) {
        this.TIPO_BS = TIPO_BS;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arfaflPK != null ? arfaflPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arpfol)) {
            return false;
        }
        Arfafl other = (Arfafl) object;
        if ((this.arfaflPK == null && other.arfaflPK != null) || (this.arfaflPK != null && !this.arfaflPK.equals(other.arfaflPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Arpfol[ arpfolPK=" + arfaflPK + " ]";
    }

}
