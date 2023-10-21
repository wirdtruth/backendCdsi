package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArpffeRepo;
import com.cdsi.backend.inve.models.entity.Arpffe;
import com.cdsi.backend.inve.models.services.IArpffeService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class ArpffeServiceImple implements IArpffeService {

    @Autowired
    private IArpffeRepo arpffeRepo;

    @Override
    public Arpffe buscarId(String cia, String bodega,String guia) {
        return this.arpffeRepo.buscarId(cia,bodega,guia);
    }

    @Override
    public Arpffe findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arpffe> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arpffe> findByLike(Arpffe arpffe) throws ServiceException {
        return null;
    }

    @Override
    @Transactional
    public Arpffe save(Arpffe arpffe) throws ServiceException {
        return this.arpffeRepo.save(arpffe);
    }

    @Override
    public Arpffe delete(Long id) throws ServiceException {
        return null;
    }

    @Override
    public Page<Arpffe> pageCia(int limit, int page, String cia) throws ServiceException {
        Pageable pageableRest = PageRequest.of(page,limit);
        Page<Arpffe> arpffePage = this.arpffeRepo.pagiCia(pageableRest,cia);
        return arpffePage;
    }
}
