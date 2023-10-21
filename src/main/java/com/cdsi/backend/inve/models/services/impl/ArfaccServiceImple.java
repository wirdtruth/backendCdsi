package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.dto.SerieDocumentoDto;
import com.cdsi.backend.inve.models.dao.IArfaccRepo;
import com.cdsi.backend.inve.models.dao.IArfadocRepo;
import com.cdsi.backend.inve.models.entity.Arfacc;
import com.cdsi.backend.inve.models.entity.ArfaccPK;
import com.cdsi.backend.inve.models.entity.Arfadoc;
import com.cdsi.backend.inve.models.entity.ArfadocPK;
import com.cdsi.backend.inve.models.services.IArfaccService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArfaccServiceImple implements IArfaccService {

    @Autowired
    private IArfaccRepo iArfaccRepo;
    
    @Autowired
    private IArfadocRepo arfadocRepo;
    
    @Override
    public Arfacc save(Arfacc arfacc) throws ServiceException {
    	Arfacc objA = null;
    	try {
    		if(arfacc != null) {
            	objA = this.iArfaccRepo.save(arfacc);
            }
    	}catch (Exception e) {
			System.out.println(e.getMessage());
		}
        return objA;
    }

    @Override
    public Arfacc actualizar(ArfaccPK arfaccPK, Arfacc arfacc) throws ServiceException {
       try{
    	  
           Arfacc arfacc1 = this.iArfaccRepo.buscarId(arfaccPK.getNoCia(),arfaccPK.getCentro(),arfaccPK.getTipoDoc(),arfaccPK.getSerie());
           
           if (arfacc1 != null){              
        	   arfacc1.setConsDesde(arfacc.getConsDesde()+1);
               return this.iArfaccRepo.save(arfacc1);
           }
           return null;
       }catch (Exception e){
    	   
           return null;
       }

    }

    @Override
    public List<Arfacc> buscarCiaAndTipDocAndCentroAndActivo(Arfacc arfacc) throws ServiceException {
        try {
            List<Arfacc> arfaccList = this.iArfaccRepo.buscarCiaAndTipDocAndCentroAndActivo(arfacc.getArfaccPK().getNoCia(),
                    arfacc.getArfaccPK().getTipoDoc(),arfacc.getArfaccPK().getCentro(),arfacc.getActivo());
            return arfaccList;
        }catch (Exception e){
        	
            return null;
        }
    }

    @Override
    public Page<Arfacc> listPageCia(int limit, int page,ArfaccPK arfaccPK) throws ServiceException {
        try{
            Pageable pageableRequest = PageRequest.of(page,limit);
            Page<Arfacc> arfaccPage = this.iArfaccRepo.listarCia(arfaccPK.getNoCia(),pageableRequest);
            return arfaccPage;
        }catch (Exception e){
        	
            return null;
        }
    }

    @Override
    public Page<Arfacc> listPageCiaAndActivo(int limit, int page,Arfacc arfacc) throws ServiceException {
        try{
            Pageable pageableRequest = PageRequest.of(page,limit);
            return this.iArfaccRepo.listarCiaAndActivo(arfacc.getArfaccPK().getNoCia(),arfacc.getActivo(),pageableRequest);
        }catch (Exception e){
        	
            return null;
        }
    }

    @Override
    public Page<Arfacc> listPageCiaAndTipoDoc(int limit, int page,Arfacc arfacc) throws ServiceException {
        try{
            Pageable pageableRequest = PageRequest.of(page,limit);
            return this.iArfaccRepo.listarCiaAndTipoDoc(arfacc.getArfaccPK().getNoCia(),arfacc.getArfaccPK().getTipoDoc(),pageableRequest);
        }catch (Exception e){
        	
            return null;
        }
    }

    @Override
    public Page<Arfacc> listPageCiaAndCentro(int limit, int page,Arfacc arfacc) throws ServiceException {
        try{
            Pageable pageableRequest = PageRequest.of(page,limit);
            return this.iArfaccRepo.listarCiaAndCentro(arfacc.getArfaccPK().getNoCia(),arfacc.getArfaccPK().getCentro(),pageableRequest);
        }catch (Exception e){
        	
            return null;
        }
    }

    @Override
    public Arfacc findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arfacc> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arfacc> findByLike(Arfacc arfacc) throws ServiceException {
        return null;
    }


    @Override
    public Arfacc delete(Long id) throws ServiceException {
        return null;
    }

	@Override
	public Page<Arfacc> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SerieDocumentoDto> listaSerieDocumento(String cia, String tipoDoc, String centro, String activo)
			throws ServiceException {
		// TODO Auto-generated method stub
		ArfadocPK arfadocpk = new ArfadocPK(cia, tipoDoc);
		Arfadoc arfadoc = this.arfadocRepo.findById(arfadocpk).orElse(null);		
		if(arfadoc != null) {
			List<Arfacc> arfaccs = this.iArfaccRepo.buscarCiaAndTipDocAndCentroAndActivo(cia, tipoDoc, centro, activo);
			if(!arfaccs.isEmpty()) {
				List<SerieDocumentoDto> serieDocs = new ArrayList<>();				
				for(Arfacc arfacc: arfaccs) {
					SerieDocumentoDto serieDocuDto = new SerieDocumentoDto(arfacc.getArfaccPK().getCentro(),arfacc.getArfaccPK().getTipoDoc(),arfadoc.getDescripcion(),
							arfacc.getArfaccPK().getSerie(), arfacc.getConsDesde());
					serieDocs.add(serieDocuDto);
				}
				return serieDocs;
			}
		}
		return null;
	}
}
