package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Artsopp;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

public interface IArtsoppService extends IGenericService<Artsopp> {
	
	List<Artsopp> listar(String cia) throws ServiceException;

}
