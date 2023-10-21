package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arfadoc;

public interface IArfadocServi {
    Arfadoc getId(String cia, String tipDoc);
    List<Arfadoc> listaByCiaAndEstado(String cia, String estado);
}
