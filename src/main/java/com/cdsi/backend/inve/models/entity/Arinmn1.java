package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ARINMN1")
public class Arinmn1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Arinmn1PK arinmn1PK;
    @Column(name = "ANO")
    private int ano;
    @Column(name = "MES")
    private int mes;
    @Column(name = "LOTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lote;
    @Column(name = "NO_ENTRADA")
    private String noEntrada;
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UNIDADES")
    private BigDecimal unidades;
    /*
    @Column(name = "VENDEDOR")
    private String vendedor;
    @Column(name = "VENTA")
    private BigDecimal venta;
    @Column(name = "DESCUENTO")    
    private BigDecimal descuento;
    */
    @Column(name = "NO_LINEA")
    private Integer noLinea;
    @Column(name = "NO_ORDEN")
    private String noOrden;
    /*
    @Column(name = "VEHICULO")
    private String vehiculo;
    @Column(name = "TRANSFERIDO")
    private String transferido;
    @Column(name = "CONTENIDO")
    private BigDecimal contenido;
    @Column(name = "CONTENIDO_UND")
    private String contenidoUnd;
    */
    @Column(name = "TIPO_DOC_REFE")
    private String tipoDocRefe;
    /*
    @Column(name = "PESO")
    private BigDecimal peso;
    @Column(name = "OBSLIN")
    private String obslin;
    @Column(name = "NO_REQUI")
    private String noRequi;
    @Column(name = "NO_PED_MANT")
    private String noPedMant;
    @Column(name = "FECHA_COST_REPO_SIST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCostRepoSist;
    @Column(name = "FECHA_COST_UNI_SIST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCostUniSist;
    @Column(name = "COSTO_REPO")
    private BigDecimal costoRepo;
    @Column(name = "IND_COSTO_EXCEPCION")
    private String indCostoExcepcion;
    @Column(name = "UNIDAD")
    private String unidad;
    @Column(name = "STOCK_ALMACEN")
    private BigDecimal stockAlmacen;
    @Column(name = "COD_FORMATO")
    private String codFormato;
    @Column(name = "SERIE_ORDEN")
    private String serieOrden;
    */
    @Column(name = "IND_PVENT")
    private String indPvent;
    /*@Column(name = "COD_PRE_ORDEN")
    private String codPreOrden;
    @Column(name = "COSTO_UNI")
    private BigDecimal costoUni;
    @Column(name = "FEC_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCrea;
    @Column(name = "USU_CREA")
    private String usuCrea;
    @Column(name = "COD_PRE_ORDEN1")
    private String codPreOrden1;
    @Column(name = "MARCA1")
    private String marca1;
    @Column(name = "FECHA1")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha1;
    @Column(name = "MARCA2")
    private String marca2;
    @Column(name = "NO_ARTI1")
    private String noArti1;
    @Column(name = "MARCA3")
    private String marca3;
    */
    @Column(name = "TIPO_BS")
    private String tipoBs;

    public Arinmn1() {
    }

    public Arinmn1(Arinmn1PK arinmn1PK) {
        this.arinmn1PK = arinmn1PK;
    }

    public Arinmn1(String noCia, String bodega, String noArti, String tipoDoc, String noDocu) {
        this.arinmn1PK = new Arinmn1PK(noCia, bodega, noArti, tipoDoc, noDocu);
    }

    public Arinmn1PK getArinmn1PK() {
        return arinmn1PK;
    }

    public void setArinmn1PK(Arinmn1PK arinmn1PK) {
        this.arinmn1PK = arinmn1PK;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getUnidades() {
        return unidades;
    }

    public void setUnidades(BigDecimal unidades) {
        this.unidades = unidades;
    }

    public Integer getNoLinea() {
        return noLinea;
    }

    public void setNoLinea(Integer noLinea) {
        this.noLinea = noLinea;
    }

    public String getNoOrden() {
        return noOrden;
    }

    public void setNoOrden(String noOrden) {
        this.noOrden = noOrden;
    }

    public String getTipoDocRefe() {
        return tipoDocRefe;
    }

    public void setTipoDocRefe(String tipoDocRefe) {
        this.tipoDocRefe = tipoDocRefe;
    }

    public String getIndPvent() {
        return indPvent;
    }

    public void setIndPvent(String indPvent) {
        this.indPvent = indPvent;
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
        hash += (arinmn1PK != null ? arinmn1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arinmn1)) {
            return false;
        }
        Arinmn1 other = (Arinmn1) object;
        if ((this.arinmn1PK == null && other.arinmn1PK != null) || (this.arinmn1PK != null && !this.arinmn1PK.equals(other.arinmn1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.inve.Arinmn1[ arinmn1PK=" + arinmn1PK + " ]";
    }
    
}