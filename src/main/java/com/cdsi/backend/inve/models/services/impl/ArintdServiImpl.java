package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArintdRepo;
import com.cdsi.backend.inve.models.entity.Arintd;
import com.cdsi.backend.inve.models.services.IArintdService;

@Service
public class ArintdServiImpl implements IArintdService {
	
	@Autowired
	private IArintdRepo arintdRepo;

	@Override
	public Arintd getCiaAndTransa(String cia, String trasac) {
		// TODO Auto-generated method stub
		return this.arintdRepo.getCiaAndTransac(cia, trasac);
	}

	@Override
	public List<Arintd> listaCia(String cia) {
		// TODO Auto-generated method stub
		return this.arintdRepo.listaCia(cia);
	}

	@Override
	public Arintd save(Arintd a) {
		// TODO Auto-generated method stub
		return this.arintdRepo.save(a);
	}

	@Override
	public List<String> listaTransDevoluByCiaAndIndNC(String cia, String ind) {
		// TODO Auto-generated method stub
		return this.arintdRepo.listaTransDevoluByCiaAndIndNC(cia, ind);
	}

}
