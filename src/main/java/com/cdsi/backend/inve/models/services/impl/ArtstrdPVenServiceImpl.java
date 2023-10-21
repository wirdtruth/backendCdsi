package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArtstrdPVenRepo;
import com.cdsi.backend.inve.models.entity.ArtstrdPVen;
import com.cdsi.backend.inve.models.services.ArtstrdPVenService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;

@Service
public class ArtstrdPVenServiceImpl implements ArtstrdPVenService {
	
	@Autowired
	private IArtstrdPVenRepo repo;

	@Override
	public ArtstrdPVen findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArtstrdPVen> getAll() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArtstrdPVen> findByLike(ArtstrdPVen t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArtstrdPVen save(ArtstrdPVen t) throws ServiceException {
		try{
			ArtstrdPVen artstrdPVen = this.repo.save(t);
            return artstrdPVen;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
	}

	@Override
	public ArtstrdPVen delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ArtstrdPVen> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArtstrdPVen buscar(String cia, String doc, String factu) throws ServiceException {
		try {
			ArtstrdPVen artstrdPVen = this.repo.buscar(cia, doc, factu);
            return artstrdPVen;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
	}

}
