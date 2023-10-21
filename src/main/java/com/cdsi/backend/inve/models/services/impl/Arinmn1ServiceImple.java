package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArinmn1Repo;
import com.cdsi.backend.inve.models.entity.Arinmn1;
import com.cdsi.backend.inve.models.entity.Arinmn1PK;
import com.cdsi.backend.inve.models.services.IArinmn1Service;
import com.cdsi.backend.inve.models.services.exception.ServiceException;

@Service
public class Arinmn1ServiceImple implements IArinmn1Service {
	@Autowired
	private IArinmn1Repo repo;

	@Override
	public List<Arinmn1> listarId(String cia, String bodega, String tipoDoc, String docu, String arti) {
		// TODO Auto-generated method stub
		Arinmn1PK objA = new Arinmn1PK(cia,bodega,arti,tipoDoc,docu);
		return this.repo.findByArinmn1PK(objA);
	}
	
	@Override
	public Arinmn1 save(Arinmn1 t) throws ServiceException {
		// TODO Auto-generated method stub
		return this.repo.save(t);
	}

	@Override
	public Arinmn1 findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arinmn1> getAll() throws ServiceException {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	@Override
	public List<Arinmn1> findByLike(Arinmn1 t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}	

	@Override
	public Arinmn1 delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Arinmn1> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
