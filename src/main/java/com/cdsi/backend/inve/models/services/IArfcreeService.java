package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arfcree;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

public interface IArfcreeService extends IGenericService<Arfcree> {
	
	public Arfcree buscar(String noCia, String noOrden, String noCliente) throws ServiceException;

}
