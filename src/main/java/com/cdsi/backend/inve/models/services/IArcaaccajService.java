package com.cdsi.backend.inve.models.services;

import java.util.Date;
import java.util.List;

import com.cdsi.backend.inve.dto.CajaDTO;
import com.cdsi.backend.inve.dto.DatosCajaDTO;
import com.cdsi.backend.inve.models.entity.Arcaaccaj;
import com.cdsi.backend.inve.models.entity.IdArcaaccaj;

public interface IArcaaccajService {
	
	List<Arcaaccaj> buscarCajaAbierta(String cia, String centro, String caja, String estado);
	
	List<Arcaaccaj> verificarCajaAbierta(String cia, String centro, String cajera, String estado, String fecha);

	Arcaaccaj aperturaCaja(Arcaaccaj caja) throws Exception;
	
	Arcaaccaj actualizaCaja(Arcaaccaj caja) throws Exception;
	
	Arcaaccaj buscarCaja(DatosCajaDTO dto);
	
	List<Arcaaccaj> caja(DatosCajaDTO dto);
	
	List<Arcaaccaj> totalCajas(DatosCajaDTO dto);
	
	String codigoAperturaCaja(String cia, Date fecha);
	
	Arcaaccaj findById(IdArcaaccaj id) throws Exception;
	
	Arcaaccaj buscarID(String cia,  String centro,  String caja,  String cod);
	
	void eliminar(IdArcaaccaj id) throws Exception;
	
	List<CajaDTO> listaCajas(String cia, String centro);
}
