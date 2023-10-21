package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ARPFOL")
public class Arpfol implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArpfolPK arpfolPK;

    @Column(name = "NO_CLIENTE")
    private String noCliente;
    @Column(name = "TIPO_ARTI")
    private String tipoArti;
    @Column(name = "ARTI_NUEVO")
    private String artiNuevo;
    @Column(name = "BODEGA")
    private String bodega;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANT_COMP")
    private BigDecimal cantComp;
    @Column(name = "CANT_SOLICITADA")
    private BigDecimal cantSolicitada;
    
    @Column(name = "CANT_ENTREG")
    private BigDecimal cantEntreg;
    
    @Column(name = "CANT_ASIGNADA")
    private BigDecimal cantAsignada;
    @Column(name = "CANT_REASIGNADA")
    private BigDecimal cantReasignada;

    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "PRECIO")
    private BigDecimal precio;
    
    @Column(name = "TOT_LINEA")
    private BigDecimal totLinea;

    @Column(name = "IGV")
    private BigDecimal igv;

    @Column(name = "NO_LINEA")
    private Short noLinea;
 
    @Column(name = "IMP_IGV")
    private BigDecimal impIgv;

    @Column(name = "PRECIO_SIGV")
    private BigDecimal precioSigv;
    @Column(name = "TOTAL_LIN")
    private BigDecimal totalLin;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    
    @Column(name = "TIPO_BS")
    private String tipoBs;
    
    @Column(name = "OPER_EXONERADAS")
    private BigDecimal operExoneradas;
    @Column(name = "OPER_GRATUITAS")
    private BigDecimal operGratuitas;
    @Column(name = "OPER_GRAVADAS")
    private BigDecimal operGravadas;
    @Column(name = "OPER_INAFECTAS")
    private BigDecimal operInafectas;
    @Column(name = "TIPO_AFECTACION")
    private String tipoAfectacion;

    @Column(name = "MEDIDA")
    private String medida;
    @Column(name = "ICBPER")
    private BigInteger icbper;
    @Column(name = "PRECIO_UNI")
    private BigDecimal precioUni;  
    
    @Column(name = "P_DSCTO3")
    private BigDecimal dscto;
    
    public BigDecimal getDscto() {
		return dscto;
	}

	public void setDscto(BigDecimal dscto) {
		this.dscto = dscto;
	}

	public String getTipoBs() {
		return tipoBs;
	}

	public void setTipoBs(String tipoBs) {
		this.tipoBs = tipoBs;
	}

	public Arpfol() {
    }

    public Arpfol(ArpfolPK arpfolPK) {
        this.arpfolPK = arpfolPK;
    }

    public Arpfol(String noCia, String noOrden, String noArti) {
        this.arpfolPK = new ArpfolPK(noCia, noOrden, noArti);
    }

    public ArpfolPK getArpfolPK() {
		return arpfolPK;
	}

	public void setArpfolPK(ArpfolPK arpfolPK) {
		this.arpfolPK = arpfolPK;
	}

	public String getNoCliente() {
		return noCliente;
	}

	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}

	public String getTipoArti() {
		return tipoArti;
	}

	public void setTipoArti(String tipoArti) {
		this.tipoArti = tipoArti;
	}

	public String getArtiNuevo() {
		return artiNuevo;
	}

	public void setArtiNuevo(String artiNuevo) {
		this.artiNuevo = artiNuevo;
	}

	public String getBodega() {
		return bodega;
	}

	public void setBodega(String bodega) {
		this.bodega = bodega;
	}

	public BigDecimal getCantComp() {
		return cantComp;
	}

	public void setCantComp(BigDecimal cantComp) {
		this.cantComp = cantComp;
	}

	public BigDecimal getCantSolicitada() {
		return cantSolicitada;
	}

	public void setCantSolicitada(BigDecimal cantSolicitada) {
		this.cantSolicitada = cantSolicitada;
	}


	public BigDecimal getCantEntreg() {
		return cantEntreg;
	}

	public void setCantEntreg(BigDecimal cantEntreg) {
		this.cantEntreg = cantEntreg;
	}


	public BigDecimal getCantAsignada() {
		return cantAsignada;
	}

	public void setCantAsignada(BigDecimal cantAsignada) {
		this.cantAsignada = cantAsignada;
	}

	public BigDecimal getCantReasignada() {
		return cantReasignada;
	}

	public void setCantReasignada(BigDecimal cantReasignada) {
		this.cantReasignada = cantReasignada;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getTotLinea() {
		return totLinea;
	}

	public void setTotLinea(BigDecimal totLinea) {
		this.totLinea = totLinea;
	}

	public BigDecimal getIgv() {
		return igv;
	}

	public void setIgv(BigDecimal igv) {
		this.igv = igv;
	}

	public Short getNoLinea() {
		return noLinea;
	}

	public void setNoLinea(Short noLinea) {
		this.noLinea = noLinea;
	}

	public BigDecimal getImpIgv() {
		return impIgv;
	}

	public void setImpIgv(BigDecimal impIgv) {
		this.impIgv = impIgv;
	}

	public BigDecimal getPrecioSigv() {
		return precioSigv;
	}

	public void setPrecioSigv(BigDecimal precioSigv) {
		this.precioSigv = precioSigv;
	}

	public BigDecimal getTotalLin() {
		return totalLin;
	}

	public void setTotalLin(BigDecimal totalLin) {
		this.totalLin = totalLin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public String getTipoAfectacion() {
		return tipoAfectacion;
	}

	public void setTipoAfectacion(String tipoAfectacion) {
		this.tipoAfectacion = tipoAfectacion;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public BigInteger getIcbper() {
		return icbper;
	}

	public void setIcbper(BigInteger icbper) {
		this.icbper = icbper;
	}

	public BigDecimal getPrecioUni() {
		return precioUni;
	}

	public void setPrecioUni(BigDecimal precioUni) {
		this.precioUni = precioUni;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (arpfolPK != null ? arpfolPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arpfol)) {
            return false;
        }
        Arpfol other = (Arpfol) object;
        if ((this.arpfolPK == null && other.arpfolPK != null) || (this.arpfolPK != null && !this.arpfolPK.equals(other.arpfolPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.factu.Arpfol[ arpfolPK=" + arpfolPK + " ]";
    }
    
}