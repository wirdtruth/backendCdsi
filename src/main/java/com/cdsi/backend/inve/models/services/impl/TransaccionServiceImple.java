package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.ITransaccionRepo;
import com.cdsi.backend.inve.models.entity.Transaccion;
import com.cdsi.backend.inve.models.services.ITransaccionService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionServiceImple implements ITransaccionService {
    @Autowired
    private ITransaccionRepo iTransaccionRepo;

    @Override
    public List<Transaccion> findByCiaAndUser(String cia, String usuario) {
        try {
            return this.iTransaccionRepo.findByCiaAndUser(cia,usuario);
        }catch (Exception e){
        	System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Transaccion findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Transaccion> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Transaccion> findByLike(Transaccion transaccion) throws ServiceException {
        return null;
    }

    @Override
    public Transaccion save(Transaccion transaccion) throws ServiceException {
        return null;
    }

    @Override
    public Transaccion delete(Long id) throws ServiceException {
        return null;
    }

	@Override
	public Page<Transaccion> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
}
