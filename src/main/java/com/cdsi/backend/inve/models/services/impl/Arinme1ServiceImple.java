package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.dto.ComprobanteIngresoDto;
import com.cdsi.backend.inve.models.dao.IArinme1Repo;
import com.cdsi.backend.inve.models.dao.IArinmn1Repo;
import com.cdsi.backend.inve.models.entity.Arinme1;
import com.cdsi.backend.inve.models.entity.Arinme1PK;
import com.cdsi.backend.inve.models.entity.Arinml1;
import com.cdsi.backend.inve.models.entity.Arinmn1;
import com.cdsi.backend.inve.models.entity.Arinmn1PK;
import com.cdsi.backend.inve.models.services.IArfafeService;
import com.cdsi.backend.inve.models.services.IArinme1Service;
import com.cdsi.backend.inve.models.services.IArintdService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Arinme1ServiceImple implements IArinme1Service {
	
    @Autowired
    private IArinme1Repo arinme1Repo;
    
    @Autowired
    private IArinmn1Repo arinmn1Repo;
    
    @Autowired
    private IArintdService arintdService;
    
    @Autowired
    private IArfafeService arfafeService;
    
    private List<ComprobanteIngresoDto> convertir(List<Arinme1> arinme1s) {
    	if(!arinme1s.isEmpty()) {
    		List<ComprobanteIngresoDto> compobIngreDtos = new ArrayList<>();
    		for(Arinme1 arinme1: arinme1s) {
    			ComprobanteIngresoDto compIngreDto = new ComprobanteIngresoDto();
    			compIngreDto.setAlmacen(arinme1.getArinme1PK().getBodega());
    			compIngreDto.setTipoDoc(arinme1.getArinme1PK().getTipoDoc());
    			compIngreDto.setNoDocu(arinme1.getArinme1PK().getNoDocu());
    			compIngreDto.setFecha(arinme1.getFecha());
    			compIngreDto.setNoCliente(arinme1.getNoCliente());
    			compIngreDto.setTipoDocRem(arinme1.getTipoDocRem());
    			compIngreDto.setSerieDocRem(arinme1.getSerieDocRem());
    			compIngreDto.setCorrDocRem(arinme1.getCorrDocRem());
    			compIngreDto.setTipoDocRec2(arinme1.getTipoDocRec2());
    			compIngreDto.setCorrDocRec2(arinme1.getCorrDocRec2());
    			compIngreDto.setEstado(arinme1.getEstado());
    			compobIngreDtos.add(compIngreDto);    			
    		}
    		return compobIngreDtos;
    	}
    	return null;
    }
    
	@Override
	public List<ComprobanteIngresoDto> listaComprobIngreso(String cia, String noCli) {
		List<Arinme1> arinme1s = this.arinme1Repo.listaComprobIngreso(cia, noCli);
		if(!arinme1s.isEmpty()) {
			List<String> transacNCs = this.arintdService.listaTransDevoluByCiaAndIndNC(cia, "S");
			List<Arinme1> lisCompNC =  arinme1s.stream()
					.filter(arinme1 -> transacNCs.indexOf(arinme1.getArinme1PK().getTipoDoc()) > 0 
							&& null == this.arfafeService.getExisteArinme1(cia, arinme1.getCentro(), arinme1.getArinme1PK().getBodega(), arinme1.getArinme1PK().getTipoDoc(),
									arinme1.getArinme1PK().getNoDocu(), arinme1.getNoCliente())
							&& null == getExistencia(cia, arinme1.getNoCliente(),  arinme1.getCentro(),  arinme1.getArinme1PK().getBodega(),
									arinme1.getArinme1PK().getTipoDoc(), arinme1.getArinme1PK().getNoDocu() )
							).collect( Collectors.toList() );
			return this.convertir(lisCompNC);
		}
		return null;
	}
    
	@Override
	public Arinme1 getExistencia(String cia, String noCli, String centro, String bodega, String tipoDoc,
			String noDocu) {
		Arinme1 arinme1 = this.arinme1Repo.getExistencia(cia, noCli, centro, bodega, tipoDoc, noDocu);
		if(arinme1 != null) {
			List<String> transacciones = this.arintdService.listaTransDevoluByCiaAndIndNC(cia, "S");
			if(!transacciones.isEmpty()) {
				for(String transaccion: transacciones) {
					if(transaccion.equals(arinme1.getArinme1PK().getTipoDoc())) return arinme1;
				}
				return null;
			}
			return null;
		}
		return null;
	}

    @Override
    public Arinme1 buscarId(Arinme1PK arinme1PK) throws ServiceException {
            Arinme1 arinme1 = this.arinme1Repo.buscarId(arinme1PK.getNoCia(),arinme1PK.getBodega(),arinme1PK.getTipoDoc(),arinme1PK.getNoDocu());
            return arinme1;
    }

    @Override
    public Page<Arinme1> buscarCia(int limit, int page,String cia) throws ServiceException {
        Pageable pageableRes = PageRequest.of(page,limit);
        Page<Arinme1> arinme1Page = this.arinme1Repo.buscarCia(cia,pageableRes);
        return arinme1Page;
    }


    @Override
    public Arinme1 findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arinme1> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arinme1> findByLike(Arinme1 arinme1) throws ServiceException {
        return null;
    }

    @Override
    public Arinme1 save(Arinme1 arinme1) throws ServiceException {    	
        return this.arinme1Repo.save(arinme1);
    }
    // METODO QUE NOS PERMITE GUARDAR EN LA ARINMN1
    @Override
    public void guardarArinmn1(Arinme1 arinme1) throws ServiceException {
    	Calendar fecha = Calendar.getInstance();
    	//System.out.println("ENTRO =) ");
    	for(Arinml1 a: arinme1.getArinml1List()) {
    		if(a.getTipoBs().equals("B")) {
    			//System.out.println("ENTRO ===> B");
	    		Arinmn1PK objArinmn1pk = new Arinmn1PK();
	    		objArinmn1pk.setNoCia(a.getArinml1PK().getNoCia());
	    		objArinmn1pk.setBodega(a.getArinml1PK().getBodega());
	    		objArinmn1pk.setNoArti(a.getArinml1PK().getNoArti());
	    		objArinmn1pk.setNoDocu(a.getArinml1PK().getNoDocu());
	    		objArinmn1pk.setTipoDoc(a.getArinml1PK().getTipoDoc());
	    		Arinmn1 objArinmn1 = new Arinmn1();
	    		objArinmn1.setArinmn1PK(objArinmn1pk);	    		
	    		objArinmn1.setAno(fecha.get(Calendar.YEAR));
	    		objArinmn1.setMes(fecha.get(Calendar.MONTH) + 1);
	    		objArinmn1.setLote(a.getLote());
	    		objArinmn1.setNoEntrada("-");
	    		objArinmn1.setFecha(a.getLote());
	    		objArinmn1.setUnidades(a.getUnidades());
	    		objArinmn1.setNoLinea(a.getNoLinea());
	    		objArinmn1.setNoOrden(arinme1.getAlmaDestino());
	    		objArinmn1.setTipoDocRefe("G");
	    		objArinmn1.setIndPvent("S");
	    		//objArinmn1.setCostoUni(0.00);
	    		objArinmn1.setTipoBs("B");
	    		//GUARDAR
	    		this.arinmn1Repo.save(objArinmn1);
    		}    		    		
    	}
    }

    @Override
    public Arinme1 delete(Long id) throws ServiceException {
        return null;
    }

	@Override
	public Page<Arinme1> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
