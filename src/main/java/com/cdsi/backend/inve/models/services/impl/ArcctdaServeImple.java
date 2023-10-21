package com.cdsi.backend.inve.models.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArcctdaRepo;
import com.cdsi.backend.inve.models.entity.ArcctdaEntity;
import com.cdsi.backend.inve.models.entity.ArcctdaPKEntity;
import com.cdsi.backend.inve.models.services.IArcctdaServe;

@Service
public class ArcctdaServeImple implements IArcctdaServe {
    @Autowired
	private IArcctdaRepo repo;
	
	@Override
	public ArcctdaEntity getArcctda(String cia, String sucursal, String noCliente) {
		// TODO Auto-generated method stub
		ArcctdaPKEntity pk = new ArcctdaPKEntity(cia,noCliente,sucursal);
		return this.repo.findById(pk).orElse(null);
	}

}
