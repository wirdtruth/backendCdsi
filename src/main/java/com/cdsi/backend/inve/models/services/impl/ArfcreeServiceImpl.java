package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArfcreeRepo;
import com.cdsi.backend.inve.models.entity.Arfcree;
import com.cdsi.backend.inve.models.services.IArfcreeService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;


@Service
public class ArfcreeServiceImpl implements IArfcreeService {
	
	@Autowired
	private IArfcreeRepo iArfcreeRepo;

	@Override
	public Arfcree findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arfcree> getAll() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arfcree> findByLike(Arfcree t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Arfcree save(Arfcree t) throws ServiceException {
		try {
			Arfcree arfcree = this.iArfcreeRepo.save(t);
			return arfcree;
		} catch (Exception e) {
			System.out.print(e.getMessage());
			return null;
		}
	}

	@Override
	public Arfcree delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Arfcree> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Arfcree buscar(String noCia, String noOrden, String noCliente) throws ServiceException {
		try {
			
			Arfcree arfcree = this.iArfcreeRepo.buscar(noCia, noOrden, noCliente);
			
			return arfcree;
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
			return null;
		}
		
	}

}
