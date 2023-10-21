package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arcktb;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

public interface IArcktbService extends IGenericService<Arcktb> {
	
	public List<Arcktb> listar();

}
