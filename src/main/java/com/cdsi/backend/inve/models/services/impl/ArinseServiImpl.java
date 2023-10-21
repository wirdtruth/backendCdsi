package com.cdsi.backend.inve.models.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArinseRepo;
import com.cdsi.backend.inve.models.entity.Arinse;
import com.cdsi.backend.inve.models.services.IArinseService;

@Service
public class ArinseServiImpl implements IArinseService {
	
	@Autowired
	private IArinseRepo repo;

	@Override
	public Arinse getCiaAndBodegaAndTrans(String cia, String bodega, String trans) {
		// TODO Auto-generated method stub
		return this.repo.getCiaAndBodegaAndTrans(cia, bodega, trans);
	}

	@Override
	public Arinse aumentarSecuencia(Arinse a) {
		Arinse x = new Arinse();
		x.setArinsePK(a.getArinsePK());
		
		Long secu = a.getSecuencia() + 1;
		x.setSecuencia(secu);
		
		return this.repo.save(x);
	}

	@Override
	public Arinse registrar(Arinse a) {
		// TODO Auto-generated method stub
		return this.repo.save(a);
	}

}
