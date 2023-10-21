package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArtsoppRepo;
import com.cdsi.backend.inve.models.entity.Artsopp;
import com.cdsi.backend.inve.models.services.IArtsoppService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;

@Service
public class IArtsoppServiceImpl implements IArtsoppService {
	
	@Autowired
	private IArtsoppRepo repo;

	@Override
	public Artsopp findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artsopp> getAll() throws ServiceException {
		return null;
	}

	@Override
	public List<Artsopp> findByLike(Artsopp t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artsopp save(Artsopp t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artsopp delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Artsopp> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artsopp> listar(String cia) {
		try {
			return repo.listar(cia);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
