package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlTransient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ARTSTCB")
public class Artstcb implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArtstcbPK artstcbPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO")
    private String estado;
    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artstcb", fetch = FetchType.EAGER)
    private List<Artsccb> artsccbList;
    */
    
}