package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArfadocRepo;
import com.cdsi.backend.inve.models.entity.Arfadoc;
import com.cdsi.backend.inve.models.entity.ArfadocPK;
import com.cdsi.backend.inve.models.services.IArfadocServi;

@Service
public class ArfadocServImpl implements IArfadocServi {
    
	@Autowired
	private IArfadocRepo repo;
	
	@Override
	public Arfadoc getId(String cia, String tipDoc) {
		// TODO Auto-generated method stub
		ArfadocPK arfadocpk = new ArfadocPK(cia, tipDoc);
		return this.repo.findById(arfadocpk).orElse(null);
	}

	@Override
	public List<Arfadoc> listaByCiaAndEstado(String cia, String estado) {
		// TODO Auto-generated method stub
		return this.repo.listaByCiaAndEstado(cia, estado);
	}


}
