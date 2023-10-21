package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ARFACF")
public class Arfacf implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected ArfacfPK arfacfPK;
    
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "TRANS_PTO_VENTA_PED")
    private String transPtoVentaPed;

    @Column(name = "TRANS_PTO_VENTA_CAJA")
    private String transPtoVentaCaja;
    @Column(name = "TRANS_PTO_VENTA_CXC")
    private String transPtoVentaCxc;
    @Column(name = "TIPO_PRECIO_PVEN")
    private String tipoPrecioPven;

    @Column(name = "SERIE_GR")
    private String serieGr;
    @Column(name = "CORREL_FICT")
    private Long correlFict;
    @Column(name = "SERIE_FACT")
    private String serieFact;
    @Column(name = "CENTRO_COSTO")
    private String centroCosto;
    @Column(name = "TRANS_PTO_VENTA_CONS")
    private String transPtoVentaCons;
    @Column(name = "TRANS_PTO_VENTA_CONV")
    private String transPtoVentaConv;
    @Column(name = "IND_PVENT")
    private String indPvent;
    @Column(name = "TRANS_VENTA_CXC")
    private String transVentaCxc;
    @Column(name = "SERIE_PTO_VENTA_CXC")
    private String seriePtoVentaCxc;
    @Column(name = "SERIE_VENTA_CXC")
    private String serieVentaCxc;
    @Column(name = "SERIE_PTO_VENTA_TESO")
    private String seriePtoVentaTeso;
    @Column(name = "LIBRERIA")
    private String libreria;    
    @Column(name = "ON_LINE")
    private String onLine;

    public Arfacf() {
    }

    public Arfacf(ArfacfPK arfacfPK) {
        this.arfacfPK = arfacfPK;
    }

    public Arfacf(String noCia, String centro) {
        this.arfacfPK = new ArfacfPK(noCia, centro);
    }

    public ArfacfPK getArfacfPK() {
        return arfacfPK;
    }

    public void setArfacfPK(ArfacfPK arfacfPK) {
        this.arfacfPK = arfacfPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTransPtoVentaPed() {
        return transPtoVentaPed;
    }

    public void setTransPtoVentaPed(String transPtoVentaPed) {
        this.transPtoVentaPed = transPtoVentaPed;
    }

    public String getTransPtoVentaCaja() {
        return transPtoVentaCaja;
    }

    public void setTransPtoVentaCaja(String transPtoVentaCaja) {
        this.transPtoVentaCaja = transPtoVentaCaja;
    }

    public String getTransPtoVentaCxc() {
        return transPtoVentaCxc;
    }

    public void setTransPtoVentaCxc(String transPtoVentaCxc) {
        this.transPtoVentaCxc = transPtoVentaCxc;
    }

    public String getTipoPrecioPven() {
        return tipoPrecioPven;
    }

    public void setTipoPrecioPven(String tipoPrecioPven) {
        this.tipoPrecioPven = tipoPrecioPven;
    }

    public String getSerieGr() {
        return serieGr;
    }

    public void setSerieGr(String serieGr) {
        this.serieGr = serieGr;
    }

    public Long getCorrelFict() {
        return correlFict;
    }

    public void setCorrelFict(Long correlFict) {
        this.correlFict = correlFict;
    }

    public String getSerieFact() {
        return serieFact;
    }

    public void setSerieFact(String serieFact) {
        this.serieFact = serieFact;
    }

    public String getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    public String getTransPtoVentaCons() {
        return transPtoVentaCons;
    }

    public void setTransPtoVentaCons(String transPtoVentaCons) {
        this.transPtoVentaCons = transPtoVentaCons;
    }

    public String getTransPtoVentaConv() {
        return transPtoVentaConv;
    }

    public void setTransPtoVentaConv(String transPtoVentaConv) {
        this.transPtoVentaConv = transPtoVentaConv;
    }

    public String getIndPvent() {
        return indPvent;
    }

    public void setIndPvent(String indPvent) {
        this.indPvent = indPvent;
    }

    public String getTransVentaCxc() {
        return transVentaCxc;
    }

    public void setTransVentaCxc(String transVentaCxc) {
        this.transVentaCxc = transVentaCxc;
    }

    public String getSeriePtoVentaCxc() {
        return seriePtoVentaCxc;
    }

    public void setSeriePtoVentaCxc(String seriePtoVentaCxc) {
        this.seriePtoVentaCxc = seriePtoVentaCxc;
    }

    public String getSerieVentaCxc() {
        return serieVentaCxc;
    }

    public void setSerieVentaCxc(String serieVentaCxc) {
        this.serieVentaCxc = serieVentaCxc;
    }

    public String getSeriePtoVentaTeso() {
        return seriePtoVentaTeso;
    }

    public void setSeriePtoVentaTeso(String seriePtoVentaTeso) {
        this.seriePtoVentaTeso = seriePtoVentaTeso;
    }

    public String getLibreria() {
        return libreria;
    }

    public void setLibreria(String libreria) {
        this.libreria = libreria;
    }

    public String getOnLine() {
        return onLine;
    }

    public void setOnLine(String onLine) {
        this.onLine = onLine;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arfacfPK != null ? arfacfPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arfacf)) {
            return false;
        }
        Arfacf other = (Arfacf) object;
        if ((this.arfacfPK == null && other.arfacfPK != null) || (this.arfacfPK != null && !this.arfacfPK.equals(other.arfacfPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Arfacf[ arfacfPK=" + arfacfPK + " ]";
    }

}
