package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arfacf;
import com.cdsi.backend.inve.models.entity.ArfacfPK;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

public interface IArfacfService extends IGenericService<Arfacf> {
    public Arfacf buscarId(ArfacfPK arfacfPK) throws ServiceException;
    // METODO QUE NOS PERMITE ACTUALIZAR EL CORRELATIVO FICTA DE GUIA
    public Arfacf ingrementarCorreFicta(Arfacf arfacf) throws ServiceException;
}
