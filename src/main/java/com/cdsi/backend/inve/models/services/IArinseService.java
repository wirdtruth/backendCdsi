package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arinse;

public interface IArinseService {
  
	//VAMOS A TRAER LAS SECUENCIAS
	public Arinse getCiaAndBodegaAndTrans(String cia, String bodega, String trans);
	
	public Arinse aumentarSecuencia(Arinse a);
	
	public Arinse registrar(Arinse a);
}
