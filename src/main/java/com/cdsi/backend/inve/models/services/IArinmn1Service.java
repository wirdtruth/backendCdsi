package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arinmn1;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

public interface IArinmn1Service extends IGenericService<Arinmn1> {
  List<Arinmn1> listarId(String cia, String bodega , String tipoDoc, String docu, String arti);
  
}
