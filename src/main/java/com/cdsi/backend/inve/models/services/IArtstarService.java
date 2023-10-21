package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Artstar;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

public interface IArtstarService extends IGenericService<Artstar> {
	
	public List<Artstar> listar(String cia);

}
