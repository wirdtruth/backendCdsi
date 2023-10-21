package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.dto.NotaCreditoRepoCab;
import com.cdsi.backend.inve.models.entity.Arfamc;

public interface IArfamcService {
	
	public NotaCreditoRepoCab getNotaCreditoRepoCar(String cia, String sucursal);
	
	public List<Arfamc> findAll();
	
	public Arfamc finById(String cia);
	
	public Arfamc actualizar(Arfamc a);
}
