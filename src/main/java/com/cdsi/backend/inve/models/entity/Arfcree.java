package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ARFCREE")
public class Arfcree implements Serializable {
	
	@EmbeddedId
	protected ArfcreePK arfcreePk;
    @Column(name = "DESDE")
    private String desde;
    @Column(name = "HASTA")
    private String hasta;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "MONTO")
    private BigDecimal monto;
    @Column(name = "COD_FP")
    private String codFP;
    @Column(name = "CUOTA")
    private int cuota;
    @Column(name = "FEC_EMI")
    private String fecEmi;
    @Column(name = "IND_DETRAC")
    private String detrac;
    @Column(name = "RETENCION")
    private String retencion;
    @Column(name = "PERCEPTION")
    private String percepcion;
    @Column(name = "SALDO_CUOTA_DRP")
    private BigDecimal saldoDRP;
    @Column(name = "PORCEN_DETRACCION")
    private BigDecimal porcenDetrac;
    @Column(name = "PORCEN_RETENCION")
    private BigDecimal porcenRetenc;
    @Column(name = "PORCEN_PERCEPTION")
    private BigDecimal porcenPercep;
    @Column(name = "NOMBRE_DRP")
    private String nombreDRP;
    @Column(name = "IMPORTE_DRP")
    private BigDecimal imporDRP;
    
    @JsonIgnoreProperties({"gibernateLazyInitializer","handler"})
    @JoinColumns({
    	@JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
    	@JoinColumn(name = "NO_ORDEN", referencedColumnName = "NO_ORDEN", insertable = false, updatable = false),
    	@JoinColumn(name = "NO_CLIENTE", referencedColumnName = "NO_CLIENTE", insertable = false, updatable = false)
    })
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Arfcred> arfcredList;
    
    public Arfcree() {
    	
    }
    
	public List<Arfcred> getArfcredList() {
		return arfcredList;
	}

	public void setArfcredList(List<Arfcred> arfcredList) {
		this.arfcredList = arfcredList;
	}

	public Arfcree(ArfcreePK arfcreePk) {
		this.arfcreePk = arfcreePk;
	}
	public ArfcreePK getArfcreePk() {
		return arfcreePk;
	}
	public void setArfcreePk(ArfcreePK arfcreePk) {
		this.arfcreePk = arfcreePk;
	}
	public String getDesde() {
		return desde;
	}
	public void setDesde(String desde) {
		this.desde = desde;
	}
	public String getHasta() {
		return hasta;
	}
	public void setHasta(String hasta) {
		this.hasta = hasta;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getCodFP() {
		return codFP;
	}
	public void setCodFP(String codFP) {
		this.codFP = codFP;
	}
	public int getCuota() {
		return cuota;
	}
	public void setCuota(int cuota) {
		this.cuota = cuota;
	}
	public String getFecEmi() {
		return fecEmi;
	}
	public void setFecEmi(String fecEmi) {
		this.fecEmi = fecEmi;
	}
	public String getDetrac() {
		return detrac;
	}
	public void setDetrac(String detrac) {
		this.detrac = detrac;
	}
	public String getRetencion() {
		return retencion;
	}
	public void setRetencion(String retencion) {
		this.retencion = retencion;
	}
	public String getPercepcion() {
		return percepcion;
	}
	public void setPercepcion(String percepcion) {
		this.percepcion = percepcion;
	}
	public BigDecimal getSaldoDRP() {
		return saldoDRP;
	}
	public void setSaldoDRP(BigDecimal saldoDRP) {
		this.saldoDRP = saldoDRP;
	}
	public BigDecimal getPorcenDetrac() {
		return porcenDetrac;
	}
	public void setPorcenDetrac(BigDecimal porcenDetrac) {
		this.porcenDetrac = porcenDetrac;
	}
	public BigDecimal getPorcenRetenc() {
		return porcenRetenc;
	}
	public void setPorcenRetenc(BigDecimal porcenRetenc) {
		this.porcenRetenc = porcenRetenc;
	}
	public BigDecimal getPorcenPercep() {
		return porcenPercep;
	}
	public void setPorcenPercep(BigDecimal porcenPercep) {
		this.porcenPercep = porcenPercep;
	}
	public String getNombreDRP() {
		return nombreDRP;
	}
	public void setNombreDRP(String nombreDRP) {
		this.nombreDRP = nombreDRP;
	}
	public BigDecimal getImporDRP() {
		return imporDRP;
	}
	public void setImporDRP(BigDecimal imporDRP) {
		this.imporDRP = imporDRP;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arfcreePk == null) ? 0 : arfcreePk.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Arfcree)) return false;
		Arfcree other = (Arfcree) obj;
		if (arfcreePk == null) {
			if (other.arfcreePk != null)
				return false;
		} else if (!arfcreePk.equals(other.arfcreePk))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Arfcree { 'arfcreePk' : '" + arfcreePk + "' }";
	}
    
    

}
