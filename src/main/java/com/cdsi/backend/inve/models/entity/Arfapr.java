package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ARFAPR")
public class Arfapr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArfaprPK arfaprPK;
    @Column(name = "MONEDA")
    private String moneda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORC_UTIL")
    private BigDecimal porcUtil;
    @Column(name = "PRECIO")
    private BigDecimal precio;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "USUARIO_ACT")
    private String usuarioAct;
    @Column(name = "FECHA_ACT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAct;
    @Column(name = "IND_ACT")
    private String indAct;
    @Column(name = "COMI_UNI")
    private BigDecimal comiUni;
    @Column(name = "COMI_MAX")
    private BigDecimal comiMax;
    @Column(name = "PORC_DSCTO")
    private BigDecimal porcDscto;
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
    /*
    @JoinColumns({
        @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
        @JoinColumn(name = "TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Arfatp arfatp;
    */
    public Arfapr() {
    }

    public Arfapr(ArfaprPK arfaprPK) {
        this.arfaprPK = arfaprPK;
    }

    public Arfapr(String noCia, String noArti, String tipo, Date vigInicio, Date vigFinal) {
        this.arfaprPK = new ArfaprPK(noCia, noArti, tipo, vigInicio, vigFinal);
    }

    public ArfaprPK getArfaprPK() {
        return arfaprPK;
    }

    public void setArfaprPK(ArfaprPK arfaprPK) {
        this.arfaprPK = arfaprPK;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getPorcUtil() {
        return porcUtil;
    }

    public void setPorcUtil(BigDecimal porcUtil) {
        this.porcUtil = porcUtil;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuarioAct() {
        return usuarioAct;
    }

    public void setUsuarioAct(String usuarioAct) {
        this.usuarioAct = usuarioAct;
    }

    public Date getFechaAct() {
        return fechaAct;
    }

    public void setFechaAct(Date fechaAct) {
        this.fechaAct = fechaAct;
    }

    public String getIndAct() {
        return indAct;
    }

    public void setIndAct(String indAct) {
        this.indAct = indAct;
    }

    public BigDecimal getComiUni() {
        return comiUni;
    }

    public void setComiUni(BigDecimal comiUni) {
        this.comiUni = comiUni;
    }

    public BigDecimal getComiMax() {
        return comiMax;
    }

    public void setComiMax(BigDecimal comiMax) {
        this.comiMax = comiMax;
    }

    public BigDecimal getPorcDscto() {
        return porcDscto;
    }

    public void setPorcDscto(BigDecimal porcDscto) {
        this.porcDscto = porcDscto;
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
    /*
    public Arfatp getArfatp() {
        return arfatp;
    }

    public void setArfatp(Arfatp arfatp) {
        this.arfatp = arfatp;
    }
    */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arfaprPK != null ? arfaprPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arfapr)) {
            return false;
        }
        Arfapr other = (Arfapr) object;
        if ((this.arfaprPK == null && other.arfaprPK != null) || (this.arfaprPK != null && !this.arfaprPK.equals(other.arfaprPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.factu.Arfapr[ arfaprPK=" + arfaprPK + " ]";
    }
    
}
