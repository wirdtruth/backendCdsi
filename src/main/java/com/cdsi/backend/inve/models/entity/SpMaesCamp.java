package com.cdsi.backend.inve.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SP_MAES_CAMP")
public class SpMaesCamp implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SpMaesCampPK spMaesCampPK;

    @Column(name = "DESC_LISTA")
    private String descLista;

    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;

    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;

    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "COMENTAR")
    private String comentar;
    @Column(name = "IND_LISTA")
    private String indLista;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "IND_PTOVTA")
    private String indPtovta;
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

    @JsonIgnoreProperties({"spMaesCampList","hibernateLazyInitializer","handler"})
    @JoinColumns({
            @JoinColumn(name = "NRO_CIA", referencedColumnName = "NRO_CIA", insertable = false, updatable = false),
            @JoinColumn(name = "CODI_CAMP", referencedColumnName = "CODI_CAMP", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SpMaesCampana spMaesCampana;

    @JsonIgnoreProperties({"spMaesCamp","hibernateLazyInitializer","handler"})
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "spMaesCamp", fetch = FetchType.LAZY)
    private List<SpMaesEdic> spMaesEdicList;

    public SpMaesCamp() {
    }

    public SpMaesCamp(SpMaesCampPK spMaesCampPK) {
        this.spMaesCampPK = spMaesCampPK;
    }

    public SpMaesCamp(SpMaesCampPK spMaesCampPK, String descLista, Date fechaInicio, Date fechaFin, String moneda) {
        this.spMaesCampPK = spMaesCampPK;
        this.descLista = descLista;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.moneda = moneda;
    }

    public SpMaesCamp(String nroCia, String codiCamp, String noLista) {
        this.spMaesCampPK = new SpMaesCampPK(nroCia, codiCamp, noLista);
    }

    public SpMaesCampPK getSpMaesCampPK() {
        return spMaesCampPK;
    }

    public void setSpMaesCampPK(SpMaesCampPK spMaesCampPK) {
        this.spMaesCampPK = spMaesCampPK;
    }

    public String getDescLista() {
        return descLista;
    }

    public void setDescLista(String descLista) {
        this.descLista = descLista;
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

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getComentar() {
        return comentar;
    }

    public void setComentar(String comentar) {
        this.comentar = comentar;
    }

    public String getIndLista() {
        return indLista;
    }

    public void setIndLista(String indLista) {
        this.indLista = indLista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIndPtovta() {
        return indPtovta;
    }

    public void setIndPtovta(String indPtovta) {
        this.indPtovta = indPtovta;
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

    public SpMaesCampana getSpMaesCampana() {
        return spMaesCampana;
    }

    public void setSpMaesCampana(SpMaesCampana spMaesCampana) {
        this.spMaesCampana = spMaesCampana;
    }

    public List<SpMaesEdic> getSpMaesEdicList() {
        return spMaesEdicList;
    }

    public void setSpMaesEdicList(List<SpMaesEdic> spMaesEdicList) {
        this.spMaesEdicList = spMaesEdicList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spMaesCampPK != null ? spMaesCampPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpMaesCamp)) {
            return false;
        }
        SpMaesCamp other = (SpMaesCamp) object;
        if ((this.spMaesCampPK == null && other.spMaesCampPK != null) || (this.spMaesCampPK != null && !this.spMaesCampPK.equals(other.spMaesCampPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdsi.traerbeaneactiva.promo.SpMaesCamp[ spMaesCampPK=" + spMaesCampPK + " ]";
    }
}
