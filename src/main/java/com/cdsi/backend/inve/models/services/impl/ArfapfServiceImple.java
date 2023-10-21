package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArfafpRepo;
import com.cdsi.backend.inve.models.entity.Arfafp;
import com.cdsi.backend.inve.models.entity.ArfafpPK;
import com.cdsi.backend.inve.models.services.IArfafpService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ArfapfServiceImple implements IArfafpService {

    @Autowired
    private IArfafpRepo iArfafpRepo;

    @Override
    public List<Arfafp> findByCiaAndEstado(String cia, String estado) throws ServiceException {
        try {
            List<Arfafp> arfafpList = this.iArfafpRepo.listarCiaAndEstado(cia,estado);
            return arfafpList;
        }catch (Exception e){
        	log.error(e.getMessage());
        }
        return null;
    }

    @Override
    public Arfafp buscarId(ArfafpPK arfafpPK) {
        try {
            return this.iArfafpRepo.findById(arfafpPK).orElse(null);  //buscarId(arfafpPK.getNoCia(), arfafpPK.getTipoFpago(), arfafpPK.getCodFpago());
        }catch (Exception e){
        	log.error(e.getMessage());
        }
        return null;
    }

    @Override
    public Arfafp findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arfafp> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arfafp> findByLike(Arfafp arfafp) throws ServiceException {
        return null;
    }

    @Override
    public Arfafp save(Arfafp arfafp) throws ServiceException {
        return null;
    }

    @Override
    public Arfafp delete(Long id) throws ServiceException {
        return null;
    }

	@Override
	public Page<Arfafp> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
}
