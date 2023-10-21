package com.cdsi.backend.inve.models.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdsi.backend.inve.dto.ArccmcDTO;
import com.cdsi.backend.inve.dto.DireccionLegalDto;
import com.cdsi.backend.inve.models.dao.IArccmcDao;
import com.cdsi.backend.inve.models.dao.IArcctdaRepo;
import com.cdsi.backend.inve.models.dao.IArfatdirRepo;
import com.cdsi.backend.inve.models.entity.Arccmc;
import com.cdsi.backend.inve.models.entity.ArcctdaEntity;
import com.cdsi.backend.inve.models.entity.Arfatdir;
import com.cdsi.backend.inve.models.entity.ArfatdirPK;
import com.cdsi.backend.inve.models.entity.IdArccmc;
import com.cdsi.backend.inve.models.services.IArccmcService;

@Service
public class ArccmcServiceImple implements IArccmcService  {

	@Autowired
	private IArccmcDao arccDao;
	
	@Autowired
	private IArfatdirRepo arfatdirRepo;
	
	@Autowired
	private IArcctdaRepo arcctdaRepo;

	@Autowired
	private ObjectMapper objectMapper;

	@Override
	public List<DireccionLegalDto> listaDireccionLegal(String cia, String noCli) {
		ArfatdirPK arfatdirPk = new ArfatdirPK(cia,"LEG");
		Arfatdir arfatdir = this.arfatdirRepo.findById(arfatdirPk).orElse(null);
		if(arfatdir != null) {
			List<ArcctdaEntity> arcctdas = this.arcctdaRepo.listaDirecLegal(cia, noCli);
			if(!arcctdas.isEmpty()) {
				List<ArcctdaEntity> arcctdas2 = arcctdas.stream().filter(d -> d.getTipoDir().contains(arfatdir.getArfatdirPK().getTipo()) ).collect(Collectors.toList());
				if(!arcctdas2.isEmpty()) {
					List<DireccionLegalDto> direccLegalDtos = new ArrayList<>();
					for(ArcctdaEntity a: arcctdas2) {
						DireccionLegalDto direccLegalDto = new DireccionLegalDto(a.getDireccion(),a.getNombre(),a.getArcctdaPKEntity().getCodTienda(),arfatdir.getDescripcion());
						direccLegalDtos.add(direccLegalDto);
					}
					return direccLegalDtos;
				}
			}
		}
		return null;
	}
	
	@Override
	public List<ArccmcDTO> listaClienteDtoByCiaAndCodigo(String cia, String codigo) {
		List<Arccmc> arccmcs = this.arccDao.findByCiaAndRuc(cia, codigo);
		if(!arccmcs.isEmpty()) {
			List<ArccmcDTO> arccmcdtos = new ArrayList<ArccmcDTO>();
			for(Arccmc arccmc: arccmcs) {
				ArccmcDTO arccmcdto = new ArccmcDTO(arccmc.getObjIdArc().getId(),arccmc.getDocumento(),arccmc.getNombre());
				arccmcdtos.add(arccmcdto);
			}
			return arccmcdtos;
		}
		return null;
	}
	
	@Override
	public List<ArccmcDTO> listaClienteDtoByCiaAndNombre(String cia, String nombre) {
		List<Arccmc> arccmcs = this.arccDao.findByNombreAndCia(cia, nombre);
		if(!arccmcs.isEmpty()) {
			List<ArccmcDTO> arccmcdtos = new ArrayList<ArccmcDTO>();
			for(Arccmc arccmc: arccmcs) {
				ArccmcDTO arccmcdto = new ArccmcDTO(arccmc.getObjIdArc().getId(),arccmc.getDocumento(),arccmc.getNombre());
				arccmcdtos.add(arccmcdto);
			}
			return arccmcdtos;
		}
		return null;
	}
	
	@Override
	@Transactional
	public Arccmc createArccmc(Arccmc arccmc) {
		if (arccmc.getNombre().trim().contains("-")) {
			//VAMOS A CORTAR EL NOMBRE DESPUES '-'
			String[] cortarNombres = arccmc.getNombre().trim().split("-");
			arccmc.setNombre(cortarNombres[0]);			
		}		
		arccmc.setClase("020");
		arccmc.setPais("001");
		arccmc.setCodVenCob("001");
		arccmc.setTipoFpago("20");
		arccmc.setCodFpago("01");
		
		arccmc.setTipoCliente("B");
		arccmc.setGrupo("01");
		arccmc.setGracia("8");
		arccmc.setMoneda("SOL");
		arccmc.setLimCredN(0);
		arccmc.setLimCredD(0);
		arccmc.setExcenImp("N");
		arccmc.setStatus("1");
		arccmc.setCheqDife("N");
		arccmc.setUsuario("LLE");
		arccmc.setIndVal("L");
		arccmc.setCodClasif("B");
		arccmc.setCodCateg("A");
		arccmc.setIndAgeRet("N");
		arccmc.setIndBuenCon("N");
		arccmc.setIndSisDef("N");
		arccmc.setCodCali("1");
		arccmc.setCodPropio("N");
		arccmc.setIndRenova("N");
		arccmc.setIndProve("N");
		arccmc.setTipoEnti("C");
		arccmc.setCodSuc("001");
		
		return this.arccDao.save(arccmc);
		
	}

	@Override
	@Transactional
	public Arccmc updateArccmc(IdArccmc objIdArc, Arccmc objA) {
		Arccmc newArcc = findCiaForCodigo(objIdArc);

		objA.setClase("020");
		objA.setPais("001");
		objA.setCodVenCob("001");
		objA.setTipoFpago("20");
		objA.setCodFpago("01");
		
		objA.setTipoCliente("B");
		objA.setGrupo("01");
		objA.setGracia("8");
		objA.setMoneda("SOL");
		objA.setLimCredN(0);
		objA.setLimCredD(0);
		objA.setExcenImp("N");
		objA.setStatus("1");
		objA.setCheqDife("N");
		objA.setUsuario("LLE");
		objA.setIndVal("L");
		objA.setCodClasif("B");
		objA.setCodCateg("A");
		objA.setIndAgeRet("N");
		objA.setIndBuenCon("N");
		objA.setIndSisDef("N");
		objA.setCodCali("1");
		objA.setCodPropio("N");
		objA.setIndRenova("N");
		objA.setIndProve("N");
		objA.setTipoEnti("C");
		objA.setCodSuc("001");
		
		newArcc = objectMapper.convertValue(objA,Arccmc.class);
		return arccDao.save(newArcc);
	}

	@Override
	@Transactional
	public Object deleteArccmc(IdArccmc objIdArc) {
		Arccmc arccmc = this.findCiaForCodigo(objIdArc);
		arccmc.setActivo("N");
	  return 	this.arccDao.save(arccmc);
	}

	@Override
	public Arccmc findCiaForCodigo(IdArccmc objIdArc) {
		return arccDao.findCiaForCodigo(objIdArc.getCia(),objIdArc.getId());
	}

	@Override
	public Page<Arccmc> findPagByCia(Pageable pageable, String cia) {
		return arccDao.findPagByCia(pageable, cia);
	}

	@Override
	//@Transactional(readOnly = true)
	public List<Arccmc> findByNombreAndCia(String cia, String dscri) {
		return arccDao.findByNombreAndCia(cia, dscri);
	}

	@Override
	public List<Arccmc> findByCiaAndRuc(String cia, String id) {
		return arccDao.findByCiaAndRuc(cia, id);
	}

}
