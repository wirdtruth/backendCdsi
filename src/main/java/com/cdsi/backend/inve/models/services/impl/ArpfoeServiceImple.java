package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArpfoeRepo;
import com.cdsi.backend.inve.models.entity.Arpfoe;
import com.cdsi.backend.inve.models.services.IArpfoeService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;


@Service
public class ArpfoeServiceImple implements IArpfoeService {

    @Autowired
    private IArpfoeRepo iArpfoeRepo;

    @Override
    public Arpfoe buscarId(String cia, String noOrden) throws ServiceException {
        try{
            Arpfoe arpfoe = this.iArpfoeRepo.buscarId(cia,noOrden);
            return arpfoe;
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return  null;
        }
    }

    @Override
    public List<Arpfoe> buscarCiaAndIndPvent(int limit, int page, String cia, String indPvent) throws ServiceException {
        try {
            Pageable pageableRequest = PageRequest.of(page, limit);
            Page<Arpfoe> arpfoePage = this.iArpfoeRepo.buscarCiaAndIndPvent(pageableRequest,cia,indPvent);
            List<Arpfoe> arpfoeList = arpfoePage.getContent();
            return arpfoeList;
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Arpfoe> buscarCiaAndIndPventAndNoCliente(int limit, int page, String cia, String indPvent, String noCliene) throws ServiceException {
        try {
            Pageable pageableRequest = PageRequest.of(page,limit);
            Page<Arpfoe> arpfoePage = this.iArpfoeRepo.buscarCiaAndIndPventAndNoCliente(pageableRequest,cia,indPvent,noCliene);
            List<Arpfoe> arpfoeList = arpfoePage.getContent();
            return arpfoeList;
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Arpfoe> buscarCiaAndIndPventAndCodTPed(int limit, int page, String cia, String indPvent, String codTPed) throws ServiceException {
        try {
            Pageable pageableResquest = PageRequest.of(page,limit);
            Page<Arpfoe> arpfoePage = this.iArpfoeRepo.buscarCiaAndIndPventAndCodTPed(pageableResquest,cia,indPvent,codTPed);
            List<Arpfoe> arpfoeList = arpfoePage.getContent();
            return arpfoeList;
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Arpfoe findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arpfoe> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arpfoe> findByLike(Arpfoe arpfoe) throws ServiceException {
        return null;
    }

    @Override
    @Transactional
    public Arpfoe save(Arpfoe arpfoe) throws ServiceException {
        Arpfoe objA =  null;
    	try{
    		arpfoe.setMotConting("0");    		
    		if(arpfoe.getNoCliente().length() == 11) { // RUC
    			arpfoe.setTipoDocCli("RUC");
    			arpfoe.setNumDocCli(arpfoe.getNoCliente());
    		} else if(arpfoe.getNoCliente().length() == 8) {
    			arpfoe.setTipoDocCli("DNI");
    			arpfoe.setNumDocCli(arpfoe.getNoCliente());
    		}else {
    			arpfoe.setTipoDocCli("");
    			arpfoe.setNumDocCli("");
    		}
    			
            objA =  this.iArpfoeRepo.save(arpfoe);
        }catch (Exception e){
            
            System.out.println(e.getMessage());
        }
    	return objA;
    }

    @Override
    public Arpfoe delete(Long id) throws ServiceException {
        return null;
    }

    @Override
    public Page<Arpfoe> pageCia(int limit, int page, String cia) throws ServiceException {
        Pageable pageableRest = PageRequest.of(page,limit);
        Page<Arpfoe> arpfoePage = this.iArpfoeRepo.pageCia(pageableRest,cia);
        return arpfoePage;
    }

    @Override
	public List<Arpfoe> listarPedidosPV(String cia, String indPvent, String fec1, String fec2) throws ServiceException {
		// TODO Auto-generated method stub
		return this.iArpfoeRepo.listarCiaAndIndPvent(cia, indPvent, fec1, fec2);
	}

	
}
