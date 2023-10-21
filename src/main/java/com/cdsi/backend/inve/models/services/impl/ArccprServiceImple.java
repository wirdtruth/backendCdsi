package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArccprRepo;
import com.cdsi.backend.inve.models.entity.Arccpr;
import com.cdsi.backend.inve.models.services.IArccprService;

@Service
public class ArccprServiceImple implements IArccprService{
	
	@Autowired
	private IArccprRepo repo;

	@Override
	public List<Arccpr> listarProvinciaXCiaAndDepart(String cia, String dp) {
		// TODO Auto-generated method stub
		return this.repo.listarProvinciaXCiaAndDepar(cia, dp);
	}

	

	
	
	

}
