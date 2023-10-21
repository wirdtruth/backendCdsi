package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arcgcan;
import com.cdsi.backend.inve.models.entity.ArcgcanPK;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

import java.util.List;

public interface IArcgcanService extends IGenericService<Arcgcan> {

    List<Arcgcan> listarByCiaAndEstado(Arcgcan arcgcan) throws ServiceException;

    Arcgcan buscarId(ArcgcanPK arcgcanPK) throws ServiceException;

}
