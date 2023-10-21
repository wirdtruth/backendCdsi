package com.cdsi.backend.inve.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cdsi.backend.inve.dto.ArccmcDTO;
import com.cdsi.backend.inve.dto.DireccionLegalDto;
import com.cdsi.backend.inve.models.entity.Arccmc;
import com.cdsi.backend.inve.models.entity.IdArccmc;


public interface IArccmcService {
	
	List<DireccionLegalDto> listaDireccionLegal(String cia, String noCli);

	Arccmc createArccmc(Arccmc articulo);

	Arccmc updateArccmc(IdArccmc objIdArc, Arccmc objA);

	Object deleteArccmc(IdArccmc objIdArc);
	
	//BUSCAR UN ARTICULO
	Arccmc findCiaForCodigo(IdArccmc objIdArc);
	
	//Pagination de los clientes por compañia
    Page<Arccmc> findPagByCia(Pageable pageable,String cia);   
    
    //VAMOS A BUSCAR UN CLIENTES POR SU DESCRIPCION
    List<Arccmc> findByNombreAndCia(String cia,String dscri);
    
    //VAMOS A BUSCAR UN CLIENTES POR SU RUC
    List<Arccmc> findByCiaAndRuc(String cia,String id);
    
    List<ArccmcDTO> listaClienteDtoByCiaAndNombre(String cia, String nombre);
    
    List<ArccmcDTO> listaClienteDtoByCiaAndCodigo(String cia, String codigo);
    
}
