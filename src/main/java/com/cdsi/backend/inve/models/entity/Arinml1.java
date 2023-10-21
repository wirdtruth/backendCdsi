package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ARINML1")
public class Arinml1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Arinml1PK arinml1PK;
    
    @Column(name = "NO_LINEA")
    private Integer noLinea;
    @Column(name = "LOTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lote;
    @Column(name = "NO_ENTRADA")
    private String noEntrada;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UNIDADES")
    private BigDecimal unidades;
    @Column(name = "CONTENIDO")
    private BigDecimal contenido;
    /*
    @Column(name = "CONTENIDO_UND")
    private String contenidoUnd;    
    @Column(name = "MONTO")
    private BigDecimal monto;
    @Column(name = "IND_CONTROL")
    private String indControl;
    */
    @Column(name = "UND_REFERENCIA")
    private BigDecimal undReferencia;
    @Column(name = "LOTE_LOG")
    private Short loteLog;
    @Column(name = "STOCK_ALMACEN")
    private BigDecimal stockAlmacen;
    
	/*
    @Column(name = "MONEDA_ARTI")
    private String monedaArti;
    @Column(name = "LINEA_EXT")
    private Short lineaExt;
    @Column(name = "CLASE")
    private String clase;
    @Column(name = "CATEGORIA")
    private String categoria;
    @Column(name = "PESO")
    private BigDecimal peso;
    @Column(name = "OBSLIN")
    private String obslin;
    @Column(name = "NO_REQUI")
    private String noRequi;
    @Column(name = "COSTO_UNI")
    private BigDecimal costoUni;    
    @Column(name = "UNIDAD")
    private String unidad;
    @Column(name = "CONSUMO")
    private BigDecimal consumo;
    @Column(name = "COD_PRE_ORDEN")
    private String codPreOrden;
    @Column(name = "COD_ANTIGUO")
    private String codAntiguo;
    @Column(name = "IND_COD_BARRA")
    private String indCodBarra;
    @Column(name = "STOCK_ALMACEN1")
    private BigDecimal stockAlmacen1;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "COD_PRE_ORDEN1")
    private String codPreOrden1;
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
    @Column(name = "MARCA1")
    private String marca1;
    @Column(name = "MARCA2")
    private String marca2;
    @Column(name = "NO_ARTI1")
    private String noArti1;
    @Column(name = "MARCA3")
    private String marca3;
    */
    @Column(name = "TIPO_BS")
    private String tipoBs;
    
    public Arinml1() {
    }

    public Arinml1(Arinml1PK arinml1PK) {
        this.arinml1PK = arinml1PK;
    }

    public Arinml1(String noCia, String bodega, String tipoDoc, String noDocu, String noArti) {
        this.arinml1PK = new Arinml1PK(noCia, bodega, tipoDoc, noDocu, noArti);
    }
    
    public Arinml1PK getArinml1PK() {
		return arinml1PK;
	}

	public void setArinml1PK(Arinml1PK arinml1pk) {
		arinml1PK = arinml1pk;
	}

	public Integer getNoLinea() {
		return noLinea;
	}


    public BigDecimal getStockAlmacen() {
		return stockAlmacen;
	}

	public void setStockAlmacen(BigDecimal stockAlmacen) {
		this.stockAlmacen = stockAlmacen;
	}

	
	public void setNoLinea(Integer noLinea) {
		this.noLinea = noLinea;
	}

	public Date getLote() {
		return lote;
	}

	public void setLote(Date lote) {
		this.lote = lote;
	}

	public String getNoEntrada() {
		return noEntrada;
	}

	public void setNoEntrada(String noEntrada) {
		this.noEntrada = noEntrada;
	}

	public BigDecimal getUnidades() {
		return unidades;
	}

	public void setUnidades(BigDecimal unidades) {
		this.unidades = unidades;
	}

	public BigDecimal getContenido() {
		return contenido;
	}

	public void setContenido(BigDecimal contenido) {
		this.contenido = contenido;
	}

	public BigDecimal getUndReferencia() {
		return undReferencia;
	}

	public void setUndReferencia(BigDecimal undReferencia) {
		this.undReferencia = undReferencia;
	}

	public Short getLoteLog() {
		return loteLog;
	}

	public void setLoteLog(Short loteLog) {
		this.loteLog = loteLog;
	}

	public String getTipoBs() {
		return tipoBs;
	}

	public void setTipoBs(String tipoBs) {
		this.tipoBs = tipoBs;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (arinml1PK != null ? arinml1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arinml1)) {
            return false;
        }
        Arinml1 other = (Arinml1) object;
        if ((this.arinml1PK == null && other.arinml1PK != null) || (this.arinml1PK != null && !this.arinml1PK.equals(other.arinml1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "INVE.Arinml1[ arinml1PK=" + arinml1PK + " ]";
    }
}
