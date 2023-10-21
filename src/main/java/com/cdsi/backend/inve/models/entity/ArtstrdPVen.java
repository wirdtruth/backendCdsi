package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "ARTSTRD_PVEN")
public class ArtstrdPVen implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected ArtstrdPVenPK artstrdPVenPK;
	
	@Column(name = "CLASE_TRANSC")
	private String claseTransc;
	@Column(name = "TIPO_M")
	private String tipoM;
	@Column(name = "TIPO_ACC")
	private String tAcc;
	@Column(name = "COD_ENTIDAD")
	private String codEntidad;
	@Column(name = "FECHA")
	private String fecha;
	@Column(name = "NO_OPERACION")
	private String noOperacion;
	@Column(name = "FECHA_CH_DIFE")
	private String fechaDife;
	@Column(name = "IMPORTE")
	private BigDecimal importe;
	@Column(name = "CLASE_TRANSC_REF")
	private String claseTranscRef;
	@Column(name = "TIPO_M_REF")
	private String tipoMRef;
	@Column(name = "TIPO_FORMATO_REF")
	private String tipoFormatoRef;
	@Column(name = "SERIE_FORMATO_REF")
	private String serieFormatoRef;
	@Column(name = "NO_FORMATO_REF")
	private String noFormatoRef;
	@Column(name = "USUARIO")
	private String usuario;
	@Column(name = "FECHA_SIST")
	private String fechaSist;
	@Column(name = "COD_BANCO")
	private String codBanco;
	@Column(name = "TIPO_CABA_ORI")
	private String tipoCabaOri;
	@Column(name = "COD_CABA_ORI")
	private String codCabaOri;
	@Column(name = "TIPO_CABA_DES")
	private String tipoCabaDes;
	@Column(name = "COD_CABA_DES")
	private String codCabaDes;
	@Column(name = "COD_CABA_REF")
	private String codCabaRef;
	@Column(name = "PLANILLA_REVERSADA")
	private String planillaReversada;
	@Column(name = "PLANILLA_REVERSION")
	private String planillaReversion;
	@Column(name = "TIPO_PARTE_DIARIO")
	private String tipoParteDiario;
	@Column(name = "SERIE_PARTE_DIARIO")
	private String serieParteDiario;
	@Column(name = "NO_DOCU_PARTE_DIARIO")
	private String noDocuParteDiario;
	@Column(name = "IND_REASIG_CHEQUE")
	private String indReasigCheque;
	@Column(name = "CLASE_TARJ")
	private String claseTarj;
	@Column(name = "TIPO_OPER")
	private String tipoOper;
	@Column(name = "COD_OPER")
	private String codOper;
	@Column(name = "IMP_DOL")
	private BigDecimal impDol;
	@Column(name = "IMP_SOL")
	private BigDecimal impSol;
	@Column(name = "VUELTO")
	private BigDecimal vuelto;
	@Column(name = "IMP_TC")
	private BigDecimal impTc;
	@Column(name = "MARCA1")
	private String marca1;
	
	public ArtstrdPVen() {
	}
	
	public ArtstrdPVen(ArtstrdPVenPK artstrdPVenPK) {
		this.artstrdPVenPK = artstrdPVenPK;
	}

	public ArtstrdPVenPK getArtstrdPVenPK() {
		return artstrdPVenPK;
	}

	public void setArtstrdPVenPK(ArtstrdPVenPK artstrdPVenPK) {
		this.artstrdPVenPK = artstrdPVenPK;
	}

	public String getClaseTransc() {
		return claseTransc;
	}

	public void setClaseTransc(String claseTransc) {
		this.claseTransc = claseTransc;
	}

	public String getTipoM() {
		return tipoM;
	}

	public void setTipoM(String tipoM) {
		this.tipoM = tipoM;
	}

	public String gettAcc() {
		return tAcc;
	}

	public void settAcc(String tAcc) {
		this.tAcc = tAcc;
	}

	public String getCodEntidad() {
		return codEntidad;
	}

	public void setCodEntidad(String codEntidad) {
		this.codEntidad = codEntidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNoOperacion() {
		return noOperacion;
	}

	public void setNoOperacion(String noOperacion) {
		this.noOperacion = noOperacion;
	}

	public String getFechaDife() {
		return fechaDife;
	}

	public void setFechaDife(String fechaDife) {
		this.fechaDife = fechaDife;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public String getClaseTranscRef() {
		return claseTranscRef;
	}

	public void setClaseTranscRef(String claseTranscRef) {
		this.claseTranscRef = claseTranscRef;
	}

	public String getTipoMRef() {
		return tipoMRef;
	}

	public void setTipoMRef(String tipoMRef) {
		this.tipoMRef = tipoMRef;
	}

	public String getTipoFormatoRef() {
		return tipoFormatoRef;
	}

	public void setTipoFormatoRef(String tipoFormatoRef) {
		this.tipoFormatoRef = tipoFormatoRef;
	}

	public String getSerieFormatoRef() {
		return serieFormatoRef;
	}

	public void setSerieFormatoRef(String serieFormatoRef) {
		this.serieFormatoRef = serieFormatoRef;
	}

	public String getNoFormatoRef() {
		return noFormatoRef;
	}

	public void setNoFormatoRef(String noFormatoRef) {
		this.noFormatoRef = noFormatoRef;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getFechaSist() {
		return fechaSist;
	}

	public void setFechaSist(String fechaSist) {
		this.fechaSist = fechaSist;
	}

	public String getCodBanco() {
		return codBanco;
	}

	public void setCodBanco(String codBanco) {
		this.codBanco = codBanco;
	}

	public String getTipoCabaOri() {
		return tipoCabaOri;
	}

	public void setTipoCabaOri(String tipoCabaOri) {
		this.tipoCabaOri = tipoCabaOri;
	}

	public String getCodCabaOri() {
		return codCabaOri;
	}

	public void setCodCabaOri(String codCabaOri) {
		this.codCabaOri = codCabaOri;
	}

	public String getTipoCabaDes() {
		return tipoCabaDes;
	}

	public void setTipoCabaDes(String tipoCabaDes) {
		this.tipoCabaDes = tipoCabaDes;
	}

	public String getCodCabaDes() {
		return codCabaDes;
	}

	public void setCodCabaDes(String codCabaDes) {
		this.codCabaDes = codCabaDes;
	}

	public String getCodCabaRef() {
		return codCabaRef;
	}

	public void setCodCabaRef(String codCabaRef) {
		this.codCabaRef = codCabaRef;
	}

	public String getPlanillaReversada() {
		return planillaReversada;
	}

	public void setPlanillaReversada(String planillaReversada) {
		this.planillaReversada = planillaReversada;
	}

	public String getPlanillaReversion() {
		return planillaReversion;
	}

	public void setPlanillaReversion(String planillaReversion) {
		this.planillaReversion = planillaReversion;
	}

	public String getTipoParteDiario() {
		return tipoParteDiario;
	}

	public void setTipoParteDiario(String tipoParteDiario) {
		this.tipoParteDiario = tipoParteDiario;
	}

	public String getSerieParteDiario() {
		return serieParteDiario;
	}

	public void setSerieParteDiario(String serieParteDiario) {
		this.serieParteDiario = serieParteDiario;
	}

	public String getNoDocuParteDiario() {
		return noDocuParteDiario;
	}

	public void setNoDocuParteDiario(String noDocuParteDiario) {
		this.noDocuParteDiario = noDocuParteDiario;
	}

	public String getIndReasigCheque() {
		return indReasigCheque;
	}

	public void setIndReasigCheque(String indReasigCheque) {
		this.indReasigCheque = indReasigCheque;
	}

	public String getClaseTarj() {
		return claseTarj;
	}

	public void setClaseTarj(String claseTarj) {
		this.claseTarj = claseTarj;
	}

	public String getTipoOper() {
		return tipoOper;
	}

	public void setTipoOper(String tipoOper) {
		this.tipoOper = tipoOper;
	}

	public String getCodOper() {
		return codOper;
	}

	public void setCodOper(String codOper) {
		this.codOper = codOper;
	}

	public BigDecimal getImpDol() {
		return impDol;
	}

	public void setImpDol(BigDecimal impDol) {
		this.impDol = impDol;
	}

	public BigDecimal getImpSol() {
		return impSol;
	}

	public void setImpSol(BigDecimal impSol) {
		this.impSol = impSol;
	}

	public BigDecimal getVuelto() {
		return vuelto;
	}

	public void setVuelto(BigDecimal vuelto) {
		this.vuelto = vuelto;
	}

	public BigDecimal getImpTc() {
		return impTc;
	}

	public void setImpTc(BigDecimal impTc) {
		this.impTc = impTc;
	}

	public String getMarca1() {
		return marca1;
	}

	public void setMarca1(String marca1) {
		this.marca1 = marca1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artstrdPVenPK == null) ? 0 : artstrdPVenPK.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArtstrdPVen other = (ArtstrdPVen) obj;
		if (artstrdPVenPK == null) {
			if (other.artstrdPVenPK != null)
				return false;
		} else if (!artstrdPVenPK.equals(other.artstrdPVenPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artstrd_PVen [artstrd_PVenPK=" + artstrdPVenPK + "]";
	}
	
	

}
