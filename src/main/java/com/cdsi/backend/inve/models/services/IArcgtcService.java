package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arcgtc;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

public interface IArcgtcService extends IGenericService<Arcgtc> {
    //public Arcgtc buscarClaseAndFecha(ArcgtcPK arcgtcPK) throws ServiceException;
	public Arcgtc buscarClaseAndFecha(String clase,Date fecha) throws ServiceException;
    public List<Arcgtc> listarXFecha(Date fecha) throws ServiceException;
    public Page<Arcgtc> pageArcgtc(int limit, int page) throws ServiceException;
    
    public void guardarTipoCambioApiSunat();
    
}
