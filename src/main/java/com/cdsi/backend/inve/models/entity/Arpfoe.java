package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "ARPFOE")
public class Arpfoe implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArpfoePK arpfoePK;
    
    @Column(name = "COD_FPAGO")
    private String codFpago;
    
    @Column(name = "GRUPO")
    private String grupo;
    @Column(name = "NO_CLIENTE")
    private String noCliente;
    @Column(name = "DIVISION")
    private String division;

    @Column(name = "NO_VENDEDOR")
    private String noVendedor;
    @Column(name = "COD_T_PED")
    private String codTPed;

    @Column(name = "F_RECEPCION")
    @Temporal(TemporalType.DATE)
    private Date fRecepcion;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "F_APROBACION")
    @Temporal(TemporalType.DATE)
    private Date fAprobacion;
        
    @Column(name = "TIPO_PRECIO")
    private String tipoPrecio;
    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "TIPO_CAMBIO")
    private BigDecimal tipoCambio;
    @Column(name = "SUB_TOTAL")
    private BigDecimal subTotal;
    @Column(name = "T_IMPUESTO")
    private BigDecimal tImpuesto;
    @Column(name = "T_PRECIO")
    private BigDecimal tPrecio;
    @Column(name = "IMPUESTO")
    private BigDecimal impuesto;
    @Column(name = "IMP_ISC")
    private BigDecimal impIsc;

    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "BODEGA")
    private String bodega;

    @Column(name = "IGV")
    private BigDecimal igv;
    @Column(name = "IND_GUIADO")
    private String indGuiado;
    
    @Column(name = "NO_SOLIC")
    private String noSolic;
    @Column(name = "OBSERVA")
    private String observa;
       
    @Column(name = "PER_DE_GRACIA")
    private Short perDeGracia;
    
    @Column(name = "DIRECCION_COMERCIAL")
    private String direccionComercial;
    
    @Column(name = "CODI_DEPA")
    private String codiDepa;
    @Column(name = "CODI_PROV")
    private String codiProv;
    @Column(name = "CODI_DIST")
    private String codiDist;

    @Column(name = "MOTIVO_TRASLADO")
    private String motivoTraslado;
    @Column(name = "NOMBRE_CLIENTE")
    private String nombreCliente;
    @Column(name = "RUC")
    private String ruc;

    @Column(name = "T_DESCUENTO")
    private BigDecimal tDescuento;

    @Column(name = "FECHA_DOC_REF")
    @Temporal(TemporalType.DATE)
    private Date fechaDocRef;
    @Column(name = "TIPO_DOC_REF")
    private String tipoDocRef;
    @Column(name = "COD_CLAS_PED")
    private String codClasPed;
    @Column(name = "TIPO_FPAGO")
    private String tipoFpago;
    @Column(name = "T_DSCTO_GLOBAL")
    private BigDecimal tDsctoGlobal;
    @Column(name = "T_VALOR_VENTA")
    private BigDecimal tValorVenta;

    @Column(name = "COD_TIENDA")
    private String codTienda;
    @Column(name = "NOMB_TIENDA")
    private String nombTienda;
    @Column(name = "DIREC_TIENDA")
    private String direcTienda;
    @Column(name = "ALMA_ORIGEN")
    private String almaOrigen;
    
    @Column(name = "ALMA_DESTINO")
    private String almaDestino;

	@Column(name = "TIPO_ARTI")
    private String tipoArti;

    @Column(name = "TIPO_DOC_CLI")
    private String tipoDocCli;
    
    @Column(name = "NUM_DOC_CLI")
    private String numDocCli;

    @Column(name = "TOTAL_BRUTO")
    private BigDecimal totalBruto;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "IND_PVENT")
    private String indPvent;
    @Column(name = "CENTRO")
    private String centro;
    @Column(name = "IND_FACTURA1")
    private String indFactura1;
    @Column(name = "IND_BOLETA1")
    private String indBoleta1;
    @Column(name = "COD_CAJA")
    private String codCaja;
    @Column(name = "CAJERA")
    private String cajera;

    @Column(name = "CENTRO_COSTO")
    private String centroCosto;
    @Column(name = "IND_NOTA_CRED")
    private String indNotaCred;
    @Column(name = "IND_EXPORTACION")
    private String indExportacion;
    @Column(name = "CONSUMO")
    private String consumo;
    @Column(name = "IND_FERIAS")
    private String indFerias;

    @Column(name = "IND_PROVINCIA")
    private String indProvincia;

    @Column(name = "REDONDEO")
    private BigDecimal redondeo;
    @Column(name = "IND_COD_BARRA")
    private String indCodBarra;

    @Column(name = "OPER_EXONERADAS")
    private BigDecimal operExoneradas;
    @Column(name = "OPER_GRATUITAS")
    private BigDecimal operGratuitas;
    @Column(name = "OPER_GRAVADAS")
    private BigDecimal operGravadas;
    @Column(name = "OPER_INAFECTAS")
    private BigDecimal operInafectas;
    @Column(name = "TIPO_OPERACION")
    private String tipoOperacion;
    @Column(name = "EMAIL_PEDIDO")
    private String emailPedido;
    
    @Column(name = "MOT_CONTING")
    private String motConting;
    
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumns({
            @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
            @JoinColumn(name = "NO_ORDEN", referencedColumnName = "NO_ORDEN", insertable = false, updatable = false)})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Arpfol> arpfolList;
    
    public Arpfoe() {
    }
    

    public Arpfoe(ArpfoePK arpfoePK) {
        this.arpfoePK = arpfoePK;
    }

    public Arpfoe(String noCia, String noOrden) {
        this.arpfoePK = new ArpfoePK(noCia, noOrden);
    }

    public ArpfoePK getArpfoePK() {
		return arpfoePK;
	}
     
    public String getMotConting() {
		return motConting;
	}


	public void setMotConting(String motConting) {
		this.motConting = motConting;
	}


	public String getAlmaDestino() {
		return almaDestino;
	}

	public void setAlmaDestino(String almaDestino) {
		this.almaDestino = almaDestino;
	}

	public void setArpfoePK(ArpfoePK arpfoePK) {
		this.arpfoePK = arpfoePK;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getNoCliente() {
		return noCliente;
	}

	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getNoVendedor() {
		return noVendedor;
	}

	public void setNoVendedor(String noVendedor) {
		this.noVendedor = noVendedor;
	}

	public String getCodTPed() {
		return codTPed;
	}

	public void setCodTPed(String codTPed) {
		this.codTPed = codTPed;
	}

	public String getCodFpago() {
		return codFpago;
	}

	public void setCodFpago(String codFpago) {
		this.codFpago = codFpago;
	}

	public Date getfRecepcion() {
		return fRecepcion;
	}

	public void setfRecepcion(Date fRecepcion) {
		this.fRecepcion = fRecepcion;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getfAprobacion() {
		return fAprobacion;
	}

	public void setfAprobacion(Date fAprobacion) {
		this.fAprobacion = fAprobacion;
	}

	public String getTipoPrecio() {
		return tipoPrecio;
	}

	public void setTipoPrecio(String tipoPrecio) {
		this.tipoPrecio = tipoPrecio;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public BigDecimal getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(BigDecimal tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BigDecimal gettImpuesto() {
		return tImpuesto;
	}

	public void settImpuesto(BigDecimal tImpuesto) {
		this.tImpuesto = tImpuesto;
	}

	public BigDecimal gettPrecio() {
		return tPrecio;
	}

	public void settPrecio(BigDecimal tPrecio) {
		this.tPrecio = tPrecio;
	}

	public BigDecimal getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(BigDecimal impuesto) {
		this.impuesto = impuesto;
	}

	public BigDecimal getImpIsc() {
		return impIsc;
	}

	public void setImpIsc(BigDecimal impIsc) {
		this.impIsc = impIsc;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBodega() {
		return bodega;
	}

	public void setBodega(String bodega) {
		this.bodega = bodega;
	}

	public BigDecimal getIgv() {
		return igv;
	}

	public void setIgv(BigDecimal igv) {
		this.igv = igv;
	}

	public String getIndGuiado() {
		return indGuiado;
	}

	public void setIndGuiado(String indGuiado) {
		this.indGuiado = indGuiado;
	}

	public String getNoSolic() {
		return noSolic;
	}

	public void setNoSolic(String noSolic) {
		this.noSolic = noSolic;
	}

	public String getObserva() {
		return observa;
	}

	public void setObserva(String observa) {
		this.observa = observa;
	}

	public Short getPerDeGracia() {
		return perDeGracia;
	}

	public void setPerDeGracia(Short perDeGracia) {
		this.perDeGracia = perDeGracia;
	}

	public String getDireccionComercial() {
		return direccionComercial;
	}

	public void setDireccionComercial(String direccionComercial) {
		this.direccionComercial = direccionComercial;
	}

	public String getCodiDepa() {
		return codiDepa;
	}

	public void setCodiDepa(String codiDepa) {
		this.codiDepa = codiDepa;
	}

	public String getCodiProv() {
		return codiProv;
	}

	public void setCodiProv(String codiProv) {
		this.codiProv = codiProv;
	}

	public String getCodiDist() {
		return codiDist;
	}

	public void setCodiDist(String codiDist) {
		this.codiDist = codiDist;
	}

	public String getMotivoTraslado() {
		return motivoTraslado;
	}

	public void setMotivoTraslado(String motivoTraslado) {
		this.motivoTraslado = motivoTraslado;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public BigDecimal gettDescuento() {
		return tDescuento;
	}

	public void settDescuento(BigDecimal tDescuento) {
		this.tDescuento = tDescuento;
	}

	public Date getFechaDocRef() {
		return fechaDocRef;
	}

	public void setFechaDocRef(Date fechaDocRef) {
		this.fechaDocRef = fechaDocRef;
	}

	public String getTipoDocRef() {
		return tipoDocRef;
	}

	public void setTipoDocRef(String tipoDocRef) {
		this.tipoDocRef = tipoDocRef;
	}

	public String getCodClasPed() {
		return codClasPed;
	}

	public void setCodClasPed(String codClasPed) {
		this.codClasPed = codClasPed;
	}

	public String getTipoFpago() {
		return tipoFpago;
	}

	public void setTipoFpago(String tipoFpago) {
		this.tipoFpago = tipoFpago;
	}

	public BigDecimal gettDsctoGlobal() {
		return tDsctoGlobal;
	}

	public void settDsctoGlobal(BigDecimal tDsctoGlobal) {
		this.tDsctoGlobal = tDsctoGlobal;
	}

	public BigDecimal gettValorVenta() {
		return tValorVenta;
	}

	public void settValorVenta(BigDecimal tValorVenta) {
		this.tValorVenta = tValorVenta;
	}

	public String getCodTienda() {
		return codTienda;
	}

	public void setCodTienda(String codTienda) {
		this.codTienda = codTienda;
	}

	public String getNombTienda() {
		return nombTienda;
	}

	public void setNombTienda(String nombTienda) {
		this.nombTienda = nombTienda;
	}

	public String getDirecTienda() {
		return direcTienda;
	}

	public void setDirecTienda(String direcTienda) {
		this.direcTienda = direcTienda;
	}

	public String getAlmaOrigen() {
		return almaOrigen;
	}

	public void setAlmaOrigen(String almaOrigen) {
		this.almaOrigen = almaOrigen;
	}

	public String getTipoArti() {
		return tipoArti;
	}

	public void setTipoArti(String tipoArti) {
		this.tipoArti = tipoArti;
	}

	public String getTipoDocCli() {
		return tipoDocCli;
	}

	public void setTipoDocCli(String tipoDocCli) {
		this.tipoDocCli = tipoDocCli;
	}

	public String getNumDocCli() {
		return numDocCli;
	}

	public void setNumDocCli(String numDocCli) {
		this.numDocCli = numDocCli;
	}

	public BigDecimal getTotalBruto() {
		return totalBruto;
	}

	public void setTotalBruto(BigDecimal totalBruto) {
		this.totalBruto = totalBruto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIndPvent() {
		return indPvent;
	}

	public void setIndPvent(String indPvent) {
		this.indPvent = indPvent;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getIndFactura1() {
		return indFactura1;
	}

	public void setIndFactura1(String indFactura1) {
		this.indFactura1 = indFactura1;
	}

	public String getIndBoleta1() {
		return indBoleta1;
	}

	public void setIndBoleta1(String indBoleta1) {
		this.indBoleta1 = indBoleta1;
	}

	public String getCodCaja() {
		return codCaja;
	}

	public void setCodCaja(String codCaja) {
		this.codCaja = codCaja;
	}

	public String getCajera() {
		return cajera;
	}

	public void setCajera(String cajera) {
		this.cajera = cajera;
	}

	public String getCentroCosto() {
		return centroCosto;
	}

	public void setCentroCosto(String centroCosto) {
		this.centroCosto = centroCosto;
	}

	public String getIndNotaCred() {
		return indNotaCred;
	}

	public void setIndNotaCred(String indNotaCred) {
		this.indNotaCred = indNotaCred;
	}

	public String getIndExportacion() {
		return indExportacion;
	}

	public void setIndExportacion(String indExportacion) {
		this.indExportacion = indExportacion;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public String getIndFerias() {
		return indFerias;
	}

	public void setIndFerias(String indFerias) {
		this.indFerias = indFerias;
	}

	public String getIndProvincia() {
		return indProvincia;
	}

	public void setIndProvincia(String indProvincia) {
		this.indProvincia = indProvincia;
	}

	public BigDecimal getRedondeo() {
		return redondeo;
	}

	public void setRedondeo(BigDecimal redondeo) {
		this.redondeo = redondeo;
	}

	public String getIndCodBarra() {
		return indCodBarra;
	}

	public void setIndCodBarra(String indCodBarra) {
		this.indCodBarra = indCodBarra;
	}

	public BigDecimal getOperExoneradas() {
		return operExoneradas;
	}

	public void setOperExoneradas(BigDecimal operExoneradas) {
		this.operExoneradas = operExoneradas;
	}

	public BigDecimal getOperGratuitas() {
		return operGratuitas;
	}

	public void setOperGratuitas(BigDecimal operGratuitas) {
		this.operGratuitas = operGratuitas;
	}

	public BigDecimal getOperGravadas() {
		return operGravadas;
	}

	public void setOperGravadas(BigDecimal operGravadas) {
		this.operGravadas = operGravadas;
	}

	public BigDecimal getOperInafectas() {
		return operInafectas;
	}

	public void setOperInafectas(BigDecimal operInafectas) {
		this.operInafectas = operInafectas;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public String getEmailPedido() {
		return emailPedido;
	}

	public void setEmailPedido(String emailPedido) {
		this.emailPedido = emailPedido;
	}

	public List<Arpfol> getArpfolList() {
		return arpfolList;
	}

	public void setArpfolList(List<Arpfol> arpfolList) {
		this.arpfolList = arpfolList;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (arpfoePK != null ? arpfoePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arpfoe)) {
            return false;
        }
        Arpfoe other = (Arpfoe) object;
        if ((this.arpfoePK == null && other.arpfoePK != null) || (this.arpfoePK != null && !this.arpfoePK.equals(other.arpfoePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.factu.Arpfoe[ arpfoePK=" + arpfoePK + " ]";
    }
    
}