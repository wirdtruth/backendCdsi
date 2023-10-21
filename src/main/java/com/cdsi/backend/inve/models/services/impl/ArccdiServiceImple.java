package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArccdiRepo;
import com.cdsi.backend.inve.models.entity.Arccdi;
import com.cdsi.backend.inve.models.services.IArccdiService;

@Service
public class ArccdiServiceImple implements IArccdiService {
	
	@Autowired
	private IArccdiRepo repo;

	@Override
	public List<Arccdi> listarDistritoXCiaAndDepartaAndProvin(String cia, String dp, String pr) {
		// TODO Auto-generated method stub
		return this.repo.listarDistritoXCiaAndDepartAndProvi(cia, dp, pr);
	}

}
