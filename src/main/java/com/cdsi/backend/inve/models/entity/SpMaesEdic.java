package com.cdsi.backend.inve.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "SP_MAES_EDIC")
public class SpMaesEdic implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SpMaesEdicPK spMaesEdicPK;
    @Column(name = "MONEDA")
    private String moneda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO")
    private BigDecimal precio;
    @Column(name = "PORC_DSCTO")
    private BigDecimal porcDscto;
    @Column(name = "IND_FORMATO")
    private String indFormato;
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
    @Column(name = "PRECIO1")
    private BigDecimal precio1;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "MONT_DSCTO")
    private BigDecimal montDscto;

    @JsonIgnoreProperties({"spMaesEdicList","hibernateLazyInitializer","handler"})
    @JoinColumns({
            @JoinColumn(name = "NRO_CIA", referencedColumnName = "NRO_CIA", insertable = false, updatable = false),
            @JoinColumn(name = "CODI_CAMP", referencedColumnName = "CODI_CAMP", insertable = false, updatable = false),
            @JoinColumn(name = "NO_LISTA", referencedColumnName = "NO_LISTA", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SpMaesCamp spMaesCamp;

    public SpMaesEdic() {
    }

    public SpMaesEdic(SpMaesEdicPK spMaesEdicPK) {
        this.spMaesEdicPK = spMaesEdicPK;
    }

    public SpMaesEdic(String nroCia, String codiCamp, String noLista, String noArti) {
        this.spMaesEdicPK = new SpMaesEdicPK(nroCia, codiCamp, noLista, noArti);
    }

    public SpMaesEdicPK getSpMaesEdicPK() {
        return spMaesEdicPK;
    }

    public void setSpMaesEdicPK(SpMaesEdicPK spMaesEdicPK) {
        this.spMaesEdicPK = spMaesEdicPK;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getPorcDscto() {
        return porcDscto;
    }

    public void setPorcDscto(BigDecimal porcDscto) {
        this.porcDscto = porcDscto;
    }

    public String getIndFormato() {
        return indFormato;
    }

    public void setIndFormato(String indFormato) {
        this.indFormato = indFormato;
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

    public BigDecimal getPrecio1() {
        return precio1;
    }

    public void setPrecio1(BigDecimal precio1) {
        this.precio1 = precio1;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getMontDscto() {
        return montDscto;
    }

    public void setMontDscto(BigDecimal montDscto) {
        this.montDscto = montDscto;
    }

    public SpMaesCamp getSpMaesCamp() {
        return spMaesCamp;
    }

    public void setSpMaesCamp(SpMaesCamp spMaesCamp) {
        this.spMaesCamp = spMaesCamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spMaesEdicPK != null ? spMaesEdicPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpMaesEdic)) {
            return false;
        }
        SpMaesEdic other = (SpMaesEdic) object;
        if ((this.spMaesEdicPK == null && other.spMaesEdicPK != null) || (this.spMaesEdicPK != null && !this.spMaesEdicPK.equals(other.spMaesEdicPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdsi.traerbeaneactiva.promo.SpMaesEdic[ spMaesEdicPK=" + spMaesEdicPK + " ]";
    }
}
