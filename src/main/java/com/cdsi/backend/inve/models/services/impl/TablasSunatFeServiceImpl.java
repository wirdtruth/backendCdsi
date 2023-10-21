package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.ITablasSunatFeRepo;
import com.cdsi.backend.inve.models.entity.TablasSunatFe;
import com.cdsi.backend.inve.models.services.ITablasSunatFeService;

@Service
public class TablasSunatFeServiceImpl implements ITablasSunatFeService{
	
	@Autowired
	private ITablasSunatFeRepo repo;

	@Override
	public List<TablasSunatFe> listar(String clase) {
		return repo.listar(clase);
	}

}
