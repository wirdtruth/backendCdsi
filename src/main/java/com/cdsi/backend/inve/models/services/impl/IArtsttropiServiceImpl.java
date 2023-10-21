package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArtsttropiRepo;
import com.cdsi.backend.inve.models.entity.Artsttropi;
import com.cdsi.backend.inve.models.services.IArtsttropiService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;

@Service
public class IArtsttropiServiceImpl implements IArtsttropiService {

	@Autowired
	private IArtsttropiRepo repo; 
	
	@Override
	public Artsttropi findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artsttropi> getAll() throws ServiceException {
		return null;
	}

	@Override
	public List<Artsttropi> findByLike(Artsttropi t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artsttropi save(Artsttropi t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artsttropi delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Artsttropi> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artsttropi> listar(String cia) {
		try {
			return repo.listar(cia);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
