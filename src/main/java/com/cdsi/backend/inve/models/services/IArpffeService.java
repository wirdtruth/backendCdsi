package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arpffe;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

public interface IArpffeService extends IGenericService<Arpffe> {

    Arpffe buscarId(String cia, String bodega,String guia);

}
