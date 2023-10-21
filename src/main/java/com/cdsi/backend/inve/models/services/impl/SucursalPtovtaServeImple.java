package com.cdsi.backend.inve.models.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.ISucursalPtovtaRepo;
import com.cdsi.backend.inve.models.entity.SucursalPtovta;
import com.cdsi.backend.inve.models.entity.SucursalPtovtaPK;
import com.cdsi.backend.inve.models.services.ISucursalPtovtaServe;

@Service
public class SucursalPtovtaServeImple implements ISucursalPtovtaServe {
	
	@Autowired
	private ISucursalPtovtaRepo repo;

	@Override
	public SucursalPtovta getId(String cia, String sucursal) {
		SucursalPtovtaPK pk = new SucursalPtovtaPK(cia, sucursal);
		SucursalPtovta sucurPto = this.repo.findById(pk).orElse(null);
		return sucurPto;
	}

}
