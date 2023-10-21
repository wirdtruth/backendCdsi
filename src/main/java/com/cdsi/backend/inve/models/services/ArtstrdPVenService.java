package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.ArtstrdPVen;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

public interface ArtstrdPVenService extends IGenericService<ArtstrdPVen> {
	
	public ArtstrdPVen buscar(String cia, String doc, String factu) throws ServiceException;

}
