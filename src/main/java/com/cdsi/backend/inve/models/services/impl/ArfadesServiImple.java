package com.cdsi.backend.inve.models.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArfadesRepo;
import com.cdsi.backend.inve.models.services.IArfadesService;

@Service
public class ArfadesServiImple implements IArfadesService {
	
	@Autowired
	private IArfadesRepo repo;

	@Override
	public String archivo_anulacion_fe(String cia, String tipDocu, String noFactu, String descrip) {
		// TODO Auto-generated method stub
		return this.repo.respestaCrearFilePlanoFe(cia, tipDocu, noFactu, descrip);
	}
	

}
