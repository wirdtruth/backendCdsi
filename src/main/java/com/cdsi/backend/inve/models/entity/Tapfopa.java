package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "TAPFOPA")
public class Tapfopa implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TapfopaPK tapfopaPK;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "PLAZO")
    private Short plazo;
    @Column(name = "PLAZO2")
    private Short plazo2;
    @Column(name = "PLAZO3")
    private Short plazo3;
    @Column(name = "PLAZO4")
    private Short plazo4;
    @Column(name = "PLAZO5")
    private Short plazo5;
    @Column(name = "PLAZO6")
    private Short plazo6;
    @Column(name = "PLAZO7")
    private Short plazo7;
    @Column(name = "PLAZO8")
    private Short plazo8;
    @Column(name = "PLAZO9")
    private Short plazo9;
    @Column(name = "PLAZO10")
    private Short plazo10;
    @Column(name = "PLAZO11")
    private Short plazo11;
    @Column(name = "PLAZO12")
    private Short plazo12;
    @Basic(optional = false)
    @Column(name = "TIPO_FPAGO")
    private String tipoFpago;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    /*
    @Column(name = "FEC_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCrea;
    @Column(name = "USU_CREA")
    private String usuCrea;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FEC_MODI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecModi;
    */

    public Tapfopa() {
    }

    public Tapfopa(TapfopaPK tapfopaPK) {
        this.tapfopaPK = tapfopaPK;
    }

    public Tapfopa(TapfopaPK tapfopaPK, String descripcion, String tipoFpago, String estado) {
        this.tapfopaPK = tapfopaPK;
        this.descripcion = descripcion;
        this.tipoFpago = tipoFpago;
        this.estado = estado;
    }

    public Tapfopa(String noCia, String codFpago) {
        this.tapfopaPK = new TapfopaPK(noCia, codFpago);
    }

    public TapfopaPK getTapfopaPK() {
        return tapfopaPK;
    }

    public void setTapfopaPK(TapfopaPK tapfopaPK) {
        this.tapfopaPK = tapfopaPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Short getPlazo() {
        return plazo;
    }

    public void setPlazo(Short plazo) {
        this.plazo = plazo;
    }

    public Short getPlazo2() {
        return plazo2;
    }

    public void setPlazo2(Short plazo2) {
        this.plazo2 = plazo2;
    }

    public Short getPlazo3() {
        return plazo3;
    }

    public void setPlazo3(Short plazo3) {
        this.plazo3 = plazo3;
    }

    public Short getPlazo4() {
        return plazo4;
    }

    public void setPlazo4(Short plazo4) {
        this.plazo4 = plazo4;
    }

    public Short getPlazo5() {
        return plazo5;
    }

    public void setPlazo5(Short plazo5) {
        this.plazo5 = plazo5;
    }

    public Short getPlazo6() {
        return plazo6;
    }

    public void setPlazo6(Short plazo6) {
        this.plazo6 = plazo6;
    }

    public Short getPlazo7() {
        return plazo7;
    }

    public void setPlazo7(Short plazo7) {
        this.plazo7 = plazo7;
    }

    public Short getPlazo8() {
        return plazo8;
    }

    public void setPlazo8(Short plazo8) {
        this.plazo8 = plazo8;
    }

    public Short getPlazo9() {
        return plazo9;
    }

    public void setPlazo9(Short plazo9) {
        this.plazo9 = plazo9;
    }

    public Short getPlazo10() {
        return plazo10;
    }

    public void setPlazo10(Short plazo10) {
        this.plazo10 = plazo10;
    }

    public Short getPlazo11() {
        return plazo11;
    }

    public void setPlazo11(Short plazo11) {
        this.plazo11 = plazo11;
    }

    public Short getPlazo12() {
        return plazo12;
    }

    public void setPlazo12(Short plazo12) {
        this.plazo12 = plazo12;
    }

    public String getTipoFpago() {
        return tipoFpago;
    }

    public void setTipoFpago(String tipoFpago) {
        this.tipoFpago = tipoFpago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    /*
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFecModi() {
        return fecModi;
    }

    public void setFecModi(Date fecModi) {
        this.fecModi = fecModi;
    }
    */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tapfopaPK != null ? tapfopaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tapfopa)) {
            return false;
        }
        Tapfopa other = (Tapfopa) object;
        if ((this.tapfopaPK == null && other.tapfopaPK != null) || (this.tapfopaPK != null && !this.tapfopaPK.equals(other.tapfopaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.compras.Tapfopa[ tapfopaPK=" + tapfopaPK + " ]";
    }
    
}
