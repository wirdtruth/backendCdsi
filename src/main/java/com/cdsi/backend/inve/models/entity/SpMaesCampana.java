package com.cdsi.backend.inve.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SP_MAES_CAMPANA")
public class SpMaesCampana implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SpMaesCampanaPK spMaesCampanaPK;

    @Column(name = "DESC_CAMP")
    private String descCamp;

    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;

    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "IND_ACTIVO")
    private String indActivo;
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
    @Column(name = "IND_PRODUCCION")
    private String indProduccion;

    @JsonIgnoreProperties({"spMaesCampana","hibernateLazyInitializer","handler"})
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "spMaesCampana", fetch = FetchType.LAZY)
    private List<SpMaesCamp> spMaesCampList;

    public SpMaesCampana() {
    }

    public SpMaesCampana(SpMaesCampanaPK spMaesCampanaPK) {
        this.spMaesCampanaPK = spMaesCampanaPK;
    }

    public SpMaesCampana(SpMaesCampanaPK spMaesCampanaPK, String descCamp, Date fechaInicio, Date fechaFin) {
        this.spMaesCampanaPK = spMaesCampanaPK;
        this.descCamp = descCamp;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public SpMaesCampana(String nroCia, String codiCamp) {
        this.spMaesCampanaPK = new SpMaesCampanaPK(nroCia, codiCamp);
    }

    public SpMaesCampanaPK getSpMaesCampanaPK() {
        return spMaesCampanaPK;
    }

    public void setSpMaesCampanaPK(SpMaesCampanaPK spMaesCampanaPK) {
        this.spMaesCampanaPK = spMaesCampanaPK;
    }

    public String getDescCamp() {
        return descCamp;
    }

    public void setDescCamp(String descCamp) {
        this.descCamp = descCamp;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIndActivo() {
        return indActivo;
    }

    public void setIndActivo(String indActivo) {
        this.indActivo = indActivo;
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

    public String getIndProduccion() {
        return indProduccion;
    }

    public void setIndProduccion(String indProduccion) {
        this.indProduccion = indProduccion;
    }


    public List<SpMaesCamp> getSpMaesCampList() {
        return spMaesCampList;
    }

    public void setSpMaesCampList(List<SpMaesCamp> spMaesCampList) {
        this.spMaesCampList = spMaesCampList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spMaesCampanaPK != null ? spMaesCampanaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpMaesCampana)) {
            return false;
        }
        SpMaesCampana other = (SpMaesCampana) object;
        if ((this.spMaesCampanaPK == null && other.spMaesCampanaPK != null) || (this.spMaesCampanaPK != null && !this.spMaesCampanaPK.equals(other.spMaesCampanaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdsi.traerbeaneactiva.promo.SpMaesCampana[ spMaesCampanaPK=" + spMaesCampanaPK + " ]";
    }
}
