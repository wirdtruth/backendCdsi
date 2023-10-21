package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arinbo1;

public interface IArinbo1Service {

	//PAGINACION
	List<Arinbo1> findAll(String cia);
	// METODO QUE NOS PERMITE TRAER UN ALMACEN
	Arinbo1 findArinbo1XCiaAndAlmacen(String cia, String almacen);
}
