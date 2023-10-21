package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArcgcanRepo;
import com.cdsi.backend.inve.models.entity.Arcgcan;
import com.cdsi.backend.inve.models.entity.ArcgcanPK;
import com.cdsi.backend.inve.models.services.IArcgcanService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ArcgcanServiceImple implements IArcgcanService {
   
	@Autowired
    private IArcgcanRepo iArcgcanRepo;
	
    @Override
    public List<Arcgcan> listarByCiaAndEstado(Arcgcan arcgcan) throws ServiceException {
        try {
            return this.iArcgcanRepo.listaCiaAndEstado(arcgcan.getArcgcanPK().getNoCia(),arcgcan.getEstado());
        }catch (Exception e){
        	log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Arcgcan buscarId(ArcgcanPK arcgcanPK) throws ServiceException {
        try{
            return this.iArcgcanRepo.buscarId(arcgcanPK.getTipoAnalitico(),arcgcanPK.getNoCia(),arcgcanPK.getCodAnalitico());
        }catch (Exception e){
        	log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Arcgcan findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arcgcan> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arcgcan> findByLike(Arcgcan arcgcan) throws ServiceException {
        return null;
    }

    @Override
    public Arcgcan save(Arcgcan arcgcan) throws ServiceException {
        return null;
    }

    @Override
    public Arcgcan delete(Long id) throws ServiceException {
        return null;
    }

	@Override
	public Page<Arcgcan> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
}
