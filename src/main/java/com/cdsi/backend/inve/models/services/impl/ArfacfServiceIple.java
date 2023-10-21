package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArfacfRepo;
import com.cdsi.backend.inve.models.entity.Arfacf;
import com.cdsi.backend.inve.models.entity.ArfacfPK;
import com.cdsi.backend.inve.models.services.IArfacfService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArfacfServiceIple implements IArfacfService {
    @Autowired
    private IArfacfRepo arfacfRepo;

    @Override
    public Arfacf buscarId(ArfacfPK arfacfPK) throws ServiceException {
        return this.arfacfRepo.buscarId(arfacfPK.getNoCia(),arfacfPK.getCentro());
    }
    
    @Override
	public Arfacf ingrementarCorreFicta(Arfacf arfacf) throws ServiceException {
		Arfacf objA = new Arfacf();
		objA.setArfacfPK(arfacf.getArfacfPK());
		objA.setDescripcion(arfacf.getDescripcion());
		objA.setTransPtoVentaPed(arfacf.getTransPtoVentaPed());
		objA.setTransPtoVentaCaja(arfacf.getTransPtoVentaCaja());
		objA.setTransPtoVentaCxc(arfacf.getTransPtoVentaCxc());
		objA.setTipoPrecioPven(arfacf.getTipoPrecioPven());
		objA.setSerieGr(arfacf.getSerieGr());		
		Long correFicta = arfacf.getCorrelFict() + 1;
		objA.setCorrelFict(correFicta);
		objA.setSerieFact(arfacf.getSerieFact());
		objA.setCentroCosto(arfacf.getCentroCosto());
		objA.setTransPtoVentaCons(arfacf.getTransPtoVentaCons());
		objA.setTransPtoVentaConv(arfacf.getTransPtoVentaConv());
		objA.setIndPvent(arfacf.getIndPvent());
		objA.setTransVentaCxc(arfacf.getTransVentaCxc());
		objA.setSeriePtoVentaCxc(arfacf.getSeriePtoVentaCxc());
		objA.setSeriePtoVentaTeso(arfacf.getSeriePtoVentaTeso());
		objA.setLibreria(arfacf.getLibreria());
		objA.setOnLine(arfacf.getOnLine());
		
		return this.arfacfRepo.save(objA);
	}

    @Override
    public Arfacf findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arfacf> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arfacf> findByLike(Arfacf arfacf) throws ServiceException {
        return null;
    }

    @Override
    public Arfacf save(Arfacf arfacf) throws ServiceException {
        return null;
    }

    @Override
    public Arfacf delete(Long id) throws ServiceException {
        return null;
    }

    @Override
    public Page<Arfacf> pageCia(int limit, int page, String cia) throws ServiceException {
        Pageable pageableRequest = PageRequest.of(page,limit);
        Page<Arfacf> arfacfPage = this.arfacfRepo.pageCia(cia,pageableRequest);
        return arfacfPage;
    }

	
}
