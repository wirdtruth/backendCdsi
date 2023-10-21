package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ARINBO1")
public class Arinbo1 implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected Arinbo1PK arinbo1PK;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "BODEGA_VENTA")
	private String bodegaVenta;
	@Column(name = "ANO")
	private Short ano;
	@Column(name = "MES")
	private Short mes;
	@Column(name = "BLOQUEADO")
	private String bloqueado;
	@Column(name = "NO_SECUEN")
	private Integer noSecuen;
	@Column(name = "FEC_AJUST_AST")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecAjustAst;
	@Column(name = "FEC_AJUST_HTR")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecAjustHtr;
	@Column(name = "MES_AJUST_AST")
	private Short mesAjustAst;
	@Column(name = "MES_AJUST_HTR")
	private Short mesAjustHtr;
	@Column(name = "DIRECCION")
	private String direccion;
	@Column(name = "COD_RESP")
	private String codResp;
	@Column(name = "UBIGEO")
	private String ubigeo;
	@Column(name = "ESTADO")
	private Character estado;
	@Column(name = "IND_TRANSFERENCIA")
	private String indTransferencia;
	@Column(name = "CONTROL_TRANSFERENCIA")
	private String controlTransferencia;
	@Column(name = "CENTRO_FACT")
	private String centroFact;
	@Column(name = "AFECT_COST")
	private String afectCost;
	@Column(name = "CONTABILIZA")
	private String contabiliza;
	@Column(name = "IND_SEMBRADOR")
	private String indSembrador;
	@Column(name = "IND_PT")
	private String indPt;
	@Column(name = "CODI_DEPA")
	private String codiDepa;
	@Column(name = "DEPARTAMENTO")
	private String departamento;
	@Column(name = "CODI_PROV")
	private String codiProv;
	@Column(name = "PROVINCIA")
	private String provincia;
	@Column(name = "CODI_DIST")
	private String codiDist;
	@Column(name = "DISTRITO")
	private String distrito;
	@Column(name = "IND_DESPACHO")
	private Character indDespacho;
	@Column(name = "DNI")
	private String dni;
	@Column(name = "NO_VENDEDOR")
	private String noVendedor;
	@Column(name = "USUARIO")
	private String usuario;
	@Column(name = "TIPO_ALMACEN")
	private String tipoAlmacen;
	@Column(name = "NO_CLIENTE")
	private String noCliente;
	@Column(name = "COD_TIENDA")
	private String codTienda;
	@Column(name = "CONTROL_STOCK")
	private String controlStock;
	@Column(name = "IND_STOCK_REP")
	private String indStockRep;
	@Column(name = "CONTROL_STOCK_MANT")
	private String controlStockMant;
	@Column(name = "LIBRERIA")
	private String libreria;
	@Column(name = "COD_ESTABLEC")
	private String codEstablec;

	@Column(name = "IND_CIERRE")
	private String indCierre;
    /*
	@JoinColumns({
			@JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
			@JoinColumn(name = "GRUPO", referencedColumnName = "GRUPO", insertable = false, updatable = false)})
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Aringr aringr;
    */
	public Arinbo1() {
	}

	public Arinbo1(Arinbo1PK arinbo1PK) {
		this.arinbo1PK = arinbo1PK;
	}

	public Arinbo1(String noCia, String codigo) {
		this.arinbo1PK = new Arinbo1PK(noCia, codigo);
	}

	public Arinbo1PK getArinbo1PK() {
		return arinbo1PK;
	}

	public void setArinbo1PK(Arinbo1PK arinbo1PK) {
		this.arinbo1PK = arinbo1PK;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getBodegaVenta() {
		return bodegaVenta;
	}

	public void setBodegaVenta(String bodegaVenta) {
		this.bodegaVenta = bodegaVenta;
	}

	public Short getAno() {
		return ano;
	}

	public void setAno(Short ano) {
		this.ano = ano;
	}

	public Short getMes() {
		return mes;
	}

	public void setMes(Short mes) {
		this.mes = mes;
	}

	public String getBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(String bloqueado) {
		this.bloqueado = bloqueado;
	}

	public Integer getNoSecuen() {
		return noSecuen;
	}

	public void setNoSecuen(Integer noSecuen) {
		this.noSecuen = noSecuen;
	}

	public Date getFecAjustAst() {
		return fecAjustAst;
	}

	public void setFecAjustAst(Date fecAjustAst) {
		this.fecAjustAst = fecAjustAst;
	}

	public Date getFecAjustHtr() {
		return fecAjustHtr;
	}

	public void setFecAjustHtr(Date fecAjustHtr) {
		this.fecAjustHtr = fecAjustHtr;
	}

	public Short getMesAjustAst() {
		return mesAjustAst;
	}

	public void setMesAjustAst(Short mesAjustAst) {
		this.mesAjustAst = mesAjustAst;
	}

	public Short getMesAjustHtr() {
		return mesAjustHtr;
	}

	public void setMesAjustHtr(Short mesAjustHtr) {
		this.mesAjustHtr = mesAjustHtr;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodResp() {
		return codResp;
	}

	public void setCodResp(String codResp) {
		this.codResp = codResp;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public String getIndTransferencia() {
		return indTransferencia;
	}

	public void setIndTransferencia(String indTransferencia) {
		this.indTransferencia = indTransferencia;
	}

	public String getControlTransferencia() {
		return controlTransferencia;
	}

	public void setControlTransferencia(String controlTransferencia) {
		this.controlTransferencia = controlTransferencia;
	}

	public String getCentroFact() {
		return centroFact;
	}

	public void setCentroFact(String centroFact) {
		this.centroFact = centroFact;
	}

	public String getAfectCost() {
		return afectCost;
	}

	public void setAfectCost(String afectCost) {
		this.afectCost = afectCost;
	}

	public String getContabiliza() {
		return contabiliza;
	}

	public void setContabiliza(String contabiliza) {
		this.contabiliza = contabiliza;
	}

	public String getIndSembrador() {
		return indSembrador;
	}

	public void setIndSembrador(String indSembrador) {
		this.indSembrador = indSembrador;
	}

	public String getIndPt() {
		return indPt;
	}

	public void setIndPt(String indPt) {
		this.indPt = indPt;
	}

	public String getCodiDepa() {
		return codiDepa;
	}

	public void setCodiDepa(String codiDepa) {
		this.codiDepa = codiDepa;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCodiProv() {
		return codiProv;
	}

	public void setCodiProv(String codiProv) {
		this.codiProv = codiProv;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCodiDist() {
		return codiDist;
	}

	public void setCodiDist(String codiDist) {
		this.codiDist = codiDist;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public Character getIndDespacho() {
		return indDespacho;
	}

	public void setIndDespacho(Character indDespacho) {
		this.indDespacho = indDespacho;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNoVendedor() {
		return noVendedor;
	}

	public void setNoVendedor(String noVendedor) {
		this.noVendedor = noVendedor;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTipoAlmacen() {
		return tipoAlmacen;
	}

	public void setTipoAlmacen(String tipoAlmacen) {
		this.tipoAlmacen = tipoAlmacen;
	}

	public String getNoCliente() {
		return noCliente;
	}

	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}

	public String getCodTienda() {
		return codTienda;
	}

	public void setCodTienda(String codTienda) {
		this.codTienda = codTienda;
	}

	public String getControlStock() {
		return controlStock;
	}

	public void setControlStock(String controlStock) {
		this.controlStock = controlStock;
	}

	public String getIndStockRep() {
		return indStockRep;
	}

	public void setIndStockRep(String indStockRep) {
		this.indStockRep = indStockRep;
	}

	public String getControlStockMant() {
		return controlStockMant;
	}

	public void setControlStockMant(String controlStockMant) {
		this.controlStockMant = controlStockMant;
	}

	public String getLibreria() {
		return libreria;
	}

	public void setLibreria(String libreria) {
		this.libreria = libreria;
	}

	public String getCodEstablec() {
		return codEstablec;
	}

	public void setCodEstablec(String codEstablec) {
		this.codEstablec = codEstablec;
	}

	public String getIndCierre() {
		return indCierre;
	}

	public void setIndCierre(String indCierre) {
		this.indCierre = indCierre;
	}
    /*
	public Aringr getAringr() {
		return aringr;
	}

	public void setAringr(Aringr aringr) {
		this.aringr = aringr;
	}
    */
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (arinbo1PK != null ? arinbo1PK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Arinbo1)) {
			return false;
		}
		Arinbo1 other = (Arinbo1) object;
		if ((this.arinbo1PK == null && other.arinbo1PK != null) || (this.arinbo1PK != null && !this.arinbo1PK.equals(other.arinbo1PK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.mycompany.migrarpv.inve.Arinbo1[ arinbo1PK=" + arinbo1PK + " ]";
	}

}
