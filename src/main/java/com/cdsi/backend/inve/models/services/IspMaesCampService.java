package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.SpMaesCampana;
import com.cdsi.backend.inve.models.entity.SpMaesCampanaPK;
import com.cdsi.backend.inve.models.services.generic.IGenericService;
import org.hibernate.service.spi.ServiceException;

import java.util.List;

public interface IspMaesCampService extends IGenericService<SpMaesCampana> {
    //VAMOS A LISTAR TODAS LAS CAMPAÑAS CON ESTADO ACTIVO
    List<SpMaesCampana> listaCampanaActivas(String cia, String estado) throws ServiceException;

    //VAMOS A BUSCAR UNA COMPAÑIA PERO CON ESTADO ACTIVO
    SpMaesCampana  findByCiaAndCamp(SpMaesCampanaPK spMaesCampanaPK);
}
