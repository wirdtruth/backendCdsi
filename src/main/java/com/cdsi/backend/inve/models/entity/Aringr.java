package com.cdsi.backend.inve.models.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "ARINGR")
public class Aringr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AringrPK aringrPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "REQ_COMB")
    private String reqComb;
    @Column(name = "TIPO_ALMACEN")
    private String tipoAlmacen;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "IND_CBARRA")
    private String indCbarra;
    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aringr", fetch = FetchType.EAGER)
    private List<Arinbo1> arinbo1List;
    */
    public Aringr() {
    }

    public Aringr(AringrPK aringrPK) {
        this.aringrPK = aringrPK;
    }

    public Aringr(String noCia, String grupo) {
        this.aringrPK = new AringrPK(noCia, grupo);
    }

    public AringrPK getAringrPK() {
        return aringrPK;
    }

    public void setAringrPK(AringrPK aringrPK) {
        this.aringrPK = aringrPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReqComb() {
        return reqComb;
    }

    public void setReqComb(String reqComb) {
        this.reqComb = reqComb;
    }

    public String getTipoAlmacen() {
        return tipoAlmacen;
    }

    public void setTipoAlmacen(String tipoAlmacen) {
        this.tipoAlmacen = tipoAlmacen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIndCbarra() {
        return indCbarra;
    }

    public void setIndCbarra(String indCbarra) {
        this.indCbarra = indCbarra;
    }
    /*
    @XmlTransient
    public List<Arinbo1> getArinbo1List() {
        return arinbo1List;
    }

    public void setArinbo1List(List<Arinbo1> arinbo1List) {
        this.arinbo1List = arinbo1List;
    }
    */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aringrPK != null ? aringrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aringr)) {
            return false;
        }
        Aringr other = (Aringr) object;
        if ((this.aringrPK == null && other.aringrPK != null) || (this.aringrPK != null && !this.aringrPK.equals(other.aringrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.inve.Aringr[ aringrPK=" + aringrPK + " ]";
    }

}
