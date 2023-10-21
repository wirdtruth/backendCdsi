package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.dto.StockLibroDTO;

public interface StockLibroDTOService {
	
	public List<StockLibroDTO> listaCiaAndBodegaAndTipo(String cia, String bodega, String tipo);

}
