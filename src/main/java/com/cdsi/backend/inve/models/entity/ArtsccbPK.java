package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class ArtsccbPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NO_CIA")
    private String noCia;
    @Basic(optional = false)
    @Column(name = "TIPO_CABA")
    private String tipoCaba;
    @Basic(optional = false)
    @Column(name = "NO_CABA")
    private String noCaba;

    
}
