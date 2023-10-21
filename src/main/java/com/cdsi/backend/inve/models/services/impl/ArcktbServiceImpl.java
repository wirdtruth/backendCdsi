package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArcktbRepo;
import com.cdsi.backend.inve.models.entity.Arcktb;
import com.cdsi.backend.inve.models.services.IArcktbService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;

@Service
public class ArcktbServiceImpl implements IArcktbService {
	
	@Autowired
	private IArcktbRepo repo;

	@Override
	public Arcktb findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arcktb> getAll() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arcktb> findByLike(Arcktb t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Arcktb save(Arcktb t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Arcktb delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Arcktb> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arcktb> listar() {
		// TODO Auto-generated method stub
		return repo.listar();
	}

}
