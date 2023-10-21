package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ARCGCAN")
public class Arcgcan implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArcgcanPK arcgcanPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "CUENTA_FILTRO")
    private String cuentaFiltro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALDO_MES_ANT_NI")
    private BigDecimal saldoMesAntNi;
    @Column(name = "DEBITOS_NI")
    private BigDecimal debitosNi;
    @Column(name = "CREDITOS_NI")
    private BigDecimal creditosNi;
    @Column(name = "SALDO_MES_ANT_DI")
    private BigDecimal saldoMesAntDi;
    @Column(name = "DEBITOS_DI")
    private BigDecimal debitosDi;
    @Column(name = "CREDITOS_DI")
    private BigDecimal creditosDi;
    @Column(name = "SALDO_MES_ANT_NDI")
    private BigDecimal saldoMesAntNdi;
    @Column(name = "DEBITOS_NDI")
    private BigDecimal debitosNdi;
    @Column(name = "CREDITOS_NDI")
    private BigDecimal creditosNdi;
    @Column(name = "SALDO_MES_ANT_DNI")
    private BigDecimal saldoMesAntDni;
    @Column(name = "DEBITOS_DNI")
    private BigDecimal debitosDni;
    @Column(name = "CREDITOS_DNI")
    private BigDecimal creditosDni;
    @Column(name = "SALDO_MES_ANT_NG")
    private BigDecimal saldoMesAntNg;
    @Column(name = "DEBITOS_NG")
    private BigDecimal debitosNg;
    @Column(name = "CREDITOS_NG")
    private BigDecimal creditosNg;
    @Column(name = "SALDO_MES_ANT_DG")
    private BigDecimal saldoMesAntDg;
    @Column(name = "DEBITOS_DG")
    private BigDecimal debitosDg;
    @Column(name = "CREDITOS_DG")
    private BigDecimal creditosDg;
    @Column(name = "SALDO_MES_ANT_NDG")
    private BigDecimal saldoMesAntNdg;
    @Column(name = "DEBITOS_NDG")
    private BigDecimal debitosNdg;
    @Column(name = "CREDITOS_NDG")
    private BigDecimal creditosNdg;
    @Column(name = "SALDO_MES_ANT_DNG")
    private BigDecimal saldoMesAntDng;
    @Column(name = "DEBITOS_DNG")
    private BigDecimal debitosDng;
    @Column(name = "CREDITOS_DNG")
    private BigDecimal creditosDng;
    @Column(name = "IND_MOV")
    private String indMov;
    @Column(name = "CUENTA_FILTRO1")
    private String cuentaFiltro1;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FEC_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCrea;
    @Column(name = "USU_CREA")
    private String usuCrea;
    @Column(name = "USU_MODI")
    private String usuModi;
    @Column(name = "FEC_MODI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecModi;

    public Arcgcan() {
    }

    public Arcgcan(ArcgcanPK arcgcanPK) {
        this.arcgcanPK = arcgcanPK;
    }

    public Arcgcan(String noCia, String tipoAnalitico, String codAnalitico) {
        this.arcgcanPK = new ArcgcanPK(noCia, tipoAnalitico, codAnalitico);
    }

    public ArcgcanPK getArcgcanPK() {
        return arcgcanPK;
    }

    public void setArcgcanPK(ArcgcanPK arcgcanPK) {
        this.arcgcanPK = arcgcanPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCuentaFiltro() {
        return cuentaFiltro;
    }

    public void setCuentaFiltro(String cuentaFiltro) {
        this.cuentaFiltro = cuentaFiltro;
    }

    public BigDecimal getSaldoMesAntNi() {
        return saldoMesAntNi;
    }

    public void setSaldoMesAntNi(BigDecimal saldoMesAntNi) {
        this.saldoMesAntNi = saldoMesAntNi;
    }

    public BigDecimal getDebitosNi() {
        return debitosNi;
    }

    public void setDebitosNi(BigDecimal debitosNi) {
        this.debitosNi = debitosNi;
    }

    public BigDecimal getCreditosNi() {
        return creditosNi;
    }

    public void setCreditosNi(BigDecimal creditosNi) {
        this.creditosNi = creditosNi;
    }

    public BigDecimal getSaldoMesAntDi() {
        return saldoMesAntDi;
    }

    public void setSaldoMesAntDi(BigDecimal saldoMesAntDi) {
        this.saldoMesAntDi = saldoMesAntDi;
    }

    public BigDecimal getDebitosDi() {
        return debitosDi;
    }

    public void setDebitosDi(BigDecimal debitosDi) {
        this.debitosDi = debitosDi;
    }

    public BigDecimal getCreditosDi() {
        return creditosDi;
    }

    public void setCreditosDi(BigDecimal creditosDi) {
        this.creditosDi = creditosDi;
    }

    public BigDecimal getSaldoMesAntNdi() {
        return saldoMesAntNdi;
    }

    public void setSaldoMesAntNdi(BigDecimal saldoMesAntNdi) {
        this.saldoMesAntNdi = saldoMesAntNdi;
    }

    public BigDecimal getDebitosNdi() {
        return debitosNdi;
    }

    public void setDebitosNdi(BigDecimal debitosNdi) {
        this.debitosNdi = debitosNdi;
    }

    public BigDecimal getCreditosNdi() {
        return creditosNdi;
    }

    public void setCreditosNdi(BigDecimal creditosNdi) {
        this.creditosNdi = creditosNdi;
    }

    public BigDecimal getSaldoMesAntDni() {
        return saldoMesAntDni;
    }

    public void setSaldoMesAntDni(BigDecimal saldoMesAntDni) {
        this.saldoMesAntDni = saldoMesAntDni;
    }

    public BigDecimal getDebitosDni() {
        return debitosDni;
    }

    public void setDebitosDni(BigDecimal debitosDni) {
        this.debitosDni = debitosDni;
    }

    public BigDecimal getCreditosDni() {
        return creditosDni;
    }

    public void setCreditosDni(BigDecimal creditosDni) {
        this.creditosDni = creditosDni;
    }

    public BigDecimal getSaldoMesAntNg() {
        return saldoMesAntNg;
    }

    public void setSaldoMesAntNg(BigDecimal saldoMesAntNg) {
        this.saldoMesAntNg = saldoMesAntNg;
    }

    public BigDecimal getDebitosNg() {
        return debitosNg;
    }

    public void setDebitosNg(BigDecimal debitosNg) {
        this.debitosNg = debitosNg;
    }

    public BigDecimal getCreditosNg() {
        return creditosNg;
    }

    public void setCreditosNg(BigDecimal creditosNg) {
        this.creditosNg = creditosNg;
    }

    public BigDecimal getSaldoMesAntDg() {
        return saldoMesAntDg;
    }

    public void setSaldoMesAntDg(BigDecimal saldoMesAntDg) {
        this.saldoMesAntDg = saldoMesAntDg;
    }

    public BigDecimal getDebitosDg() {
        return debitosDg;
    }

    public void setDebitosDg(BigDecimal debitosDg) {
        this.debitosDg = debitosDg;
    }

    public BigDecimal getCreditosDg() {
        return creditosDg;
    }

    public void setCreditosDg(BigDecimal creditosDg) {
        this.creditosDg = creditosDg;
    }

    public BigDecimal getSaldoMesAntNdg() {
        return saldoMesAntNdg;
    }

    public void setSaldoMesAntNdg(BigDecimal saldoMesAntNdg) {
        this.saldoMesAntNdg = saldoMesAntNdg;
    }

    public BigDecimal getDebitosNdg() {
        return debitosNdg;
    }

    public void setDebitosNdg(BigDecimal debitosNdg) {
        this.debitosNdg = debitosNdg;
    }

    public BigDecimal getCreditosNdg() {
        return creditosNdg;
    }

    public void setCreditosNdg(BigDecimal creditosNdg) {
        this.creditosNdg = creditosNdg;
    }

    public BigDecimal getSaldoMesAntDng() {
        return saldoMesAntDng;
    }

    public void setSaldoMesAntDng(BigDecimal saldoMesAntDng) {
        this.saldoMesAntDng = saldoMesAntDng;
    }

    public BigDecimal getDebitosDng() {
        return debitosDng;
    }

    public void setDebitosDng(BigDecimal debitosDng) {
        this.debitosDng = debitosDng;
    }

    public BigDecimal getCreditosDng() {
        return creditosDng;
    }

    public void setCreditosDng(BigDecimal creditosDng) {
        this.creditosDng = creditosDng;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public String getCuentaFiltro1() {
        return cuentaFiltro1;
    }

    public void setCuentaFiltro1(String cuentaFiltro1) {
        this.cuentaFiltro1 = cuentaFiltro1;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecCrea() {
        return fecCrea;
    }

    public void setFecCrea(Date fecCrea) {
        this.fecCrea = fecCrea;
    }

    public String getUsuCrea() {
        return usuCrea;
    }

    public void setUsuCrea(String usuCrea) {
        this.usuCrea = usuCrea;
    }

    public String getUsuModi() {
        return usuModi;
    }

    public void setUsuModi(String usuModi) {
        this.usuModi = usuModi;
    }

    public Date getFecModi() {
        return fecModi;
    }

    public void setFecModi(Date fecModi) {
        this.fecModi = fecModi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arcgcanPK != null ? arcgcanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arcgcan)) {
            return false;
        }
        Arcgcan other = (Arcgcan) object;
        if ((this.arcgcanPK == null && other.arcgcanPK != null) || (this.arcgcanPK != null && !this.arcgcanPK.equals(other.arcgcanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conta.Arcgcan[ arcgcanPK=" + arcgcanPK + " ]";
    }
}
