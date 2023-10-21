package com.cdsi.backend.inve.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ArcctdaPKEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "NO_CIA")
    private String noCia;

    @Column(name = "NO_CLIENTE")
    private String noCliente;

    @Column(name = "COD_TIENDA")
    private String codTienda;

    public ArcctdaPKEntity() {
    }

    public ArcctdaPKEntity(String noCia, String noCliente, String codTienda) {
        this.noCia = noCia;
        this.noCliente = noCliente;
        this.codTienda = codTienda;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public String getCodTienda() {
        return codTienda;
    }

    public void setCodTienda(String codTienda) {
        this.codTienda = codTienda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (noCliente != null ? noCliente.hashCode() : 0);
        hash += (codTienda != null ? codTienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArcctdaPKEntity)) {
            return false;
        }
        ArcctdaPKEntity other = (ArcctdaPKEntity) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.noCliente == null && other.noCliente != null) || (this.noCliente != null && !this.noCliente.equals(other.noCliente))) {
            return false;
        }
        if ((this.codTienda == null && other.codTienda != null) || (this.codTienda != null && !this.codTienda.equals(other.codTienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityCXC.ArcctdaPKEntity[ noCia=" + noCia + ", noCliente=" + noCliente + ", codTienda=" + codTienda + " ]";
    }
}
