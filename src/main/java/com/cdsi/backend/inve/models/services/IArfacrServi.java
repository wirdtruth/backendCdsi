package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.dto.ConceptoDto;
import com.cdsi.backend.inve.models.entity.Arfacr;

public interface IArfacrServi {
	
	List<ConceptoDto> listaNotaCredito(String cia, String tipDet);
	
	List<Arfacr> lista(String cia);

}
