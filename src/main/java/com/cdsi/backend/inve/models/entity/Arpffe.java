package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ARPFFE")
public class Arpffe implements Serializable {
	
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArpffePK arpffePK;
    
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @Column(name = "GRUPO")
    private String grupo;

    @Column(name = "NO_CLIENTE")
    private String noCliente;
    @Column(name = "NO_VENDEDOR")
    private String noVendedor;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    
    @Column(name = "NO_ORDEN")
    private String noOrden;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "TIPO_DOC")
    private String tipoDoc;
    @Column(name = "NO_FACTU")
    private String noFactu;

    @Column(name = "CENTRO")
    private String centro;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "CLASE")
    private String clase;
    /*
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "TIPO_DOC_REM")
    private String tipoDocRem;
    @Column(name = "SERIE_DOC_REM")
    private String serieDocRem;
    @Column(name = "CORR_DOC_REM")
    private String corrDocRem;
    */
    @Column(name = "NO_DOCU")
    private String noDocu;
 
    @Column(name = "TIPO_TRANSC")
    private String tipoTransc;

    @Column(name = "USUARIO")
    private String usuario;

    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    /*
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    
    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;
    
    @Column(name = "NO_SOLIC")
    private String noSolic;
    */
    @Column(name = "COD_FPAGO")
    private String codFpago;
    @Column(name = "ALMA_ORIGEN")
    private String almaOrigen;
    @Column(name = "ALMA_DESTINO")
    private String almaDestino;

    @Column(name = "NOMBRE_DIGI")
    private String nombreDigi;
    /*
    @Column(name = "TIPO_ARTI")
    private String tipoArti;
    @Column(name = "MOTIVO_ANULA")
    private String motivoAnula;
    */
    @Column(name = "IND_FACTURA")
    private String indFactura;
    @Column(name = "IND_BOLETA")
    private String indBoleta;
    /*
    @Column(name = "F_ANULACION")
    @Temporal(TemporalType.DATE)
    private Date fAnulacion;
    */
    @Column(name = "COD_TIENDA")
    private String codTienda;
    
    @Column(name = "TIPO_GUIA")
    private String tipoGuia;
    
    @Column(name = "IMPRIME")
    private String imprime;

    @Column(name = "IND_PVENT")
    private String indPvent;
    @Column(name = "COD_CAJA")
    private String codCaja;

    @Column(name = "IND_FERIAS")
    private String indFerias;
    
    @Column(name = "IND_PROVINCIA")
    private String indProvincia;
    
    @Column(name = "CONSUMO")
    private String consumo;
    
    @Column(name = "CONVENIO")
    private String convenio;
    
    @Column(name = "IND_COD_BARRA")
    private String indCodBarra;
    
    @Column(name = "IND_FICTA")
    private String indFicta;
    
    @Column(name = "IND_PROFORMA")
    private String indProforma;
    
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumns({
            @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
            @JoinColumn(name = "BODEGA", referencedColumnName = "BODEGA", insertable = false, updatable = false),
            @JoinColumn(name = "NO_GUIA", referencedColumnName = "NO_GUIA", insertable = false, updatable = false)
    })
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Arpffl> arpfflList;
    
    public Arpffe() {
    }

    public Arpffe(ArpffePK arpffePK) {
        this.arpffePK = arpffePK;
    }

    public Arpffe(String noCia, String bodega, String noGuia) {
        this.arpffePK = new ArpffePK(noCia, bodega, noGuia);
    }
    
	public ArpffePK getArpffePK() {
		return arpffePK;
	}

	public void setArpffePK(ArpffePK arpffePK) {
		this.arpffePK = arpffePK;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	public String getNoVendedor() {
		return noVendedor;
	}

	public void setNoVendedor(String noVendedor) {
		this.noVendedor = noVendedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNoOrden() {
		return noOrden;
	}

	public void setNoOrden(String noOrden) {
		this.noOrden = noOrden;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNoFactu() {
		return noFactu;
	}

	public void setNoFactu(String noFactu) {
		this.noFactu = noFactu;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getNoDocu() {
		return noDocu;
	}

	public void setNoDocu(String noDocu) {
		this.noDocu = noDocu;
	}

	public String getTipoTransc() {
		return tipoTransc;
	}

	public void setTipoTransc(String tipoTransc) {
		this.tipoTransc = tipoTransc;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getCodFpago() {
		return codFpago;
	}

	public void setCodFpago(String codFpago) {
		this.codFpago = codFpago;
	}

	public String getAlmaOrigen() {
		return almaOrigen;
	}

	public void setAlmaOrigen(String almaOrigen) {
		this.almaOrigen = almaOrigen;
	}

	public String getAlmaDestino() {
		return almaDestino;
	}

	public void setAlmaDestino(String almaDestino) {
		this.almaDestino = almaDestino;
	}

	public String getNombreDigi() {
		return nombreDigi;
	}

	public void setNombreDigi(String nombreDigi) {
		this.nombreDigi = nombreDigi;
	}

	public String getIndFactura() {
		return indFactura;
	}

	public void setIndFactura(String indFactura) {
		this.indFactura = indFactura;
	}

	public String getIndBoleta() {
		return indBoleta;
	}

	public void setIndBoleta(String indBoleta) {
		this.indBoleta = indBoleta;
	}

	public String getCodTienda() {
		return codTienda;
	}

	public void setCodTienda(String codTienda) {
		this.codTienda = codTienda;
	}

	public String getTipoGuia() {
		return tipoGuia;
	}

	public void setTipoGuia(String tipoGuia) {
		this.tipoGuia = tipoGuia;
	}

	public String getImprime() {
		return imprime;
	}

	public void setImprime(String imprime) {
		this.imprime = imprime;
	}

	public String getIndPvent() {
		return indPvent;
	}

	public void setIndPvent(String indPvent) {
		this.indPvent = indPvent;
	}

	public String getCodCaja() {
		return codCaja;
	}

	public void setCodCaja(String codCaja) {
		this.codCaja = codCaja;
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

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getIndCodBarra() {
		return indCodBarra;
	}

	public void setIndCodBarra(String indCodBarra) {
		this.indCodBarra = indCodBarra;
	}

	public String getIndFicta() {
		return indFicta;
	}

	public void setIndFicta(String indFicta) {
		this.indFicta = indFicta;
	}

	public String getIndProforma() {
		return indProforma;
	}

	public void setIndProforma(String indProforma) {
		this.indProforma = indProforma;
	}

	public List<Arpffl> getArpfflList() {
		return arpfflList;
	}

	public void setArpfflList(List<Arpffl> arpfflList) {
		this.arpfflList = arpfflList;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (arpffePK != null ? arpffePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arpffe)) {
            return false;
        }
        Arpffe other = (Arpffe) object;
        if ((this.arpffePK == null && other.arpffePK != null) || (this.arpffePK != null && !this.arpffePK.equals(other.arpffePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Arpffe[ arpffePK=" + arpffePK + " ]";
    }
}
