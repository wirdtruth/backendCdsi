package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArtstarRepo;
import com.cdsi.backend.inve.models.entity.Artstar;
import com.cdsi.backend.inve.models.services.IArtstarService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;

@Service
public class ArtstarServiceImpl implements IArtstarService {
	
	@Autowired
	private IArtstarRepo repo;

	@Override
	public Artstar findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artstar> getAll() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artstar> findByLike(Artstar t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artstar save(Artstar t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artstar delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Artstar> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artstar> listar(String cia) {
		// TODO Auto-generated method stub
		return repo.listar(cia);
	}

}
