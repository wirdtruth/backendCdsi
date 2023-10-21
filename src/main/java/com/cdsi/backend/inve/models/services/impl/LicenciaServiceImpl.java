package com.cdsi.backend.inve.models.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.ILicenciaRepo;
import com.cdsi.backend.inve.models.entity.Licencia;
import com.cdsi.backend.inve.models.entity.LicenciaPK;
import com.cdsi.backend.inve.models.services.ILicenciaService;

@Service
public class LicenciaServiceImpl implements ILicenciaService {
	
	@Autowired
	private ILicenciaRepo repo;

	@Override
	public Licencia buscarId(String cia, String ruc) {
		// TODO Auto-generated method stub
		LicenciaPK licenpk = new LicenciaPK(cia, ruc);
		return this.repo.findById(licenpk).orElse(null);
	}

	@Override
	public Licencia buscarCia(String cia) {
		// TODO Auto-generated method stub
		return this.repo.buscarCia(cia);
	}

	@Override
	public Licencia actualizar(String cia, String ruc, String llave) {
		// TODO Auto-generated method stub
		Licencia licencia = this.buscarId(cia, ruc);
		licencia.setLlave(llave);
		return this.repo.save(licencia);
	}

	@Override
	public Boolean validar(String cia, String ruc, String llave) {
		Licencia licencia = this.buscarId(cia, ruc);
		return licencia.getLlave().equals(llave) ? true : false;
	}

}
