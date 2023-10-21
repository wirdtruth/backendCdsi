package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArcgtcRepo;
import com.cdsi.backend.inve.models.entity.Arcgtc;
import com.cdsi.backend.inve.models.entity.ArcgtcPK;
import com.cdsi.backend.inve.models.entity.Sunattc;
import com.cdsi.backend.inve.models.services.IArcgtcService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.util.TipoCambioSunat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ArcgtcServiceImpl implements IArcgtcService {
    @Autowired
    private IArcgtcRepo arcgtcRepo;
    
    //METODO QUE NOS PERMITE GUARDAR EL TIPO DE CAMBIO DE LA API DE SUNAT
    @Override
    public void guardarTipoCambioApiSunat() {
    	TipoCambioSunat objTCS = new TipoCambioSunat();
    	Sunattc sunattc = objTCS.getTipoCambio();
    	
    	if(sunattc != null) {
    		
    		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); 
       	    Date f = null;
			try {
				f = formato.parse(sunattc.getFecha());
			} catch (ParseException e) {
				System.out.println(e.getMessage());
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		Arcgtc objA = new Arcgtc();
    		ArcgtcPK objAPK = new ArcgtcPK();
    		
    		objAPK.setClaseCambio("01");
    		objAPK.setFecha(f);
    		
    		objA.setArcgtcPK(objAPK);
    		objA.setTipoCambio(sunattc.getCompra());    		
    		arcgtcRepo.save(objA);
    		
    		Arcgtc objA2 = new Arcgtc();
    		ArcgtcPK objAPK2 = new ArcgtcPK();
    		
    		objAPK2.setClaseCambio("02");
    		objAPK2.setFecha(f);
    		
    		objA2.setArcgtcPK(objAPK2);
    		objA2.setTipoCambio(sunattc.getVenta());    		
    		arcgtcRepo.save(objA2);
    		
    		Arcgtc objA3 = new Arcgtc();
    		ArcgtcPK objAPK3 = new ArcgtcPK();
    		
    		objAPK3.setClaseCambio("03");
    		objAPK3.setFecha(f);
    		
    		objA3.setArcgtcPK(objAPK3);
    		BigDecimal pizarra = new BigDecimal(0.05);
    		BigDecimal piza = sunattc.getVenta().subtract(pizarra);
    		objA3.setTipoCambio(piza);    		
    		arcgtcRepo.save(objA3);
    		
    	}
    	
    }

    @Override
    public Arcgtc buscarClaseAndFecha(String clase,Date fecha) throws ServiceException {
        Arcgtc arcgtc = this.arcgtcRepo.buscarClaseAndFecha(clase,fecha);
        return arcgtc;
    }

    @Override
    public List<Arcgtc> listarXFecha(Date fecha) throws ServiceException {
        try {
            List<Arcgtc> arcgtcs = this.arcgtcRepo.buscarXFecha(fecha);
            return arcgtcs;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public Page<Arcgtc> pageArcgtc(int limit, int page) throws ServiceException {
        try {
            Pageable pageable = PageRequest.of(page, limit);
            return this.arcgtcRepo.pageArcgtc(pageable);
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Arcgtc findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arcgtc> getAll() throws ServiceException {
       return this.arcgtcRepo.listar();
    }

    @Override
    public List<Arcgtc> findByLike(Arcgtc arcgtc) throws ServiceException {
        return null;
    }

    @Override
    public Arcgtc save(Arcgtc arcgtc) throws ServiceException {
        Arcgtc a = null;
        try {
			a = this.arcgtcRepo.save(arcgtc);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
        return a;
    }

    @Override
    public Arcgtc delete(Long id) throws ServiceException {
        return null;
    }

    @Override
    public Page<Arcgtc> pageCia(int limit, int page, String cia) throws ServiceException {
        return null;
    }
}
