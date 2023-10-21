package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arfafp;
import com.cdsi.backend.inve.models.entity.ArfafpPK;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

import java.util.List;

public interface IArfafpService extends IGenericService<Arfafp> {

    //METODO QUE NOS PERMITE TRAER TODOS LAS FORMAS DE PAGO POR CIA Y ESTADO
    public List<Arfafp> findByCiaAndEstado(String cia,String estado) throws ServiceException;

    //METODO QUE TRAE UNA FORMA DE PAGO
    Arfafp buscarId(ArfafpPK arfafpPK);

}
