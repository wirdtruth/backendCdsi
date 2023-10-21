package com.cdsi.backend.inve.models.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.dto.ConceptoDto;
import com.cdsi.backend.inve.models.dao.IArfacrRepo;
import com.cdsi.backend.inve.models.dao.IArfatcnRepo;
import com.cdsi.backend.inve.models.entity.Arfacr;
import com.cdsi.backend.inve.models.services.IArfacrServi;

@Service
public class ArfacrServiImple implements IArfacrServi {
	
	@Autowired
	private IArfacrRepo arfacrRepo;
	
	@Autowired
	private IArfatcnRepo arfatcnRepo;

	@Override
	public List<Arfacr> lista(String cia) {
		List<String> tipos   = this.arfatcnRepo.listaTipoFromCiaAndIndDetalle(cia, "N");
		//tipos.forEach(tipo -> System.out.println(tipo));
		List<Arfacr> arfacrs = this.arfacrRepo.listaCia(cia);
		
		List<Arfacr> arfacrsn = arfacrs.stream().filter( x -> tipos.contains(x.getTipo()) ).collect(Collectors.toList());
		
		return arfacrsn;
	}

	@Override
	public List<ConceptoDto> listaNotaCredito(String cia, String indDet) {
		List<String> tipos = this.arfatcnRepo.listaCiaAndIndDeta(cia, indDet);
		if(!tipos.isEmpty()) {
			List<Arfacr> arfacrs = this.arfacrRepo.listaCia(cia);
			if(!arfacrs.isEmpty()) {
				List<ConceptoDto> conceptodtos = new ArrayList<>();
				List<Arfacr> arfacrs2 = arfacrs.stream().filter( x -> tipos.contains(x.getTipo()) ).collect(Collectors.toList());
				for(Arfacr z: arfacrs2) {
					ConceptoDto conceptodto = new ConceptoDto(z.getArfacrPK().getConcepto(),z.getDescripcion(),indDet,z.getCodSunat());
					conceptodtos.add(conceptodto);
				}
				return conceptodtos;
			}
		}
		return null;
	}

}
