package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.dto.NotaCreditoRepoCab;
import com.cdsi.backend.inve.models.dao.IArfamcDao;
import com.cdsi.backend.inve.models.entity.Arfamc;
import com.cdsi.backend.inve.models.entity.SucursalPtovta;
import com.cdsi.backend.inve.models.services.IArfamcService;
import com.cdsi.backend.inve.models.services.ISucursalPtovtaServe;

@Service
public class ArfamcServiceImpl implements IArfamcService {
	
	@Autowired
	private IArfamcDao arfamcDao;
	
	@Autowired
	private ISucursalPtovtaServe sucursal;

	@Override
	public List<Arfamc> findAll() {
		// TODO Auto-generated method stub
		return this.arfamcDao.findAll();
	}

	@Override
	public Arfamc finById(String cia) {
		// TODO Auto-generated method stub
		return this.arfamcDao.findById(cia).orElse(null);
	}

	@Override
	public Arfamc actualizar(Arfamc a) {
		// TODO Auto-generated method stub
		return this.arfamcDao.save(a);
	}

	@Override
	public NotaCreditoRepoCab getNotaCreditoRepoCar(String cia, String sucursal) {
		Arfamc arfamc = this.finById(cia);
		SucursalPtovta  sucurPvota = this.sucursal.getId(cia, sucursal);
	    NotaCreditoRepoCab notaCreditodoCab = new NotaCreditoRepoCab();
	    notaCreditodoCab.setPNOMBRE_CIA(arfamc.getNombre().trim());
	    notaCreditodoCab.setPRUC_CIA(arfamc.getRuc().trim());
	    notaCreditodoCab.setPDIRECCION_CIA(sucurPvota.getDireccion().trim());
	    notaCreditodoCab.setPTELE_CIA(sucurPvota.getTelef1()+"/"+sucurPvota.getTelef2());
	    notaCreditodoCab.setPWEB_CIA(sucurPvota.getPagWeb());
	    notaCreditodoCab.setPEMAIL_CIA(sucurPvota.getCorreoelectro());
	    notaCreditodoCab.setPSUCUR_CIA(sucurPvota.getNombreSucuPtovta());
	    
	    return notaCreditodoCab;
	}

}
