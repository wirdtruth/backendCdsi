package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Artsttropi;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

public interface IArtsttropiService extends IGenericService<Artsttropi> {
	
	List<Artsttropi> listar(String cia) throws ServiceException;

}
